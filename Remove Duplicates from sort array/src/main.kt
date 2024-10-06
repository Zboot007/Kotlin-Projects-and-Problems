fun main() {
    val num1 = intArrayOf(1, 1, 2)
    val num2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(removeDuplicates(num1))
    println(removeDuplicates(num2))
}
fun removeDuplicates(nums: IntArray): Int {
    var secondaryIndex = 1
    var index = 1
    while(index < nums.size) {
        if(nums[index] != nums[index - 1]) {
            nums[secondaryIndex] = nums[index]
            secondaryIndex += 1
        }
        index += 1
    }
    return secondaryIndex
}