import kotlin.math.pow

// ====> Task 1
fun capitals(s: String): List<Int> {
    var result = mutableListOf<Int>()
    for(index in s.indices)
        if(s[index].isUpperCase())
            result += index
    return result.toList()
}

fun testCapitals() {
    val s1 = "CodEWaRs"
    val s2 = "PaGeMaStEr"

    println(capitals(s1) == listOf(0, 3, 4, 6))
    println(capitals(s2) == listOf(0, 2, 4, 6, 8))
}
// ====> Task 2
fun expandedForm(num: Int): String {
    val str = num.toString()
    var result = ""
    var dev = 10.0.pow((str.length - 1).toDouble()).toInt()

    for (index in str.indices) {
        val currentDigit = str[index].toString().toInt()
        if (currentDigit != 0) {
            if (result.isNotEmpty()) {
                result += " + "
            }
            result += (currentDigit * dev).toString()
        }
        dev /= 10
    }

    return result
}
fun testExpandedForm() {
    println(expandedForm(12) == "10 + 2")
    println(expandedForm(42) == "40 + 2")
    println(expandedForm(70304) == "70000 + 300 + 4")
}


// ====> Task 3
fun sortArray(lst: List<Int>): List<Int> {
    var oddNumber = mutableListOf<Int>()
    var result = lst.toMutableList()
    for(num in lst)
        if(num % 2 == 1)
            oddNumber += num
    oddNumber.sort()
    var counter = 0
    for(index in result.indices) {
        if(result[index] % 2 == 1) {
            result[index] = oddNumber[counter]
            counter += 1
        }
    }
    return result.toList()
}
fun testSortArray() {
    println(sortArray(listOf(5, 3, 2, 8, 1, 4)) == listOf(1, 3, 2, 8, 5, 4))
    println(sortArray(listOf(5, 3, 1, 8, 0)) == listOf(1, 3, 5, 8, 0))
    println(sortArray(emptyList()) == listOf<Int>())
    println(sortArray(listOf(5, 3, 2, 8, 1, 4, 11)) == listOf(1, 3, 2, 8, 5, 4, 11))
    println(sortArray(listOf(2, 22, 37, 11, 4, 1, 5, 0)) == listOf(2, 22, 1, 5, 4, 11, 37, 0))
    println(sortArray(listOf(1, 111, 11, 11, 2, 1, 5, 0)) == listOf(1, 1, 5, 11, 2, 11, 111, 0))
    println(sortArray(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) == listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))
    println(sortArray(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) == listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    println(sortArray(listOf(0, 1, 2, 3, 4, 9, 8, 7, 6, 5)) == listOf(0, 1, 2, 3, 4, 5, 8, 7, 6, 9))
}
// ====> Task 4
fun incrementString(s: String): String {
    if(s.isEmpty())
        return "1"
    var str = ""
    var temp = ""
    var len = s.length - 1
    wBlock@while(len < s.length) {
        if(s[len].isLetter()) {
            len += 1
            str = s.substring(0, len)
            while (len < s.length) {
                temp += s[len]
                len += 1
                if(len == s.length)
                    break@wBlock
            }
        }
        else if(s[len].isDigit())
            len -= 1
    }
    var index = 0
    var zeros = ""
    var counter = 0
    while (index < temp.length) {
        if(temp[index] == '0') {
            zeros += temp[index]
            counter += 1
        }
        index += 1
    }
    temp = temp.substring(counter)
    if(zeros.isEmpty())
        zeros = ""
    if(temp.isEmpty()) {
        temp = "0"
    }
    if(zeros.isNotEmpty() && temp.isEmpty()) {
        temp = zeros.lastIndex.toString()
        zeros = zeros.substring(1)
    }
    var n = temp.toInt() + 1
    var result = str + zeros + n
    println(result)
    return result
}
fun testIncrementString() {
    println(incrementString("foo") == "foo1")
    println(incrementString("foobar001") == "foobar002")
    println(incrementString("foobar1") == "foobar2")
    println(incrementString("foobar00") == "foobar01")
    println(incrementString("foobar99") == "foobar100")
    println(incrementString("foobar099") == "foobar100")
    println(incrementString("fo99obar99") == "fo99obar100")
    println(incrementString("fo99obar1999") == "fo99obar2000")
    println(incrementString("") == "1")
}

// ====> Task 5
fun wave(s: String): List<String> {
    var str = ""
    var counter = 0
    var result = mutableListOf<String>()
    var inner = 0
    for(index in s.trim().indices) {
        while(inner < s.trim().length) {
             if(counter == inner && s[inner] != ' ') {
                 str += s[inner].toUpperCase()
             }
//             else if(s[inner] == ' ') {
//                 str += s[inner]
//                 counter += 1
//                 inner += 1
//             }
             else
                 str += s[inner]
            inner += 1
        }
        counter += 1
        result += str
        str = ""
        inner = 0
    }
    println(result)
    return result
}
fun testWave() {
    var result = listOf("Hello", "hEllo", "heLlo", "helLo", "hellO")
    println(wave("hello") == result)

    result = listOf("Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS")
    println(wave("codewars") == result)

    result = listOf()
    println(wave("") == result)

    result = listOf("Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS")
    println(wave("two words") == result)

    result = listOf(" Gap ", " gAp ", " gaP ")
    println(wave(" gap ") == result)

    result = listOf("A       b    ", "a       B    ")
    println(wave("a       b    ") == result)

    result = listOf("This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS")
    println(wave("this is a few words") == result)
}

// ====> Task 6
fun meeting(s: String): String {
    return ""
}
fun testMeeting() {
    println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn") ==
            "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)")
    println(meeting("John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell") ==
            "(BELL, MEGAN)(CORNWELL, AMBER)(DORNY, JAMES)(DORRIES, PAUL)(GATES, JOHN)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)(STEVE, LEWIS)(WAHL, MICHAEL)")
    println(meeting("Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern") ==
            "(ARNO, ALEX)(ARNO, HALEY)(BELL, SARAH)(CORNWELL, ALISSA)(DORNY, PAUL)(DORRIES, ANDREW)(KERN, ANN)(KERN, MADISON)")
    println(meeting("Anna:Wahl;Grace:Gates;James:Russell;Elizabeth:Rudd;Victoria:STAN;Jacob:Wahl;Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve") ==
            "(BELL, MEGAN)(GATES, ANTONY)(GATES, GRACE)(META, ALISSA)(RUDD, ELIZABETH)(RUSSELL, JAMES)(STAN, AMANDY)(STAN, VICTORIA)(STEVE, ANNA)(WAHL, ALEX)(WAHL, ANNA)(WAHL, JACOB)")
    println(meeting("Ann:Russel;John:Gates;Paul:Wahl;Alex:Tolkien;Ann:Bell;Lewis:Kern;Sarah:Rudd;Sydney:Korn;Madison:Meta") ==
            "(BELL, ANN)(GATES, JOHN)(KERN, LEWIS)(KORN, SYDNEY)(META, MADISON)(RUDD, SARAH)(RUSSEL, ANN)(TOLKIEN, ALEX)(WAHL, PAUL)")
    println(meeting("Paul:Arno;Matthew:Schwarz;Amandy:Meta;Grace:Meta;Ann:Arno;Alex:Schwarz;Jacob:Rudd;Amber:Cornwell") ==
            "(ARNO, ANN)(ARNO, PAUL)(CORNWELL, AMBER)(META, AMANDY)(META, GRACE)(RUDD, JACOB)(SCHWARZ, ALEX)(SCHWARZ, MATTHEW)")
    println(meeting("Abba:Bell;Lewis:Cornwell;Jacob:STAN;Matthew:Schwarz;Ann:STAN;Sophia:Gates;Victoria:Korn;Anna:Bell;Paul:Kern;Alissa:Tolkien") ==
            "(BELL, ABBA)(BELL, ANNA)(CORNWELL, LEWIS)(GATES, SOPHIA)(KERN, PAUL)(KORN, VICTORIA)(SCHWARZ, MATTHEW)(STAN, ANN)(STAN, JACOB)(TOLKIEN, ALISSA)")
    println(meeting("Victoria:Thorensen;Ann:Arno;Alexis:Wahl;Emily:Stan;Anna:STAN;Jacob:Korn;Sophia:Gates;Amber:Kern") ==
            "(ARNO, ANN)(GATES, SOPHIA)(KERN, AMBER)(KORN, JACOB)(STAN, ANNA)(STAN, EMILY)(THORENSEN, VICTORIA)(WAHL, ALEXIS)")
    println(meeting("Andrew:Arno;Jacob:Russell;Anna:STAN;Antony:Gates;Amber:Korn;Lewis:Dorries;Ann:Burroughs;Alex:Kern;Anna:Arno;Elizabeth:Kern;John:Schwarz;Sarah:STAN") ==
            "(ARNO, ANDREW)(ARNO, ANNA)(BURROUGHS, ANN)(DORRIES, LEWIS)(GATES, ANTONY)(KERN, ALEX)(KERN, ELIZABETH)(KORN, AMBER)(RUSSELL, JACOB)(SCHWARZ, JOHN)(STAN, ANNA)(STAN, SARAH)")
    println(meeting("Megan:Wahl;Alexis:Arno;Alex:Wahl;Grace:STAN;Amber:Kern;Amandy:Schwarz;Alissa:Stan;Paul:Kern;Ann:Meta;Lewis:Burroughs;Andrew:Bell") ==
            "(ARNO, ALEXIS)(BELL, ANDREW)(BURROUGHS, LEWIS)(KERN, AMBER)(KERN, PAUL)(META, ANN)(SCHWARZ, AMANDY)(STAN, ALISSA)(STAN, GRACE)(WAHL, ALEX)(WAHL, MEGAN)")

}
// ====> Task 7
// 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
// 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
// 4 --> 0 (because 4 is already a one-digit number, there is no multiplication)

fun persistence(num: Int): Int {
    return 0
}
fun testPersistence() {
    println(persistence(39) == 3)
    println(persistence(4) == 0)
    println(persistence(25) == 2)
    println(persistence(999) == 4)
}

// ====> Task 8
fun uniqueInOrder(sequence: List<Any>): List<Any> {
    println(sequence)
    var counter = 1
    var result = mutableListOf<Any>()
    for(index in sequence.indices) {
        for(checker_index in sequence.indices) {

        }
    }
    println(result)
    return result
}
fun testUniqueInOrder() {
    println(uniqueInOrder("AAAABBBCCDAABBB".toList()) == listOf('A', 'B', 'C', 'D', 'A', 'B'))
    println(uniqueInOrder("ABBCcAD".toList()) == listOf('A', 'B', 'C', 'c', 'A', 'D'))
    println(uniqueInOrder(listOf(1, 2, 2, 3, 3)) == listOf(1, 2, 3))
    println(uniqueInOrder(listOf(1, 2, 2, 3, 3)) == listOf(1, 2, 3))
    println(uniqueInOrder(listOf(7, 5, 7)) == listOf(7, 5))
}
// ====> Task 9
fun createPhoneNumber(lst: List<Int>): String {
    var result = "("
    for(index in lst.indices) {
        if(index == 6) {
            result += "-"
            result += lst[index]
        }
        if(index <= 3) {
            if(index == 2) {
                result += lst[index]
                result += ") "
            }
            else
                result += lst[index]
        }
        else if(index < 6)
            result += lst[index]
        else if(index > 6)
            result += lst[index]

    }
    return result
}
fun testCreatePhoneNumber() {
    println(createPhoneNumber(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) == "(123) 456-7890")
    println(createPhoneNumber(listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)) == "(111) 111-1111")
    println(createPhoneNumber(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) == "(123) 456-7890")
    println(createPhoneNumber(listOf(0, 2, 3, 0, 5, 6, 0, 8, 9, 0)) == "(023) 056-0890")
    println(createPhoneNumber(listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)) == "(000) 000-0000")
}

// ====> Task 10
fun printMatrix(matrix: List<List<Int>>) {
    for(row in matrix) {
        println(row)
    }
}


fun rotate(matrix: List<List<Int>>, deg: Int): List<List<Int>> {
    return emptyList()
}
fun testRotate() {
    // [1, 2, 3]
    // [4, 5, 6]
    // [7, 8, 9]

    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    printMatrix(rotate(matrix, 90))
    // [7, 4, 1]
    // [8, 5, 2]
    // [9, 6, 3]

    printMatrix(rotate(matrix, 180))
    // [9, 8, 7]
    // [6, 5, 4]
    // [3, 2, 1]

    printMatrix(rotate(matrix, 270))
    // [3, 6, 9]
    // [2, 5, 8]
    // [1, 4, 7]

    printMatrix(rotate(matrix, 360))
    // [1, 2, 3]
    // [4, 5, 6]
    // [7, 8, 9]
}




fun main() {
//    testCapitals() ^
//    testExpandedForm() ^
//    testSortArray() ^
//    testIncrementString() ^?
//    testWave() ^?
//    testMeeting()
//    testPersistence()
//    testUniqueInOrder()
//    testCreatePhoneNumber() ^
//    testRotate()
}