fun main() {
    val x = 153423
    println(reverse(x)) // 321
    val y = -123
    println(reverse(y)) // -321
    val z = 120
    println(reverse(z)) // 21
}
fun reverse(x: Int): Int {
    var rev = ""
    var sign = 1
    if (x < 0) {
        rev = x.toString().substring(1).reversed()
        sign = -1
    } else {
        rev = x.toString().reversed()
    }

    val result = try {
        rev.toInt()
    } catch (e: NumberFormatException) {
        return 0
    }

    return if (result in Int.MIN_VALUE..Int.MAX_VALUE) {
        result * sign
    } else {
        0
    }

}