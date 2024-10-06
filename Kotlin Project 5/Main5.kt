fun main() {
//    // ====> Task 1
//    val names = listOf(
//        "Mike", "Tom", "Anna", "Sam", "John"
//    )
//
//    println(recContains(names, "Anna"))   // true
//    println(recContains(names, "Teresa")) // false
//
//    // ====> Task 2
//    val nums = listOf(5, 1, 2, 3, 5, 1, 5, 5, 4)
//
//    println(recCount(nums, 5)) // 4
//    println(recCount(nums, 1)) // 2
//    println(recCount(nums, 3)) // 1
//    println(recCount(nums, 7)) // 0
//
//    // ====> Task 3
//    val numbers = listOf(5, 1, 2, 3, 5, 1, 5, 5, 4)
//
//    println(recDeleteElement(numbers, 5)) // [1, 2, 3, 1, 4]
//    println(recDeleteElement(numbers, 4)) // [5, 1, 2, 3, 5, 1, 5, 5]
//    println(recDeleteElement(numbers, 7)) // [5, 1, 2, 3, 5, 1, 5, 5, 4]
//
//    // ====> Task 4
//    val text = "Hello, World!!!"
//    val dict = recGetSymbolCount(text)
//
//    for((key, value) in dict.entries) {
//        println("$key -> $value")
//    }
//    // H -> 1
//    // e -> 1
//    // l -> 3
//    // o -> 2
//    // ....
//
//
//    val names2 = listOf(
//        "Naomi", "Tom", "Mike", "Jessica", "Nicole",
//        "Sam", "Teresa", "Monika", "Mark", "Scott", "Pagemaster",
//        "Ron", "Sarah", "John", "Simona", "Nina"
//    )
//
//    val getDict = getDictFromNames1(names2)
//    for ((key, value) in getDict.entries)  {
//        println("$key: $value")
//    }
//////        'N': ["Naomi", "Nicole", "Nina"],
//////        'T': ["Tom", "Teresa"],
//////        'M': ["Mike", "Monika", "Mark"],
//////        'J': ["Jessica", "John"],
//////        'S': ["Sam", "Scott", "Sarah", "Simona"],
//////        'R': ["Ron"]
//
//    // ====> Bonus
//    val getDict2 = getDictFromNames2(names2)
//    for ((key, value) in getDict2.entries)  {
//        println("$key: $value")
//    }

    // b is !is
    // b as as?

//    // [1, [2, 3, [4, 5, 6, [7, 8, 9, 10, [11, 12, 13, 14, 15]]]
//    val list = listOf(1, listOf(2, 3, listOf(4, 5, 6, listOf(7, 8, 9, 10, listOf(11, 12, 13, 14, 15), 10))))
//    var result = 0
//    for(item1 in list) {
//        if(item1 is List<*>) {
//            for(item2 in item1) {
//                if(item2 is List<*>) {
//                    for(item3 in item2) {
//                        result += item3 as Int
//                    }
//                } else {
//                    result += item2 as Int
//                }
//            }
//        } else {
//            result += item1 as Int
//        }
//    }

//    println(result)
//    println(listOf(1, listOf(2, 3)).slice(1..<2))
//    val list2 = listOf(
//        listOf(listOf(listOf(listOf(listOf(listOf(listOf(listOf(1)))))))),
//        listOf(listOf(listOf(listOf(listOf(3, listOf(listOf(listOf(listOf(listOf(listOf(listOf(2)))))))))))),
//        listOf(4)
//    )
//    println(recSum(listOf(1, listOf(2, 3), 4)))
//    println(recSum(list))
//    println(list2)
//    println(list2)

    // ====> Task
    val list1 = listOf(1, listOf(2, 3))
    val list2 = listOf(1, listOf(2, 3, listOf(4, 5, 6, listOf(7, 8, 9, 10, listOf(11, 12, 13, 14, 15), 10))))
    val list3 = listOf(
        listOf(listOf(listOf(listOf(listOf(listOf(listOf(listOf(1)))))))),
        listOf(listOf(listOf(listOf(listOf(3, listOf(listOf(listOf(listOf(listOf(listOf(listOf(2)))))))))))),
        listOf(4)
    )
    println(deepToString(list1))
    // [1, [2, 3]]
    println(deepToString(list2))
    // [1, [2, 3, [4, 5, 6, [7, 8, 9, 10, [11, 12, 13, 14, 15]]]
    println(deepToString(list3))
    // [[[[[[[[[1]]]]]]]], [[[[[3, [[[[[[[2]]]]]]]]]]]], [4]]
}
fun deepToString(list: List<Any>): String {
//    return list.toString()
}
fun recSum(list: List<Any>): Int { // [1, [2, 3], 4] ->
    var result = 0

    for(item in list) {
        result += if(item is List<*>) {
            recSum(item as List<Any>)
        } else {
            item as Int
        }
    }

    return result
}
// [1, [2, 3], 4]
// 1 + 5
// [[2, 3], 4]
// [2, 3]
// 2 + 3
// [3]
// 3 + 0
// 0

fun recContains(names: List<String>, name: String): Boolean {
    if(names.isEmpty())
        return false

    if(names[0] == name)
        return true

    return recContains(names.slice(1..names.lastIndex), name)
}
fun recCount(numbers: List<Int>, number: Int): Int {
    if(numbers.isEmpty())
        return 0

    return recCount(numbers.slice(1..numbers.lastIndex), number) + if(numbers[0] == number) 1 else 0
}
fun recDeleteElement(numbers: List<Int>, number: Int): List<Int> {
    if(numbers.isEmpty())
        return emptyList()

    val temp = recDeleteElement(numbers.slice(1..numbers.lastIndex), number)
    return (if(numbers[0] != number) listOf(numbers[0]) else emptyList()) + temp
}
fun recGetSymbolCount(s: String): MutableMap<Char, Int> {
    if(s.isEmpty())
        return mutableMapOf()

    val dict = recGetSymbolCount(s.substring(1))
    dict[s[0]] = (dict[s[0]] ?: 0) + 1
    return dict
}
fun getDictFromNames1(names: List<String>): MutableMap<Char, List<String>> {
    if(names.isEmpty())
        return mutableMapOf()

    val dict = getDictFromNames1(names.slice(1..names.lastIndex))
    dict[names[0][0]] = (dict[names[0][0]] ?: emptyList()) + listOf(names[0])
    return dict
}
fun getDictFromNames2(names: List<String>): MutableMap<Int, List<String>> {
    if(names.isEmpty())
        return mutableMapOf()

    val dict = getDictFromNames2(names.slice(1..names.lastIndex))
    dict[names[0].length] = (dict[names[0].length] ?: emptyList()) + listOf(names[0])
    return dict
}