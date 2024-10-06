class Queue() {
    private var stack = mutableListOf<Int>()
    fun enqueue(value: Int) {
        stack.addFirst(value)
    }
    fun peek() : Int? {
        return if(stack.isNotEmpty()) stack[stack.size - 1] else null
    }
    fun dequeue() : Int? {
        return if(stack.isEmpty()) null else stack.removeFirst()
    }
    operator fun iterator() : Iterator<Int> = object : Iterator<Int> {
        private var index = stack.size - 1
        override fun hasNext(): Boolean {
            return index >= 0
        }

        override fun next(): Int {
            return stack[index--]
        }

    }
}
class Deque() {
    private var stack = mutableListOf<Int>()
    fun addFirst(value: Int) {
        stack.addFirst(value)
    }
    fun addLast(value: Int) {
        stack.addLast(value)
    }
    fun removeFirst() : Int = stack.removeFirst()
    fun removeLast() : Int = stack.removeLast()

    operator fun iterator() : Iterator<Int> = object : Iterator<Int> {
        private var index = 0

        override fun hasNext(): Boolean = stack.size - 1 >= index
        override fun next(): Int = stack[index++]
    }
}
class MinStack {
    private var stack = mutableListOf<Int>()
    fun push(value: Int) {
        stack += value
    }

    fun pop() : Int? = if(stack.isEmpty()) null else stack.removeLast()

    fun top() : Int? = if(stack.isEmpty()) null else stack[stack.size - 1]
    fun getMin() : Int? {
        if(stack.isEmpty())
            return null
        var checker = stack[0]
        for(item in stack)
            if(checker > item)
                checker = item
        return checker
    }
}
class CustomList {
    private var stack = mutableListOf<Int>()
    fun add(value: Int) {
        stack += value
    }
    fun get(value: Int) : Int = stack[value]
    fun remove(value: Int) : Int = stack.removeAt(1)
    fun size() : Int = stack.size
}
fun main() {
    // Queue
    val queue = Queue()

    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)

    println(queue.peek()) // 1

    while (queue.peek() != null) {
        println(queue.dequeue())
    }
    // 1
    // 2
    // 3
    // 4

    for (item in queue) {
        print("$item ")
    }
    println("\n")

    println("=".repeat(10))

    // Deque

    val deque = Deque()

    // Добавляем элементы в начало и конец очереди
    deque.addFirst(1)  // [1]
    deque.addLast(2)   // [1, 2]
    deque.addFirst(3)  // [3, 1, 2]
    deque.addLast(4)   // [3, 1, 2, 4]

    // Удаляем элементы с начала и конца очереди
    println(deque.removeFirst()) // 3
    println(deque.removeLast())  // 4

    // Остаток элементов в очереди
    for (item in deque) {
        print("$item ")
    }
    println() // 1 2

    println("=".repeat(10))
    // MinStack

    val minStack = MinStack()

    // Добавляем элементы в стек
    minStack.push(5)
    minStack.push(3)
    minStack.push(7)
    minStack.push(2)

    // Выводим минимальный элемент в стеке
    println(minStack.getMin()) // 2

    // Удаляем элементы и проверяем минимальный элемент
    println(minStack.pop()) // 2
    println(minStack.getMin()) // 3

    println(minStack.pop()) // 7
    println(minStack.getMin()) // 3

    println(minStack.pop()) // 3
    println(minStack.getMin()) // 5

    println(minStack.pop()) // 5
    println(minStack.getMin()) // null (пустой стек)

    // Добавляем еще элементы
    minStack.push(10)
    minStack.push(1)
    minStack.push(8)

    // Проверяем минимальный элемент
    println(minStack.getMin()) // 1

    // Custom List
    println("=".repeat(10))
    val customList = CustomList()

    // Добавляем элементы в список
    customList.add(10)  // [10]
    customList.add(20)  // [10, 20]
    customList.add(30)  // [10, 20, 30]
    customList.add(40)  // [10, 20, 30, 40]

    // Доступ по индексу
    println(customList.get(0))  // 10
    println(customList.get(2))  // 30

    // Удаление элемента по индексу
    println(customList.remove(1))  // 20, список становится [10, 30, 40]

    // Проверяем оставшиеся элементы
    for (i in 0..<customList.size()) {
        print("${customList.get(i)} ")
    }
    println() // 10 30 40
}