class Node1<TNode>(
    var previous: Node1<TNode>? = null,
    var value: TNode? = null,
    var next: Node1<TNode>? = null
)
class Box6<TBox>(vararg values: TBox): Iterable<TBox> {
    private var head: Node1<TBox>? = null
    private var tail: Node1<TBox>? = null
    init {
        for(value in values)
            plusAssign(value)
    }
    fun addFirst(value: TBox) {
        if(head == null) {
            head = Node1(value = value)
            tail = head
        } else {
            head!!.previous = Node1(value = value, next = head, previous = null)
            head = head!!.previous
            tail = Node1(value = value)
        }
    }
    operator fun plusAssign(value: TBox) {
        val newNode = Node1(value = value)
        if(head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.previous = head
            tail!!.next = newNode
            tail = tail?.next
        }
    }
    operator fun plusAssign(values: Iterable<TBox>) {
        for(value in values)
            plusAssign(value)
    }
    override operator fun iterator(): Iterator<TBox> = object : Iterator<TBox> {
        private var current = tail // (null& <- 1) -> (1& <- 2) -> (2& <- 3) -> (3& <- 4) -> (4& <- 5) -> null

        override fun hasNext(): Boolean = current!!.previous != null

        override fun next(): TBox {
            val a = current!!.value
            current = current?.previous
            return a!!
        }
    }

    override fun toString(): String {
        var temp = "["
        var current = tail
        while(current != null) {
            temp += if(current.previous != null) "${current.value}, " else "${current.value}"
            current = current.previous
        }
        return "$temp]"
    }
//    override fun toString(): String {
//        var current = head
//        val stringBuilder = StringBuilder("[")
//        while(current != null) {
//            stringBuilder.append(if(current.value != null) "${current.value}" else "")
//            if(current.next != null && current.next!!.value != null)
//                stringBuilder.append(", ")
//            current = current.next
//        }
//        return stringBuilder.append("]").toString()
//    }
}
fun main() {
    val box = Box6<Int>()
//    box += 1                 // [1]
//    box += setOf(3, 7, 11)    // [1, 3, 7, 11]
//    box += listOf(2, 1, 3, 1) // [1, 3, 7, 11, 2, 1, 3, 1]
    box.addFirst(11)
    box.addFirst(12)
    box.addFirst(13)
    println(box)
//    for(prev in box)
//        print("$prev ")
//    box.reverse()
    println(box)
}
