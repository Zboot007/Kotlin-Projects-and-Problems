fun main() {
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(2, 3, 4, 9)
    println(addTwoNumbers(l1, l2))
}
fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<String> {
    val result: List<String>
    val strNumber1 = l1.joinToString("")
    val strNumber2 = l2.joinToString("")
    val num = strNumber1.toInt() + strNumber2.toInt()
    result = num.toString().split("").filter { it.isNotEmpty() }
    return result
}