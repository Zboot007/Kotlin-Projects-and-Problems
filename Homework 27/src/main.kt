fun main() {
    println(babyCount("babybabybaby"))
    println(babyCount("abby"))
    println(babyCount("bbbbbbbbbbbbbbbbay"))
//    println(babyCount("Why the hell are there so many babies?!"))
//    println(babyCount("Anyone remember life before babies?"))
//    println(babyCount("Happy babies boom ba by?"))
//    println(babyCount("b a b y"))
//    println(babyCount(""))
//    println(babyCount("none her"))
}
fun babyCount(x: String): Int? {
    val r = Regex("((?=.*a)?(?=.*b{2})?(?=.*y)){4}", RegexOption.IGNORE_CASE).findAll(x)
    val cap = r.map { it.value }.toList()
    println(cap)
    return if(r.count() == 0) null else r.count() / 4
}