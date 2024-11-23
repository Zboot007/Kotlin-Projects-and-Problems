fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val twoDimension = list.chunked(2)
//    println(twoDimension)
//    println(list.justChunked(2))
//    println(twoDimension.chunked(1) { println(it) })
//    println(twoDimension.myChunked(1) { println(it) })
    println(list.chunked(3) { it })
    println(list.myChunked(3) { it })
}
fun <T> Iterable<T>.justChunked(size: Int): List<List<T>> {
    val list = mutableListOf<MutableList<T>>()
    for(item in this) {
        if(list.size == 0 || size == list[list.lastIndex].size)
            list += mutableListOf(item)
        else
            list[list.lastIndex] += item
    }
    return list
}
fun <T, K> Iterable<T>.myChunked(size: Int, transform: (List<T>) -> K): List<K> {
    val list = mutableListOf<K>()
    for(item in this.justChunked(size)) {
        list += transform(item)
    }
    return list
}
