class Node<TNode>(
    var value: TNode? = null,
    var next: Node<TNode>? = null
)
class Box5<TBox>(vararg values: TBox): Iterable<TBox> {
    private var head: Node<TBox>? = null
    private var tail: Node<TBox>? = null
    init {
        for(value in values)
            plusAssign(value)
    }
    var size = 0
    val first: TBox?
        get() = head?.value
    val last: TBox?
        get() = tail?.value
    operator fun plusAssign(values: Iterable<TBox>) {
        for(value in values)
            plusAssign(value)
    }
    operator fun plusAssign(value: TBox) {
        val newNode = Node(value)
        if(head == null) {
            head = newNode
            tail = newNode
        } else {
            tail!!.next = newNode
            tail = tail?.next
        }
        size += 1
    }
    operator fun contains(value: TBox): Boolean {
        var current = head
        while(current != null && current.value != value)
            current = current.next
        return current!!.value == value
    }
    override operator fun iterator(): Iterator<TBox> = object : Iterator<TBox> {
        private var current = Node(null, head)

        override fun hasNext(): Boolean = current.next != null

        override fun next(): TBox {
            current = current.next!!
            return current.value!!
        }
    }
    operator fun minusAssign(values: Iterable<TBox>) {
        for(value in values)
            minusAssign(value)
    }
    operator fun minusAssign(value: TBox) {
        if(head == null) return
        if(head!!.value == value) head = head!!.next
        var current = head
        while(current!!.next != null) {
            if(current.next!!.value == value)
                current.next = current.next!!.next
            else
                current = current.next
        }
        tail = current
        size -= 1
    }
    fun reverse() {
        
    }
    override fun equals(other: Any?): Boolean {
            if(other == null || other !is Box5<*>) return false
            if(other.size != size) return false
            if(this === other) return true
            var current = head
            var node2 = other.head
            while(current != null && node2 != null) {
                if(current.value != node2.value)
                    return false
                current = current.next
                node2 = node2.next
            }
            return true
        }
    override fun hashCode(): Int {
        var current = head
        var result = 1
        while(current != null) {
            result = 31 * result + current.value.hashCode()
            current = current.next
        }
        return result
    }
    override fun toString(): String {
        var current = head
        val stringBuilder = StringBuilder().append("[")
        while(current != null) {
            stringBuilder.append(if(current.value != null) "${current.value}" else "")
            if(current.next != null && current.next!!.value != null)
                stringBuilder.append(", ")
            current = current.next
        }
        return stringBuilder.append("]").toString()
    }
}

fun main() {
    val box = Box5<Int>()

    println(box.size) // 0

    box += 1                  // [1]
    box += setOf(3, 7, 11)    // [1, 3, 7, 11]
    box += listOf(2, 1, 3, 1) // [1, 3, 7, 11, 2, 1, 3, 1]

    println(box)       // [1, 3, 7, 11, 2, 1, 3, 1]
    println(box.first) // 1
    println(box.last)  // 1
    println(7 in box)  // true
    println(2 !in box) // false
    println(box.size)  // 8

    for(number in box) {
        print("$number ")
    } // 1 3 7 11 2 1 3 1
    println()

    box -= 1                     // [3, 7, 11, 2, 3]
    box -= listOf(2, 7, 5, 1, 4) // [3, 11, 3]

    println(box)       // [3, 11, 3]
    println(box.first) // 3
    println(box.last)  // 3

    box += listOf(5, 8) // [3, 11, 3, 5, 8]

    println(box)

    box.reverse()

    println(box) // [8, 5, 3, 11, 3]

    val box1 = Box5(5, 1, 3, 4)
    val box2 = Box5(5, 1, 3, 4)
    val box3 = Box5(5, 1, 3, 4, 7)
    val box4 = Box5(5, 1, 2, 4)
    val box5 = Box5(5, 1, 2, 4)

    println(box1 == box2) // true
    println(box1 == box3) // false
    println(box1 == box4) // false
    println(box5 == box4) // true
    println(box5 == box2) // false

    println(box1.hashCode()) // 1
    println(box2.hashCode()) // 1
    println(box3.hashCode()) // 3
    println(box4.hashCode()) // 4
    println(box5.hashCode()) // 4
}