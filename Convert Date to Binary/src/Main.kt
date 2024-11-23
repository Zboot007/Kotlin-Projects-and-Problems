fun main() {
    println(convertDateToBinary("100000100000-10-11101")) // 2080-02-29
}
fun convertDateToBinary(date: String): String {
    var result = ""
    date.split("-").forEachIndexed { index, it ->
        result += it.toInt().toString(2)
        result += if(index != 2) "-" else ""
    }
    return result
}