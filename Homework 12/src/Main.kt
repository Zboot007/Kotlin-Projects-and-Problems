class Stack() : Iterable<Int>{
    val stack = mutableListOf<Int>()
    fun push(value: Int) {
        stack += value
    }
    fun peek() : Int? {
        return if(stack.isNotEmpty()) stack[stack.size - 1] else null
    }
    fun top() : Int? {
        return if(stack.isNotEmpty()) stack.removeAt(stack.size - 1) else null
    }
    override fun iterator(): Iterator<Int> = object : Iterator<Int> {
        private var index = stack.size - 1

        override fun hasNext() : Boolean {
            return index >= 0
        }

        override fun next() : Int {
            return stack[index--]
        }
    }
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Stack)
            return false
        if(this === other || stack == other.stack)
            return true
        return stack == other.stack // smart casting
    }

    override fun hashCode(): Int {
        return stack.hashCode()
    }
}
fun main() {
    // LIFO
    // ====> Task 1
    val stack = Stack()

    stack.push(1) // [1]
    stack.push(2) // [1, 2]
    stack.push(3) // [1, 2, 3]
    stack.push(4) // [1, 2, 3, 4]
    stack.push(5) // [1, 2, 3, 4, 5]
    println(stack.peek()) // 5
    while(stack.stack.isNotEmpty()) {
        println(stack.top())
    }
    // 5
    // 4
    // 3
    // 2
    // 1

    // ====> Task 2
    val st1 = Stack()
    val st2 = Stack()

    st1.push(1); st1.push(2); st1.push(3)
    st2.push(1); st2.push(2); st2.push(3)

    println(st1 == st2) // true

    // ====> Task 3
    val stack5 = Stack()

    stack5.push(1) // [1]
    stack5.push(2) // [1, 2]
    stack5.push(3) // [1, 2, 3]
    stack5.push(4) // [1, 2, 3, 4]
    stack5.push(5) // [1, 2, 3, 4, 5]

    for(item in stack5)
        print("$item ")
    println() // 5 4 3 2 1
}