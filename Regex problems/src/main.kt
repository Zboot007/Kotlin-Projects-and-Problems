fun main()  {
    // Easier problems with Regex.
    println("Easy problems " + "=".repeat(6))
    // Task 1: Match Digits
    val digitInput = "My phone number is 12345."
    val digits = matchDigits(digitInput)
    println("Digits: $digits")
    // Output: Digits: [1, 2, 3, 4, 5]

    // Task 2: Match Words with Only Letters
    val wordsInput = "Hello world 123!"
    val words = matchWordsWithOnlyLetters(wordsInput)
    println("Words with only letters: $words")
    // Output: Words with only letters: [Hello, world]

    // Task 3: Match Single Words Starting with a Specific Letter (e.g., 'A')
    val letterInput = "Apple is amazing, and so are apricots."
    val aWords = matchWordsStartingWithA(letterInput)
    println("Words starting with 'A': $aWords")
    // Output: Words starting with 'A': [Apple, amazing, apricots]

    // Task 4: Match Three Consecutive Characters
    val consecutiveInput = "123 ABC"
    val consecutiveChars = matchThreeConsecutiveChars(consecutiveInput)
    println("Three consecutive characters: $consecutiveChars")
    // Output: Three consecutive characters: [123, ABC]

    // More difficult problems          *

    println("Difficult problems " + "=".repeat(6))

    // Task 1: Match Email Addresses
    val emailInput = "Contact us at support@example.com and sales@example.org"
    val emails = matchEmails(emailInput)
    println("Emails: $emails")
    // Output: Emails: [support@example.com, sales@example.org]

    // Task 2: Match Phone Numbers
    val phoneInput = "Call me at +1-123-456-7890 or (123) 456-7890"
    val phoneNumbers = matchPhoneNumbers(phoneInput)
    println("Phone Numbers: $phoneNumbers")
    // Output: Phone Numbers: [+1-123-456-7890, (123) 456-7890]

    // Task 3: Match Dates (DD/MM/YYYY or DD-MM-YYYY)
    val dateInput = "The events are on 12/09/2021 and 14-10-2022."
    val dates = matchDates(dateInput)
    println("Dates: $dates")
    // Output: Dates: [12/09/2021, 14-10-2022]

    // Task 4: Extract URLs
    val urlInput = "Visit http://example.com or https://google.com for more info."
    val urls = extractUrls(urlInput)
    println("URLs: $urls")
    // Output: URLs: [http://example.com, https://google.com]

    // Task 5: Validate IPv4 Addresses
    val ipInput = "These are IP addresses: 192.168.1.1, 256.256.256.256"
    val validIps = validateIPAddresses(ipInput)
    println("Valid IPs: $validIps")
    // Output: Valid IPs: [192.168.1.1]

    // Task 6: Find Words Starting with Vowels
    val vowelInput = "Apples are eaten by elephants."
    val vowelWords = findVowelWords(vowelInput)
    println("Words starting with vowels: $vowelWords")
    // Output: Words starting with vowels: [Apples, are, eaten, elephants]

    // Task 7: Validate Hexadecimal Colors /**????**/
    val colorInput = "The colors are #FF5733 and #zz7733, but #ZZZZZZ is invalid."
    val validColors = validateHexColors(colorInput)
    println("Valid Hex Colors: $validColors")
    // Output: Valid Hex Colors: [#FF5733]

    // Task 8: Extract Quoted Text
    val quoteInput = """She said, "Hello, world!" and then left."""
    val quotedText = extractQuotedText(quoteInput)
    println("Quoted Text: $quotedText")
    // Output: Quoted Text: [Hello, world!]

    // Task 9: Check Palindrome
    val palindromeInput = "A man, a plan, a canal, Panama"
    val isPalindrome = checkPalindrome(palindromeInput)
    println("Is Palindrome: $isPalindrome")
    // Output: Is Palindrome: true

    // Task 10: Password Strength Checker
    val passwordInput = "P@ssw0rd123!"
    val isStrongPassword = checkPasswordStrength(passwordInput)
    println("Is Strong Password: $isStrongPassword")
    // Output: Is Strong Password: true

    // 10 another problems ***************

    println("Another 10 problems " + "=".repeat(6))

    // Task 1: Extract All Capitalized Words
    val input1 = "My name is John and I live in New York."
    val capitalizedWords = extractCapitalizedWords(input1)
    println("Capitalized Words: $capitalizedWords")
    // Output: [My, John, I, New, York]

    // Task 2: Validate Username (Letters and Numbers Only)
    val input2 = "user123, johndoe, user!, short, 1234567890123456"
    val validUsernames = validateUsernames(input2)
    println("Valid Usernames: $validUsernames")
    // Output: [user123, johndoe, short]

    // Task 3: Find All Hashtags
    val input3 = "Post includes #fun, #learning, and #Kotlin."
    val hashtags = findHashtags(input3)
    println("Hashtags: $hashtags")
    // Output: [#fun, #learning, #Kotlin]

    // Task 4: Find All Numbers with Two Decimal Points
    val input4 = "Prices are 4.99, 3.5, and 12.00."
    val twoDecimalNumbers = findNumbersWithTwoDecimals(input4)
    println("Numbers with Two Decimal Points: $twoDecimalNumbers")
    // Output: [4.99, 12.00]

    // Task 5: Extract All Three-Letter Words
    val input5 = "The cat and the dog ran."
    val threeLetterWords = extractThreeLetterWords(input5)
    println("Three-Letter Words: $threeLetterWords")
    // Output: [cat, and, the, dog, ran]

//    // Task 6: Validate Complex Password
//    val input6 = "My password is P@ssw0rd123! and another123."
//    val strongPasswords = validateComplexPasswords(input6)
//    println("Strong Passwords: $strongPasswords")
//    // Output: [P@ssw0rd123!]

    // Task 7: Extract Time in 12-Hour Format
    val input7 = "The meeting is at 12:30 PM or 03:45 AM."
    val times = extractTimes12HourFormat(input7)
    println("12-Hour Format Times: $times")
    // Output: [12:30 PM, 03:45 AM]

    // Task 8: Validate IPv4 Address
    val input8 = "The IPs are 192.168.1.1 and 999.999.999.999."
    val validIPs = validateIPv4Addresses(input8)
    println("Valid IPs: $validIPs")
    // Output: [192.168.1.1]

//    // Task 9: Validate a URL
//    val input9 = "Visit https://www.google.com or http://invalid-site."
//    val validURLs = validateURLs(input9)
//    println("Valid URLs: $validURLs")
//    // Output: [https://www.google.com]
//
//    // Task 10: Validate US Phone Numbers
//    val input10 = "Call me at (123) 456-7890 or 123-456-7890 or 12:30 PM,1234567890."
//    val validPhones = validateUSPhoneNumbers(input10)
//    println("Valid US Phone Numbers: $validPhones")
//    // Output: [(123) 456-7890, 123-456-7890, 1234567890]
}
fun matchDigits(str: String): List<Char> {
    val regex = Regex("\\d+")
    val list = mutableListOf<Char>()
    for(index in regex.find(str)?.range!!) {
        list += str[index]
    }
    return list
}
fun matchWordsWithOnlyLetters(str: String): List<String> {
    val regex = Regex("\\b[A-Za-z]+\\b")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str)) {
        list += matches.value
    }
    return list
}
fun matchWordsStartingWithA(str: String): List<String> {
    val regex = Regex("\\b[Aa][A-Za-z]+\\b")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str)) {
        list += matches.value
    }
    return list
}
fun matchThreeConsecutiveChars(str: String): List<String> {
    val regex = Regex("\\b\\w{3}\\b")
    val list = mutableListOf<String>()
    for(match in regex.findAll(str)) {
        list += match.value
    }
    return list
}
fun matchEmails(str: String): List<String> {
    val list = mutableListOf<String>()
    val regex = Regex("\\b[A-Za-z0-9-_]+@[A-Za-z0-9-_]+\\.\\w{2,4}\\b")

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun matchPhoneNumbers(str: String): List<String> {
    val regex = Regex("(\\+?\\d)?((-?\\d+)|(\\(\\d+\\)))(\\s|-)?\\s?\\d{3}-\\d{4}")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str)) {
        list += matches.value
    }
    return list
}
fun matchDates(str: String): List<String> {
    val regex = Regex("(\\d{2})([/-])(\\d{2})([/-])(\\d{4})")
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun extractUrls(str: String): List<String> {
    val regex = Regex("\\bhttp://.+\\.\\w{2,4}")
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun validateIPAddresses(str: String): List<String> {
    val regex = Regex("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun findVowelWords(str: String): List<String> {
    val regex = Regex("\\b[aeoiu][a-z]+\\b", RegexOption.IGNORE_CASE)
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun validateHexColors(str: String): List<String> /****()****/ {
    val regex = Regex("\\B#([A-Fa-f0-9]{6})\\b", RegexOption.IGNORE_CASE)
    val list = mutableListOf<String>()

    for (match in regex.findAll(str)) {
        list += match.value
    }

    return list
}
fun extractQuotedText(str: String): List<String> {
    val regex = Regex("\"(.*?)\"", RegexOption.MULTILINE)
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun checkPalindrome(str: String): Boolean {
    val regex = Regex("[a-z]", RegexOption.IGNORE_CASE)
    val pureStr = regex.findAll(str).joinToString("") { it.value.lowercase() }
    return pureStr == pureStr.reversed()
}
fun checkPasswordStrength(str: String): Boolean {
    val regex = Regex("^((?=.*[a-z])(?=.*[A-Z])(?=.*@)(?=.*!)(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"|,.<>/])).{8,20}$")
    return regex.matches(str)
}
fun extractCapitalizedWords(str: String): List<String> {
    val regex = Regex("\\b[A-Z]([a-z]|\\d)*?\\b")
    val list = mutableListOf<String>()

    for(matches in regex.findAll(str)) {
        list += matches.value
    }

    return list
}
fun validateUsernames(str: String): List<String> {
    val regex = Regex("\\b[A-Za-z\\d]{5,15}\\b")
    val list = mutableListOf<String>()

    for(match in regex.findAll(str)) {
        list += match.value
    }

    return list
}
fun findHashtags(str: String): List<String> /**!!!**/ {
    val regex = Regex("\\B#[A-Za-z0-9]+\\b") // withou B | b it will work but conside that B starts with not 'word'
    val list = mutableListOf<String>()

    for(match in regex.findAll(str)) {
        list += match.value
    }

    return list
}
fun findNumbersWithTwoDecimals(str: String): List<String> {
    val regex = Regex("\\d+\\.\\d+")
    val list = mutableListOf<String>()

    for(match in regex.findAll(str)) list += match.value

    return list
}
fun extractThreeLetterWords(str: String): List<String> {
    val regex = Regex("[a-z]{3}")
    val list = mutableListOf<String>()

    for(match in regex.findAll(str)) list += match.value

    return list
}
fun extractTimes12HourFormat(str: String): List<String> {
    val regex = Regex("\\b(2[0-3])|([0-1]\\d):[0-5]\\d\\s(PM|AM)\\b")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str)) {
        list += matches.value
    }
    return list
}
fun validateIPv4Addresses(str: String): List<String> /**!!!**/ {
    val regex = Regex("\\b((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\b")
    val list = mutableListOf<String>()
    for(matches in regex.findAll(str)) list += matches.value
    return list
}