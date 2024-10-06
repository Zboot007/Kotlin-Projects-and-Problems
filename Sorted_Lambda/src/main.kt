fun main() {
    val words = listOf("apple", "banana", "kiwi", "strawberry")

    val sortedWords = words.sortedBy { it.length }

    println(sortedWords)
    // Ожидаемый результат: [kiwi, apple, banana, strawberry]
}