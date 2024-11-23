fun main() {
    var s = "A man, a plan, a canal: Panama"
    println(isPalindrome(s))
    s = "race a car"
    println(isPalindrome(s))
    s = " "
    println(isPalindrome(s))
}
fun isPalindrome(s: String): Boolean {
    val original = "[^a-z]".toRegex(RegexOption.IGNORE_CASE).replace(s.lowercase(), "").reversed()
    return original.length > 1 && original == original.reversed()
}