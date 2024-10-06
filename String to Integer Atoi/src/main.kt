fun main() {
    val s1 = "42" // 42
    val s2 = "-42" // -42
    val s3 = " -042" // -42 if s3.toInt() = -42 without 0
    val s4 = "0-42" // 0
    val s5 = "1337c0d3" // 1337
    val s6 = "0-1" // 0
    val s7 = "words and 987" // 0 with no number starts
    println(myAtoi(s1))
    println(myAtoi(s2))
    println(myAtoi(s3))
    println(myAtoi(s4))
    println(myAtoi(s5))
    println(myAtoi(s6))
    println(myAtoi(s7))

}
fun myAtoi(s: String): Int {
    var str = s.trim()
    var sign = 1
    var startIndex = 0
    if (str.isEmpty()) return 0
    if (str[0] == '-') {
        sign = -1
        startIndex = 1
    } else if (str[0] == '+') {
        startIndex = 1
    } else if (str[0].isLetter()) {
        return 0
    }

    var result = 0L

    for (index in startIndex until str.length) {
        if (str[index].isDigit()) {
            val digit = str[index] - '0'

            if (result > (Int.MAX_VALUE - digit) / 10) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }

            result = result * 10 + digit
        } else {
            break
        }
    }

    return (result * sign).toInt()
}
/*fun myAtoi2(s: String): Int {
    var str = s.trim()
    var result = ""
    var sign = 1
    var startIndex = 0
    if(str[0] == '-') {
        sign = -1
        startIndex = 1
    }
    else if(str[0].isLetter())
        return 0
    for(index in startIndex until str.length) {
        if(str[index].isDigit())
            result += str[index]
        else
            break
    }
    if (result.isEmpty()) return 0

    val longResult = result.toLong() * sign

    return when {
        longResult > Int.MAX_VALUE -> Int.MAX_VALUE
        longResult < Int.MIN_VALUE -> Int.MIN_VALUE
        else -> longResult.toInt()
    }
    return -1
}*/