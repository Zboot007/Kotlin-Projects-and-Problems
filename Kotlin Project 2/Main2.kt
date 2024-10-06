fun main() {
    // while(...) { ... } do { ... } while(...)
    // break continue
    // if(...) [{ ... }] [else if(...) { } else {}]
    // when(...) { ... }
    // in !in
    // 1 in [5, 1, 3] == [5, 1, 3].contains(1)
    // 1 !in [5, 1, 3] == ![5, 1, 3].contains(1)
//    val friends = 0
//    val result = if(friends >= 5) {
//        var b = 5
//        b += 1
//        "Едем в горы!"
//    } else if(friends >= 1) {
//        "Идем в кино!"
//    } else {
//        "Останусь дома!"
//    }
//    val result: String
//    when(friends) {
//        in (1..4) -> result = "Идем в кино!"
//        in (5..100) -> result = "Едем в горы!"
////        else -> result = "Останусь дома!"
//    }

    // 2..5         -> 2, 3, 4, 5
    // 2..<5        -> 2, 3, 4
    // 10 downTo 5  -> 10, 9, 8, 7, 6, 5
    // 2..10 step 2 -> 2, 4, 6, 8, 10

//    val r1 = 2..5
//    val r2 = 2..< 5
//    val r3 = 10 downTo 5
//    println(result)

//    for(index in 10 downTo 1 step 3)
//        print("$index ")

//    val age = 25
//    val state = when(age) {
//        in (1..<7) -> "Ребенок"
//        in (7..<17) -> "Школьник"
//        in (17..<24) -> "Студент"
//        in (24..<65) -> "Рабочий"
//        in (65..110) -> "Пенсионер"
//        else -> "Неверный возраст"
//    }
//    val state = if(age >= 1 && age < 7)
//            "Ребенок"
//        else if(age >= 7 && age < 17)
//            "Школьник"
//        else if(age >= 17 && age < 24)
//            "Студент"
//        else if(age >= 25 && age < 65)
//            "Рабочий"
//        else if(age >= 65 && age <= 110)
//            "Пенсионер"
//        else
//            "Неверный возраст"

//    println(state)

//   display()
//   display(name = "Mike")
//   display("Hi","Anna")

//    println(max(5, 1, 2, 3, 7, 4, 1))

//    println(add(5, 10))
//    println(abs(-5))
//    println(abs(5))
//
//    println(getState(25))

//    val point2D: Pair<Int, Int> = 5 to 10, 3 to 12 // Pair(5, 10)
//    val x = point2D.first
//    val y = point2D.second
//    val (x, y) = point2D
//    println(x)
//    println(y)

//    val point3D: Triple<Int, Int, Int> = Triple(5, 2, -1)
//    val (x, y, z) = point3D

    // List<type> <- MutableList<type>
    // Set<type>  <- MutableSet<type>
    // Map<type>  <- MutableMap<type>

    // listOf<type>(...) | mutableListOf<type>(...)
    // setOf<type>(...) | mutableSetOf<type>(...)
    // mapOf<type>(...) | mutableMapOf<type>(...)
//    var l = listOf(5)
//    l -= 7

//    val list = mutableListOf<Int>()

//    list.add(5) // [5]
//    list.addAll(listOf(7, 8, 9, 10)) // [5, 7, 8, 9, 10]
//    list += 5
//    list += listOf(7, 8, 9, 10)
//    list.add(1, 6)
//    list.addAll(0, listOf(1, 2, 3, 4))
//    list.addFirst(0)
//    list.addLast(11)

    // ====> contains | in, indexOf, lastIndexOf, containsAll
//    println(list.contains(5))  // true
//    println(!list.contains(5)) // false
//    println(5 in list)         // true
//    println(5 !in list)        // false
//    println(list.containsAll(listOf(5, 10)))  // true

//    list -= 5
//    list -= listOf(0, 11, 6)
//
//    val (a, b, c, d, e) = list
//
//    println(list)  // [1, 2, 3, 4, 7, 8, 9, 10]

//    val phoneList = mutableMapOf(
//        "Tom" to "777",
//        "Nicole" to "333",
//        "Mike" to "222"
//    )
//    if("Teresa" !in phoneList)
//        phoneList["Teresa"] = "555"
//
//    println(phoneList.entries.toList())
//    println(phoneList.keys.toList())
//    println(phoneList.values.toSet())

//    print("Enter your name: ")
//    val name = readln()
//    println(name)
}
fun add(a: Int, b: Int) = a + b
fun abs(num: Int) = if(num < 0) -num else num
fun getState(age: Int) = when(age) {
        in (1..<7) -> "Ребенок"
        in (7..<17) -> "Школьник"
        in (17..<24) -> "Студент"
        in (24..<65) -> "Рабочий"
        in (65..110) -> "Пенсионер"
        else -> "Неверный возраст"
    }
fun max(vararg args: Int): Int {
    var temp = args[0]

    for(num in args)
        if(num > temp)
            temp = num

    return temp
}
fun display(
    hi: String = "Hello",
    name: String = "Guest"
) {
    println("$hi, $name!")
}

//fun display(hi: String, name: String) {
//    println("$hi, $name!")
//}
//fun display(name: String) {
//    display("Hello", name)
//}
//fun display() {
//    display("Hello", "Guest")
//}

