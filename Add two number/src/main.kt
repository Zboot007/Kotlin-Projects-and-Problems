fun main() {
    val l1 = listOf(2, 3, 6)
    val l2 = listOf(1, 3, 5)
    println(addTwoNumbers(l1, l2))
}
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 *
 * }
 */
fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var carry = 0
    var i = l1.size - 1
    var j = l2.size - 1

    while (i >= 0 || j >= 0 || carry != 0) {
        val x = if (i >= 0) l1[i] else 0
        val y = if (j >= 0) l2[j] else 0
        val sum = x + y + carry
        result.add(0, sum % 10)
        carry = sum / 10
        i--
        j--
    }
    return result
}
