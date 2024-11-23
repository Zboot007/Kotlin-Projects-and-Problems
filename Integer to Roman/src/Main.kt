fun main() {
    intToRoman(4)
}
fun intToRoman(num: Int) {
    val map = mapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    )
    var result = ""
    var number = num
    for((key, value) in map) {
         while(number >= value) {
             result += key
             number -= value
        }
    }
}