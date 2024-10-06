enum class Days(val label: String) {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");
    val next: Days
        get() = after(1)
    val prev: Days
        get() = ago(1)
    fun after(times: Int): Days {
        var index = ordinal
        var originalDay = Days.Monday
        for (inner in 1..times) {
            index = (index + 1) % Days.entries.size
            originalDay = Days.entries[index]
        }
        return originalDay
    }
    fun ago(times: Int): Days {
        var index = ordinal
        var originalDay = Days.Monday
        for(inner in 1..times) {
            index = (index - 1 + Days.entries.size) % Days.entries.size
            originalDay = Days.entries[index]
        }
        return originalDay
    }
}
fun sumTriangle(triangle: List<List<Int>>): Int {
    var sum = 0
    var shifter = 0
    for(outer in triangle) {
        for(inner in shifter..<outer.size - 1) {
            if(outer[shifter] < outer[inner + 1]) {
                sum += outer[shifter]
            } else {
                sum += outer[shifter]
                shifter += 1
            }
        }
    }
    return sum
}
fun calculate(expression: String): Int {
    val list = expression.split(" ").toMutableList()
    var innerIndex = 0
    while (innerIndex < list.size) {
        if (list[innerIndex] == "*") {
            val result = list[innerIndex - 1].toInt() * list[innerIndex + 1].toInt()
            list[innerIndex - 1] = result.toString()
            list.removeAt(innerIndex); list.removeAt(innerIndex)
        } else if (list[innerIndex] == "/") {
            val result = list[innerIndex - 1].toInt() / list[innerIndex + 1].toInt()
            list[innerIndex - 1] = result.toString()
            list.removeAt(innerIndex); list.removeAt(innerIndex)
        } else {
            innerIndex += 1
        }
    }
    var sum = 0
    var index = 0
    if (list.isNotEmpty()) {
        sum = list[index].toInt()
        index += 1
    }
    var operand = "+"
    while(index < list.size) {
        operand = list[index]
        index += 1
        if(index < list.size) {
            when (operand) {
                "+" -> sum += list[index].toInt()
                "-" -> sum -= list[index].toInt()
            }
            index += 1
        }
    }
    return sum
}
fun main() {
    // ====> Task 1s
    val day = Days.Tuesday
    println(day.label) // Вторник
    println(day.next.label)  // Среда
    println(day.prev.label)  // Понедельник
    println(day.label)
    println(day.ordinal)
    println("name: ${day.name}")
    val r1 = day.after(4) // Saturday
    val r2 = day.ago(4)   // Friday
    println(r1.label)     // Суббота
    println(r2.label)     // Пятница

    // ====> Task 2
    val triangle = listOf(
        listOf(4),
        listOf(2, 5),
        listOf(7, 2, 1),
        listOf(5, 4, 9, 5),
        listOf(1, 3, 4, 7, 5),
        listOf(1, 3, 6, 7, 9, 2),
        listOf(1, 3, 2, 5, 1, 2, 4),
    )

    println(sumTriangle(triangle)) // 4 + 5 + 2 + 9 + 7 + 9 + 2 = 38

    // ====> Task 3
    val one = "2 + 2"
    val two = "2 + 2 * 2"
    val three = "2 + 3 * 2 - 7"
    val four = "1 - 3 + 4 - 2 * 2 / 2 * 3 + 10"

    println(calculate(one))    // 4
    println(calculate(two))    // 6
    println(calculate(three))  // 1
    println(calculate(four))   // 8
}