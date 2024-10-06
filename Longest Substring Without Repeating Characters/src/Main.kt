fun main() {
    val s1 = "abcabcbb"
    println(lengthOfLongestSubstring(s1)) // 3 because abc length is 3
    val s2 = "bbbbb"
    println(lengthOfLongestSubstring(s2)) // 1 because b length is 1
    val s3 = "pwwkew"
    println(lengthOfLongestSubstring(s3)) // 4
}
fun lengthOfLongestSubstring(s: String): Int {
    val charSet = mutableSetOf<Char>()
    var left = 0
    var maxLength = 0

    for (right in s.indices) {
        while (charSet.contains(s[right])) {
            charSet.remove(s[left])
            left++
        }

        charSet.add(s[right])

        maxLength = maxOf(maxLength, right - left + 1)
    }
    return maxLength
}