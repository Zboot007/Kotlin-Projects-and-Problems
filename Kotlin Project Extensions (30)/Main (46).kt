
fun Int.isEven()
    = this % 2 == 0
val Int.isOdd
    get() = this % 2 != 0


fun highAndLow(s: String): String {
    // "1 2 -3 4 5" -> ["1", "2", "-3", "4", "5"]
    // ["1", "2", "-3", "4", "5"] -> [1, 2, -3, 4, 5]
    // [1, 2, -3, 4, 5] ->  [-3, 1, 2, 4, 5]
    // "5 -3"
    return s.split(" ")
            .map(String::toInt)
            .sorted()
            .run {
                "${last()} ${first()}"
            }

//    return "${s.split(" ").maxOf(String::toInt)} ${s.split(" ").minOf(String::toInt)}"
//    val r = s.split(" ")
//        .map(String::toInt)
//        .sorted()
//    return "${r.last()} ${r.first()}"
}

fun testHighAndLow(){
    println(highAndLow("1 2 -3 4 5")) // == "5 -3")
    println(highAndLow("1 9 3 4 -5")) // == "9 -5")
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")) // == "42 -9")
    println(highAndLow("1 2 3")) // == "3 1")
    println("===== TestHighAndLow =====")
}

fun <E, R> E.myLet(callback: (E) -> R): R {
    return callback(this)
}
fun <E, R> E.myRun(callback: E.() -> R): R {
    return callback()
}

fun myBuildString(build: StringBuilder.() -> Unit): String {
    val s = StringBuilder()
    s.build()
    return s.toString()
}

fun main() {

//    val s = StringBuilder().append("[")
//                           .append("1, ")
//                           .append("2, ")
//                           .append("3]")
//    val s = myBuildString {
//        append("[")
//        append("1, ")
//        append("2, ")
//        append("3]")
//    }
//    val l = buildList {
//        add(5)
//        this += 2
//    }
//    println(s)
//    println(l)

//    println(listOf(5, 1, 3).myRun {
//        "${last()} ${first()}"
//    })

//    testHighAndLow()

//    println(isEven(2))
//    println((2).isEven())
//    println((3).isOdd)

    // apply(() -> this)
    // let((this) -> R)
    // run(() -> R)
    // with(this, () -> R)
    // takeIf((this) -> Boolean): E?
    // takeUnless((this) -> Boolean): E?

//    println(listOf(5, 1, 3).last().takeIf { it % 2 == 0 } ?: "??")
//    println(listOf(5, 1, 3).last().takeUnless { it % 2 == 0 })

    // ====> myMap, myMapIndexed
    // ====> myAny myAll
    // ====> myForEach, myForEachIndexed
    // ====> myFilter, myFilterIndexed
    // ====> myFold, myFoldIndexed

}