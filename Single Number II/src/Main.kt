fun main() {
    println(singleNumber(intArrayOf(1, 2, 3 , 3, 2, 1, 99))) // 99
    println(singleNumber(intArrayOf(1, 2, 3 , 3, 2, 1, 12, 33, 33, 12, 0))) // 0
}
fun singleNumber(nums: IntArray): Int {
    return nums.groupBy { it }.mapValues { it.value.count() }.minBy { it.value }.key
}