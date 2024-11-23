fun main() {
    println(getEncryptedString("dart", 3)) // tdar
    println(getEncryptedString("aaa", 1)) // tdar
}
fun getEncryptedString(s: String, k: Int): String {
    val adjustedK = k % s.length
    return s[adjustedK] + s.slice(0..<adjustedK) + s.slice((adjustedK + 1)..<s.length)
}