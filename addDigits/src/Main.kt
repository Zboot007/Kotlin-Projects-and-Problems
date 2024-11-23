fun main() {
    println(33) // 2
}
fun addDigits(num: Int): Int {
    var sum = num
    while(sum > 9) {
        sum += sumOfAllDigits(sum)
    }
    return sum
}
fun sumOfAllDigits(sum: Int): Int {
    var result = 0
    var n = sum
    while(n > 0) {
        result += n % 10
        n /= 10
    }
    return result
}