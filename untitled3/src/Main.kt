fun main() {
    println(permute(intArrayOf(1, 2, 3))) // [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    println(permute(intArrayOf(0, 1)))    // [[0,1],[1,0]]
    println(permute(intArrayOf(1)))       // [[1]]
}
fun permute(nums: IntArray): List<List<Int>> {
    val list = mutableListOf<List<Int>>()
    backtrack(nums.toList(), mutableListOf<Int>(), list)
    return list
}
fun backtrack(nums: List<Int>, current: MutableList<Int>, results: MutableList<List<Int>>) {
    if (nums.isEmpty()) {
        results.add(current.toList())
        return
    }

    for (i in nums.indices) {
        current.add(nums[i])
        backtrack(nums.filterIndexed { index, _ -> index != i }, current, results)
        current.removeAt(current.size - 1)
    }
}