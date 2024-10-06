fun main() {
    var s = "III"
    println(romanToInt(s)) // 3
    s = "LVIII"
    println(romanToInt(s)) // 58
    s = "MCMXCIV"
    println(romanToInt(s)) // 1994
}
fun romanToInt(s: String): Int {
    val chars = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var result = 0
    var previous = 0
    for(ch in s) {
        for(entry in chars.entries) {
            if(entry.key == ch) {
                if(entry.value > previous) {
                    result += entry.value - 2 * previous
                } else {
                    result += entry.value
                }
                previous = entry.value
            }
        }
    }
    return result
}