fun main() {
    println(isPowerOfTwo(2))
    println(isPowerOfTwo(1))
    println(isPowerOfTwo(4))
    println(isPowerOfTwo(3))
    println(isPowerOfTwo(16))
    println(isPowerOfTwo(32))
    println(isPowerOfTwo(45))
}
fun isPowerOfTwo(n: Int): Boolean {
    if(n == 1) return true
    if(n % 2 == 1) return false

    for(index in 0..n) {
        if(2.pow(index) == n)
            return true
    }
    return false
}
fun Int.pow(n: Int): Int {
    var result = this
    var index = 0
    while(index < n) {
        result *= this
        index += 1
    }
    return result
}
// method 2
// fun isPowerOfTwo(n: Int) = n > 0 && n.countOneBits() == 1