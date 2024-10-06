fun main() {
    val num1 = intArrayOf(2, 7, 11, 15)
    val num2 = intArrayOf(3, 2, 4)
    val num3 = intArrayOf(3, 3)
    println(format(twoSum(num1, 9))) // [0, 1] only positions (index)
    println(format(twoSum(num2, 6))) // [1, 2] only positions (index)
    println(format(twoSum(num3, 6))) // [0, 1] only positions (index)
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    var result = intArrayOf()
    for(index in nums.indices) {
        for(checker in nums.indices) {
            if(nums[index] + nums[checker] == target && index < checker) {
                result += index
                result += checker
            }
        }
    }
    return result.sortedArray()
}
fun format(result: IntArray): String {
    return result.joinToString(prefix = "[", postfix = "]")
}