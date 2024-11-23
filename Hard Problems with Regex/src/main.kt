import java.awt.geom.Line2D

fun main() {
    // 1. Validate Credit Card Numbers
    val creditCard = "1234-5678-9123-4567"
    println("Valid credit card: ${validateCreditCard(creditCard)}") // true

    // 2. Extract HTML Tags
    val htmlString = "<div>Hello <b>World</b></div>"
    println("Extracted HTML tags: ${extractHtmlTags(htmlString)}") // [<div>, <b>, </b>, </div>]

    // 3. Identify and Extract Coordinates
    val coordinates = "The location is 37.7749, -122.4194."
    println("Extracted coordinates: ${extractCoordinates(coordinates)}") // [37.7749, -122.4194]

    // 4. Validate UUIDs
    val uuid = "123e4567-e89b-12d3-a456-426614174000"
    println("Valid UUID: ${validateUUID(uuid)}") // true

    // 5. Extract Quoted Strings
    val quotedString = """She said, "Hello" and 'Goodbye'"""
    println("Extracted quoted strings: ${extractQuotedStrings(quotedString)}") // [Hello, Goodbye]

    // 6. Match Nested Parentheses
    val nestedParentheses = "(a(b)c)"
    println("Has nested parentheses: ${hasNestedParentheses(nestedParentheses)}") // true

    // 7. Extract Words with Specific Patterns
    val textWithVowels = "An elephant is outside"
    println("Words starting with a vowel: ${extractWordsWithVowels(textWithVowels)}") // [An, elephant]

    // 8. Validate Strong Passwords
    val password = "StrongPassword123!"
    println("Valid strong password: ${validateStrongPassword(password)}") // true

    // 9. Identify Anagrams
    val wordsList = listOf("listen", "silent", "enlist")
    println("Anagrams: ${findAnagrams(wordsList)}") // [[listen, silent, enlist]]

    // 10. Match Dates in Different Languages
    val dateText = "Today is October 11, 2024 and 11 october 2024."
    println("Extracted dates: ${extractDatesInDifferentLanguages(dateText)}") // [October 11, 2024, 11 octobre 2024]
}
fun validateCreditCard(cardNumber: String): Boolean {
    val regex = Regex("((\\d{4}-){3})\\d{4}")
    return regex.containsMatchIn(cardNumber)
}
fun extractHtmlTags(htmlTags: String): List<String> {
    val regex = Regex("(<\\w{1,3}>)|(</\\w{1,3}>)")
    return regex.findAll(htmlTags)
        .map { it.value }
        .toList()
}
fun extractCoordinates(coordinates: String): List<Double> {
    val regex = Regex("-?(\\d{1,3})\\.\\d+")
    return regex.findAll(coordinates)
        .map { it.value.toDouble() }
        .toList()
}
fun validateUUID(uuid: String): Boolean {
    val regex = Regex("(\\d|[a-z]){8}-((\\d|[a-z]){4}-){3}(\\d|[a-z]){12}")
    return regex.containsMatchIn(uuid)
}
fun extractQuotedStrings(quoted: String): List<String> {
    val regex = Regex("[\'\"]\\w+[\'\"]", RegexOption.MULTILINE)
    return regex.findAll(quoted).map { it.value }.toList()
}
fun hasNestedParentheses(nestedParentheses: String): Boolean /**(!)**/ {
    val balance = nestedParentheses.fold(0) {accamulator, char ->
        when(char) {
            '(' -> accamulator + 1
            ')' -> accamulator - 1
            else -> accamulator
        }
    }
    return balance == 0 && nestedParentheses.indexOf(')') == -1
}
fun extractWordsWithVowels(textWithVowels: String): List<String> {
    val regex = Regex("\\b[aioeu][a-z]+", RegexOption.IGNORE_CASE)
    return regex.findAll(textWithVowels).map { it.value }.toList()
}
fun validateStrongPassword(password: String): Boolean {
    val regex = Regex("(?=.*[a-z]{5,})(?=.*\\d+)(?=.*[!@#$%^&*_=-]+)", RegexOption.IGNORE_CASE)
    return regex.containsMatchIn(password)
}
fun findAnagrams(wordList: List<String>): List<List<String>> /**(!)**/ {
    return wordList.groupBy { word -> word.toCharArray().sorted().joinToString("") }
        .values
        .filter { it.size > 1 }
}
fun extractDatesInDifferentLanguages(dataText: String): List<String> {
    val regex = Regex("(\\w+|\\d{2})(,\\s)?(\\s)(\\d{2}|\\w+)(,|\\s)?(\\s)\\d{4}", RegexOption.IGNORE_CASE)
    return regex.findAll(dataText).map { it.value }.toList()
}