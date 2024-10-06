import kotlin.math.truncate

fun main() {
    // ====> Task
    val list1 = listOf(1, listOf(2, 3))
    val list2 = listOf(1, listOf(2, 3, listOf(4, 5, 6, listOf(7, 8, 9, 10, listOf(11, 12, 13, 14, 15), 10))))
    val list3 = listOf(
        listOf(listOf(listOf(listOf(listOf(listOf(listOf(listOf(1)))))))),
        listOf(listOf(listOf(listOf(listOf(3, listOf(listOf(listOf(listOf(listOf(listOf(listOf(2)))))))))))),
        listOf(4)
    )
    println("Original: $list1")
    println(deepToString(list1))
        // [1, [2, 3]]
    println("Original: $list2")
    println(deepToString(list2))
    // [1, [2, 3, [4, 5, 6, [7, 8, 9, 10, [11, 12, 13, 14, 15], 10]]
    println("Original: $list3")
    println(deepToString(list3))
    // [[[[[[[[[1]]]]]]]], [[[[[3, [[[[[[[2]]]]]]]]]]]], [4]]
}
fun deepToString(list: List<Any>): String {
    var result = "["
    for(item in list.indices) {
        if(list[item] is List<*>) {
            result += deepToString(list[item] as List<Any>)
            result += if(list.size - 1 != item)
                ", "
            else
                ""
        } else {
            result += if(list.size - 1 != item)
                "${list[item]}, "
            else
                "${list[item]}"
        }
    }
    return "$result]"
}