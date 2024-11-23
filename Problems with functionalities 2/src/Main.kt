import kotlin.math.absoluteValue

fun main() {
    // Problem 1: Sum of Squares
    val numbers1 = listOf(1, 2, 3, 4, 5)
    println(getSumSquares(numbers1))
    // answer: 55

    // Problem 2: Sum of Even Numbers
    val numbers2 = listOf(1, 2, 3, 4, 5, 6)
    println(getSumOfEven(numbers2))
    // answer: 12

    // Problem 3: Sum of Lengths of Strings
    val strings = listOf("apple", "banana", "cherry")
    val sum1 = strings.sumOf { it.length }
    println(sum1)
    // answer: 17

    // Problem 4: Sum of Digits in a String
    val digits = "12345"
    val sum2 = digits.sumOf { it.digitToInt() }
    println(sum2)
    // answer: 15

    // Problem 5: Sum of ASCII Values of Characters
    val text = "Hello"
    val sumOfASCII = text.sumOf { it.code }
    println(sumOfASCII)
    // answer: 500

    // Problem 6: Sum of Unique Integers
    val numbers3 = listOf(1, 2, 3, 2, 1, 4)
    val sum = numbers3.distinct().sum()
    println(sum)
    // answer: 10

    // Problem 7: Sum of Products of Two Lists
    val list1 = listOf (1,2, 3)
    val list2 = listOf(4, 5, 6)
    val sumOfTwo = list2.zip(list1) { a, b -> a * b }.sum()
    println(sumOfTwo)
    // answer: 32

    // Problem 8: Sum of Absolute Differences Between Consecutive Elements
    val numbers4 = listOf(10, 5, 3, 8)
    val sumOfAbsoluteDifferences = numbers4.zipWithNext { a, b -> kotlin.math.abs(a - b) }.sum()
    println(sum)
    // answer: 15

    // Problem 9: Weighted Sum of String Lengths
    val weightedStrings = listOf("apple", "banana", "cherry")
    val weights = listOf(1, 2, 3)
    val result = weights.zip(weightedStrings) { accomulator, transformator -> accomulator * transformator.length}
    println(result)
    // answer: 35

    // Problem 10: Sum of Squares of Digits in a Number
    val number = 12345
    val sumOfSquared = number.toString().sumOf { it.digitToInt() * it.digitToInt() }
    println(sumOfSquared)
    // answer: 55
}
fun getSumSquares(list: List<Int>) = list.sumOf { it * it }
fun getSumOfEven(list: List<Int>) = list.filter { it % 2 == 0 }.sum()