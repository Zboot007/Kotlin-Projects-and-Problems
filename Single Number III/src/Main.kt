fun main() {
    println(singleNumber(intArrayOf(1, 2, 1, 3, 2, 5))) // [3, 5]
    println(singleNumber(intArrayOf(-1, 0))) // [-1, 0]
    println(singleNumber(intArrayOf(0, 1))) // [0, 1]
}
fun singleNumber(nums: IntArray): IntArray {
    return nums.groupBy { it }.mapValues { it.value.count() }.filter { it.value == 1 }.keys.toIntArray()
}