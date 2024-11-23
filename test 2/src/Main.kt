import java.io.Serializable

// ====> Task 1
fun isAnagram(s: String, t: String): Boolean {
    return if(s.isEmpty() && t.isEmpty()) false else s.toList().sorted() == t.toList().sorted()
}
fun testIsAnagram() {
    println(isAnagram("anagram", "nagaram"))   // true
    println(isAnagram("rat", "car"))           // false
    println(isAnagram("shuffle", "fuleshe"))   // false
    println(isAnagram("shuffle", "ffullushe")) // false
    println(isAnagram("shuffle", "ffulesh"))   // true
}

// ====> Task 2
fun reverseVowels(s: String): String {
    val regexVowels = Regex("[aieou]", RegexOption.IGNORE_CASE)
    val regexReversed = regexVowels.findAll(s).map { it.value }.toList().reversed().iterator()
    return regexVowels.replace(s) { regexReversed.next() }
}
fun testReverseVowels() { // IeeA -> AeeI
    println(reverseVowels("IceCreAm")) // AceCreIm
    println(reverseVowels("leetcode")) // leotcede
}

// ====> Task 3
fun firstUniqueChar(s: String): Int {
//    val regex = Regex("([a-z])(\\1*)").findAll(s)
//    val match = regex.map { it.value }.toList().filter { it.length < 2 }
//    return if(match.isNotEmpty()) match.indexOf(match[0]) else -1
    val group = s.groupBy({ it }) { it }.mapValues { it.value.count() }
    println(group)
    val index = group.maxByOrNull { it.value < 2 }?.value ?: -1
    println((group.maxByOrNull { it.value < 2 }?.value ?: -1))
    return if(index != -1) s.indexOf(s.elementAt(index)) else -1
}
fun testFirstUniqueChar() {
    println(firstUniqueChar("leetcode"))     // 0
    println(firstUniqueChar("loveleetcode")) // 2
    println(firstUniqueChar("aabb"))         // -1
}

// ====> Task 4
fun maxRepeatSymbolNearTo(s: String): Char {
//    println("([a-z])\\1*".toRegex().findAll(s).maxWith { i, s -> i.value.compareTo(s.value) }.value)
    return "([a-z])\\1*".toRegex().findAll(s)
        .maxWithOrNull(compareBy({ it.value.length }, { s.lastIndexOf(it.value) }))?.value?.first() ?: ' '
}
fun testMaxRepeatSymbolNearTo() {
    println(maxRepeatSymbolNearTo("aabbbbcc"))          // b
    println(maxRepeatSymbolNearTo("aefffeeffcfffeeee")) // e
    println(maxRepeatSymbolNearTo("aaccgggaacc"))       // g
    println(maxRepeatSymbolNearTo("aabbaaccbbaa"))      // c
    println(maxRepeatSymbolNearTo("acfdb"))             // f
}

// ====> Task 5
fun findTheDifference(s: String, t: String): Char {
    val sortedS = s.toCharArray().sorted()
    val sortedT = t.toCharArray().sorted()
    for(symbolIndex in sortedT.indices)
        if(symbolIndex >= sortedS.size || sortedS[symbolIndex] != sortedT[symbolIndex])
            return sortedT[symbolIndex]
    return '0'
}
fun testFindTheDifference() {
    println(findTheDifference("abcd", "abcde"))      // e
    println(findTheDifference("", "y"))              // y
    println(findTheDifference("body", "ydzob"))      // z
    println(findTheDifference("Penfcil", "eNcFPil")) // F
}

// ====> Task 6
fun isSubsequence(s: String, t: String): Boolean {
    var regex = ""
    for(symbol in s) regex += ".*?$symbol"
    return regex.toRegex().containsMatchIn(t)
}
fun testIsSubsequence() {
    println(isSubsequence("abc", "ahbgdc")) // true
    println(isSubsequence("ace", "abcde"))  // true
    println(isSubsequence("aec", "abcde"))  // false
    println(isSubsequence("axc", "ahbgdc")) // false
}

// ====> Task 7
fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()
    for(index in 1..n) {
        if(index % 5 == 0 && index % 3 == 0) list += "FizzBuzz"
        else if(index % 5 == 0) list += "Buzz"
        else if(index % 3 == 0) list += "Fizz"
        else list += "$index"
    }
    return list
}
fun testFizzBuzz() {
//    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//    answer[i] == "Fizz" if i is divisible by 3.
//    answer[i] == "Buzz" if i is divisible by 5.
//    answer[i] == i (as a string) if none of the above conditions are true.

    val r1 = fizzBuzz(3)
    val r2 = fizzBuzz(5)
    val r3 = fizzBuzz(8)
    val r4 = fizzBuzz(15)

    val answer1 = listOf("1", "2", "Fizz")
    val answer2 = listOf("1", "2", "Fizz", "4", "Buzz")
    val answer3 = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8")
    val answer4 = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")

    println(r1 == answer1) // true
    println(r2 == answer2) // true
    println(r3 == answer3) // true
    println(r4 == answer4) // true
}

// ====> Task 8
fun addStrings(num1: String, num2: String): String {
    return (num1.toInt() + num2.toInt()).toString()
}
fun testAddStrings() {
    println(addStrings("11", "123"))  // "134"
    println(addStrings("456", "77"))  // "533"
    println(addStrings("0", "0"))     // "0"
    println(addStrings("0", "01"))    // "1"
    println(addStrings("222", "555")) // "777"
}

// ====> Task 9
fun reverseStr(s: String, k: Int): String {
    val str = s.takeWhile { s.indexOf(it) != k }.reversed()
    return if(k < s.length) str + s.takeLast(s.length - k) else s.reversed()
}
fun testReverseStr() {
    println(reverseStr("abcdefg", 2)) // bacdefg
    println(reverseStr("abcd", 2)) // bacd
    println(reverseStr("abcd", 4)) // dcba
    println(reverseStr("abcd", 7)) // dcba
    println(reverseStr("Pagemaster", 4)) // egaPmaster
}

// ====> Task 10
fun reverseWords(s: String): String {
    return s.split(" ").joinToString(" ") { it.reversed() }
}
fun testReverseWords() {
    println(reverseWords("Let's take LeetCode contest")) // "s'teL ekat edoCteeL tsetnoc"
    println(reverseWords("Mr Ding")) // "rM gniD"
    println(reverseWords("smoke")) // "ekoms"
}
fun main() {

    // ====> Task 1
//    testIsAnagram() // ^

    // ====> Task 2
//    testReverseVowels() // ^

    // ====> Task 3
    testFirstUniqueChar() // &

    // ====> Task 4
//    testMaxRepeatSymbolNearTo() ?

    // ====> Task 5
//    testFindTheDifference() // ^

//     ====> Task 6
//    testIsSubsequence() // ^

    // ====> Task 7
//    testFizzBuzz() ^

//     ====> Task 8
//    testAddStrings() // ^

    // ====> Task 9
//    testReverseStr() ^

//     ====> Task 10
//    testReverseWords() // ^
}