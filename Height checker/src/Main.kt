fun main() {
    println(heightChecker(intArrayOf(1, 1, 4, 2, 1, 3))) // 3
    println(heightChecker(intArrayOf(5, 1, 2, 3, 4))) // 5
}
fun heightChecker(heights: IntArray): Int {
    var index = 0
    val expected = heights.sorted()
    var counter = 0
    while(index < heights.size) {
        if(expected[index] != heights[index])
            counter += 1
        index += 1
    }
    return counter
}