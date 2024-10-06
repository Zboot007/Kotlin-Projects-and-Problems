fun main() {
    testUniqueInOrder()
}
fun uniqueInOrder(sequence: List<Any>): List<Any> {
    if(sequence.isEmpty())
        return emptyList()
    var result = mutableListOf<Any>()
    var index = 0
    while(index < sequence.size - 1) {
        if (sequence[index] != sequence[index + 1])
            result += sequence[index]
        index += 1
    }
    result += sequence[index]
    println(result)
    return result
}
fun testUniqueInOrder() {
    println(uniqueInOrder("AAAABBBCCDAABBB".toList()) == listOf('A', 'B', 'C', 'D', 'A', 'B'))
    println(uniqueInOrder("ABBCcAD".toList()) == listOf('A', 'B', 'C', 'c', 'A', 'D'))
    println(uniqueInOrder(listOf(1, 2, 2, 3, 3)) == listOf(1, 2, 3))
    println(uniqueInOrder(listOf(1, 2, 2, 3, 3)) == listOf(1, 2, 3))
    println(uniqueInOrder(listOf(7, 5, 7)) == listOf(7, 5, 7))
}