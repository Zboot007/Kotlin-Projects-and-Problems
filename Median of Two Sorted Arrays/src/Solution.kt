fun main() {
    val nums1 = intArrayOf(1, 3)
    val nums2 = intArrayOf(2)
    val nums = listOf(2,31,12,3,3)
    //1, 3,  4,  5, 6
    println(findMedianSortedArrays(nums1, nums2))
}
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedArr = (nums1 + nums2).sorted()
    if(mergedArr.size % 2 == 0) {
        val m = (mergedArr.size / 2) - 1
        val n = mergedArr.size / 2
        return (mergedArr[m] + mergedArr[n]) / 2.0
    } else {
        return mergedArr[(mergedArr.size / 2)].toDouble()
    }
}