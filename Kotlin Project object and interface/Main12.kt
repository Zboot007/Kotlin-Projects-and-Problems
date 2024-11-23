import java.util.*

//class Bag(private val items: MutableList<String> = mutableListOf())
//    : Iterable<String> {
//    fun putIn(str: String) {
//        items += str
//    }
//    fun contains(str: String): Boolean = str in items
//    override fun toString(): String = "$items"
////    override fun iterator(): Iterator<String> = BagIterator(items)
////    private class BagIterator(
////        private val data: List<String>
////    ) : Iterator<String> {
////        private var index = -1
////
////        override fun hasNext() = (index + 1) < data.size
////        override fun next() = data[++index]
////    }
//
////    override fun iterator(): Iterator<String> = BagIterator()
////    private inner class BagIterator() : Iterator<String> {
////        private var index = -1
////
////        override fun hasNext() = (index + 1) < items.size
////        override fun next() = items[++index]
////    }
//
//    override fun iterator(): Iterator<String> = object : Iterator<String> {
//        private var index = -1
//
//        override fun hasNext() = (index + 1) < items.size
//        override fun next() = items[++index]
//    }
//}
//
//// 1
//object Test {
//    val name: String = "Mike"
//    fun repeat(count: Int) = name.repeat(count)
//}

// 2
//class Iphone15(
//    val memory: Int,
//    val price: Int,
//    val color: String
//) {
//    companion object {
//        private var count: Int = 0
//        fun getCount() = count
//    }
//    init {
//        count += 1
//    }
//    fun t() {
//        getCount()
//    }
//}

//interface Calc {
//    fun add(a: Int, b: Int): Int
//    fun minus(a: Int, b: Int): Int
//}
//
//// 3
//class ClassCalc : Calc {
//    override fun add(a: Int, b: Int) = a + b
//    override fun minus(a: Int, b: Int) = a - b
//}
//fun test() {
//    val calc = object : Calc {
//        override fun add(a: Int, b: Int) = a + b
//        override fun minus(a: Int, b: Int) = a - b
//    }// ClassCalc()
//
//    println(calc.add(5, 10))   // 15
//    println(calc.minus(10, 5)) // 5
//}

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Point)
            return false

        if(this === other)
            return true

        return x == other.x && y == other.y
    }

    override fun hashCode() = Objects.hash(x, y)
}



fun main() {
    // LIFO
    // ====> Task 1
    val stack = Stack()

    stack.push(1) // [1]
    stack.push(2) // [1, 2]
    stack.push(3) // [1, 2, 3]
    stack.push(4) // [1, 2, 3, 4]
    stack.push(5) // [1, 2, 3, 4, 5]

    println(stack.peek()) // 5
    while(!stack.isEmpty)
        println(stack.top())
    // 5
    // 4
    // 3
    // 2
    // 1

    // ====> Task 2
    val st1 = Stack()
    val st2 = Stack()

    st1.push(1); st1.push(2); st1.push(3)
    st2.push(1); st2.push(2); st2.push(3)

    println(st1 == st2) // true

    // ====> Task 3
    val stack5 = Stack()

    stack5.push(1) // [1]
    stack5.push(2) // [1, 2]
    stack5.push(3) // [1, 2, 3]
    stack5.push(4) // [1, 2, 3, 4]
    stack5.push(5) // [1, 2, 3, 4, 5]

    for(item in stack5)
        print("$item ")
    println() // 5 4 3 2 1

//    println(listOf(1, 2, 3) == listOf(1, 2, 3))

//    val p1 = Point(5, 10)
//    val p2 = Point(5, 10)
//    val p3 = p1
//
//    println(p1.hashCode()) //
//    println(p2.hashCode()) //
//    println(p3.hashCode()) //


//    println(p1 === p2)  // false
//    println(p1 === p3)  // true
//    println("=".repeat(20))
//    println(p1.equals(p2)) // true
//    println(p1.equals(p3)) // true
//    println(!p1.equals(p2)) // false
//    println(!p1.equals(p3)) // false
//    println("=".repeat(20))
//    println(p1 == p2)  // true
//    println(p1 == p3)  // true
//    println(p1 === p3) // true
//
//    println(p1 != p2)  // false
//    println(p1 != p3)  // false
//    println(p1 !== p3) // false


//    test()
//    val c: Calc = Calc {
//        override fun add(a: Int, b: Int) = a + b
//        override fun minus(a: Int, b: Int) = a - b
//    }


//    val p1 = Iphone15(memory = 256, price = 1050, color = "Purple")
//    val p2 = Iphone15(memory = 512, price = 1120, color = "Dark")
//    val p3 = Iphone15(memory = 128, price = 980, color = "Gray")
//    val p4 = Iphone15(memory = 256, price = 1050, color = "Silver")
//
//    println(Iphone15.getCount()) // ???
//    println(Iphone15.getCount()) // ???
//    println(Test.name)
//    println(Test.repeat(3))

//    val bag = Bag()
//    bag.putIn("Book")
//    bag.putIn("Laptop")
//    bag.putIn("Pencil")
//
//    for(item in bag)
//        print("$item ")
//    println("\n" + "=".repeat(20))


//    val b = A.B(A())
//    val a = A()
//    val c = a.C()
//    c.test()


}



//class A {
//    private val a = "class A"
//    class B(val a: A) {
//        val b = "class B"
//        fun test() {
//            println(b)
//            println(a.a)
//        }
//    }
//    inner class C {
//        val c = "class C"
//        val a = "a in class C"
//        fun test() {
//            println(c)
//            println(this@A.a)
//            println(a)
//        }
//    }
//}