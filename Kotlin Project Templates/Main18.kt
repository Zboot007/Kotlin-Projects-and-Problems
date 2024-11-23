fun <T>display(item: T) {
    println(item)
}
fun <T>add(a: T, b: T): Double
    where T: Number {
    return a.toDouble().plus(b.toDouble())
}


class Stack<T> {
    private class Node<E>(var value: E, var next: Node<E>? = null)

    private var _head: Node<T>? = null
    val isEmpty: Boolean
        get() = _head == null

    fun push(element: T) {
        _head = Node(element, _head)
    }
    fun top(): T? = _head?.value
    fun pop() {
        if(isEmpty)
            return

        _head = _head?.next
    }
}

class MyPair<TFirst, TSecond>(val first: TFirst, val second: TSecond)

class Cafe<T>(var employee: MutableList<T>)
    where T : Employee,
          T : JuniorProgrammer {
    fun sort() {
        employee = employee.sorted().toMutableList()
    }
}

fun main() {
    val programmer = Programmer("Mike", "Meyers", 22)
    val waiter = Waiter("Naomi", "Scott", 25)
    val p: Employee = programmer

    val cafe = Cafe(listOf(programmer).toMutableList())


//    val minAndMax = MyPair(1, "fdsfds")

//    println(minAndMax.first)
//    println(minAndMax.second)


//    val sNum = Stack<Int>()
//    val sChar = Stack<Char>()
//
//    sNum.push(1); sNum.push(2); sNum.push(3); sNum.push(4); sNum.push(5);
//    sChar.push('a'); sChar.push('b'); sChar.push('c'); sChar.push('d'); sChar.push('e');
//
//    while(!sNum.isEmpty) {
//        println(sNum.top())
//        sNum.pop()
//    }
    // 5
    // 4
    // 3
    // 2
    // 1
//    println("=".repeat(20))
//    while(!sChar.isEmpty) {
//        println(sChar.top())
//        sChar.pop()
//    }
    // e
    // d
    // c
    // b
    // a


//    println(add(5, 10))
//    display(5)
//    display("5555")
//    display(false)
}
