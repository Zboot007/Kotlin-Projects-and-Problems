package com.sositacademy.tetris

import com.sositacademy.tetris.Direction.*

sealed class Programmer5(
    val name: String,
    val age: Int
) {
    class JuniorProgrammer5(
        name: String,
        age: Int
    ) : Programmer5(name, age)
    class MiddleProgrammer5(
        name: String,
        age: Int
    ) : Programmer5(name, age)
    class SeniorProgrammer5(
        name: String,
        age: Int
    ) : Programmer5(name, age)
    class TechLeadProgrammer5(
        name: String,
        age: Int
    ) : Programmer5(name, age)
}
//class JuniorProgrammer5(
//    name: String,
//    age: Int
//) : Programmer5(name, age)
//class MiddleProgrammer5(
//    name: String,
//    age: Int
//) : Programmer5(name, age)
//class SeniorProgrammer5(
//    name: String,
//    age: Int
//) : Programmer5(name, age)
//class TechLeadProgrammer5(
//    name: String,
//    age: Int
//) : Programmer5(name, age)

enum class Direction(
    val ruName: String
) {
    Left("Влево"),
    Top("Вправо"),
    Bottom("Вниз"),
    Right("Вправо");

    fun getRuName5() = ruName
}

fun main() {
    // ====> Task 1
//    val day = Days.Tuesday
//
//    println(day.label) // Вторник
//    println(day.next)  // Среда
//    println(day.prev)  // Понедельник
//
//    val r1 = day.after(4) // Saturday
//    val r2 = day.ago(4)   // Friday
//    println(r1.label)     // Суббота
//    println(r2.label)     // Пятница

    // ====> Task 2
//    val triangle = listOf(
//        listOf(4),
//        listOf(2, 5),
//        listOf(7, 2, 1),
//        listOf(5, 4, 9, 5),
//        listOf(1, 3, 4, 7, 5),
//        listOf(1, 3, 6, 7, 9, 2),
//        listOf(1, 3, 2, 5, 1, 2, 4),
//    )
//
//    println(sumTriangle(triangle)) // 4 + 5 + 2 + 9 + 7 + 9 + 2

    // ====> Task 3
//    val one = "2 + 2"
//    val two = "2 + 2 * 2"
//    val three = "2 + 3 * 2 - 7"
//    val four = "1 - 3 + 4 - 2 * 2 / 2 * 3 + 10"
//
//    println(calculate(one))    // 4
//    println(calculate(two))    // 6
//    println(calculate(three))  // 1
//    println(calculate(four))   // 6







//    val top = Direction.Top
//
//    println(top.name)
//    println(top.ruName)
//    println(top.getRuName5())

//    val direction = Left
//
//    println(Direction.entries)
//    println(Direction.values().toList())
//    println(Direction.valueOf("Right"))
//    println(direction)
//    println(direction.name)

//    val p: Programmer5 = Programmer5.TechLeadProgrammer5("Tom", 25)
//
//    var temp = when(p) {
//        is Programmer5.JuniorProgrammer5 -> "JuniorProgrammer5"
//        is Programmer5.MiddleProgrammer5 -> "MiddleProgrammer5"
//        is Programmer5.SeniorProgrammer5 -> "SeniorProgrammer5"
//        is Programmer5.TechLeadProgrammer5 -> "TechLeadProgrammer5"
//    }

//    println(temp)

}