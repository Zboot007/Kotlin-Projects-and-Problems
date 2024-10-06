fun main() {
    val s1 = "babad"
    val s2 = "cbbd"
    println(longestPalindrome(s1)) // "bab" || aba
    println(longestPalindrome(s2)) // "bb"
}
fun longestPalindrome(s: String): String {
    if (s.isEmpty()) return ""
    var start = 0
    var end = 0

    for (i in s.indices) {
        val len1 = expandAroundCenter(s, i, i)
        val len2 = expandAroundCenter(s, i, i + 1)
        val len = maxOf(len1, len2)
        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    return s.substring(start, end + 1)
}
private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var l = left
    var r = right
    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }
    return r - l - 1
}
