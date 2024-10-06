fun main() {
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
    println(test1)    // [3, 6, 9]
    println(test2)    // []
    // ====> Task 3
    println(any(even) { it % 2 != 0 })             // false
    println(any(ltFive) { it % 3 == 0 })           // true
    println(all(odd) { it % 2 != 0 })              // true
    println(all(listOf(-3, 1, -2, -8)) { it < 0 }) // false
}
fun myRepeat(times: Int, func: (Int) -> Unit) {
    var index = 0
    while(index < times) {
        func(index)
        index++
    }
}
fun filter(list: List<Int>, func: (Int) -> Boolean): MutableList<Int> {
    var index = 0
    var result = mutableListOf<Int>()
    while(index < list.size) {
        if(func(list[index]))
            result += list[index]
        index += 1
    }
    return result
}
fun any(list: List<Int>, func: (Int) -> Boolean): Boolean {
    var index = 0
    while(index < list.size) {
        if(func(list[index])) return true
        index += 1
    }
    return false
}
fun all(list: List<Int>, func: (Int) -> Boolean): Boolean {
    var index = 0
    var bool = true
    while(index < list.size) {
        if (func(list[index])) bool = true
        else return false
        index += 1
    }
    return bool
}