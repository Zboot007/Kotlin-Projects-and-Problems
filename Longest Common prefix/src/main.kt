fun main() {
    val strs1 = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(strs1)) // "fl"
    val strs2 = arrayOf("dog", "racecar", "car")
    println(longestCommonPrefix(strs2)) // ""
}
fun longestCommonPrefix(strs: Array<String>): String {
    var result = ""
    var sorted = strs.sorted()
    for(element in sorted) {

    }
    return result
}