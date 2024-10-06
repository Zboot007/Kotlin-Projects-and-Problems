class Node(
    var value: Int,
    var next: Node? = null
)

fun printNode(node: Node?): String {
    var current: Node? = node
    var temp = "["
    while(current != null) {
        temp += "$current${if (current.next == null) "" else ", "}"
        current = current.next
    }
    return "$temp]"
}

fun test1() {
    // 2 -> 3 -> 3 -> 3 -> 3 -> 5 -> 3 ->
    var node: Node = Node(2, Node(3, Node(3, Node(3, Node(5, Node(3))))))

//    printNode(node)
//    println(count(node, 3)) // 5
//    println(count(node, 1)) // 0
//    println(count(node, 5)) // 1
}
fun test2() {
    // 1 -> 1 -> 2 -> 3 -> 3 -> 3 -> 5 -> 5 ->
    var node = Node(1, Node(1, Node(2, Node(3, Node(3, Node(3, Node(5, Node(5))))))))

//    printNode(node)
//    var newNode: Node = removeDuplicate(node)
//    printNode(newNode)
    // [1, 2, 3, 5]
}
fun test3() {
    // 5 -> 1 -> 3 -> 5 -> 2 -> 5 -> 4
    var node = Node(5, Node(1, Node(3, Node(5, Node(2, Node(5, Node(4)))))))

//    printNode(node)
//    var newNode: Node = removeItem(node, 5)
//    printNode(newNode)
    // [1, 3, 2, 4]

}
fun test4() {
    // hard
    // 1 -> 2 -> 3 -> 4 -> 5 ->
    var node = Node(1, Node(2, Node(3, Node(4, Node(5)))))

//    printNode(node)
//    var newNode: Node = reverse(node)
//    printNode(newNode)
    // [5, 4, 3, 2, 1]
}
fun test5() {
    // 1 -> 2 ->
    // 1 -> 2 -> 3 -> 4 -> ^2 -> ...
    // 1 -> 5 -> 8 -> 10 -> ^8 -> ...
    // 1 -> 2 -> 3 -> ^1 -> ...
    // 1 -> 3 -> 5 -> 7 ->

    var node1 = Node(1, Node(2))
    var node2 = Node(1, Node(2, Node(3, Node(4))))
    node2.next!!.next!!.next!!.next = node2.next

    var node3 = Node(1, Node(5, Node(8, Node(10))))
    node3.next!!.next!!.next!!.next = node3.next!!.next

    var node4 = Node(1, Node(2, Node(3)))
    node4.next!!.next!!.next = node4

    var node5 = Node(1, Node(3, Node(5, Node(7))))

//    println(isCycle(node1)) // false
//    println(isCycle(node2)) // true
//    println(isCycle(node3)) // true
//    println(isCycle(node4)) // true
//    println(isCycle(node5)) // false
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