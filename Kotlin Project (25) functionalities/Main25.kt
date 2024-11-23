fun isPalindrome1(s: String): Boolean { // O(N / 2)
    var left = 0
    var right = s.lastIndex

    while(left < right) {
        if(s[left] != s[right])
            return false

        left += 1
        right -= 1
    }

    return true
}
fun isPalindrome2(s: String) // O(N / 2) + O(N)
    = s.reversed() == s

fun testIsPalindrome() {
//    val s1 = "abccba" // abccba
//    val s2 = "aklclclka"
//    val s3 = "akrcka"
//    val s4 = "rarrab"

//    println(isPalindrome1(s1)) // true
//    println(isPalindrome1(s2)) // true
//    println(isPalindrome1(s3)) // false
//    println(isPalindrome1(s4)) // false

//    println(isPalindrome2(s1)) // true
//    println(isPalindrome2(s2)) // true
//    println(isPalindrome2(s3)) // false
//    println(isPalindrome2(s4)) // false
}


fun func1(list: List<Int>): List<Int> {
    // take(count) | takeLast(count)
    // drop(count) | dropLast(count)
    // takeWhile((T) -> Boolean), takeLastWhile((T) -> Boolean),
    // dropWhile((T) -> Boolean), dropLastWhile((T) -> Boolean)

//    val r = list.sorted() // [1, 4, 5, 12]
//    return listOf(r[r.lastIndex-1], r[r.lastIndex])
//    return list.sorted().subList(list.size - 2, list.size)
    return list.sorted().takeLast(2)
}
fun test1() {
    val list1 = listOf(4, 1, 5, 12)
    val list2 = listOf(7, 3, 55, 88, 1, 88, 73)
    val list3 = listOf(2, 5, 1, 7, 4, 10, 3, 0, -5)

    println(list2.takeWhile { it < 50 })         // [7, 3]
    println(list2.takeLastWhile { it % 2 != 0 }) // [73]
    println(list2.dropWhile { it % 2 != 0 })     // [88, 1, 88, 73]
    println(list2.dropLastWhile { it > 50 })     // [7, 3, 55, 88, 1]

//    val r1 = func1(list1)
//    val r2 = func1(list2)
//    val r3 = func1(list3)

//    println(r1) // [5, 12]
//    println(r2) // [88, 88]
//    println(r3) // [7, 10]
}

fun func2(list: List<Int>): Int? {
    // first() | first((T) -> Boolean), last
    // firstOrNull, lastOrNull
    // single() | single((T) -> Boolean), singleOrNull
    // count() | count((T) -> Boolean)
    // sum() | sumOf((T) -> Int)
    // min() | minOf((T) -> Int)
    // max() | maxOf((T) -> Int)
    // average()
    return list.sorted().lastOrNull { it % 2 == 0 }
}
fun test2() {
//    val s1 = "thIs is A simple tExt"
//    val s2 = "PagEmAstEr"
//
//    println(s1.count()) // 21
//    println(s2.count()) // 10
//
//    println(s1.count { it.lowercase() in "aeiou" }) // 6
//    println(s2.lowercase().count { it in "aeiou" }) // 4

//    val nums = listOf(1, -5, 2, 3, -3, 4, 5, -7, -10, 6, 7, -3, -3, 8, 9, -2, 10, -2)
//    val countPositive = nums.count { it > 0 }
//    val sumNegative = nums.sumOf { if(it < 0) it else 0 }
//
//    println(countPositive) // 10
//    println(sumNegative)   // -35

//    val list1 = listOf(4, 1, 5, 11)
//    val list2 = listOf(7, 3, 55, 88, 1, 68, 73)
//    val list3 = listOf(2, 5, 1, 7, 4, 10, 3, 0, -5)

//    val arr = listOf(5, 7, 1, 2, 9, 11, 13)
//    val arr2 = listOf(2, 16, 17, 22, 18, 10, 4)
//
//    println(arr.single { it % 2 == 0 })  // 2
//    println(arr2.single { it % 2 != 0 }) // 17

//    println(listOf<Int>(1, 2).single())  // error
//    println(listOf<Int>(5).singleOrNull()) // 5

//    println(func2(list1)) // 11
//    println(func2(list2)) // 88
//    println(func2(list3)) // 10
//    println(func2(emptyList())) // ???
}

fun test3() {
    // all((T) -> Boolean)
    // none() | none((T) -> Boolean)
    // any() | any((T) -> Boolean)
//    val list1 = listOf(5, 1, 4, 3, 7)
//    val list2 = listOf(8, 4, 2, 6, 10, 14)
//    val list3 = listOf(25, 55, 72, 93, 30)
//
//    println(list1.all { it % 2 != 0 }) // false
//    println(list2.all { it % 2 == 0 }) // true
//    println(list3.all { it >= 30 })    // false
//
//    println(list2.none { it % 2 != 0 }) // true
//    println(list3.none { it > 0 })      // false
//
//    println(list1.any { it % 2 == 0 }) // true
//    println(list2.any { it % 2 != 0 }) // false
//    println(list3.any { it < 0 })      // false
}

fun test4() {
    // getOrNull(index: Int): T?
    // getOrElse(index: Int, () -> T): T
    // elementAt(index: Int): T | error
    // elementAtOrNull(index: Int): T?
    // elementAtOrElse(index: Int, () -> T): T

//    val list = listOf("Mike", "Tom", "Naomi")

//    println(list.get(0)) // list[0]
//    println(list.getOrNull(3) ?: "Guest")  // null
//    println(list.getOrElse(3) { "Guest" }) // null
//    println(list.elementAt(3))             // error
//    println(list.elementAtOrNull(3) ?: "Guest") // null
//    println(list.elementAtOrElse(3) { "Guest" }) // null
}
fun main() {
//    testIsPalindrome()
//    test1()
//    test2()
//    test3()
//    test4()

    // forEach, forEachIndexed
    // onEach, onEachIndexed

    val names = listOf("Naomi", "Tom", "Sarah")

    names.onEach(::println)
         .map(String::uppercase)
         .onEach(::println)
         .filter { it.length < 4 }
         .onEach(::println)

//    names.forEach {
//        println(it)
//    }
//    names.forEach(::println)

//    names.forEachIndexed { index, name -> println("$index -> $name") }

//    for(name in names)
//        println(name)
}