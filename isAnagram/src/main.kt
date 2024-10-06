fun main() {
    var s = "anagram"
    var t = "nagaram"
    println(isAnagram(s, t))
    s = "car"
    t = "rat"
    println(isAnagram(s, t))
}
fun isAnagram(s: String, t: String): Boolean {
    var sortedS1 = s.split("")
    var sortedS2 = t.split("")
    sortedS1 = sortedS1.sorted()
    sortedS2 = sortedS2.sorted()
    return sortedS1.joinToString("") == sortedS2.joinToString("")
}