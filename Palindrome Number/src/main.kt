fun main() {
    val x = 121
    println(isPalindrome(x))
    val y = 231
    println(isPalindrome(y))
}
fun isPalindrome(x: Int): Boolean {
    if(x == 0) return true
    val str = x.toString().reversed()
    return x.toString() == str
    // return x.toString() == x.toString().reversed()
}