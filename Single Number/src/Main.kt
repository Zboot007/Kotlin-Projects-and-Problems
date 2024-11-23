fun main() {
    println(singleNumber(intArrayOf(1, 1, 2))) // 2
    println(singleNumber(intArrayOf(4, 1, 2, 1, 2))) // 4
    println(singleNumber(intArrayOf(1))) // 1
}
fun singleNumber(nums: IntArray): Int {
    return nums.groupBy { it }.mapValues { it.value.count() }.mixBy { it.value }.key
}