fun main() {

//    val result1 = calc2(5, 10, func={ a, b -> a + b })
//    val result2 = calc2(5, 10, { a, b -> a + b })
//    val result3 = calc2(5, 10) { a, b -> a + b }

//    t({ println("Hello, World!")})
//    t {
//        println("Hello, World!")
//    }

//    for(index in 0..<5) {
//        println(index)
//    }
//    repeat(5) {
//        println(it)
//    }

//    val names1 = listOf(
//        "Mike", "Teresa", "John", "Sarah", "Monika"
//    )
//
//    val r = names1.joinToString(
//        prefix = "<<<",
//        postfix = ">>>",
//        separator = ", ",
//        limit = 3,
//        truncated = "..."
//    ) { name -> (name.length to name).toString() }
//    var r2 = names1.joinToString { it.uppercase() }
//    println(r)
    // <<<(4, Mike), (6, Teresa), (4, John), ...>>>
//    println(r2)
    // MIKE, TERESA, JOHN, SARAH, MONIKA

    // ====> Task 1
    myRepeat(5) {
        println(it)
    }

    // ====> Task 2
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val even = filter(nums) { it % 2 == 0 }
    val odd = filter(nums) { it % 2 != 0 }
    val gtFive = filter(nums) { it > 5 }
    val ltFive = filter(nums) { it < 5 }
    val test1 = filter(nums) { it % 3 == 0 }
    val test2 = filter(nums) { it < 0 }

    println(even)     // [2, 4, 6, 8, 10]
    println(odd)      // [1, 3, 5, 7, 9]
    println(gtFive)   // [6, 7, 8, 9, 10]
    println(ltFive)   // [1, 2, 3, 4]
    println(test1)    // [5, 10]
    println(test2)    // []

    // ====> Task 3
    println(any(even) { it % 2 != 0 })             // false
    println(any(ltFive) { it % 3 == 0 })           // true
    println(all(odd) { it % 2 != 0 })              // true
    println(all(listOf(-3, 1, -2, -8)) { it < 0 }) // false
}
fun filter() {

}

fun t(action: () -> Unit) = action()

fun calc2(a: Int, b: Int, func: (Int, Int) -> Int)
    = func(a, b)