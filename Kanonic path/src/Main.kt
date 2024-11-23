fun main() {
    val str = readln()
    val regex = Regex("/([a-z]|\\d)*?", RegexOption.IGNORE_CASE)
    println(regex.findAll(str).map { it.value }.toList())
}