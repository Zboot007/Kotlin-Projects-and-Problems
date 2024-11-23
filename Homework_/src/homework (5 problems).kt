fun main() {
    // Task 1
    val urlInput = "Visit http://example.com or https://google.com for more info."
    val urls = extractUrls(urlInput)
    println("URLs: $urls")
    // Output: URLs: [http://example.com, https://google.com]
    // Task 2
    val vowelInput = "Apples are eaten by elephants."
    val vowelWords = findVowelWords(vowelInput)
    println("Words starting with vowels: $vowelWords")
    // Output: Words starting with vowels: [Apples, are, eaten, elephants]
    // Task 3
    val quoteInput = """She said, "Hello, world!" and then left."""
    val quotedText = extractQuotedText(quoteInput)
    println("Quoted Text: $quotedText")
    // Output: Quoted Text: [Hello, world!]
    // Task 4
    val input5 = "The cat and the dog ran."
    val threeLetterWords = extractThreeLetterWords(input5)
    println("Three-Letter Words: $threeLetterWords")
    // Output: [cat, and, the, dog, ran]
    // Task 5
    val input7 = "The meeting is at 12:30 PM or 03:45 AM."
    val times = extractTimes12HourFormat(input7)
    println("12-Hour Format Times: $times")
    // Output: [12:30 PM, 03:45 AM]
}
fun extractUrls(str: String): List<String> {
    val regex = Regex("\\bhttp://.+\\.\\w{2,4}")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str))
        list += matches.value
    return list
}
fun findVowelWords(str: String): List<String> {
    val regex = Regex("\\b[aeoiu][a-z]+\\b", RegexOption.IGNORE_CASE)
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str))
        list += matches.value
    return list
}
fun extractQuotedText(str: String): List<String> {
    val regex = Regex("\"(.*?)\"", RegexOption.MULTILINE)
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str))
        list += matches.value
    return list
}
fun extractThreeLetterWords(str: String): List<String> {
    val regex = Regex("[a-z]{3}")
    val list = mutableListOf<String>()
    for(match in regex.findAll(str))
        list += match.value
    return list
}
fun extractTimes12HourFormat(str: String): List<String> {
    val regex = Regex("\\b(2[0-3])|([0-1]\\d):[0-5]\\d\\s(PM|AM)\\b")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str))
        list += matches.value
    return list
}