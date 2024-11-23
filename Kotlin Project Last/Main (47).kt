import java.io.Serializable


// ====> Task 2
fun reverseVowels(s: String): String {
    val list = s.filter { it in "aeiouAEIOU" }.toMutableList()
    return s.map { if(it in "aeiouAEIOU") list.removeLast() else it }.joinToString("")
}
fun testReverseVowels() { // IeeA -> AeeI
    println(reverseVowels("IceCreAm")) // AceCreIm
    println(reverseVowels("leetcode")) // leotcede
}

// ====> Task 3
fun firstUniqueChar(s: String): Int {
    return s.indexOfFirst { symbol -> s.count { it == symbol } == 1 }
}
fun testFirstUniqueChar() {
    println(firstUniqueChar("leetcode"))     // 0
    println(firstUniqueChar("loveleetcode")) // 2
    println(firstUniqueChar("aabb"))         // -1
}

// ====> Task 4
fun maxRepeatSymbolNearTo(s: String): Char {
    return Regex("([a-z])\\1*").findAll(s)
                                      .sortedWith { lhs, rhs ->
        val result = lhs.value.length.compareTo(rhs.value.length)
        if(result == 0) {
            lhs.value.compareTo(rhs.value)
        } else {
            result
        }
    }.last().value[0]
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
    return t.toSet()
        .subtract(s.toSet())
        .first()
}
fun testFindTheDifference() {
    println(findTheDifference("abcd", "abcde"))      // e
    println(findTheDifference("", "y"))              // y
    println(findTheDifference("body", "ydzob"))      // z
    println(findTheDifference("Penfcil", "encFPil")) // F
}

// ====> Task 6
fun isSubsequence(s: String, t: String)
        = s.map { "$it.*?" }
    .joinToString("")
    .toRegex()
    .containsMatchIn(t)

fun testIsSubsequence() {
    println(isSubsequence("abc", "ahbgdc")) // true
    println(isSubsequence("ace", "abcde"))  // true
    println(isSubsequence("aec", "abcde"))  // false
    println(isSubsequence("axc", "ahbgdc")) // false
}

// ====> Task 7
fun fizzBuzz(n: Int): List<String> {
    return (1 .. n).map {
        when {
            it % 5 == 0 && it % 3 == 0 -> "FizzBuzz"
            it % 5 == 0 -> "Buzz"
            it % 3 == 0 -> "Fizz"
            else -> "$it"
        }
    }
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


// ====> Task 9
fun reverseStr(s: String, k: Int): String {
    return if(k > s.length) s.reversed() else s.take(k).reversed() + s.substring(k)
}
fun testReverseStr() {
    println(reverseStr("abcdefg", 2)) // bacdefg
    println(reverseStr("abcd", 2)) // bacd
    println(reverseStr("abcd", 4)) // dcba
    println(reverseStr("abcd", 7)) // dcba
    println(reverseStr("Pagemaster", 4)) // egaPmaster
}

fun main() {


    // ====> Task 2
//    testReverseVowels()

    // ====> Task 3
//    testFirstUniqueChar()

    // ====> Task 4
//    testMaxRepeatSymbolNearTo()

    // ====> Task 5
//    testFindTheDifference()

//     ====> Task 6
//    testIsSubsequence()

    // ====> Task 7
//    testFizzBuzz()


    // ====> Task 9
//    testReverseStr()

}