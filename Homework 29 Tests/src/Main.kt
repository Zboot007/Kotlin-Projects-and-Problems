// ===== TestHighAndLow =====
fun HighAndLow(s: String): String {
    val list = s.split(" ").map { it.toInt() }.sorted()
    return "${list.last()} ${list[0]}"
}

fun TestHighAndLow(){
    assert(HighAndLow("1 2 -3 4 5") == "5 -3")
    assert(HighAndLow("1 9 3 4 -5") == "9 -5")
    assert(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4") == "42 -9")
    assert(HighAndLow("1 2 3") == "3 1")
    println("===== TestHighAndLow =====")
}

// ===== TestPersistence =====
//fun Persistence(n: Int): Int {
//}

//fun TestPersistence(){
//    // 39  -> 3  => 3*9 = 27, 2*7 = 14, 1*4 = 4
//    // 999 -> 4  => 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, 1*2 = 2
//    // 4   -> 0  => 4
//    // 25 ->  2*5 = 10, 1
//    assert(3 == Persistence(39))
//    assert(0 == Persistence(4))
//    assert(2 == Persistence(25))
//    assert(4 == Persistence(999))
//    println("===== TestPersistence =====")
//}

// ===== TestAccum =====
fun Accum(s: String): String {
    return s.mapIndexed { index, c -> "${c.uppercase()}${c.lowercase().repeat(index)}" + if(index < s.lastIndex) "-" else "" }.joinToString("")
}

fun TestAccum(){
    assert(Accum("abcd") == "A-Bb-Ccc-Dddd")
    assert(Accum("RqaEzty") == "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy")
    assert(Accum("cwAt") == "C-Ww-Aaa-Tttt")
    assert(Accum("ZpglnRxqenU") == "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
    assert(Accum("NyffsGeyylB") == "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")
    assert(Accum("MjtkuBovqrU") == "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu")
    assert(Accum("EvidjUnokmM") == "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm")
    assert(Accum("HbideVbxncC") == "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc")
    println("===== TestAccum =====")
}

// ===== TestDescendingOrder =====
fun DescendingOrder(num: Int): Int {
    return num.toString().split("").sortedDescending().joinToString("").toInt()
}

fun TestDescendingOrder() {
    assert(DescendingOrder(42145) == 54421)
    assert(DescendingOrder(145263) == 654321)
    assert(DescendingOrder(123456789) == 987654321)
    println("===== TestDescendingOrder =====")
}

// ===== TestFind =====
fun FindOutlier(integers: List<Int>): Int {
    return if(integers.filter { it % 2 == 0 }.size == 1) integers.find { it % 2 == 0 } ?: 0 else integers.find { it % 2 == 1 } ?: 0
}

fun TestFindOutlier(){
    var exampleTest1 = listOf(2, 4, 0, 100, 4, 11, 2602, 36)
    assert(11 == FindOutlier(exampleTest1))

    var exampleTest2 = listOf(160, 3, 1719, 19, 11, 13, -21)
    assert(160 == FindOutlier(exampleTest2))

    var exampleTest3 = listOf(2,6,8,-10,3)
    assert(3 == FindOutlier(exampleTest3))

    var exampleTest4 = listOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)
    assert(206847684 == FindOutlier(exampleTest4))

    var exampleTest5 = listOf(7777777, 0, 1)
    assert(0 == FindOutlier(exampleTest5))

    println("===== TestFind =====")
}

// ===== TestDisemvowel =====
fun Disemvowel(s: String): String {
    return "[aoiue]".toRegex(RegexOption.IGNORE_CASE).replace(s, "")
}

fun TestDisemvowel(){
    assert("Ths wbst s fr lsrs LL!" == Disemvowel("This website is for losers LOL!"))
    assert("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd" == Disemvowel("No offense but,\nYour writing is among the worst I've ever read"))
    assert("Wht r y,  cmmnst?" == Disemvowel("What are you, a communist?"))
    println("===== TestDisemvowel =====")
}

// ===== TestTwoOldestAges =====
fun TwoOldestAges(ages: List<Int>): List<Int> {
    return ages.sortedDescending().dropLast(ages.size - 2).reversed()
}

fun TestTwoOldestAges() {
    var result1 = TwoOldestAges( listOf(1, 2, 10, 8 ))
    assert(result1[0] == 8 && result1[1] == 10)

    var result2 = TwoOldestAges( listOf(1,5,87,45,8,8 ))
    assert(result2[0] == 45 && result2[1] == 87)

    var result3 = TwoOldestAges( listOf(6,5,83,5,3,18 ))
    assert(result3[0] == 18 && result3[1] == 83)

    var result4 = TwoOldestAges( listOf(6,5,83,83 ))
    assert(result4[0] == 83 && result4[1] == 83)
    println("===== TestTwoOldestAges =====")
}

// ===== TestBinaryArrayToNumber =====
fun BinaryArrayToNumber(arr: List<Int>): Int {
    return arr.joinToString("").toInt(2)
}

fun TestBinaryArrayToNumber() {
    assert(BinaryArrayToNumber(listOf( 0, 1, 0, 0 )) == 4)
    assert(BinaryArrayToNumber(listOf( 0, 0, 1, 0 )) == 2)
    assert(BinaryArrayToNumber(listOf( 0, 1, 0, 1 )) == 5)
    assert(BinaryArrayToNumber(listOf( 1, 0, 0, 1 )) == 9)
    assert(BinaryArrayToNumber(listOf( 0, 0, 1, 0 )) == 2)
    assert(BinaryArrayToNumber(listOf( 0, 1, 1, 0 )) == 6)
    assert(BinaryArrayToNumber(listOf( 1, 1, 1, 1 )) == 15)
    assert(BinaryArrayToNumber(listOf( 1, 0, 1, 1 )) == 11)
    println("===== TestBinaryArrayToNumber =====")
}

// ===== TestIsIsogram =====
fun IsIsogram(s: String): Boolean {
    return s.lowercase().length == s.lowercase().toSet().size
}

fun TestIsIsogram(){
    // "Dermatoglyphics" -> true
    // "aba" --> false
    // "moOse" --> false (ignore letter case)
    assert(IsIsogram("Dermatoglyphics"))
    assert(IsIsogram("isogram"))
    assert(!IsIsogram("moose"))
    assert(!IsIsogram("isIsogram"))
    assert(!IsIsogram("aba"))
    assert(!IsIsogram("moOse"))
    assert(IsIsogram("thumbscrewjapingly"))
    assert(IsIsogram(""))
    println("===== TestIsIsogram =====")
}

// ===== TestDuplicateCount =====
fun DuplicateCount(text: String): Int {
    return text.lowercase().groupingBy { it }.eachCount().count { it.value > 1 }
}

fun TestDuplicateCount(){
    assert(0 == DuplicateCount(""))
    assert(2 == DuplicateCount("aA11"))
    assert(2 == DuplicateCount("ABBA"))
    assert(0 == DuplicateCount("abcde"))
    assert(2 == DuplicateCount("aabbcde"))
    assert(2 == DuplicateCount("aabBcde"))
    assert(1 == DuplicateCount("Indivisibility"))
    assert(2 == DuplicateCount("Indivisibilities"))
    println("===== TestDuplicateCount =====")
}

// ===== TestCheckExam =====
fun CheckExam(arr1: List<String>, arr2: List<String>): Int {
    return arr1.mapIndexed { index, correct ->
        val answer = arr2.getOrElse(index) { "" }
        when {
            answer.isEmpty() -> 0
            answer == correct -> 4
            else -> -1
        }
    }.fold(0) { acc, score -> acc + score }.coerceAtLeast(0)
}

fun TestCheckExam(){
    // 4 -1 0
    assert(CheckExam(listOf("a", "a", "b", "b"), listOf("a", "c", "b", "d")) == 6)
    assert(CheckExam(listOf("a", "a", "c", "b"), listOf("a", "a", "b",  "")) == 7)
    assert(CheckExam(listOf("a", "a", "b", "c"), listOf("a", "a", "b", "c")) == 16)
    assert(CheckExam(listOf("b", "c", "b", "a"), listOf("",  "a", "a", "c")) == 0)
    println("===== TestCheckExam =====")
}

// ===== TestCapitals =====
fun Capitals(word: String): List<Int> {
    return word.mapIndexed { index, c -> if(c.isUpperCase()) listOf(index) else emptyList<Int>() }.flatten()
}

fun TestCapitals(){
    assert(Capitals("CodEWaRs") == listOf(0, 3, 4, 6))
    assert(Capitals("PaGeMaSTeR") == listOf(0, 2, 4, 6, 7, 9))
    println("===== TestCapitals =====")
}

// ===== TowerBuilder =====
fun TowerBuilder(n_floors: Int): List<String> {
    return (0..<n_floors).map {
        " ".repeat(n_floors - 1 - it) +
        "*".repeat(it * 2 + 1) +
        " ".repeat(n_floors - 1 - it)
    }
}

fun TestTowerBuilder(){
    assert(TowerBuilder(1) == listOf(  "*" ))
    assert(TowerBuilder(2) == listOf( " * ",
                                               "***" ))
    assert(TowerBuilder(3) == listOf( "  *  ",
                                               " *** ",
                                               "*****" ))
    assert(TowerBuilder(6) == listOf( "     *     ",
                                               "    ***    ",
                                               "   *****   ",
                                               "  *******  ",
                                               " ********* ",
                                               "***********" ))
    println("===== TowerBuilder =====")
}
fun main() {

    TestHighAndLow()
//    TestPersistence() // ?🎇?
    TestAccum()
    TestDescendingOrder()
    TestFindOutlier()
    TestDisemvowel()
    TestTwoOldestAges()
    TestBinaryArrayToNumber()
    TestIsIsogram()
    TestDuplicateCount()
    TestCheckExam()
    TestCapitals()
    TestTowerBuilder() // 💎
}