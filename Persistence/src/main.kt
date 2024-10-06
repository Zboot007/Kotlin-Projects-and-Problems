fun main() {
// ====> Task 7
// 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one
    // digit, there are 3 multiplications)
// 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2,
    // there are 4 multiplications)
// 4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
    testPersistence()
}
fun persistence(num: Int): Int {
    var numStr = num.toString()
    if(numStr.length == 1 || numStr.isEmpty())
        return 0
    var counter = 0
    while(numStr.length > 1) {
        var quantity = 1
        for(num in numStr)
            quantity *= num.digitToInt()
        numStr = quantity.toString()
        counter += 1
    }
    return counter
}
fun testPersistence() {
    println(persistence(39) == 3)
    println(persistence(4) == 0)
    println(persistence(25) == 2)
    println(persistence(999) == 4)
}