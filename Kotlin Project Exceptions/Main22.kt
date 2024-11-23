class Node<T>(
    var value: T,
    var next: Node<T>? = null
)
fun <T> printNode(node: Node<T>?) {
    var current = node
    while(current != null) {
        print("${current.value} -> ")

        if(current.next == null)
            println("X")

        current = current.next
    }
}
fun <T> reverse(node: Node<T>?): Node<T>? {
    var current = node
    var temp: Node<T>? = null
    var prev: Node<T>? = null

    while(current?.next != null) {
        temp = current.next
        val t = current
        current = current.next?.next
        temp!!.next = t
        temp.next!!.next = prev
        prev = temp
    }
    if(current == null)
        return prev

    current.next = prev
    return current
}

fun div(a: Int, b: Int) = a / b
fun divOrNull(a: Int, b: Int): Int? = if(b != 0) a / b else null

fun calc(a: Int, b: Int, func: (Int, Int) -> Int): Int {
    var r: Int
    try {
        r = func(a, b)
    } catch(error: ArithmeticException) {
        throw error
    }
    return r
}

class BoxOutOfBoundException(
    message: String
) : Exception(message) {
    ///...
}

class Box {
    val list = mutableListOf<Int>()

    fun add(element: Int) = list.add(element)

//    operator fun get(index: Int): Int {
//        if(index !in (0..list.lastIndex))
//            throw BoxOutOfBoundException("Ты вышел за диапозон, ${index}")
//
//        return list[index]
//    }
    operator fun get(index: Int): Int?
        = if(index !in (0..list.lastIndex)) null else list[index]

}

fun main() {



//    val box = Box()
//    box.add(1)
//    box.add(2)
//    box.add(3)
//
//    try {
//        println(box[2]) // 3
//        println(box[3]) // error
//    } catch(error: BoxOutOfBoundException) {
//        println(error.message)
//    }

//    try {
//        println(calc(5, 0, ::div))
//    } catch(error: Exception) {
//
//    }
//    val r = divOrNull(5, 0)
//    if(r != null)
//        println(r)

//    val list = listOf(1, 2, 3)

//    try {
//        div(5, 2)
////        println(list[2])
////        val n: String? = null
////        println(n!!.uppercase())
//    } catch(error: ArithmeticException) {
//        println(error.message)
//    } catch (error: ArrayIndexOutOfBoundsException) {
//        println(error.message)
//    } catch(error: Exception) {
//        println("Exception")
//    } finally {
//        println("finally")
//    }
//    println("after")
    // ...
    // ...

//    var node: Node<Int>? = Node(1, Node(2, Node(3, Node(4, Node(5)))))
    // 1 -> 2 -> 3 -> 4 -> 5 -> X
    // O(N) + O(N)
    // O(N) + O(1)
//    node = reverse(node)
//    node = reverse(node)
//    node = reverse(node)
//    printNode(node)
//    printNode(reverseNode)
//    printNode(reverse(Node(55)))
//    printNode(reverse(Node(22, Node(33))))
//    printNode(reverse<Int>(null))



}