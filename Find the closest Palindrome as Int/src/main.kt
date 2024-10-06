fun main() {
    println(nearestPalindromic("92695"))
}
fun nearestPalindromic(n: String): String {
    val length = n.length
    val num = n.toLong()

    // Special cases
    if (n == "1") return "0"
    if (n.all { it == '0' }) return (n.toLong() - 1).toString()

    // Candidates for closest palindrome
    val candidates = mutableSetOf<Long>()

    // Base cases for smallest and largest numbers of different length
    candidates.add(Math.pow(10.0, (length - 1).toDouble()).toLong() - 1) // 99...99
    candidates.add(Math.pow(10.0, length.toDouble()).toLong() + 1) // 100...001

    // Get the first half and generate middle palindrome
    val firstHalf = n.substring(0, (length + 1) / 2).toLong()
    for (i in -1..1) {
        val prefix = (firstHalf + i).toString()
        val palindrome = if (length % 2 == 0) {
            (prefix + prefix.reversed()).toLong()
        } else {
            (prefix + prefix.dropLast(1).reversed()).toLong()
        }
        candidates.add(palindrome)
    }

    // Remove the original number itself if it is a palindrome
    candidates.remove(num)

    // Find the closest palindrome
    var closest = -1L
    for (candidate in candidates) {
        if (closest == -1L || Math.abs(candidate - num) < Math.abs(closest - num) ||
            (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
            closest = candidate
        }
    }

    return closest.toString()
}