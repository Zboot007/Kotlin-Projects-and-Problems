class SortedList(private val maxSize: Int = 15) {
    private val list = MutableList(maxSize) { 0 }
    private var listSize = 0
    var size = 0
        get() {
            field = 0
            for(element in list)
                if(element != 0)
                    field++
            return field
        }
    val minValue: Int?
        get() {
            var min = Int.MAX_VALUE
            if(size == 0)
                return null
            else
                for(element in list)
                    if(min >= element && element != 0)
                        min = element
            return if(min == Int.MAX_VALUE) null else min
        }
    val maxValue: Int?
        get() {
            var max = Int.MIN_VALUE
            if(size == 0)
                return null
            else
                for(element in list)
                    if(max <= element && element != 0)
                        max = element
            return if(max == Int.MIN_VALUE) null else max
        }
    fun isEmpty() : Boolean = size == 0
    fun isNotEmpty() : Boolean = size != 0
    fun removeFirst() : Int? {
        if(size == 0)
            return null
        else {
            list += 0
            return list.removeFirst()
        }
    }
    fun removeLast() : Int? {
        if(size == 0)
            return null
        var index = list.lastIndex
        while(index > 0) {
            if (list[index] == 0) {
                index -= 1
            }
            else {
                list += 0
                return list.removeAt(index)
            }
        }
        return null
    }
    fun add(input: Int) {
        if(listSize < maxSize) {
            if(input == 0)
                size += 1

            var index = 0
            while(listSize > index && list[index] < input) {
                index += 1
            }

            var indexShift = listSize + 1
            while(indexShift > index) {
                list[indexShift] = list[indexShift - 1]
                indexShift -= 1
            }
            list[index] = input
            listSize += 1
            println(list)
        } else {
            println("Invalid error!")
        }
    }
    fun contains(input: Int) : Boolean {
        for(index in list.indices)
            if(list[index] == input && index < size)
                return true
        return false
    }
    fun remove(input: Int) : Boolean {
        var bool = false
        var index = 0
        while(index < list.size - 1) {
            if(list[index] == input) {
                list.remove(input)
                list.addLast(0)
                bool = true
                index -= 1
            }
            index += 1
        }
        return bool
    }
    fun get(input: Int) = if(input <= listSize) list[input] else null
    override fun toString(): String = list.toString()
}

fun main() {

    val sortedList = SortedList(15) // [5, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    //====> size, isEmpty, isNotEmpty
    println("====> size, isEmpty, isNotEmpty")
    println(sortedList.size)         // 0
    println(sortedList.isEmpty())    // true
    println(sortedList.isNotEmpty()) // false

    // ====> removeFirst, removeLast
    println("====> removeFirst, removeLast")
    println("remove first value -> ${sortedList.removeFirst()}") // null
    println("remove last value -> ${sortedList.removeLast()}")   // null

    // ====> minValue, maxValue
    println("====> minValue, maxValue")
    println("min value -> ${sortedList.minValue}") // null
    println("max value -> ${sortedList.maxValue}") // null

    // ====> add
    println("====> add")
    sortedList.add(5)  // [5]
    sortedList.add(3)  // [3, 5]
    sortedList.add(7)  // [3, 5, 7]
    sortedList.add(4)  // [3, 4, 5, 7]
    sortedList.add(10) // [3, 4, 5, 7, 10]
    sortedList.add(9)  // [3, 4, 5, 7, 9, 10]
    sortedList.add(1)  // [1, 3, 4, 5, 7, 9, 10]
    sortedList.add(2)  // [1, 2, 3, 4, 5, 7, 9, 10]
    sortedList.add(8)  // [1, 2, 3, 4, 5, 7, 8, 9, 10]
    sortedList.add(6)  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    sortedList.add(5)  // [1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10]
    // ====> contains
    println("====> contains")
    println(sortedList.contains(2))  // true
    println(sortedList.contains(10)) // true
    println(sortedList.contains(0))  // false
    println(sortedList.contains(5))  // true
    println(sortedList.contains(11)) // false

    // ====> remove
    println("====> remove")
    println(sortedList.remove(5))  // true
    println(sortedList)
    // [1, 2, 3, 4, 6, 7, 8, 9, 10]
    println(sortedList.remove(5))  // false
    // [1, 2, 3, 4, 6, 7, 8, 9, 10]
    println(sortedList)

    // ====> size, isEmpty, isNotEmpty
    println("====> size, isEmpty, isNotEmpty")
    println(sortedList.size)         // 9
    println(sortedList.isEmpty())    // false
    println(sortedList.isNotEmpty()) // true

    // ====> get
    println("====> get")
    println(sortedList.get(2)) // 3
    println(sortedList.get(8)) // 10
    println(sortedList.get(4)) // 6

    // ====> minValue, maxValue
    println("====> minValue, maxValue")
    println("min value -> ${sortedList.minValue}") // 1
    println("max value -> ${sortedList.maxValue}") // 10

    // ====> removeFirst, removeLast
    println("====> removeFirst, removeLast")
    println("remove first value -> ${sortedList.removeFirst()}") // 1
    println("remove last value -> ${sortedList.removeLast()}")   // 10
    println(sortedList)
    // [2, 3, 4, 6, 7, 8, 9]

    // ====> minValue, maxValue
    println("====> minValue, maxValue")
    println("min value -> ${sortedList.minValue}") // 2
    println("max value -> ${sortedList.maxValue}") // 9

    // ====> remove
    println("====> remove")
    val nums = listOf(6, 4, 5, 2, 8, 3, 3, 7, 9)

    for(num in nums)
        println("remove $num -> ${sortedList.remove(num)}")

    // remove 6 -> true
    // remove 4 -> true
    // remove 5 -> false
    // remove 2 -> true
    // remove 8 -> true
    // remove 3 -> true
    // remove 3 -> false
    // remove 7 -> true
    // remove 9 -> true

    // ====> removeFirst, removeLast
    println("====> removeFirst, removeLast")
    println("remove first value -> ${sortedList.removeFirst()}") // null
    println("remove last value -> ${sortedList.removeLast()}")   // null

    // ====> minValue, maxValue
    println("====> minValue, maxValue")
    println("min value -> ${sortedList.minValue}") // null
    println("max value -> ${sortedList.maxValue}") // null

    println(sortedList)
    // []

    // ====> size, isEmpty, isNotEmpty
    println("====> size, isEmpty, isNotEmpty")
    println(sortedList.size)         // 0
    println(sortedList.isEmpty())    // true
    println(sortedList.isNotEmpty()) // false
}