fun main() {
    var head = ListNode(1)
    head.next = ListNode(2).next
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
}
fun swapPairs(head: ListNode?): ListNode? {
    if (head?.next == null) return head
    val newHead = head.next
    val temp = head.next!!.next
    newHead!!.next = head
    head.next = swapPairs(temp)
    return newHead
}
data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}