import kotlin.math.absoluteValue

fun main() {
    // Problem 1: Flatten a Deeply Nested List🙄🤔✨
    val nestedList: List<Any> = listOf(1, listOf(2, listOf(3, 4), 5), 6)
    println(flattenList(nestedList)) // Output: [1, 2, 3, 4, 5, 6]
    // Problem 2: Map Function with Optional Transformation
    val pairs = listOf(1 to "one", 2 to "two", 3 to "three", 4 to "four") //🤧
    println(mapWithCondition(pairs)) // Output: [(1, "one"), (2, "TWO"), (3, "three"), (4, "FOUR")]
    // Problem 3: FlatMap with Frequency Counting 🤕
    val words = listOf("apple", "banana", "cherry", "apple", "banana", "apple")
    println(countWordFrequency(words)) // Output: {apple=3, banana=2, cherry=1}
    // Problem 4: Flatten a List of Maps🤒
    val listOfMaps = listOf(
        mapOf("A" to listOf(1, 2), "B" to listOf(3, 4)),
        mapOf("C" to listOf(5, 6), "D" to listOf(7, 8))
    )
    println(flattenListOfMaps(listOfMaps)) // Output: [(A, 1), (A, 2), (B, 3), (B, 4), (C, 5), (C, 6), (D, 7), (D, 8)]
    // Пример 1: Сглаживание списка карт
    val listOfMaps_2 = listOf(
        mapOf("A" to listOf(1, 2), "B" to listOf(3, 4)),
        mapOf("C" to listOf(5, 6), "D" to listOf(7, 8))
    )
    println(flattenListOfMaps_2(listOfMaps_2))
    // Output: [(A, 1), (A, 2), (B, 3), (B, 4), (C, 5), (C, 6), (D, 7), (D, 8)]
    // Пример 2: Сглаживание списка карт с пользователями
    val listOfUsers = listOf(
        mapOf("Alice" to listOf(30, 31), "Bob" to listOf(25)),
        mapOf("Charlie" to listOf(35), "Diana" to listOf(28, 29))
    )
    println(flattenUserAges(listOfUsers))
    // Output: [(Alice, 30), (Alice, 31), (Bob, 25), (Charlie, 35), (Diana, 28), (Diana, 29)]
    // Пример 3: Сглаживание списка карт с товарами
    val listOfProducts = listOf(
        mapOf("Laptop" to listOf(999.99, 1099.99), "Phone" to listOf(699.99)),
        mapOf("Tablet" to listOf(399.99), "Smartwatch" to listOf(199.99, 249.99))
    )
    println(flattenProductPrices(listOfProducts))
    // Output: [(Laptop, 999.99), (Laptop, 1099.99), (Phone, 699.99), (Tablet, 399.99), (Smartwatch, 199.99), (Smartwatch, 249.99)]
    // Problem 5: FlatMap with Condition 🤕
    val strings = listOf("abc", "123", "xyz", "1a2b", "def")
    println(flatMapWithoutNumbers(strings)) // Output: [a, b, c, x, y, z, d, e, f]
    // Problem 6: Nested List Transformations
    val listOfLists = listOf(listOf(1, 2), listOf(3, 4), listOf(5))
    println(squareAndFlatten(listOfLists)) // Output: [1, 4, 9, 16, 25]
    // Problem 7: Map Nested Structures
    val nestedPairs = listOf(listOf(1 to 2, 3 to 4), listOf(5 to 6))
    println(mapNestedPairs(nestedPairs)) // Output: [(2, 4), (6, 8), (10, 12)]
    // Problem 8: FlatMap for Substrings
    val stringList = listOf("cat", "dog", "bat")
    println(flatMapSubstrings(stringList)) // Output: [c, ca, cat, d, do, dog, b, ba, bat]
    // Problem 9: Transforming a Tree-Like Structure
    val tree = listOf(Node(1, listOf(Node(2), Node(3))), Node(4))
    println(flattenTree(tree)) // Output: [1, 2, 3, 4]
    // Problem 10: Map and Filter
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(mapAndFilter(numbers)) // Output: [4, 16, 36]
}
fun flattenList(nestedList: List<*>): List<*> /**/ { // (┬┬﹏┬┬)
    return nestedList.flatMap {
        when(it) {
            is List<*> -> flattenList(it)
            else -> listOf(it)
        }
    }
}
fun mapWithCondition(pairs: List<Pair<Int, String>>): List<Pair<Int, String>> /*💨*/ {
    return pairs.map { if(it.first % 2 == 0) it.first to it.second.uppercase() else it }
}
fun countWordFrequency(words: List<String>): Map<String, Int> /*💢*/ {
    return words.groupingBy { it }.eachCount()
}
fun flattenListOfMaps(listOfMaps: List<Map<String, List<Int>>>): List<Pair<String, Int>> /*!!!*/ {
    return listOfMaps.flatMap {
        map -> map.flatMap {
            (key, value) -> value.map {
                number -> key to number
            }
        }
    }
}
fun flattenListOfMaps_2(listOfMaps: List<Map<String, List<Int>>>): String /*!!!*/ {
    return listOfMaps.flatMap {
        map -> map.flatMap {
            (key, value) -> value.map {
                number -> mapOf(key to number)
            }
        }
    }.joinToString(prefix = "<<<", postfix = ">>>", separator = ", ")
}
fun flattenUserAges(listOfUsers: List<Map<String, List<Int>>>): List<Pair<String, Int>> /*!!!*/ {
    return listOfUsers.flatMap {
        map -> map.flatMap {
            (key, value) -> value.map {
                number -> key to number
            }
        }
    }
}
fun flattenProductPrices(listOfProducts: List<Map<String, List<Double>>>): List<Pair<String, Double>> /*!!!*/ {
    val result = mutableListOf<Pair<String, Double>>()
    listOfProducts.forEach { map ->
        map.forEach { (key, value) ->
            value.forEach { number -> result.add(key to number)
            }
        }
    }
    return result
}
fun flatMapWithoutNumbers(strings: List<String>): List<Char> /*!(!)!*/ {
    return strings.flatMap { str ->
        str.flatMap { char -> if(!char.isDigit()) listOf(char) else emptyList() }
    }
}
fun squareAndFlatten(listOfLists: List<List<Int>>): List<Int> {
    return listOfLists.flatMap { lists -> lists.map { numbers -> numbers * numbers } }
}
fun mapNestedPairs(nestedPairs: List<List<Pair<Int, Int>>>): List<Pair<Int, Int>> /*💢*/ {
    return nestedPairs.flatMap { list -> list.flatMap { pair -> listOf(pair.first * 2 to pair.second * 2) } }
}
fun flatMapSubstrings(stringList: List<String>): List<String> /*!!!*/ {
    return stringList.flatMap { str ->
        (1..str.length).flatMap { lastIndex ->
        listOf(str.substring(0, lastIndex))
        }
    }
}
data class Node<TNode>(var value: TNode, var children: List<Node<TNode>> = emptyList() )
// Define the Node class for Problem 9
fun flattenTree(tree: List<Node<Int>>): List<Int> /*!!!*/ {
    return tree.flatMap { node ->
        listOf(node.value) + flattenTree(node.children)
    }
}
fun mapAndFilter(numbers: List<Int>): List<Int> {
    return numbers.filter { transformator -> transformator % 2 == 0 }
        .flatMap { transformer -> listOf(transformer * transformer) }
}