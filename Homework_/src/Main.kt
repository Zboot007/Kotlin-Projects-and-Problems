fun main() {
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
    val text = "Hello, World!!!H"
    val dict = recGetSymbolCount(text)

    for((key, value) in dict.entries) {
        println("$key -> $value")
    }
    // H -> 1
    // e -> 1
    // l -> 3
    // o -> 2
    // ....

    // Task 5
    val names2 = listOf(
        "Naomi", "Tom", "Mike", "Jessica", "Nicole",
        "Sam", "Teresa", "Monika", "Mark", "Scott", "Pagemaster",
        "Ron", "Sarah", "John", "Simona", "Nina"
    )

    val getDict = getDictFromNames1(names2)
    for ((key, value) in getDict.entries)  {
        println("$key: $value")
    }
//        'N': ["Naomi", "Nicole", "Nina"],
//        'T': ["Tom", "Teresa"],
//        'M': ["Mike", "Monika", "Mark"],
//        'J': ["Jessica", "John"],
//        'S': ["Sam", "Scott", "Sarah", "Simona"],
//        'R': ["Ron"]
    // ====> Bonus
    val getDict2 = getDictFromNames2(names2)
    for ((key, value) in getDict2.entries)  {
        println("$key: $value")
    }
//        3: ["Ron", "Sam", "Tom"],
//        4: ["Nina", "Mike", "Mark", "John"],
//        5: ["Naomi", "Scott", "Sarah"],
//        6: ["Nicole", "Teresa", "Monika", "Simona"],
//        7: ["Jessica"]
}

fun recContains(names: List<String>, str: String, index: Int = 0): Boolean {
    if(names[index] == str) return true
    else if(index < names.size - 1){
        if(recContains(names, str, index + 1))
            return true
        else
            return false
    }
    return false
}
fun recCount(nums: List<Int>, eq: Int, index: Int = 0, counter: Int = 0): Int {
    if(nums[index] == eq && nums.size - 1 > index)
        return recCount(nums, eq, index + 1, counter + 1)
    else if(index < nums.size - 1)
        return recCount(nums, eq, index + 1, counter)
    return counter
}
fun recDeleteElement(numbers: List<Int>, delete: Int, newList: List<Int> = mutableListOf(), index: Int = 0): List<Int>{
    if(numbers[index] != delete && numbers.size - 1 > index)
        return recDeleteElement(numbers, delete, newList + numbers[index], index + 1)
    else if(numbers.size - 1 > index)
        return recDeleteElement(numbers, delete, newList, index + 1)
    else if(numbers.size - 1 == index && numbers[index] != delete)
        return newList + numbers[index]
    return newList
}
fun recGetSymbolCount(str: String, index: Int = 0, index_S: Int = 0, counter: Int = 0, map: MutableMap<Char, Int> = mutableMapOf()): MutableMap<Char, Int> {
    if(str[index_S] == str[index] && index < str.length - 1 && index_S < str.length - 1) {
        return recGetSymbolCount(str, index + 1, index_S, counter + 1, map)
    } else if(str[index_S] != str[index] && index < str.length - 1)
        return recGetSymbolCount(str, index + 1, index_S, counter, map)
    else if(index == str.length - 1) {
        map.put(str[index_S], counter)
        return recGetSymbolCount(str, index = 0, index_S + 1, counter = 0, map)
    }
    if(index == str.length - 1 && index_S == 0){
        if(str[index] !in map.keys) map.put(str[index], 0)
        val a = map.get(str[index])!!
        recGetSymbolCount(str, index, index, a + 1, map)
    }
    return map
}
fun getDictFromNames1(names: List<String>, ch: Char = names[0][0], namesIndex: Int = 0, index: Int = 0, chIndex: Int = 0,
              map: MutableMap<Char, MutableList<String>> = mutableMapOf()): MutableMap<Char, MutableList<String>> {
    if(names[namesIndex][index] == ch && names.size - 1 >= namesIndex) {
        if(namesIndex < names.size - 1 && ch !in map.keys) {
            map.put(ch, mutableListOf())
        }
        map.get(ch)?.add(names[namesIndex])
        if(names.size - 1 > namesIndex)
        return getDictFromNames1(names, ch, namesIndex + 1, index, chIndex, map)
    } else if(names[namesIndex][index] != ch && names[namesIndex][index] !in map.keys && namesIndex <= names.size - 1)
        return getDictFromNames1(names, ch = names[chIndex + 1][index], namesIndex = 0, index,chIndex + 1, map)
    else if(names[namesIndex][index] != ch && names.size - 1 > namesIndex) {
        return getDictFromNames1(names, ch, namesIndex + 1, index, chIndex, map)
    }
    return map
}
fun getDictFromNames2(names: List<String>, index: Int = 0, map: MutableMap<Int, MutableList<String>> = mutableMapOf()): MutableMap<Int, MutableList<String>> {
    if(index < names.size - 1) {
        if(names[index].length !in map.keys) map.put(names[index].length, mutableListOf())
        map.get(names[index].length)?.add(names[index])
        return getDictFromNames2(names, index + 1, map)
    }
    if(index < names.size - 1) {
        if(names[index].length !in map.keys) map.put(names[index].length, mutableListOf())
        map.get(names[index].length)?.add(names[index])
    }
    return map.toSortedMap()
}