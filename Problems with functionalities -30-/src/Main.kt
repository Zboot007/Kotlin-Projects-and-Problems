import kotlin.coroutines.suspendCoroutine

data class Book(var title: String = "", var author: String = "")
data class Person(var name: String = "", var age: Int = 0, var hasPhD: Boolean = false)
data class Settings(var theme: String = "", var notificationsEnabled: Boolean = false)
class DatabaseConnection {
    var url: String = ""
    var username: String = ""
    var password: String = ""

    fun connect() {
        println("Connecting to database at $url with user $username")
    }

    fun disconnect() {
        println("Disconnecting from database at $url")
    }
}

fun main() {
    val book = Book().apply {
        author = "Alice"
        title = "Morter"
    }
    //Book(title=Morter, author=Alice)
    println(book)

    val people = listOf(
        Person().apply {
            name = "John"
            age = 30
            hasPhD = false
        },
        Person().apply {
            name = "Emily"
            age = 28
            hasPhD = true
        },
        Person().apply {
            name = "Michael"
            age = 40
            hasPhD = true
        }
    )
    //Person(name=John, age=30, hasPhD=false)
    //Person(name=Emily, age=28, hasPhD=true)
    //Person(name=Michael, age=40, hasPhD=true)
    val updatedPeople = people
    updatedPeople.forEach { println(it) }

    val configMap = mapOf(
        "theme" to "Dark",
        "notificationsEnabled" to true
    )
    //Settings(theme=Dark, notificationsEnabled=true) 💎💎💎💎💎💎
    val settings = Settings().apply {
        theme = (configMap["theme"] ?: "theme").toString() ?: theme   // 💎💎
        notificationsEnabled = (configMap["notificationsEnabled"] ?: false) as Boolean ?: notificationsEnabled  // 💎💎
    }
    println(settings)

    //Hello, Kotlin!
    val nullableString: String? = "Hello, Kotlin!"
    nullableString?.let { println(it) }

    val nullableIntegers: List<Int?> = listOf(1, null, 2, 3, null, 4)
    val nonNullSum = nullableIntegers.mapNotNull { it?.let { value -> value + it} }
    //20
    println(nonNullSum.sum())

    //john@example.com
    val userMap = mapOf("username" to "john_doe", "email" to "john@example.com")
    userMap["email"]?.let { email -> println(email) }

    val max = listOf(1, 2, 3, 4).run { max() } // this.max()
    println(max) //4

    //15.707963267949464  (Area of the circle, assuming radius = 5)
    println("=== Rectangle ===")
    val rectangle = run {
        val width = 4.0
        val height = 5.0
        width * height
    }
    println(rectangle)
    println("=== Circle ===")
    val radius = 5.0
    val area = run {
        Math.PI * radius * radius // Area = π * r²
    }
    println(area)

    println("🤔🤔 ?")
    val resultAndTime = run {
        val startTime = System.currentTimeMillis() // Начинаем измерение времени 🤔

        // Выполняем вычисление
        val result = (1..1_000_000).sum() // Суммируем числа от 1 до 1 000 000

        val endTime = System.currentTimeMillis() // Заканчиваем измерение времени
        val timeTaken = endTime - startTime // Вычисляем затраченное время

        // Возвращаем пару (результат, затраченное время)
        Pair(result, timeTaken)
    }
    println("Результат: ${resultAndTime.first}, Затраченное время: ${resultAndTime.second} мс")

    println("=== With ===")

    val circleRadius = 5.0
    with(circleRadius) {
        val area = Math.PI * this * this // Area = π * r²
        val circumference = 2 * Math.PI * this // Circumference = 2 * π * r

        println("Circle Radius: $this")
        println("Area: $area")
        println("Circumference: $circumference")
    }

    //Person(name=Alice, age=30, hasPhD=false)
    val person = Person("Alice", 30)
    with(person) { println("$name $age") }

    // 💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎
    val databaseConnection = DatabaseConnection().apply {
        url = "jdbc:mysql://localhost:3306/mydb"
        username = "admin"
        password = "password"
    }.also { connection ->
        with(connection) {
            connect()
            disconnect()
        }
    }
    //💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎💎
    //Connection successful  (Assuming a successful database connection)

    //💎
    val number = -10
    val positiveNumber = with(number) {
        if (this > 0) this else "Not a positive number"
    }
    println(positiveNumber) //💎

    //user@example.com
    val email = "user@example.com"
    val validEmail = with(email) {
        if("@" !in this) "Not valid email address" else this
    }
    println(validEmail)

    //20
    val userAge = 20
    val eligibleToVote = with(userAge) {
        if(this > 120 || this < 0) "Wrong age" else this
    }
    println(eligibleToVote)

    //String is empty
    val nonEmptyString = "Kotlin"
    val message = with(nonEmptyString) {
        if(" " !in this) "String is empty" else this
    }
    println(message)

    //3 is odd
    val oddNumber = 3
    println(oddNumber?.let { if(it % 2 == 0) "$it is odd" else "$it is even" })

    //admin
    val username = "admin"
    username?.let { println(it) }
}