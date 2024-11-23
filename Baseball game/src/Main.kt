fun main() {
    println(calPoints(arrayOf("5", "2", "C", "D", "+"))) // Expected output: 30
}

fun calPoints(operations: Array<String>): Int {
    val record = mutableListOf<Int>()
    var sum = 0
    for (operation in operations) {
        when (operation) {
            "C" -> {
                if (record.isNotEmpty()) {
                    sum -= record.removeAt(record.size - 1)
                }
            }
            "D" -> {
                if (record.isNotEmpty()) {
                    val doubled = record.last() * 2
                    record.add(doubled)
                    sum += doubled
                }
            }
            "+" -> {
                if (record.size >= 2) {
                    val newScore = record[record.size - 1] + record[record.size - 2]
                    record.add(newScore)
                    sum += newScore
                }
            }
            else -> {
                val score = operation.toInt()
                record.add(score)
                sum += score
            }
        }
    }
    return sum
}
