fun main() {
    println(getSum("123456789"))
}
fun getSum(s: String): Int {
    var sum = 0
    for(n in s) {
        sum += n.digitToInt()
    }
    return sum
}
