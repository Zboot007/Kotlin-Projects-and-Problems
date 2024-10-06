fun main() {
    val l1 = listOf(2, 4, 3)
    val l2 = listOf(5, 6, 4)
    println(addTwoNumbers(l1, l2))
}
fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<Char> {
    val str1 = l1.joinToString("")
    val str2 = l2.joinToString("")
    val result = str2.toInt() + str1.toInt()
    val list = result.toString().toList()
    return list
}