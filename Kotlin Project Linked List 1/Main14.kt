class Node(
    var value: Int,
    var next: Node? = null
)

class Container {
    var size: Int = 0
        private set

    var head: Node? = null
    val isEmpty: Boolean
        get() = head == null

    fun addFirst(value: Int) {
        head = Node(value, head)
        size += 1
    }
    fun addLast(value: Int) {
        if(isEmpty) {
            addFirst(value)
        } else {
            var current = head

            while(current!!.next != null) {
                current = current.next
            }

            current.next = Node(value)
            size += 1
        }
    }
    fun addBefore(beforeValue: Int, value: Int) {
        var previous: Node? = null
        var current: Node? = head

        while(current != null && current.value != beforeValue) {
            previous = current
            current = current.next
        }

        if(current == null)
            return

        if(previous == null) {
            addFirst(value)
        } else {
            previous.next = Node(value, current)
            size += 1
        }
    }
    fun addAfter(afterValue: Int, value: Int) { // 1 -> 3 -> 5 ->
        var current: Node? = head

        while(current != null && current.value != afterValue) {
            current = current.next
        }

        if(current == null)
            return

        current.next = Node(value, current.next)
        size += 1
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder("[")
        var current: Node? = head

        while(current != null) {
            stringBuilder.append(current.value)
                         .append(if(current.next == null) "" else ", ")
            current = current.next
        }

        return stringBuilder.append("]")
                            .toString()
    }
}


fun main() {
    val container = Container()

    // ====> Add
    container.addLast(5)  // [5]
    container.addLast(7)  // [5, 7]
    container.addFirst(3) // [3, 5, 7]
    container.addFirst(1) // [1, 3, 5, 7]

    container.addBefore(3, 2) // [1, 2, 3, 5, 7]
    container.addBefore(1, 0) // [0, 1, 2, 3, 5, 7]
    container.addAfter(3, 4)  // [0, 1, 2, 3, 4, 5, 7]
    container.addAfter(7, 10) // [0, 1, 2, 3, 4, 5, 7, 10]

    // =====> Start <=====

    // ====> Contains
    println(container.contains(3))  // true
    println(container.contains(11)) // false
    println(container.contains(0))  // true
    println(container.contains(8))  // false

    // ====> Remove
//    while(!container.isEmpty) {
//        container.removeFirst()
//        println(container)
//    }

    // [1, 2, 3, 4, 5, 7, 10]
    // [2, 3, 4, 5, 7, 10]
    // [3, 4, 5, 7, 10]
    // [4, 5, 7, 10]
    // [5, 7, 10]
    // [7, 10]
    // [10]
    // []

//    while(!container.isEmpty) {
//        container.removeLast()
//        println(container)
//    }
    // [0, 1, 2, 3, 4, 5, 7]
    // [0, 1, 2, 3, 4, 5]
    // [0, 1, 2, 3, 4]
    // [0, 1, 2, 3]
    // [0, 1, 2]
    // [0, 1]
    // [0]
    // []

    container.remove(4)
    println(container)
    // [0, 1, 2, 3, 5, 7, 10]

    container.remove(1)
    println(container)
    // [0, 2, 3, 5, 7, 10]

    container.remove(10)
    println(container)
    // [0, 2, 3, 5, 7]

    container.remove(3)
    println(container)
    // [0, 2, 5, 7]

    container.remove(0)
    println(container)
    // [2, 5, 7]

    container.remove(0)
    println(container)
    // [2, 5, 7]

    // =====> End <=====

//    var one = Node(1)
//    var two = Node(2)
//    var three = Node(3)
//    one.next = two
//    two.next = three
//
//    var five = Node(5)
//    two.next = five
//    five.next = three
//    // 1 -> 2 -> 3 -> 5 ->
//    var current: Node? = one
//    while(current != null) {
//        println(current.value)
//        current = current.next
//    }
}