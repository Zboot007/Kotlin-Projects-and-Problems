import kotlin.text.RegexOption.*

fun countWords(s: String): Int {
    var list = mutableListOf<String>()
    var buffer = ""
    for(symbol in s) {
        if(symbol != ' ' && symbol != '-') {
            buffer += symbol
        } else {
            if(buffer.isNotEmpty()) {
                list += buffer
                buffer = ""
            }
        }
    }
    if(buffer.isNotEmpty()) {
        list += buffer
    }
    return list.size
}
fun countWords2(s: String)
    = "[\\s-]+".toRegex().split(s).size

fun snakeRegister(s: String): String {
    var temp = ""

    for(symbol in s) {
        if(symbol.isUpperCase()) {
            temp += "_${symbol.lowercase()}"
        } else {
            temp += symbol
        }
    }

    return temp
}

fun snakeRegister2(s: String): String
    = "[A-Z]".toRegex().replace(s) { "_${it.value.lowercase()}" }

fun main() {
    // ====> Task 1
    // a1:B1
    // isCorrectMove(move)

    // ====> Task 2
    // Pagemaster-92
    // isCorrectPassword(password)

    // ====> Task 3
    // sos-it-academy@gmail.com
    // isCorrectEmail(mail)


    // containsMatchIn -> boolean
    // find -> match?
    // findAll -> Sequence<match>
    // split -> list<String>
    // replaceFirst -> ""
    // replace -> ""

//    val s1 = "firstName"
//    val s2 = "indexOutOfBoundRange"
//
//    println(snakeRegister2(s1)) // first_name
//    println(snakeRegister2(s2)) // index_out_of_bound_range



//    val words = "this    is--a-simple   text"
//    println(countWords(words))
//    println(countWords2(words))



//    val s = "abaaabaabaaacaaabrfaaab"
//    val reg = "a{3}b"
//
//    val matchResult = reg.toRegex().find(s)
//
//    println(matchResult?.value)  // aaab
//    println(matchResult?.range)  // 2..5
//    println("=".repeat(20))
//    for(match in reg.toRegex().findAll(s)) {
//        println(match.value)
//        println(match.range)
//    }
    // aaab
    // 2..5
    // aaab
    // 13..16
    // aaab
    // 19..22




//    val text = "tHiS Is A siMPle tExt"
//
//    for(match in "[aeiou]".toRegex(IGNORE_CASE).findAll(text)) {
//        println(match.value)
//    }

//    Regex("", RegexOption.CANON_EQ)
//    "".toRegex(...)

//    val s = "mike"
//    val reg = Regex("Mike")
//
//    println(reg.containsMatchIn(s))

    // ^ $ | . + * ? [] () {} \

//    val text = "this colour is red"
//    val reg = "color|colour".toRegex()
//    val reg = "colou?r".toRegex()
//    val match = reg.find(text)
//    println(reg.containsMatchIn(text))
//    println(match?.value)
//    println(match?.range)


//    println(reg.matches(text))
//    println(reg.matchAt(text, 0))
//    println(reg.matchesAt(text, 0))
//    println(reg.matchEntire(text))

    // ====> quantifier -> количество
    // gready -> жадные
    // expr?     -> 0,1
    // expr*     -> 0 .. *
    // expr+     -> 1 .. *
    // expr{3}   -> 3
    // expr{2,}  -> 2 .. *
    // expr{3,5} -> 3 .. 5

    // lazy -> ленивые
    // expr??     -> 0,1
    // expr*?     -> 0 .. *
    // expr+?     -> 1 .. *
    // expr{3}?   -> 3
    // expr{2,}?  -> 2 .. *
    // expr{3,5}? -> 3 .. 5

//    val tag = "<span>First</span><span>Second</span>"
//    val reg = "<span>.*?</span>".toRegex()
//
//    println(reg.find(tag)?.value)

//    println("f{1,4}".toRegex().find("abfffcd")?.value)      // 1 fff
//    println("f+?".toRegex().find("abfffcd")?.value)         // 2 f
//    println("f+?cd".toRegex().find("abfffcd")?.value)       // 3 fffcd
//    println("f{1,4}".toRegex().find("abfffcd")?.value)      // 4 fff
//    println("f+cd".toRegex().find("abfffcd")?.value)        // 5 fffcd
//    println("f{1,4}?c".toRegex().find("abfffcd")?.value)    // 6 fffc
//    println("go+?".toRegex().find("gooooogle")?.value)      // 7 go
//    println("go{3,4}?g".toRegex().find("gooooogle")?.value) // 8 null

    // ====> set -> наборы
    // [abc]  -> a|b|c
    // [^abc] -> !(a|b|c)
    // [0-9]  -> 0|1|2|3|4|5|6|7|8|9
    // \d     -> [0-9]
    // \D     -> [^0-9]
    // \w     -> [a-zA-Z_0-9]
    // \W     -> [^a-zA-Z_0-9]
    // \s     -> [\v\t\n..]
    // \S     -> [^\v\t\n..]

    // hours   -> 00 .. 23
    // minutes -> 00 .. 59
//    val time = "03:03"
//    val reg = "^(2[0-3]|[0-1]\\d):([0-5]\\d)$".toRegex()
//
//    println(reg.find(time)?.value)

    // ====> assertion -> утверждение
    // ^expr  -> начало строки -> default
    // expr$  -> конец строки  -> default
    // \bexpr -> начало слово
    // expr\b -> конец слово
    // \Bexpr -> не начало слово
    // expr\B -> не конец слово
    // expr(?=expr)  -> справой стороны должно быть совпадения
    // expr(?!expr)  -> справой стороны не должно быть совпадения
    // (?<expr)expr  -> слевой стороны должно быть совпадения
    // (?<!expr)expr -> слевой стороны не должно быть совпадения

    // ====> group -> группы
    // (expr) -> \n
    // (?<tag>expr) -> \k<tag>
    // (?:expr) -> "12:55" -> "(?:\\d{2}):(\\d{2})"
    // -> ["12:55", "55"]

//    val tag = "<div>First</div>"
//    val reg = "<(?<tag>\\w+)>.*?</\\k<tag>>".toRegex()
//    // \w -> [a-zA-Z_0-9]
//    println(reg.find(tag)?.value)

//    val ip = "192.168.1.2"
//    val reg = "(\\d{1,3}).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})"
//    val date = "16/07/2024"
//    val reg2 = "(?<all>\\d{2}/(?<mandy>\\d{2}/(?<year>\\d{4})))"
//    val match = reg.toRegex().find(ip)
//    val match2 = reg2.toRegex().find(date)
//
//    println(match2!!.groups["all"]!!.value)   // 16/07/2024
//    println(match2!!.groups["mandy"]!!.value) // 07/2024
//    println(match2!!.groups["year"]!!.value)  // 2024

//    println(match2!!.groupValues[1]) // 16/07/2024
//    println(match2!!.groupValues[2]) // 07/2024
//    println(match2!!.groupValues[3]) // 2024

//    println(match!!.groupValues[0] == match!!.value)
//    println(match!!.groupValues[1]) // 192
//    println(match!!.groupValues[2]) // 168
//    println(match!!.groupValues[3]) // 1
//    println(match!!.groupValues[3]) // 2


//    // ====> Task 1
//    val ip = "255.255.0.0"
//    println(isCorrectIpAdress(ip)) // true
//
//    // ====> Task 2
//    // 0 1 3 4 5 7 9
//    // +998935157020 | 998935157020 | 935157020
//    val phone = "+998935157020"
//    println(isCorrectPhoneNumber(phone)) // true
}

fun isCorrectTime(s: String): Boolean {
    val sub = s.split(':')
    if(sub[0].length != 2 || sub[1].length != 2)
        return false
    return sub[0].toInt() in 0..23 && sub[1].toInt() in 0 .. 59
}
