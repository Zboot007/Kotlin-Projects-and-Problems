fun main() {
    //    tRec(1)
    //    println(recSum(nums))

    //    val name = "Mike"
    //    println(recReverseString(name)) // ekiM

//    val nums = listOf(5, 7, 1, 2, 3)
//    println(recMax(nums))

    // ====> Task 1
    val names = listOf(
        "Mike", "Tom", "Anna", "Sam", "John"
    )

    println(recContains(names, "Anna"))   // true
    println(recContains(names, "Teresa")) // false

    // ====> Task 2
    val nums = listOf(5, 1, 2, 3, 5, 1, 5, 5, 4)

    println(recCount(nums, 5)) // 4
    println(recCount(nums, 1)) // 2
    println(recCount(nums, 3)) // 1
    println(recCount(nums, 7)) // 0

    // ====> Task 3
    val numbers = listOf(5, 1, 2, 3, 5, 1, 5, 5, 4)

    println(recDeleteElement(numbers, 5)) // [1, 2, 3, 1, 4]
    println(recDeleteElement(numbers, 4)) // [5, 1, 2, 3, 5, 1, 5, 5]
    println(recDeleteElement(numbers, 7)) // [5, 1, 2, 3, 5, 1, 5, 5, 4]

    // ====> Task 4
    val text = "Hello, World!!!"
    val dict = recGetSymbolCount(text)

    for((key, value) in dict.entries) {
        println("$key -> $value")
    }
    // H -> 1
    // e -> 1
    // l -> 3
    // o -> 2
    // ....


    val names2 = listOf(
        listOf(
            "Naomi", "Tom", "Mike", "Jessica", "Nicole",
            "Sam", "Teresa", "Monika", "Mark", "Scott", "Pagemaster",
            "Ron", "Sarah", "John", "Simona", "Nina"
        )
    )

    val getDict = getDictFromNames1(names)
    for ((key, value) in getDict.entries)  {
        println("$key: $value")
    }
////        'N': ["Naomi", "Nicole", "Nina"],
////        'T': ["Tom", "Teresa"],
////        'M': ["Mike", "Monika", "Mark"],
////        'J': ["Jessica", "John"],
////        'S': ["Sam", "Scott", "Sarah", "Simona"],
////        'R': ["Ron"]

    // ====> Bonus
    val getDict2 = getDictFromNames2(names)
    for ((key, value) in getDict2.entries)  {
        println("$key: $value")
    }


}
fun recMax(list: List<Int>): Int {
    if(list.size == 1)
        return list[0]

    val temp = recMax(list.slice(1..<list.size))
    return if(temp > list[0]) temp else list[0]
}
// Mike
// ike
// ke
// e
// ""
// ===
// Mike
// Mik
// Mi
// M
// ""

// M + "ike" -> "Mike"
// i + "ke" -> "ike"
// k + "e" -> "ke"
// e + "" -> "e"
// ""

// "eki" + M -> "ekiM"
// "ek" + i -> "eki"
// "e" + k -> "ek"
// "" + e -> "e"
// ""
fun recReverseString(s: String): String {
    if(s.isEmpty())
        return ""

//    return s[0] + recReverseString(s.substring(1)) // 1
    return recReverseString(s.substring(1)) + s[0] // 2

    // ===

//    return s[s.lastIndex] + recReverseString(s.substring(0, s.lastIndex)) // 1
//    return recReverseString(s.substring(0, s.lastIndex)) + s[s.lastIndex] // 2
}
fun recSum(list: List<Int>, index: Int): Int
    = if(index >= list.size) 0 else list[index] + recSum(list, index + 1)
fun recSum(list: List<Int>) = recSum(list, 0)
fun tRec(count: Int) {
    if(count > 5)
        return

    println("Круг -> $count")
    tRec(count + 1)
}
fun t(count: Int) {
    var counter = count
    while(counter <= 5) {
        println("Круг -> $counter")
        counter += 1
    }
}





