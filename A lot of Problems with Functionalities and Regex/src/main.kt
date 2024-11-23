fun main() {
    // Task 1: Extract Valid Email Addresses
    val emailList = listOf("user@example.com", "invalid-email", "test@domain.org")
    println("Valid Emails: ${extractValidEmails(emailList)}") // [user@example.com, test@domain.org]
    // Task 2: Find Duplicate Words
    val paragraph = "This is a test. This test is only a test."
    println("Duplicate Words: ${findDuplicateWords(paragraph)}") // [This, test]
    // Task 3: Replace All Digits
    val inputString = "My phone number is 12345."
    println("String with Digits Replaced: ${replaceDigits(inputString, '*')}") // My phone number is *****
    // Task 4: Count Vowels and Consonants
    val sentence = "Kotlin is fun!"
    println("Counts: ${countVowelsAndConsonants(sentence)}") // {vowels=4, consonants=7}
    // Task 5: Validate Strong Passwords
    val passwordList = listOf("WeakPass", "Strong1@", "12345678")
    println("Strong Passwords: ${validateStrongPasswords(passwordList)}") // [Strong1@]
    // Task 6: Extract URLs from Text
    val textWithUrls = "Visit us at http://example.com or https://example.org."
    println("Extracted URLs: ${extractUrls(textWithUrls)}") // [http://example.com, https://example.org]
    // Task 7: Remove Extra Whitespace
    val stringWithWhitespace = "   Hello   World!   "
    println("Trimmed String: ${removeExtraWhitespace(stringWithWhitespace)}") // "Hello World!"
    // Task 8: Find Words with Specific Length
    val sentenceWithWords = "One two three four five"
    val specificLength = 3
    println("Words of Length $specificLength: ${findWordsOfSpecificLength(sentenceWithWords, specificLength)}") // [One, two]
    // Task 9: Validate and Extract JSON Keys
    val jsonString = """{"name": "John", "age": 30, "city": "New York"}"""
    println("JSON Keys: ${extractJsonKeys(jsonString)}") // [name, age, city]
    // Task 10: Group Anagrams
    val words = listOf("listen", "silent", "enlist", "hello")
    println("Grouped Anagrams: ${groupAnagrams(words)}") // [[listen, silent, enlist]]
}
fun extractValidEmails(emails: List<String>): List<String> {
    val regex = Regex("\\b\\w{3,}@\\w{3,}\\.\\w{2,}")
    return regex.findAll(emails.toString()).map { it.value }.toList()
}
fun findDuplicateWords(paragraph: String): List<String> {
    val regex = Regex("\\b(\\w+)\\1*?\\b", RegexOption.IGNORE_CASE)
    val matches = regex.findAll(paragraph).map { it.value.lowercase() }
    return matches.groupingBy { it }.eachCount().filter{ it.value > 1 }.keys.toList()
}
fun replaceDigits(inputString: String, replacement: Char): String {
    val regex = Regex("\\d+")
    return regex.replace(inputString) { ("$replacement".repeat(regex.find(inputString)?.value?.length ?: 0)) }
}
fun countVowelsAndConsonants(sentence: String): Map<String, Int> {
    val regex_vowels = Regex("[aeoiu]", RegexOption.IGNORE_CASE)
    val regex_consonants = Regex("[bcdfghjklmnpqrstvwxyz]", RegexOption.IGNORE_CASE)
    val vowels_count = regex_vowels.findAll(sentence).count()
    val consonants_count = regex_consonants.findAll(sentence).count()
    return mapOf("vowels" to vowels_count, "consonants" to consonants_count)
}
fun validateStrongPasswords(passwords: List<String>): List<String> {
    val regex = Regex("^(?=.*\\w)(?=.*\\d+)(?=.*[@!#$%^&*_=-]).{8}$", RegexOption.IGNORE_CASE)
    return passwords.filter { regex.matches(it) }
}
fun extractUrls(urls: String): List<String> {
    val regex = Regex("https?://\\w+\\.\\w{2,}")
    return regex.findAll(urls).map { it.value }.toList()
}
fun removeExtraWhitespace(stringWithWhitespace: String): String /**(!)**/{
    val regex = Regex("\\s+")
    return stringWithWhitespace.trim().replace(regex, " ")
}
fun findWordsOfSpecificLength(sentenceWithWords: String, specificLength: Int): List<String> {
    val regex = Regex("\\b\\w{$specificLength}\\b", RegexOption.IGNORE_CASE)
    return regex.findAll(sentenceWithWords).map { it.value }.toList()
}
fun extractJsonKeys(jsonString: String): List<String> {
    val regex = Regex("\\b[a-z]+\\b")
    return regex.findAll(jsonString).map { it.value }.toList()
}
fun groupAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { it.toCharArray().sorted().joinToString("") }.values.toList()
}