fun main() {
    var a = "11"
    var b = "1"
    println(addBinary(a, b))

    a = "10"
    b = "11"
    println(addBinary(a, b))
}
fun addBinary(a: String, b: String): String {
    var result = ""
    var carryover = 0
    var aIndex = a.length - 1
    var bIndex = b.length - 1
    while (aIndex >= 0 || bIndex >= 0 || carryover > 0) {
        val aNum = a.elementAtOrNull(aIndex--)?.digitToInt() ?: 0
        val bNum = b.elementAtOrNull(bIndex--)?.digitToInt() ?: 0
        val sum = aNum + bNum + carryover
        result = (sum % 2).toString() + result
        carryover = if (sum >= 2) 1 else 0
    }
    return result
}