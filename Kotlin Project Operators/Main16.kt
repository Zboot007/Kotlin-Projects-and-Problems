class MyNumber(var number: Int) : Comparable<MyNumber> {


    operator fun plus(other: MyNumber): MyNumber = MyNumber(number + other.number)
    operator fun plus(other: Int): MyNumber = MyNumber(number + other)
    operator fun minus(other: MyNumber): MyNumber = MyNumber(number - other.number)
    operator fun times(other: MyNumber): MyNumber = MyNumber(number * other.number)
    operator fun div(other: MyNumber): MyNumber = MyNumber(number / other.number)
    operator fun rem(other: MyNumber): MyNumber = MyNumber(number % other.number)

//    operator fun plusAssign(other: MyNumber): Unit {
//        number += other.number
//    }
    operator fun unaryMinus(): MyNumber = MyNumber(-number)
    operator fun unaryPlus(): MyNumber = MyNumber(+number)

    operator fun dec(): MyNumber {
        number -= 1
        return this
    }
    operator fun inc(): MyNumber = MyNumber(number + 1)
    operator fun rangeTo(other: MyNumber) = number..other.number
    operator fun rangeUntil(other: MyNumber) = number..<other.number
    override fun compareTo(other: MyNumber): Int = number.compareTo(other.number)

    infix fun createPoint(other: MyNumber) = Point5(number, other.number)
    override fun toString() = "$number"
}

class Box {
    private var list = mutableListOf<Int>()

    operator fun plusAssign(element: Int) { add(element) }
    operator fun plusAssign(elements: Iterable<Int>) { addAll(elements) }

    operator fun contains(element: Int) = element in list

    fun add(element: Int) = list.add(element)
    fun addAll(elements: Iterable<Int>) = list.addAll(elements)

    operator fun set(index: Int, value: Int) {
        list[index] = value
    }
    operator fun get(index: Int) = list[index]

    override fun toString() = "$list"
}

class Foo {
    operator fun invoke(a: Int, b: Int) = a + b
}

class Point5(
    val x: Int,
    val y: Int
) {
    override fun toString() = "Point(x: ${x}, y: ${y})"
}

fun main() {
    // ====> Task 1
    println(func(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)) // 55
    println(func(5)()()()()()(4)()(1)()) // 10
    println(func(1)(3)(7)) // 11

    // ====> Task 2
    val box = Box()
    box.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    println(box[4, 7])    // [5, 6, 7]
    println(box[2..<8]) // [3, 4, 5, 6, 7, 8]
    println(box[-1])  // 10
    println(box[-10]) // 1
    println(box[-5])  // 6

    // ====> Task 3
    box[3, 5] = emptyList<Int>()
    println(box) // [1, 2, 3, 6, 7, 8, 9, 10]
    box[2..<6] = setOf(33, 44, 55, 66, 77, 88, 99, 100)
    println(box) // [1, 2, 33, 44, 55, 66, 77, 88, 99, 100, 9, 10]
    box[-3] = 10
    println(box) // [1, 2, 33, 44, 55, 66, 77, 88, 99, 10, 9, 10]


//    println(Pair(5, 10))
//    println(5 to 10)

//    val s: String
//    val n1 = MyNumber(5)
//    val n2 = MyNumber(10)
//
//    println(n1.createPoint(n2))
//    println(n1 createPoint n2)
//    println(Point5(5, 10))
    // 0000_0010
//    println(2 shl 3)
//    val foo = Foo()
//
//    println(foo(5, 10))
//    println(foo.invoke(5, 10))

//    val box = Box()
//    box += listOf(10, 20, 30, 40, 50)
//
//    box[1] = 55
//
//    println(box[1]) // 20

//    val box = Box()
//    box += 5
//    box += listOf(10, 15)
//    //box.add(5)
//    //box.addAll(listOf(10, 15))
//
//    println(box.contains(10))  // true
//    println(!box.contains(10)) // false

//    println(10 in box)  // true
//    println(10 !in box) // false
//    println(box) // [5, 10, 15]


//    var a = MyNumber(5)
//    var b = MyNumber(10)
//    var c = MyNumber(2)
//    var d = MyNumber(3)
//    var e = MyNumber(7)

//    println(d..e) //
//    println(d..<e) //
//    println(++a) // 6
//    println(a)   // 6

//    println(a < b)
//    println(a > b)
//    println(a <= d)
//    println(a >= d)
//    println(-e)
//    a += b // a = a + b | a += b

    // 5 + 10 * 2 - 3 + 7
//    println(a + 5)
//    println(a.plus(b.times(c)).minus(d).plus(e))
//    println(a + b * c - d + e)
}
// u - + ++ --
// b + - * / %
// b += -= *= /= %=
// b > < >= <= == !=
// b in rangeTo rangeUntil
// () []