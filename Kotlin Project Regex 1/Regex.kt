fun main() {
//    Regex("")
//    "".toRegex()

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
    val time = "03:03"
    val reg = "^(2[0-3]|[0-1]\\d):([0-5]\\d)$".toRegex()

    println(reg.find(time)?.value)

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
