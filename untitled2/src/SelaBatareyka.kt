fun main() {
    val n = readln().trim().toInt()
    val nums = readln().split(" ")
    var sum = 0
    if(n != nums.size) {
        println("")
        return
    } else {
        for(num in nums) {
            sum += num.toInt()
        }
        println(sum)
    }
}