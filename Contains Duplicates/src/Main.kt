fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1))) // true
    println(containsDuplicate(intArrayOf(1, 2, 3, 4))) // false
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))) // true
}
fun containsDuplicate(nums: IntArray): Boolean {
    return nums.size != nums.distinct().size
}