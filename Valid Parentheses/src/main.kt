fun main() {
    val s = "[]"
    println(isValid(s))
    val str = "[}"
    println(isValid(str))
}
fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val bracketMap = mapOf(')' to '(', '}' to '{', ']' to '[')
    for (char in s) {
        if (char in bracketMap.values) {
            stack.addLast(char)
        } else if (char in bracketMap.keys) {
            if (stack.isEmpty() || stack.removeLast() != bracketMap[char]) {
                return false
            }
        } else {
            return false
        }
    }
    return stack.isEmpty()
}