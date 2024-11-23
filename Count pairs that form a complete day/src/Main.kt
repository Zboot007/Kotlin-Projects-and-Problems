fun main() {
    println(countCompleteDayPairs(intArrayOf(12, 12, 30, 24, 24))) // 2
}
fun countCompleteDayPairs(hours: IntArray): Int {
    var total = 0
    for(index in hours.indices) {
        for(innerIndex in hours.indices) {
            if((hours[index] + hours[innerIndex]) % 24 == 0 && index < innerIndex)
                total += 1
        }
    }
    return total
}