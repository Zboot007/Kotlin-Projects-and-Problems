fun main() {
    println(stableMountains(intArrayOf(1, 2, 3, 4, 5),2)) // [3, 4]
}
fun stableMountains(height: IntArray, threshold: Int): List<Int> {
    if(height.isEmpty() || height.lastIndex == 1) return if(height[0] > threshold) listOf(0) else emptyList()
    val result = mutableListOf<Int>()
    for(index in 1..<height.size - 1) {
        if(height[index - 1] == height[index] && height[index] > height[index + 1] && height[index] > threshold)
            result += index
    }
    return result
}