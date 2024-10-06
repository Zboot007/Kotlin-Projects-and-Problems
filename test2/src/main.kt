// task 1
//fun main() {
//    val expression = readlnOrNull()
//    println(if(expression!!.isNotEmpty()) getSum(expression) else null)
//}
//fun getSum(expression: String): Int {
//    val str = expression.split(" ")
//    return str[0].toInt() + str[1].toInt()
//}
// task 2
//fun main() {
//    val s = readln()
//    val j = readln()
//    println(getResult(s, j))
//}
//fun getResult(s: String, j: String): Int {
//    var counter = 0
//    for(s in s) {
//        for(j in j) {
//            if(s == j) {
//                counter += 1
//            }
//        }
//    }
//    return counter - s.length
//}
//data class Developer(val name: String) {
//    var age: Int = 0
//}
//class User(val name: String)
//    val firstUser = User("Ivan")
//    val secondUser = User("Ivan")
//
//    val hashSet = setOf(firstUser, secondUser)
//
//    println("The set size is ${hashSet.size}")
//fun main() {
//    val expression = readln()
//
//    val arr = expression.split(" ")
//
//    if(arr[0].toInt() + arr[1].toInt() == arr[2].toInt())
//        println("YES")
//    else if(arr[0].toInt() + arr[2].toInt() == arr[1].toInt())
//        println("YES")
//    else if(arr[1].toInt() + arr[2].toInt() == arr[0].toInt())
//        println("YES")
//    else
//        println("NO")
//}
//fun a(): String { val a = return "" }
//fun main() {
//    val expression = readln()!!
//    if(expression.isEmpty())
//        println(0)
//    else {
//        var counter = 0
//        val set = mutableSetOf<String>()
//        val list = expression.split("")
//        println(list)
//        for (element in list) {
//            if (!set.contains(element)) {
//                set += element
//            } else {
//                counter += 1
//            }
//        }
//        println(counter)
//    }
//}
//fun main() {
//    val n = readLine()?.toInt() // Читаем количество слов
//    val words = mutableListOf<String>()
//
//    // Читаем слова
//    if (n != null) {
//        repeat(n) {
//            words.add(readLine()!!)
//        }
//    }
//
//    // Определяем гласные
//    val vowels = setOf('a', 'e', 'i', 'o', 'u')
//
//    // Сортируем слова
//    val sortedWords = words.sortedWith(
//        compareByDescending<String> { word ->
//            word.count { it in vowels } // Количество гласных
//        }.thenBy { it.length } // Длина слова
//    )
//
//    // Выводим результат
//    for (word in sortedWords) {
//        println(word)
//    }
//}
//fun main() {
//    val n = readLine()!!.toInt()
//    val words = mutableListOf<String>()
//    for (i in 1..n) {
//        val word = readLine()!!
//        words.add(word)
//    }
//    val vowels = setOf('a', 'e', 'i', 'o', 'u')
//    words.sortWith { word1, word2 ->
//        val vowelCount1 = word1.count { it in vowels }
//        val vowelCount2 = word2.count { it in vowels }
//
//        if (vowelCount1 != vowelCount2) {
//            vowelCount2 - vowelCount1
//        } else {
//            word1.length - word2.length
//        }
//    }
//    for (word in words) {
//        println(word)
//    }
//}
fun main() {
    val list = listOf(1, 2, 3, 5, 7, 8, 9, 13)
    println(transferBySequence(list)) // "1-3, 5, 7-9, 13"
}

fun transferBySequence(list: List<Int>): String {
    var result = ""
    var start = list[0]

    for (i in 1 until list.size) {
        if (list[i] != list[i - 1] + 1) {
            // Handle sequence or single number
            result += if (start == list[i - 1]) {
                "$start, "
            } else {
                "$start-${list[i - 1]}, "
            }
            start = list[i] // Update start for the next sequence
        }
    }
    // Handle the last sequence or number
    result += if (start == list.last()) {
        "$start"
    } else {
        "$start-${list.last()}"
    }

    return result
}