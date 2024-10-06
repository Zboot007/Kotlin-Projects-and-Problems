class Node(
    var value: Int,
    var next: Node? = null
)
fun printNode(node: Node?): String {
    var current: Node? = node
    var temp = "["
    while(current != null) {
        temp += "${current.value}${if (current.next == null) "" else ", "}"
        current = current.next
    }
    return "$temp]"
}
fun count(node: Node?, value: Int) : Int {
    var counter = 0
    var current: Node? = node
    while(current != null) {
        if(current.value == value)
            counter += 1
        current = current.next
    }
    return counter
}
fun removeDuplicate(node: Node?) : Node? {
    var current = node
    while(current != null) {
        if(current.value == current.next!!.value) {
            current.next = current.next!!.next
        }
        current = current.next
    }
    return node
}
fun removeItem(node: Node, value: Int): Node {
    var current = node
    var head: Node? = node
    while(head!!.value == value) {
        head = head.next
    }
    while(current.next != null) {
        if( current.next!!.value == value ) {
            current.next = current.next!!.next
        } else {
            current = current.next!!
        }
    }
    return if(node.value == value) node.next!! else node
}
fun reverse(node: Node): Node {
    var current: Node? = node
    var last: Node? = node
    var size = 1

    while(last!!.next != null) {
        last = last.next
        size += 1
    }

    var index = 0
    while(current!!.next != null && size / 2 > index) {
        last = node
        var lastLength = size - index - 1

        while(lastLength > 0) {
            last = last!!.next
            lastLength -= 1
        }

        val temp = current.value
        current.value = last!!.value
        last.value = temp
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        // 5 -> 2 -> 3 -> 4 -> 1 -> null
        // 5 -> 4 -> 3 -> 2 -> 1 -> null
        current = current.next
        index += 1
    }
    return node
}
fun isCycle(node: Node?): Boolean {
    var slow = node
    var fast = node
    while(slow != null && fast!!.next != null && fast.next!!.next != null) {
        slow = slow.next
        fast = fast.next!!.next
        if(slow === fast)
            return true
    }
    return false
}
fun test5() {
    // 1 -> 2 ->
    // 1 -> 2 -> 3 -> 4 -> ^2 -> ...
    // 1 -> 5 -> 8 -> 10 -> ^8 -> ...
    // 1 -> 2 -> 3 -> ^1 -> ...
    // 1 -> 3 -> 5 -> 7 ->
    // 5 -> 5 -> 5 -> 5 -> ^5

    val node1 = Node(1, Node(2))
    val node2 = Node(1, Node(2, Node(3, Node(4))))
    node2.next!!.next!!.next!!.next = node2.next

    val node3 = Node(1, Node(5, Node(8, Node(10))))
    node3.next!!.next!!.next!!.next = node3.next!!.next

    val node4 = Node(1, Node(2, Node(3)))
    node4.next!!.next!!.next = node4

    val node5 = Node(1, Node(3, Node(5, Node(7))))

    // another one
    val extraNode = Node(5, Node(5, Node(5, Node(5, Node(5)))))
    extraNode.next!!.next!!.next!!.next = extraNode.next

    println(isCycle(node1)) // false
    println(isCycle(node2)) // true
    println(isCycle(node3)) // true
    println(isCycle(node4)) // true
    println(isCycle(node5)) // false
    println(isCycle(extraNode)) // true
}
fun test1() {
    // 2 -> 3 -> 3 -> 3 -> 3 -> 5 -> 3 ->
    val node: Node = Node(2, Node(3, Node(3, Node(3, Node(5, Node(3))))))

    println(printNode(node))
    println("3 consists in node: " + count(node, 3)) // 4
    println("1 consists in node: " + count(node, 1)) // 0
    println("5 consists in node: " + count(node, 5)) // 1
}
fun test2() {
    // 1 -> 1 -> 2 -> 3 -> 3 -> 3 -> 5 -> 5 ->
    var node = Node(1, Node(1, Node(2, Node(3, Node(3, Node(3, Node(5, Node(5))))))))
    // 1 -> 1 -> 2 -> 3 -> 3 -> 3 -> 5 -> 5 -> null
    // 1 -> 2 -> 3 -> 3 -> 3 -> 5 -> 5 -> null
    // 1 -> 2 -> 3 -> 3 -> 5 -> 5 -> null
    // 1 -> 2 -> 3 -> 5 -> 5 -> null
    // 1 -> 2 -> 3 -> 5 -> null
    println(printNode(node))
    println(printNode(removeDuplicate(node)))
    // [1, 2, 3, 5]
}
fun test3() {
    // 5 -> 1 -> 3 -> 5 -> 2 -> 5 -> 4
    val node = Node(5, Node(1, Node(3, Node(5, Node(2, Node(5, Node(4)))))))

    println(printNode(node))
    println(printNode(removeItem(node, 5)))
    // [1, 3, 2, 4]

}
fun test4() {
    // hard
    // 1 -> 2 -> 3 -> 4 -> 5 ->
    val node = Node(1, Node(2, Node(3, Node(4, Node(5)))))

    println(printNode(node))
    println(printNode(reverse(node)))
    // [5, 4, 3, 2, 1]
}
fun main() {
    // ====> Task 1
    test1()
    // ====> Task 2
    test2()
    // ====> Task 3
    test3()
    // ====> Task 4
    test4()
    // ====> Task 5
    test5()
}