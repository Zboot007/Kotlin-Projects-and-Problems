import kotlin.text.RegexOption.*
fun main() {
    // ====> Task 1
    // a1:B1 8 x 8 [a-h] & [1-8]
    val move = "A1:B1"
    println(isCorrectMove(move)) // true
    println(isCorrectMove("A2:O1")) // false

    // ====> Task 2
    // Pagemaster-92 ? @ ! $ % _ + - = /
    val password = "Pagemaster-92"
    println(isCorrectPassword(password)) // true
    println(isCorrectPassword("passwor=2")) // false

    // ====> Task 3
    // sos-it-academy@gmail.com
    val mail = "sos-it-academy@gmail.com"
    println(isCorrectEmail(mail)) // true
    println(isCorrectEmail("spad@gamil.set")) // false
    println(isCorrectEmail("spad@gamil.com")) // false

    // 5 Problems

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
fun isCorrectMove(move: String)
    = Regex("[a-h][1-8]:[a-h][1-8]", IGNORE_CASE).containsMatchIn(move)
fun isCorrectPassword(password: String): Boolean {
    val regUpperCase = Regex("[A-Z]")
    val regDigit = Regex("\\d")
    val regexSymbols = Regex("[-_/@%=!]") // ?? () \
    return password.contains(regexSymbols) && password.contains(regDigit)
            && password.contains(regUpperCase)
}
fun isCorrectEmail(mail: String): Boolean {
    if(mail.length > 45 || mail.contains("#!$%^&*()")) return false
    val regex = Regex(".+?\\b(@gmail)\\.((ru)|(com)|(uz)|(us))\\b")
    return regex.containsMatchIn(mail)
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