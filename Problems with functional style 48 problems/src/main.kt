import kotlin.math.sqrt

fun main() {
//    // Sample data for the problems
//    val numbers_1 = listOf(8, 15, 3, 10, 4, 9) // For first() and firstOrNull()
//    val words_1 = listOf("apple", "banana", "grape", "blueberry", "zucchini") // For first() and firstOrNull()
//    val ages_1 = listOf(22, 35, 18, 45, 30) // For first()
//    val temperatures_1 = listOf(15, 22, 30, 25, 20) // For last() and lastOrNull()
//    val products_1 = listOf(50.0, 150.0, 99.99, 120.0) // For firstOrNull()
//    val prices_1 = listOf(5.0, 3.0, 10.0, 15.0, 1.0) // For lastOrNull() and count()
//    val names_1 = listOf("Alice", "Bob", "Sam", "Tom", "Max") // For last() and single()
//
//    // Problems for first()
//    println("First number divisible by 4: ")
//    println(numbers_1.first { it % 4 == 0 })
//    // Output: 8 (easy)
//
//    println("First string starting with 'b': ")
//    println(words_1.first { it.startsWith('a') })
//    // Output: apple (easy)
//
//    println("First age greater than 30:")
//    println(ages_1.first { it > 30 })
//    // Output: 35 (medium)
//
//    // Problems for firstOrNull()
//    println("First even number or null if none exist:")
//    println(numbers_1.firstOrNull { it % 2 == 0 })
//    // Output: 8 (easy)
//
//    println("First word starting with 'z' or null if none exist:")
//    println(words_1.firstOrNull { it.startsWith('z') })
//    // Output: zucchini (medium)
//
//    println("First product priced over $100 or null if none exist:")
//    println(products_1.firstOrNull { it > 100 })
//    // Output: 150.0 (medium)
//
//    // Problems for last()
//    println("Last odd number:")
//    println(numbers_1.last { it % 2 == 1 })
//    // Output: 9 (easy)
//
//    println("Last name starting with 'S':")
//    println(names_1.last { it.startsWith('S') })
//    // Output: Sam (medium)
//
//    println("Last temperature above 25°C:")
//    println(temperatures_1.last { it > 25 })
//    // Output: 30 (medium)
//
//    // Problems for lastOrNull()
//    println("Last number divisible by 5 or null if none exist:")
//    println(numbers_1.lastOrNull { it % 5 == 0 }) // ?
//    // Output: 10 (easy)
//
//    println("Last word longer than 6 characters or null if none exist:")
//    println(words_1.lastOrNull { it.length > 6 }) // ?
//    // Output: zucchini (medium)
//
//    println("Last price below $10 or null if none exist:")
//    println(prices_1.lastOrNull { it < 10 }) // ??
//    // Output: 5.0 (medium)
//
//    // Problems for single()
//    println("Single number greater than 100:")
//    println(products_1.single { it > 130 })
//    // Output: 150.0 (easy)
//
//    println("Single word with exactly 3 characters:")
//    println(names_1.single { it.length > 4 })
//    // Output: Tom (easy)
//
//    println("Single temperature that equals 0°C:")
//    println(temperatures_1.singleOrNull { it == 0 })
//    // Output: null (medium)
//
//    // Problems for singleOrNull()
//    println("Single even number or null if none exist:")
//    println(numbers_1.singleOrNull { it % 2 == 0 })
//    // Output: null (medium)
//
//    println("Single name starting with 'M' or null if none exist:")
//    println(names_1.singleOrNull { it.startsWith('M') })
//    // Output: Max (medium)
//
//    println("Single price above $100 or null if none exist:")
//    println(products_1.singleOrNull { it > 130 })
//    // Output: 150.0 (medium)
//
//    // Problems for count()
//    println("Count of numbers divisible by 3:")
//    println(numbers_1.count { it % 3 == 0 })  //?????
//    println(prices_1.count { (it % 3).toInt() == 0 })  //?????
//    // Output: 2 (easy)
//
//    println("Count of words with more than 4 letters:")
//    // Output: 3 (medium)
//
//    println("Count of prices less than $50:")
//    // Output: 5 (easy)
//
//    // Problems for sum()
//    println("Sum of all even numbers:")
//    // Output: 22 (easy)
//
//    println("Sum of product prices:")
//    // Output: 339.99 (medium)
//
//    println("Sum of temperatures:")
//    // Output: 112 (medium)
//
//    // Problems for sumOf()
//    println("Sum of squares of each number:")
//    // Output: 306 (medium)
//
//    println("Total length of each word:")
//    // Output: 21 (medium)
//
//    println("Total price of products:")
//    // Output: 339.99 (medium)
//
//    // Problems for min()
//    println("Minimum number:")
//    // Output: 3 (easy)
//
//    println("Minimum temperature:")
//    // Output: 15 (easy)
//
//    println("Minimum price:")
//    // Output: 1.0 (medium)
//
//    // Problems for minOf()
//    println("Minimum length of strings:")
//    // Output: 3 (easy)
//
//    println("Minimum square of numbers:")
//    // Output: 9 (medium)
//
//    println("Minimum temperature by absolute value:")
//    // Output: 15 (medium)
//
//    // Problems for max()
//    println("Maximum number:")
//    // Output: 15 (easy)
//
//    println("Maximum age:")
//    // Output: 45 (medium)
//
//    println("Highest price:")
//    // Output: 150.0 (medium)
//
//    // Problems for maxOf()
//    println("Maximum string length:")
//    // Output: 10 (medium)
//
//    println("Maximum cube of numbers:")
//    // Output: 3375 (medium)
//
//    println("Maximum temperature by absolute value:")
//    // Output: 30 (medium)
//
//    // Problems for average()
//    println("Average of numbers:")
//    // Output: 8.33 (medium)
//
//    println("Average temperature:")
//    // Output: 22.4 (medium)
//
//    println("Average price:")
//    // Output: 67.998 (medium)

    // Hard problems by 1

    // Sample data for the problems
    val numbers_2 = listOf(8, 15, 3, 10, 4, 9, 21, 27) // For various methods
    val words_2 = listOf("apple", "banana", "grape", "blueberry", "kiwi") // For various methods
    val ages_2 = listOf(22, 35, 18, 45, 30, 29, 40) // For various methods
    val temperatures_2 = listOf(15, 22, 30, 25, 20, 35, 28) // For various methods
    val products_2 = listOf(50.0, 150.0, 99.99, 120.0, 200.0) // For various methods
    val prices_2 = listOf(5.0, 3.0, 10.0, 15.0, 1.0, 25.0, 50.0) // For various methods
    val names_2 = listOf("Alice", "Bob", "Sam", "Tom", "Max", "Anna") // For various methods

//    // Problems for first()
//    println("First number greater than 20 that is also prime:")
//    val result = getPrimeGreaterThan20(numbers_2)
//    println(result)
    // Output: 21

//    // Problems for firstOrNull()
//    println("First word that contains all vowels or null if none exist:")
//    // Output: null
//
    // Problems for last()
    println("Last name that starts with a vowel:")
    val regex = Regex("^[aeoiu][a-z]+$", RegexOption.IGNORE_CASE)
    println(names_2.last{ regex.matches(it) })
    // Output: Anna

    // Problems for lastOrNull()
    println("Last temperature above 30°C or null if none exist:")
    println(temperatures_2.lastOrNull { it > 30 })
    // Output: 35

    // Problems for single()
    println("Single age that is both prime and odd:")
    println(ages_2.single { it % 2 == 1 && isPrime(it) })
    // Output: 29

    // Problems for singleOrNull()
    println("Single product priced exactly at $200.0 or null if none exist:")
    println(products_2.singleOrNull { it.toInt() == 200 })
    // Output: 200.0

    // Problems for count()
    println("Count of numbers greater than the average of the list:")
    println(numbers_2.count { it > numbers_2.average() })
    // Output: 4

    // Problems for sum()
    println("Sum of all numbers that are multiples of both 3 and 5:")
    print(numbers_2.filter{ it % 3 == 0 && it % 5 == 0 }.sum())
    // Output: 27

    // Problems for sumOf()
//    println("Sum of the lengths of all words that start with a consonant:")
//    // Output: 24
//
//    // Problems for min()
//    println("Minimum age of all people with names starting with 'A' or 'B':")
//    // Output: 22
//
//    // Problems for minOf()
//    println("Minimum number that is also a perfect square:")
//    // Output: 4
//
//    // Problems for max()
//    println("Maximum product price that is less than $150.0:")
//    // Output: 120.0
//
//    // Problems for maxOf()
//    println("Maximum temperature recorded in even indexed positions:")
//    // Output: 30
//
//    // Problems for average()
//    println("Average of the ages of people whose names have an 'a' in them:")
//    // Output: 33.5
}
fun isPrime(value: Int): Boolean {
    if(value < 2) return false
    for(n in 2..sqrt(value.toDouble()).toInt()) {
        if(value % n == 0) {
            return false
        }
    }
    return true
}
fun getPrimeGreaterThan20(numbers: List<Int>): Int {
    return numbers.first { it > 20 && isPrime(it) }
}