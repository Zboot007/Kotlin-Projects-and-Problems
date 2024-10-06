import kotlin.math.pow

fun main() {
    var x = 2.000000
    var n = 10
    println(myPow(x, n))
}
fun myPow(x: Double, n: Int): Double {
    return x.pow(n.toDouble())
}