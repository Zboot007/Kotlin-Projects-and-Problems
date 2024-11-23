fun main() {
    var s = "abcd"
    var t = "abcde"
    println(findTheDifference(s, t)) // e
    s = "avd"
    t = "avdg"
    println(findTheDifference(s, t)) // g
}
fun findTheDifference(s: String, t: String): Char {
    val countS = s.groupingBy { it }.eachCount()
    val countT = t.groupingBy { it }.eachCount()
    return countT.entries.first { (char, count) -> count != countS.getOrDefault(char, 0) }.key
}