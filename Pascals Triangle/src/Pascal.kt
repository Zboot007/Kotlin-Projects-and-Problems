fun main() {
    println(generate(2))
}
fun generate(numRows: Int): List<List<Int>> {
    val dp = List(numRows) { i -> MutableList(i + 1) { 1 } }

    for (row in 2..<dp.size) {
        for (col in 1..<dp[row].size - 1) {
            dp[row][col] = dp[row - 1][col - 1] + dp[row - 1][col]
        }
    }

    return dp
}