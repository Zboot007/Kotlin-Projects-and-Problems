//fun main() {
//    println(countAndSay(4)) // 1211
//    println(countAndSay(1)) // 1
//}
//fun countAndSay(n: Int): String {
//    var sum = "1"
//    for(index in 1..<n) {
//        sum += encode(sum)
//    }
//    return sum
//}
//fun encode(n: String): String {
//    return Regex("(.)\\1*")
//        .findAll(n)
//        .joinToString("") { match ->
//            val char = match.value[0]
//            val count = match.value.length
//            "$count$char"
//        }
//}
fun main() {
    println(countAndSay(4)) // Expected output: 1211
    println(countAndSay(1)) // Expected output: 1
    println(countAndSay(6)) // For example: 312211
    println(countAndSay(7)) // Expected output for 7th term
}

fun countAndSay(n: Int): String {
    var result = "1" // Starting term of the sequence
    for (i in 1 until n) {
        result = encode(result)
    }
    return result
}

fun encode(s: String): String {
    val sb = StringBuilder()
    var count = 1
    for (i in 1..<s.length) {
        if (s[i] == s[i - 1]) {
            count++
        } else {
            sb.append(count).append(s[i - 1])
            count = 1
        }
    }
    sb.append(count).append(s[s.length - 1]) // Add the last group
    return sb.toString()
}
