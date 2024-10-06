class func(value: Int) {
    private var result = value
    operator fun invoke(adder: Int = 0): func = func(adder + result)
    override fun toString(): String = "$result"
}
class Box {
    private var listBox = mutableListOf<Int>()
    fun addAll(elements: Iterable<Int>) { listBox.addAll(elements) }
    operator fun get(firstIndex: Int, secondIndex: Int = 0): MutableList<Int> {
        val temp = mutableListOf<Int>()
        var tempIndex = firstIndex
        while(tempIndex < secondIndex) {
            temp += listBox[tempIndex]
            tempIndex += 1
        }
        return temp
    }
    operator fun get(indices: IntRange): MutableList<Int>{
        val temp = mutableListOf<Int>()
        var first = indices.first; val last = indices.last
        while(first <= last) {
            temp += listBox[first]
            first += 1
        }
        return temp
    }
    operator fun get(firstIndex: Int): Int {
        var actualIndex = (listBox.size - 1) * firstIndex
        if(firstIndex < 0)
            actualIndex *= -1
        actualIndex %= listBox.size // 10 for static
        return listBox[actualIndex]
    }
    operator fun set(firstIndex: Int, secondIndex: Int, list: List<Int>): MutableList<Int> { // <secondIndex
        var index = secondIndex - 1
        if(list.isEmpty()) {
            while(index >= firstIndex) {
                listBox -= listBox[index]
                index -= 1
            }
        } else {
            while(index >= firstIndex) {
                listBox -= listBox[index]
                index -= 1
            }
            var listIndex = 0
            index = firstIndex
            while (listIndex < list.size) {
                listBox.add(index, list[listIndex])
                listIndex += 1
                index += 1
            }
        }
        return listBox
    }
    operator fun set(range: IntRange, set: Set<Int>) {
        var firstIndex = range.first; var lastIndex = range.last
        while(lastIndex >= firstIndex) {
            listBox -= listBox[lastIndex]
            lastIndex -= 1
        }
        var listIndex = 0
        while(listIndex < set.size) {
            listBox.add(firstIndex, set.elementAt(listIndex))
            listIndex += 1
            firstIndex += 1
        }
    }
    operator fun set(index: Int, value: Int) {
        var actualIndex = (listBox.size - 1) * index
        if(index < 0)
            actualIndex *= -1
        actualIndex %= listBox.size
        listBox[actualIndex] = value
    }

    override fun toString(): String = "$listBox"

}
fun main() {
    // ====> Task 1
    println(func(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)) // 55
    println(func(5)()()()()()(4)()(1)()) // 10
    println(func(1)(3)(7)) // 11

    // ====> Task 2
    val box = Box()
    box.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    println(box[4, 7])    // [5, 6, 7]
    println(box[2..<8]) // [3, 4, 5, 6, 7, 8]
    println(box[-1])  // 10
    println(box[-10]) // 1
    println(box[-4])  // 7
    println(box[-5])  // 6

//    // ====> Task 3
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    box[3, 5] = emptyList<Int>()
    println(box) // [1, 2, 3, 6, 7, 8, 9, 10]
//    box[3, 5] = listOf(1, 2) // [1, 2, 3, 1, 2, 8, 9, 10]
//    println(box) // [1, 2, 3, 6, 7, 8, 9, 10]
    box[2..<6] = setOf(33, 44, 55, 66, 77, 88, 99, 100)
    println(box) // [1, 2, 33, 44, 55, 66, 77, 88, 99, 100, 9, 10]
    box[-3] = 10
    println(box) // [1, 2, 33, 44, 55, 66, 77, 88, 99, 10, 9, 10]
}