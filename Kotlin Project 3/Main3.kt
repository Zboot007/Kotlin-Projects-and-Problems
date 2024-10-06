

fun main() {
//    val text = "thIs is simplE text"
//    println(removeVowels2(text))

    // Any? <- Any <- ... Int? <- Int

//    println(max2(5, 1, 7, 3, 4, 2))  // 7
//    println(max2(5)) // 5
//    println(max2()?.plus(5)) // ???
//    println(max2(-5, 0, -3) + 5) // ???
//    println(max2(-5, 0, -3)?.plus(5)) // ???
//    var name: String? = null
//    name = name ?: "Guest" // if(name != null) name else "Guest"
//    println(name)

//    val input: String? = null
//    val length: Int = input?.length ?: 0
//    val length: Int = if(input != null)
//                          input.length
//                      else
//                          0

//    println(length)

    // ?. ?: !!

//    val phoneList: List<Pair<String, List<String?>?>?>? = listOf(
//        "Mike" to listOf("555", null, "222"),
//        "John" to listOf(null, "333", "111", "777"),
//        "Anna" to null,
//        null
//    )
//
//    println(phoneList?.get(0)?.second?.get(1)?.length ?: 0)


    // ====> Task 1
    val one = listOf(1, 3, 7)
    val two = listOf(2, 4, 5, 6, 8, 9, 10)
    val three = merge(one, two)
    println(three)
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    // ====> Task 8
    val numbers = mutableListOf(1, 2, -3, 5, -7, -9, 6, 2, 8, -4, -1, 0)
    shiftNegative(numbers)
    println(numbers)
    // [1, 2, 5, 6, 2, 8, 0, -3, -7, -9, -4, -1]

}

fun max2(vararg args: Int): Int? {
    if(args.isEmpty())
        return null

    var temp = args[0]

    for(item in args)
        if(item > temp)
            temp = item

    return temp
}

fun removeVowels2(s: String)
    = s.replace(Regex("[^aeiou]", RegexOption.IGNORE_CASE), "")
fun removeVowels(s: String): String {
    val str = StringBuilder()
    for(symbol in s)
        if(symbol !in "aeiouAEIOU")
            str.append(symbol)
    return str.toString()
}