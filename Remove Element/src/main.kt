fun main() {
    val nums1 = intArrayOf(1, 2, 3, 3, 4, 4, 2)
    var target = 3
    println(removeElement(nums1, target))
    val nums2 = intArrayOf(3, 2, 2, 3)
    target = 3
    val k = removeElement(nums2, target)
    println(k)
}
fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0
    for(num in nums)
        if(num != `val`) {
            nums[index] = num
            index += 1
        }
    return index
}