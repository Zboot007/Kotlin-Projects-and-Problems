fun main() {
    // ====> myMap, myMapIndexed
    // ====> myAny myAll
    // ====> myForEach, myForEachIndexed
    // ====> myFilter, myFilterIndexed
    // ====> myFold, myFoldIndexed
    // ====> myReduce, myReduceIndexed
    println(listOf(1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7).map { it > 4 })
    println(listOf(1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7).myMap { it > 4 })
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8).any())
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8).myAny())
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8).all { it >= 1 })
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8).myAll { it >= 1 })
    println(listOf(1, 2, 3, 4, 5).filter { it % 2 == 0 })
    println(listOf(1, 2, 3, 4, 5).myFilter { it % 2 == 0 })
    listOf(1, 2, 3, 4).forEach { print(it * 2) }
    println()
    listOf(1, 2, 3, 4).myForEach { print(it * 2) }
    println()
    println(listOf(1, 2, 3, 4, 5).fold(0) { accumulator, current -> accumulator + current })
    println(listOf(1, 2, 3, 4, 5).myFold(0) { accumulator, current -> accumulator + current })
    println(listOf(3, 4, 5, 1, 2).mapIndexed { index, current -> print("index: $index current: $current") })
    println(listOf(3, 4, 5, 1, 2).myMapIndexed { index, current -> print("index: $index current: $current") })
    println("=== forEachIndexed ===")
    println(listOf(1, 2, 3, 4, 5, 6).forEachIndexed { index, i -> println("index: $index current: $i") })
    println(listOf(1, 2, 3, 4, 5, 6).myForEachIndexed { index, i -> println("index: $index current: $i") })
    println("=== filterIndexed ===")
    println(listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100).filterIndexed { index, i -> i % 2 == 0 && i > index })
    println(listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100).myFilterIndexed { index, i -> i % 2 == 0 && i > index })
    println("=== foldIndexed ===")
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).foldIndexed(0) { index, accumulator, i -> index + accumulator + i })
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).myFoldIndexed(0) { index, accumulator, i -> index + accumulator + i })
    println("=== reduce ===")
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce { accumulator, i -> accumulator + i * 2 })
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).myReduce { accumulator, i -> accumulator + i * 2 })
    println("=== reduceIndexed ===")
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduceIndexed { index, accumulator, i -> accumulator + i + index })
    println(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).myReduceIndexed { index, accumulator, i -> accumulator + i + index })
}
fun <T, R> Iterable<T>.myMap(func: (T) -> R): List<R> {
    val list = mutableListOf<R>()
    for(item in this) list += func(item)
    return list.toList()
}
fun <T> Iterable<T>.myAny(): Boolean {
    for(item in this) return true
    return false
}
fun <T> Iterable<T>.myAll(predicate: (T) -> Boolean): Boolean {
    var boolean = false
    for(item in this) if(predicate(item)) boolean = true else return false
    return boolean
}
fun <T> Iterable<T>.myFilter(operation: (T) -> Boolean): List<T> {
    val list = mutableListOf<T>()
    for(item in this) if(operation(item)) list += item
    return list
}
fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for(item in this) action(item)
}
fun <T, R> Iterable<T>.myFold(initial: R, callBack: (acc: R, current: T) -> R) : R {
    var acc = initial
    for(item in this) acc = callBack(acc, item)
    return acc
}
fun <T, R> Iterable<T>.myMapIndexed(callback: (index: Int, T) -> R): List<R> {
    val list = mutableListOf<R>()
    for((index, item) in withIndex()) list += callback(index, item)
    return list
}
fun <T> Iterable<T>.myForEachIndexed(action: (index: Int, T) -> Unit): Unit {
    for((index, item) in withIndex()) action(index, item)
}
fun <T> Iterable<T>.myFilterIndexed(operation: (index: Int, T) -> Boolean): List<T> {
    val list = mutableListOf<T>()
    for((index, item) in withIndex()) if(operation(index, item)) list += item
    return list
}
fun <T, K> Iterable<T>.myFoldIndexed(initial: K, callback: (index: Int, K, T) -> K): K {
    var accumulator = initial
    for((index, item) in withIndex())  accumulator = callback(index, accumulator, item)
    return accumulator
}
fun <L, I: L> Iterable<I>.myReduce(operation: (L, I) -> L): L {
    val Iterator = this.iterator()
    var accumulator: L = Iterator.next()
    while(Iterator.hasNext()) accumulator = operation(accumulator, Iterator.next())
    return accumulator
}
fun <R, T: R> Iterable<T>.myReduceIndexed(operation: (index: Int, R, T) -> R): R {
    val iterator = this.iterator()
    var accumulator: R = iterator.next()
    var index = 1
    while(iterator.hasNext()) {
        accumulator = operation(index, accumulator, iterator.next())
        index += 1
    }
    return accumulator
}