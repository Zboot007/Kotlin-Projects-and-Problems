fun main() {
    val list = intArrayOf(10, 12, 13, 14)
    println(minElement(list))
}
fun test(nums: IntArray): IntArray {
    return nums.groupBy { it }.mapValues { it.value.count() }.filter { it.value == 2 }.keys.toIntArray()
}
fun minElement(nums: IntArray): Int {
    val list = mutableListOf<Int>()
    nums.forEach {
        list += it.toString().toCharArray().sumOf { sum ->
            sum.digitToInt()
        }
    }
    return list.min()
}