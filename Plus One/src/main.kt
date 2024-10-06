//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
fun main() {
    val digits = intArrayOf(1, 2, 3)
    val result = plusOne(digits)
    println(result.joinToString(", "))  // Output: 1, 2, 4
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i] += 1
            return digits
        }
        // If the digit is 9, we set it to 0
        digits[i] = 0
    }

    // If all digits were 9, we need to add a new digit at the beginning
    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}