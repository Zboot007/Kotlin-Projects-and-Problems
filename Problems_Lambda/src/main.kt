fun main() {
    // Task 1
    val square = fun_()// Ваше лямбда-выражение здесь
    println(square(4)) // Ожидаемый результат: 16
    // Task 2
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.filter { it % 2 == 0 }// Используйте filter и лямбда-выражение
    println(evenNumbers) // Ожидаемый результат: [2, 4, 6]
    // Task 3
    val words = listOf("apple", "banana", "kiwi")
    val lengths = words.map { it.length }// Используйте map и лямбда-выражение
    println(lengths) // Ожидаемый результат: [5, 6, 4]
    // Task 4
    val result = performOperation(5, 3) { x, y -> x + y }
    println(result) // Ожидаемый результат: 8
    // Task 5
    val multiplyWithFive = createMultiplier(5)
    println(multiplyWithFive(2, 3)) // Ожидаемый результат: 11
    // Task 6
    val myCounter = counter()
    println(myCounter()) // Ожидаемый результат: 1
    println(myCounter()) // Ожидаемый результат: 2
    println(myCounter()) // Ожидаемый результат: 3
    // Task 7
    val addFiveAndTen = curriedAddition(5, 10)
    println(addFiveAndTen(2)) // Ожидаемый результат: 17
    // apply, with
    data class Configuration(var brightness: Int, var volume: Int)
    val config = Configuration(50, 70).apply {
        brightness = 60
        volume = 80
    }

    with(config) {
        brightness += 10
        volume -= 10
    }

    println(config) // Ожидаемый результат: Configuration(brightness=70, volume=70)
}
fun fun_(): (Int) -> Int {
    return {
        input: Int -> input * input
    }
}
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
fun createMultiplier(multiplier: Int): (Int, Int) -> Int {
    return {
        x: Int, y: Int -> (x * y) + multiplier
    }
}
fun counter(): () -> Int {
    var count = 0
    return {
        count += 1
        count
    }
}
fun curriedAddition(x: Int, y: Int): (Int) -> Int {
    return {
        z: Int -> z + x + y
    }
}