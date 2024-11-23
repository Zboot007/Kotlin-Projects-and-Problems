import kotlin.math.sign
import kotlin.time.Duration.Companion.minutes

fun main() {
    // ---------------------------
    // Fold Problems
    // ---------------------------

    // Easy: Find the sum of all elements using fold
    val numbersFoldEasy = listOf(1, 2, 3, 4, 5)
    val sumEasy = numbersFoldEasy.fold(0) { acc, i -> acc + i }
    println("Sum of numbers (Easy - fold): $sumEasy")
    // Expected Output: 15

    // Medium: Find the concatenation of strings in reverse order using fold
    val wordsFoldMedium = listOf("apple", "banana", "cherry")
    val concatenatedMedium = wordsFoldMedium.fold("") { accumulator, str: String -> str + accumulator }
    println("Reversed concatenated string (Medium - fold): $concatenatedMedium")
    // Expected Output: "cherrybananaapple"

    // Hard: Find the product of even numbers using fold
    val numbersFoldHard = listOf(1, 2, 3, 4, 5, 6)
    val productEvenHard = numbersFoldHard.fold(1) {acc, i -> if(i % 2 == 0) acc * i else acc }
    println("Product of even numbers (Hard - fold): $productEvenHard")
    // Expected Output: 48


    // ---------------------------
    // Reduce Problems
    // ---------------------------

    // Easy: Find the maximum value using reduce
    val numbersReduceEasy = listOf(5, 3, 8, 2, 7)
    val maxReduceEasy = numbersReduceEasy.reduce() { accamulator, number -> if(accamulator > number) accamulator else number }
    println("Maximum value (Easy - reduce): $maxReduceEasy")
    // Expected Output: 8

    // Medium: Find the concatenation of all strings in a list using reduce
    val wordsReduceMedium = listOf("Kotlin", "is", "awesome")
    val concatenatedReduceMedium = wordsReduceMedium.reduce() { acc, s -> "$acc $s" }
    println("Concatenated string (Medium - reduce): $concatenatedReduceMedium")
    // Expected Output: "Kotlin is awesome"

    // Hard: Find the longest string in the list using reduce
    val wordsReduceHard = listOf("programming", "Kotlin", "challenge", "solve")
    val longestWordReduceHard = wordsReduceHard.reduce() { accamulator, str -> if(accamulator.length > str.length) accamulator else str }
    println("Longest word (Hard - reduce): $longestWordReduceHard")
    // Expected Output: "programming"


    // ---------------------------
    // forEach Problems
    // ---------------------------

    // Easy: Print each element in a list
    val numbersForEachEasy = listOf(10, 20, 30)
    numbersForEachEasy.forEach {
        println("Number (Easy - forEach): $it")
    }
    // Expected Output:
    // Number (Easy - forEach): 10
    // Number (Easy - forEach): 20
    // Number (Easy - forEach): 30

    // Medium: Print only the even numbers in a list
    val numbersForEachMedium = listOf(1, 2, 3, 4, 5)
    numbersForEachMedium.forEach {
        println("Even number (Medium - forEach): $it")
    }
    // Expected Output:
    // Even number (Medium - forEach): 2
    // Even number (Medium - forEach): 4

    // Hard: Find the sum of numbers in a list using forEach
    val numbersForEachHard = listOf(5, 10, 15, 20)
    var sum = 0
    numbersForEachHard.forEach { element -> sum += element }
    println("Sum of numbers (Hard - forEach): $sum")
    // Expected Output: 50


    // ---------------------------
    // groupingBy Problems
    // ---------------------------

    // Easy: Group words by their first letter and count occurrences 💎
    val wordsGroupByEasy = listOf("apple", "banana", "avocado", "blueberry", "cherry")
    val groupedWordsEasy = wordsGroupByEasy.groupingBy { it.first() }.eachCount()
    println("Grouped words by first letter (Easy - groupingBy): $groupedWordsEasy")
    // Expected Output: {a=2, b=2, c=1}

    // Medium: Group numbers by even or odd and sum the values in each group 💎
    val numbersGroupByMedium = listOf(1, 2, 3, 4, 5, 6)
    val sumByEvenOddMedium = numbersGroupByMedium.groupBy { it % 2 == 0 }.mapValues { entry -> entry.value.sum() } // if just map {...} then output [9, 12]
    println("Sum by even/odd groups (Medium - groupingBy): $sumByEvenOddMedium")
    // Expected Output: {false=9, true=12}

    // Hard: Group words by their length and find the word with the most occurrences of a character in each group 💎
    val wordsGroupByHard = listOf("apple", "banana", "cherry", "avocado", "grape", "pineapple")
    val mostFrequentCharWordGroupByHard = wordsGroupByHard.groupBy { it.length }.mapValues { entry ->
        entry.value.maxByOrNull { word ->
            word.groupBy { it }.values.maxOfOrNull { it.size } ?: 0
        }
    }
    println("Most frequent char word in each group by length (Hard - groupingBy): $mostFrequentCharWordGroupByHard")
    // Expected Output: Word with most frequent char for each group of length
}