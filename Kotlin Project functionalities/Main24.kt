fun getOnlyEven(list: List<Int>): List<Int> {
    val temp = mutableListOf<Int>()

    for(item in list)
        if(item % 2 == 0)
            temp += item

    return temp
}
fun getOnlyOdd(list: List<Int>): List<Int> {
    val temp = mutableListOf<Int>()

    for(item in list)
        if(item % 2 != 0)
            temp += item

    return temp
}
fun getOnlyGtFive(list: List<Int>): List<Int> {
    val temp = mutableListOf<Int>()

    for(item in list)
        if(item > 5)
            temp += item

    return temp
}
fun filter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    val temp = mutableListOf<Int>()

    for(item in list)
        if(predicate(item))
            temp += item

    return temp
}
fun isEven(item: Int) = item % 2 == 0
fun main() {
//    val arr = listOf(5, 1, 3, 2, 7, 9, 4)
//    val even = arr.filter(::isEven)
//    val odd = arr.filter { it % 2 != 0 }
//    val gtFive = arr.filter(fun(item: Int): Boolean { return item > 5 })
//    val even = filter(arr, ::isEven)
//    val odd = filter(arr, fun(item: Int) = item % 2 != 0)
//    val gtFive = filter(arr) { it > 5 }

//    println(even)   // [2, 4]
//    println(odd)    // [5, 1, 3, 7, 9]
//    println(gtFive) // [7, 9]

//    val arr = listOf(5, 1, 3, 2, 7, 9, 4)
//    val even = arr.filter { it % 2 == 0 }
//    val odd = arr.filterNot { it % 2 == 0 }
//    val r = arr.filterIndexed { index, num -> index % 2 != 0 && num % 2 != 0 }
//    val (even, odd) = arr.partition { it % 2 == 0 }

//    println(even) // [2, 4]
//    println(odd)  // [5, 1, 3, 7, 9]
//    println(r)    // [1, 9]

    // filter, filterNot, filterIndexed, filterNotNull, filterIsInstance
    // To
    // partition, map

//    val list = listOf(1, 2, 3, 4, 5)
//    val r1 = list.map { it * 10 }
//    val r2 = list.map { it to (it * 10) }
//
//    println(r1) // [10, 20, 30, 40, 50]
//    println(r2) // [(1, 10), (2, 20), (3, 30), (4, 40), (5, 50)]

//    val list = listOf(5, 1, 3, 4, 2)
//
//    println(list.sum())     // 15
//    println(list.max())     // 5
//    println(list.min())     // 1
//    println(list.average()) // 3.0

//    val names = listOf(
//        "Naomi", "Jessica", "Teresa",
//        "Sam", "Nicole", "John", "Sarah"
//    )
//    val sumLength = names.map { it.length }.sum()
//    val sumLength = names.sumOf { it.length }
//    val maxLength = names.maxOf { it.length }
//    val minLength = names.minOf { it.length }
//
//
//    println(sumLength)
//    println(maxLength)
//    println(minLength)

//    val names = listOf(
//        "naomi", "jessica", "teresa",
//        "sam", "nicole", "john", "sarah"
//    )
//    val r = names.map(String::length).sum()


//    val r = names.filter { 'a' !in it }
//                 .map(String::uppercase)  //.map { it.uppercase() }
//
//    println(r) // ["NICOLE", "JOHN"]

//    val nums = listOf(1, 3, 7, 5)
//    val r = nums.filter { it % 2 == 0 }.reduce { acc, num -> acc + num }

//    println(r)

//    val names = listOf<String?>(
//        "Tom", null, null, "Jessica",
//        "John", "Sam", null, "Rob"
//    )


//    println(names.filterNotNull())
//    println(names.filterNot { it == null })
//    println(names.filter { it != null })

//    val nums = listOf(1, 3, 5, 2)
//    val r = mutableListOf<Int>(5, 1)
//    nums.filterTo(r) { it % 2 == 0 }
//
//    println(r)

//    val list = listOf(
//        "Mike", 5, false, true, 10, "Sam", 2 to 5
//    )
//
//    println(list.filter { it is String })
//    println(list.filterIsInstance<String>())


//    testOrder()
}

fun testEncode() {
    val s1 = "aeeeffrgtt"
    val s2 = "abcdef"
    val s3 = "aavaaaccccccccccccccccccfgr"

    println(encode(s1)) // a1e3f2r1g1t2
    println(encode(s2)) // a1b1c1d1e1f1
    println(encode(s3)) // a2v1a3c18f1g1r1
}
fun testDecode() {
    val s1 = "a1e3f2r1g1t2"
    val s2 = "a1b1c1d1e1f1"
    val s3 = "a2v1a3c18f1g1r1"

    println(decode(s1)) // aeeeffrgtt
    println(decode(s2)) // abcdef
    println(decode(s3)) // aavaaaccccccccccccccccccfgr
}

fun orderWord(s: String)
    = s.split(' ')
       .sortedBy { "\\d".toRegex().find(it)?.value }
       .joinToString(" ") { "\\d".toRegex().replace(it, "") }

fun testOrder() {
    val s1 = "si4mple i2s te5xt thi1s a3"
    val s2 = "mos4t i2s wo9rld la6nguage Java1script popular5 i7n th8e t3he"

    println(orderWord(s1)) // this is a simple text
    println(orderWord(s2)) // Javascript is the most popular language in the world
}