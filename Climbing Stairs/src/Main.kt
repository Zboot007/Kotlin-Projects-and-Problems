fun main() {
    println(climbStairs(5))
    println(climbStairs(12))
    println(climbStairs(10))
    println(climbStairs(3))
}
fun climbStairs(n: Int): Int {
    var sum = 0
    var left = 1
    var right = 0
    for(num in 1..n) {
        sum = left + right
        right = left
        left = sum
    }
    return sum
}