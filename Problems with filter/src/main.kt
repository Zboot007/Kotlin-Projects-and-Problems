fun filterEvenNumbers(numbers: List<Int>) = numbers.filter { it % 2 == 0 }
fun filterPalindromes(words: List<String>) = words.filter { it == it.reversed() }
fun filterByLength(words: List<String>, length: Int) = words.filter { it.length >= length }
fun filterUnique(numbers: List<Int>) = numbers.distinct() // or toSet()
// distinct returns only unique numbers without duplicates
data class Student(val name: String, val grade: Int)
fun filterStudentsByGrade(list: List<Student>, average: Int) = list.filter { it.grade > average }
fun filterPositiveNumbers(list: List<Int>) = list.filter { it > 0 }
fun filterBySubstring(list: List<String>, subString: String) = list.filter { it.contains(subString) }
fun filterAndSquareEvenNumbers(numbers: List<Int>) = numbers.filter { it % 2 == 0 }.map { it * it }
fun countOccurrences(words: List<String>) = words.groupingBy { it }.eachCount() /***(!)***/
fun filterStartingWithVowel(words: List<String>) = words.filter { it[0] in setOf('a', 'i', 'o', 'u', 'e') }
fun main() {
    // Problem 1: Filter Even Numbers
    val numbers1 = listOf(1, 2, 3, 4, 5, 6)
    println("Even Numbers: ${filterEvenNumbers(numbers1)}") // Output: [2, 4, 6]

    // Problem 2: Find Palindromes
    val words1 = listOf("level", "world", "radar", "hello")
    println("Palindromes: ${filterPalindromes(words1)}") // Output: [level, radar]

    // Problem 3: Filter by Length
    val words2 = listOf("apple", "banana", "kiwi", "cherry")
    println("Words longer than 5 characters: ${filterByLength(words2, 5)}") // Output: [apple, banana, cherry]

    // Problem 4: Unique Elements
    val numbers2 = listOf(1, 2, 2, 3, 4, 4, 5)
    println("Unique Numbers: ${filterUnique(numbers2)}") // Output: [1, 2, 3, 4, 5]

    // Problem 5: Filter Students by Grade
    val students = listOf(Student("Alice", 85), Student("Bob", 60), Student("Charlie", 90))
    println("Students with grade > 70: ${filterStudentsByGrade(students, 70)}") // Output: [Alice, Charlie]

    // Problem 6: Filter Positive Numbers
    val numbers3 = listOf(-2, -1, 0, 1, 2, 3)
    println("Positive Numbers: ${filterPositiveNumbers(numbers3)}") // Output: [1, 2, 3]

    // Problem 7: Filter Based on Substring
    val words3 = listOf("apple", "banana", "cherry", "date")
    println("Words containing 'an': ${filterBySubstring(words3, "an")}") // Output: [banana]

    // Problem 8: Filter and Map
    val numbers4 = listOf(1, 2, 3, 4, 5, 6)
    println("Squares of Even Numbers: ${filterAndSquareEvenNumbers(numbers4)}") // Output: [4, 16]

    // Problem 9: Count Occurrences
    val words4 = listOf("apple", "banana", "apple", "orange", "banana", "apple")
    println("Word Occurrences: ${countOccurrences(words4)}") // Output: {apple=3, banana=2, orange=1}

    // Problem 10: Filter Strings Starting with a Vowel
    val words5 = listOf("apple", "banana", "orange", "kiwi", "umbrella")
    println("Words starting with a vowel: ${filterStartingWithVowel(words5)}") // Output: [apple, orange, umbrella]
}