class Node(
    var value: Int? = null,
    var next: Node? = null
)
class Solution{
    private var node: Node? = null
    operator fun plusAssign(list: Iterable<Int>) {
        for(element in list) plusAssign(element)
    }
    operator fun plusAssign(value: Int) {
        if(node == null) {
            node = Node(value, null)
            return
        }
        var current = node
        while(current!!.next != null) {
            current = current.next
        }
        current.next = Node(value, null)
    }
    fun reverse() {
        if(node == null) return
        var result: Node? = null
        while(node != null) {
            result = Node(node!!.value, result)
            node = node!!.next
        }
        node = result
    }
    override fun toString(): String {
        var current = node
        var temp = "["
        while(current != null) {
            temp += if(current.next != null) "${current.value}, " else "${current.value}"
            current = current.next
        }
        return "$temp]"
    }
}
fun isCycle(obj: Node?): Boolean {
    var current = obj
    if(current?.next == null || current.next!!.next == null) return false
    var fast = current.next!!.next
    var slow = current.next
    while(current.next != null && fast!!.next!!.next != null && fast.next != null) {
        fast = fast.next!!.next
        slow = slow!!.next
        if(fast === slow)
            return true
    }
    return false
}
//3. Merge Two Sorted Linked Lists
//Given two sorted linked lists, merge them into a single sorted linked list.
// #1
//Input: 1 -> 3 -> 5 -> NULL and 2 -> 4 -> 6 -> NULL
//Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
// #2
//Input: 1 -> 2 -> 7 -> 8 -> 9 ->NULL and 2 -> 4 -> 6 -> NULL
//Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
fun merge(node_1: Node?, node_2: Node?): Node {
    var resultNode = Node()
    var tail = resultNode
    var current_1 = node_1
    var current_2 = node_2
    // O(n)
    while(current_1 != null && current_2 != null) {
        if(current_1.value == current_2.value) {
            tail.value = current_1.value
            tail.next = Node()
            tail = tail.next!!
            tail.value = current_2.value
            tail.next = Node()
            tail = tail.next!!
            current_2 = current_2.next
            current_1 = current_1.next
        } else if(current_1.value!! < current_2.value!!) {
            tail.value = current_1.value
            tail.next = Node()
            tail = tail.next!!
            current_1 = current_1.next
        } else if(current_1.value!! > current_2.value!!) {
            tail.value = current_2.value
            tail.next = Node()
            tail = tail.next!!
            current_2 = current_2.next
        }
    }
    if(current_1 == null) {
        while(current_2 != null) {
            tail.value = current_2.value
            tail.next = Node()
            tail = tail.next!!
            current_2 = current_2.next
        }
    } else {
        while(current_1 != null) {
            tail.value = current_1.value
            tail.next = Node()
            tail = tail.next!!
            current_1 = current_1.next
        }
    }
    return resultNode
}
fun isPalindrome(node: Node?): Boolean {
    var current = node
    var reverseCurrent: Node? = node ?: return false
    var result: Node? = null
    while(reverseCurrent != null) {
        result = Node(reverseCurrent.value, result)
        reverseCurrent = reverseCurrent.next
    }
    reverseCurrent = result
    var bool = false
    while(current != null && reverseCurrent != null) {
        if(current.value == reverseCurrent.value)
            bool = true
        else
            return false
        current = current.next
        reverseCurrent = reverseCurrent.next
    }
    return bool
}
fun removeNthTerm(node: Node?, n: Int): String {
    var index = 0
    var current = node
    while(index < n && current != null) {
        if(index + 1 == n) {
            current.next = current.next!!.next
        }
        current = current.next
        index += 1
    }
    fun toString(resultNode: Node?): String {
        var current = resultNode
        var temp = "["
        while(current != null) {
            temp += if(current!!.next != null) "${current!!.value}, " else "${current!!.value}"
            current = current!!.next
        }
        return "$temp]"
    }
    return toString(node)
}
fun middle(node: Node?): Int? {
    var counter = -1
    var current = node
    while(current != null) {
        counter += 1
        current = current.next
    }
    current = node
    counter /= 2
    while(0 < counter && current != null) {
        counter -= 1
        current = current.next
    }
    return current!!.value
}
fun removeDuplicates(node: Node?): Node? {
    if(node == null) return null
    var current = node
    var resultNode: Node? = null
    var set = mutableSetOf<Int?>()
    while(current != null) {
        set += current.value
        current = current.next
    }
    for(element in set) {

    }
    return resultNode
}
fun printNode(head: Node?): String {
    var current = head
    val stringBuilder = StringBuilder().append("[")
    while(current != null) {
        stringBuilder.append(if(current.value != null) "${current.value}" else "")
        if(current.next?.value != null)
            stringBuilder.append(", ")
        current = current.next
    }
    return stringBuilder.append("]").toString()
}
fun main() {
    // Task 1
    val solution = Solution()
    solution += 1
    solution += listOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
    solution.reverse()
    // Completed
    // Task 2
    val solution_2 = Node(1, Node(2, Node(3, Node(4, Node(5)))))
    println(solution_2)
    solution_2.next!!.next!!.next!!.next = solution_2
    println(isCycle(solution_2)) // true
    solution_2.next = null
    println(solution_2)
    println(isCycle(solution_2))
    // Completed
    // Task 4
    val palindromicEq = Node(1, Node(2, Node(2, Node(1, null))))
    println(isPalindrome(palindromicEq))
    // Completed
    // Task 5
    val n = 3 // by index
    val node = Node(1, Node(2, Node(3, Node(4, Node(5, null)))))
    println(removeNthTerm(node, n))
    // Completed
    // Task 6
    val head_2 = Node(1, Node(2, Node(3, Node(4, Node(5, Node(6, Node(7, Node(8, Node(9, Node(10))))))))))
    println(printNode(head_2))
    println(middle(head_2))
    // Completed
    // Task 7
    val node_3 = Node(1, Node(1, Node(2, Node(3, Node(3)))))
    println(printNode(removeDuplicates(node_3)))
    // Task 3
    val node_1 = Node(1, Node(3, Node(5)))
    val node_2 = Node(2, Node(4, Node(6)))
    println(printNode(merge(node_1, node_2)))
}