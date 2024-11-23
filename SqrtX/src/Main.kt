fun main() {
    println(mySqrt(5))
    println(mySqrt(4))
    println(mySqrt(36))
    println(mySqrt(35))
}
fun mySqrt(x: Int): Int {
    return Math.sqrt(x.toDouble()).toInt()
}