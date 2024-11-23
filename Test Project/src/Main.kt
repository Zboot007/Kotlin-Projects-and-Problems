fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9)) // [0, 1]
    println(twoSum(intArrayOf(3, 2, 4), 6)) // [1, 2]
    println(twoSum(intArrayOf(3, 3), 6)) // [0, 1]
}
fun twoSum(nums: IntArray, target: Int): List<Int> {
    var intArray = intArrayOf()
    for(index in nums.indices) {
        for(innerIndex in nums.indices) {
            if(nums[index] + nums[innerIndex] == target && index < innerIndex)
                intArray += intArrayOf(index, innerIndex)
        }
    }
    return intArray.toList()
}