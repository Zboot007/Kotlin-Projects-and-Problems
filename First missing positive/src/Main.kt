fun main() {
    println(firstMissingPositive(intArrayOf(1, 2, 0)))
    println(firstMissingPositive(intArrayOf(3, 4, -1, 1)))
    println(firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)))
}
fun firstMissingPositive(nums: IntArray): Int {
    for(num in 1..nums.size) {
        if(num !in nums) return num
    }
    return nums.sorted().last().toInt() + 1
}