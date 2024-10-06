fun main() {
    var nums = intArrayOf(1, 2, 3, 4, 5, 6)
    println(searchInsert(nums, 2))
    nums = intArrayOf(2, 3, 5, 6)
    println(searchInsert(nums, 1))
}
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size
    while(left < right) {
        val mid = (left + right) / 2
        if(nums[mid] < target) {
            left = mid + 1
        } else if(nums[mid] > target) {
            right = mid - 1
        } else if(nums[mid] == target){
            return mid
        }
    }
    return 0
}