fun testEncode() {
    val s1 = "aeeeffrgtt"
    val s2 = "abcdef"
    val s3 = "aavaaaccccccccccccccccccfgr"

    println(encode(s1)) // a1e3f2r1g1t2
    println(encode(s2)) // a1b1c1d1e1f1
    println(encode(s3)) // a2v1a3c18f1g1r1
}
fun encode(expression: String): String {
    val regex = Regex("(?<tag>[a-z])\\k<tag>*", RegexOption.IGNORE_CASE)
    var str = ""
    for(match in regex.findAll(expression)) {
        str += "${match.value[0]}${match.value.length}"
    }
    return str
}
fun testDecode() {
    val s1 = "a1e3f2r1g1t2"
    val s2 = "a1b1c1d1e1f1"
    val s3 = "a2v1a3c18f1g1r1"

    println(decode(s1)) // aeeeffrgtt
    println(decode(s2)) // abcdef
    println(decode(s3)) // aavaaaccccccccccccccccccfgr
}
fun decode(expression: String): String {
    var result = ""
    val regex = Regex("(\\w)(\\d+)", RegexOption.IGNORE_CASE)
    for(match in regex.findAll(expression)) {
        val character = match.groups[1]?.value
        result += character?.repeat((match.groups[2]?.value?.toInt() ?: null) ?: 0)
    }
    return result
}
fun main() {
    testEncode()
    testDecode()
    testOrder()
}
fun testOrder() {
    val s1 = "si4mple i2s te5xt thi1s a3"
    val s2 = "mos4t i2s wo9rld la6nguage Java1script popular5 i7n th8e t3he"

    println(orderWord(s1)) // this is a simple text
    println(orderWord(s2)) // Javascript is the most popular language in the world
}
fun orderWord(s: String)
        = s.split(' ')
    .sortedBy { "\\d".toRegex().find(it)?.value }
    .joinToString(" ") { "\\d".toRegex().replace(it, "") }