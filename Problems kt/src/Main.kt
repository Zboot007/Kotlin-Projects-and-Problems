fun main() {
    println("=== Sales ===")
    val sales = listOf(
        Sale("Laptop", 5),
        Sale("Phone", 10),
        Sale("Laptop", 7),
        Sale("Tablet", 3),
        Sale("Phone", 8)
    )
    val total = sales.groupBy { it.product }.mapValues { it.value.sumOf { it.quantity } }.maxBy { it.value }
    println(total)
    println("=== Books ===")
    val books = listOf(
        Book("Book A", "Fiction"),
        Book("Book B", "Non-Fiction"),
        Book("Book C", "Fiction"),
        Book("Book D", "Fiction"),
        Book("Book E", "Non-Fiction")
    )
    val mostPopular = books.groupBy { it.genre }.mapValues { it.value.count() }.maxBy { it.value }
    println(mostPopular)
    println("=== Sentences ===")
    val sentences = listOf(
        "apple banana orange",
        "banana apple apple",
        "orange banana apple"
    )
    val mostFruits = sentences.map { it.split(" ") }
    println(mostFruits.flatten().groupingBy { it }.eachCount().maxBy { it.value })

    println("=== Scores ===")

    val scores = listOf(
        PlayerScore("Alice", 50),
        PlayerScore("Bob", 60),
        PlayerScore("Alice", 70),
        PlayerScore("Bob", 30),
        PlayerScore("Charlie", 40)
    )
    val totalScore = scores.groupBy { it.player }.mapValues { entry ->
        entry.value.sumOf {
            it.score
        }
    }.maxBy { it.value }
    println(totalScore)

    println("=== Purchases ===")

    val purchases = listOf(
        Purchase("Customer1", 100.0),
        Purchase("Customer2", 200.0),
        Purchase("Customer1", 50.0),
        Purchase("Customer3", 300.0),
        Purchase("Customer2", 100.0)
    )
    val totalPurchase = purchases.groupBy { it.customer }.mapValues { it.value.sumOf { it.purchaseAmount } }.maxBy { it.value }
    println(totalPurchase)

    println("=== Students ===")
    val students = listOf(
        Student("Alice", 85),
        Student("Bob", 92),
        Student("Alice", 88),
        Student("Diana", 95)
    )
    val student = students.reduce { acc: Student, student: Student -> if(student.score > acc.score) student else acc }
    println(student)
    val words = listOf("Kotlin", "Functional", "Programming", "Reduce", "Fold")
    println(words.reduce { acc, s -> if(s.length > acc.length) s else acc })
    val numbers = listOf(3, 5, 2, 7, 1) // 210
    println(numbers.fold(1) { acc: Int, i: Int -> acc * i } )
    val sumOfEvenNumbers = listOf(10, 15, 20, 25, 30, 35)
    println(sumOfEvenNumbers.fold(0) { acc: Int, i: Int -> if(i % 2 == 0) acc + i else acc } )
}
data class Sale(val product: String, val quantity: Int)
data class Book(val title: String, val genre: String)
data class PlayerScore(val player: String, val score: Int)
data class Purchase(val customer: String, val purchaseAmount: Double)
data class Student(val name: String, val score: Int)
// Find the product with the highest total quantity sold.
//Medium
//flatMap: Создай функцию, которая принимает список строк и возвращает список, где каждая строка разбита на отдельные слова.
//groupBy: Реализуй функцию, которая группирует список строк по их первой букве.
//fold: Создай функцию, которая вычисляет факториал заданного числа, используя fold.
//runningReduce: Напиши функцию, которая возвращает список, содержащий кумулятивные произведения элементов из входного списка.
//zip: Реализуй функцию, которая объединяет два списка и возвращает список кортежей.
//unZip: Создай функцию, которая принимает список кортежей и возвращает два списка, содержащих соответствующие элементы.
//sumOf: Напиши функцию, которая возвращает сумму кубов чисел из списка.
//windowed: Реализуй функцию, которая возвращает список, содержащий все подсписки длины n, которые можно получить из исходного списка.