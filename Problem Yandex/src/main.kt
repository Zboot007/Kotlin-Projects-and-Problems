fun main() {
    val list = listOf(1, 2, 3, 5, 7, 8, 9, 13)
    println(transferBySequence(list)) // "1-3, 5, 7-9, 13"
}
fun transferBySequence(list: List<Int>): String {
    var str = "${list[0]}"
    var index = 1
    while(index < list.size - 1) {
        if(list[index] == list[index + 1] - 1) {
            index += 1
        } else {
            if(list[index - 1] < list[index] && list[index] > list[index + 1])
            str += if(index + 1 == list.size) "-${list[index]}, " else "-${list[index]}"
            str += "${list[index + 1]}"
        }
    }
    return str
}