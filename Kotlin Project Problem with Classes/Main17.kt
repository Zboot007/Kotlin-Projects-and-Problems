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

    println(box1 == box2) // true
    println(box1 == box3) // false
    println(box1 == box4) // false

    println(box1.hashCode()) // 1
    println(box2.hashCode()) // 1
    println(box3.hashCode()) // 3
    println(box4.hashCode()) // 4




}