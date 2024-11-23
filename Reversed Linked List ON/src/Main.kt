fun main() {

}
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val nextNode = current.next  // Save the next node
        current.next = prev          // Reverse the current node's pointer
        prev = current               // Move `prev` to the current node
        current = nextNode           // Move to the next node
    }

    return prev  // `prev` will be the new head of the reversed list
}
data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}