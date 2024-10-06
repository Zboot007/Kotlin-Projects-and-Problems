import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.jsoup.Jsoup
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

const val URL = "https://osdr.nasa.gov/bio/repo/search?q=&data_source=cgene,alsda&data_type=study"
const val DOWNLOAD_DIR = "C:\\Users\\user\\Downloads\\Nasa space"
const val MAX_DOWNLOAD_SIZE = 100 * 1024 * 1024 // 100 MB

fun main() {
    val totalDownloadedSize = scrapeAndDownload()
    println("Total downloaded size: ${totalDownloadedSize / (1024 * 1024)} MB")
}

fun scrapeAndDownload(): Long {
    val client = OkHttpClient()
    var totalDownloadedSize: Long = 0

    // Create download directory if it doesn't exist
    val downloadDir = File(DOWNLOAD_DIR)
    if (!downloadDir.exists()) {
        downloadDir.mkdirs()
    }

    try {
        val response: Response = client.newCall(Request.Builder().url(URL).build()).execute()
        val doc = Jsoup.parse(response.body?.string())

        // Find all reference links to individual studies
        val referenceLinks = doc.select("a[href]")

        // Loop through each reference link
        for (referenceLink in referenceLinks) {
            val refUrl = referenceLink.absUrl("href")
            println("Visiting reference page: $refUrl")

            val refResponse = client.newCall(Request.Builder().url(refUrl).build()).execute()
            val refDoc = Jsoup.parse(refResponse.body?.string())

            // Find the "files" section in the reference page
            val fileLinks = refDoc.select("a[href]")
            for (fileLink in fileLinks) {
                val fileUrl = fileLink.absUrl("href")
                if (fileUrl.endsWith(".zip") || fileUrl.endsWith(".csv") || fileUrl.endsWith(".txt") || fileUrl.endsWith(".pdf")) {
                    val fileName = fileUrl.substringAfterLast("/")
                    val savePath = File(downloadDir, fileName)

                    // Download the file and update the total downloaded size
                    totalDownloadedSize += downloadFile(client, fileUrl, savePath, totalDownloadedSize)

                    // Stop downloading if the size limit has been reached
                    if (totalDownloadedSize >= MAX_DOWNLOAD_SIZE) {
                        println("Reached the 100 MB download limit.")
                        return totalDownloadedSize
                    }
                }
            }
        }
    } catch (e: Exception) {
        println("An error occurred during scraping: ${e.message}")
    }

    return totalDownloadedSize
}

fun downloadFile(client: OkHttpClient, fileUrl: String, savePath: File, downloadedSize: Long): Long {
    return try {
        println("Attempting to download: $fileUrl")
        val response = client.newCall(Request.Builder().url(fileUrl).build()).execute()
        val fileSize = response.body?.contentLength() ?: 0

        // Check if the file can fit within the remaining space
        if (downloadedSize + fileSize > MAX_DOWNLOAD_SIZE) {
            println("Skipping $fileUrl: Download would exceed 100 MB limit.")
            return downloadedSize
        }

        // Download the file
        response.body?.byteStream().use { input ->
            FileOutputStream(savePath).use { output ->
                input?.copyTo(output)
            }
        }

        println("Downloaded: ${savePath.absolutePath} (Size: ${fileSize / (1024 * 1024)} MB)")
        downloadedSize + fileSize
    } catch (e: IOException) {
        println("An error occurred while downloading $fileUrl: ${e.message}")
        downloadedSize
    }
}
