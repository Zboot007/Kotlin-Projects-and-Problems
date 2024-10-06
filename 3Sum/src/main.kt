fun main() {
    val num_1 = intArrayOf(-1, 0, 1, 2, -1, -4)
    val num_2 = intArrayOf(0, 1, 1)
    val num_3 = intArrayOf(0, 0, 0)
    println(threeSum(num_1))
    println(threeSum(num_2))
    println(threeSum(num_3))
    /*for num_1:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    */
}
fun threeSum(nums: IntArray): List<List<Int>> {
    var result = mutableSetOf<List<Int>>()
    for (i in nums.indices) {
        for (j in nums.indices) {
            for (k in nums.indices) {
                if ((nums[i] + nums[j] + nums[k] == 0) && i != j && j != k && i != k) {
                    val temp = listOf(nums[i], nums[j], nums[k]).sorted()
                    result.add(temp)
                }
            }
        }
    }
    return result.toList()
}