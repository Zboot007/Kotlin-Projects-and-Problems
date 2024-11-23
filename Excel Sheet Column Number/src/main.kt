import kotlin.math.pow

fun main() {
    val first_test_case = "A"
    println(titleToNumber(first_test_case))
    val second_test_case = "AB"
    println(titleToNumber(second_test_case))
}
fun titleToNumber(columnTitle: String): Int {
    val map = mapOf(
        'A' to 1,
        'B' to 2,
        'C' to 3,
        'D' to 4,
        'E' to 5,
        'F' to 6,
        'G' to 7,
        'H' to 8,
        'I' to 9,
        'J' to 10,
        'K' to 11,
        'L' to 12,
        'M' to 13,
        'N' to 14,
        'O' to 15,
        'P' to 16,
        'Q' to 17,
        'R' to 18,
        'S' to 19,
        'T' to 20,
        'U' to 21,
        'V' to 22,
        'W' to 23,
        'X' to 24,
        'Y' to 25,
        'Z' to 26
    )
    val columnNumber = columnTitle
        .reversed()
        .mapIndexed { index, char ->
            map[char]!! * 26.0.pow(index.toDouble()).toInt()
        }
        .sum()
    return columnNumber
}