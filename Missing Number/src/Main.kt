fun main() {

}
fun missingNumber(nums: IntArray): Int {
    return (0..nums.max()).sum() - nums.sum()
}