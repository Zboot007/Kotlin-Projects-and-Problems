class Node(
    var value: Int,
    var next: Node? = null
)
class Box5(vararg values: Int){
    private var values = values
    private var node: Node? = null
        get() {
            if(values.isNotEmpty()) {
                var index = 0
                if (field == null) {
                    node = Node(values[index], null)
                    index += 1
                }
                var current: Node? = field
                while(index < values.size) {
                    current!!.next = Node(values[index], null)
                    current = current.next
                    index += 1
                }
            }
                return field
        }
    val size: Int
        get() {
            var current: Node? = node
            var counter = 0
            while(current != null) {
                counter += 1
                current = current.next
            }
            return counter
        }
    val first: Int?
        get() {
            if(node == null) {
                return null
            }
            return node!!.value
        }
    val last: Int?
        get() {
            if(node == null) {
                return null
            }
            var current: Node? = node
            while(current!!.next != null) {
                current = current.next
            }
            return current.value
        }
    operator fun plusAssign(value: Int) {
        if(node == null) {
            node = Node(value, null)
            return
        }
        var current: Node? = node
        while(current!!.next != null) {
            current = current.next
        }
        current.next = Node(value, null)
    }
    operator fun plusAssign(set: Set<Int>) {
        var current: Node? = node

        while(current!!.next != null) {
            current = current.next
        }
        var index = 0
        while(current != null && index < set.size) {
            current.next = Node(set.elementAt(index), null)
            index += 1
            current = current.next
        }
    }
    operator fun plusAssign(list: List<Int>) {
        var current: Node? = node
        while(current!!.next != null) {
            current = current.next
        }
        var index = 0
        while(current != null && index < list.size) {
            current.next = Node(list[index], null)
            index += 1
            current = current.next
        }
    }
    operator fun contains(value: Int): Boolean {
        var current: Node? = node
        while(current != null) {
            if(current.value == value)
                return true
            current = current.next
        }
        return false
    }
    operator fun minusAssign(value: Int) {
        var current: Node? = node // 1 -> 2 -> 3 -> null
        if(node!!.value == value) {
            node = node!!.next
        }
        while(current!!.next != null) {
            if(current.next!!.value == value) // 1.next  = 2.next 3
                current.next = current.next!!.next
            else current = current.next
        }
    }
    operator fun minusAssign(list: List<Int>) {
        var current: Node? = node // 1 -> 2 -> 3 -> null
        var index = 0
        if(node!!.value == list[index]) {
            node = node!!.next
            index += 1
            current = node
        }
        while(current!!.next != null) {
            if(current.next!!.value == list[index]) { // 1.next  = 2.next 3
                current.next = current.next!!.next
                index += 1
                current = node
            }
            else current = current.next
        }
    }
    fun reverse() {
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
            current = current.next
            index += 1
        }
    }

    override fun equals(other: Any?): Boolean = node == other

    operator fun iterator(): Iterator<Int> = object : Iterator<Int> {
        private var current: Node? = node
        private var counter = size

        override fun hasNext(): Boolean = counter > 0

        override fun next(): Int {
            if(counter == size) {
                counter -= 1
                return current!!.value
            }
            current = current!!.next
            counter -= 1
            return current!!.value
        }
    }

//    override fun hashCode(): Int {
//        var current = values
//        var index = 0
//        while (index < current.size) {
//            print("${current[index]}, ")
//            index += 1
//        }
//        return index.hashCode()
//    }
    override fun toString(): String {
        var current: Node? = node
        var temp = "["
        while(current != null) {
            temp += if(current.next != null) "${current.value}, " else "${current.value}"
            current = current.next
        }
        return "$temp]"
    }
}
fun main() {
    val box: Box5 = Box5()

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

    box.reverse()

    println(box) // [8, 5, 3, 11, 3]

    val box1 = Box5(5, 1, 3, 4)
    val box2 = Box5(5, 1, 3, 4)
    val box3 = Box5(5, 1, 3, 4, 7)
    val box4 = Box5(5, 1, 2, 4)
    box1 += 2
    println(box1)

    println(box1 == box2) // true
    println(box1 == box3) // false
    println(box1 == box4) // false

//    println(box1.hashCode()) // 1
//    println(box2.hashCode()) // 1
//    println(box3.hashCode()) // 3
//    println(box4.hashCode()) // 4
}