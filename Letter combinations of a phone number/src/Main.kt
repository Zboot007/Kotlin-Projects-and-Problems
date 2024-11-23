fun main() {

}
fun letterCombinations(digits: String): List<String> {
    if(digits.isBlank()) return emptyList()
    val digitList = digits.toCharArray()
    val options = mapOf(
        2 to listOf("a", "b", "c"),
        3 to listOf("d", "e", "f"),
        4 to listOf("g", "h", "i"),
        5 to listOf("j", "k", "l"),
        6 to listOf("m", "n", "o"),
        7 to listOf("p", "q", "r", "s"),
        8 to listOf("t", "u", "v"),
        9 to listOf("w", "x", "y", "z")
    )
    val result = mutableListOf<String>()
    fun backtrack(index: Int, currentCombination: StringBuilder) {
        if (index == digits.length) {
            result.add(currentCombination.toString())
            return
        }

        val digit = digits[index]
        val letters = options[digit] ?: return

        for (letter in letters) {
            currentCombination.append(letter)
            backtrack(index + 1, currentCombination)
            currentCombination.deleteCharAt(currentCombination.length - 1) // Backtrack
        }
    }

    backtrack(0, StringBuilder())
    return result
}