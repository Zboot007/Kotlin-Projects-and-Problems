fun main() {
    val str_1 = "Hello World"
    println(lengthOfLastWord(str_1)) // 5
    val str_2 = "   fly me   to   the moon  "
    println(lengthOfLastWord(str_2)) // 4
    val str_3 = "luffy is still joyboy"
    println(lengthOfLastWord(str_3)) // 6
}
fun lengthOfLastWord(s: String): Int {
    val regex = Regex("\\b\\w+\\b")
    val reversedStr = s.reversed()
    return regex.find(reversedStr)!!.groups[0]!!.value.length
}