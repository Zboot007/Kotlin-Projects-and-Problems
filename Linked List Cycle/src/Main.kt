/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun main() {

}
fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    var current = head
    while(fast?.next != null && slow?.next != null) {
        slow = slow.next
        fast = fast.next!!.next
        if(slow === fast) {
            return true
        }
    }
    return false
}
data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}