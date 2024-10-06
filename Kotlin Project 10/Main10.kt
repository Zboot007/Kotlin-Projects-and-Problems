fun main() {
    val tom = Programmer("Tom", "Smith", 22)
    val mike = Waiter("Mike", "Meyers", 20)
    val naomi = Cook("Naomi", "Scott", 28)

    val cafe: List<Employee> = listOf(tom, mike, naomi)

    for(emp in cafe)
        println(emp.job)

//    var employee: Any = mike
    employee = tom //^^^^^
    println(tom)
    println(mike)
    println(naomi)
//    if(employee is Waiter)
//        println(employee)

//    println((employee as? Waiter)?.job)

    // ====> Task
    val bag = Bag()

    bag.putIn("Тетрадь")
    bag.putIn("Книгу")
    bag.putIn("Ручку")
    bag.putIn("Линейку")

    println(bag) // [Тетрадь, Книгу, Ручку, Линейку]

    println(bag.contains("Книгу")) // true
    println(bag.contains("Ластик")) // false

    println(bag.takeOut("Тетрадь")) // Тетрадь
    println(bag.takeOut("Линейку")) // Линейку
    println(bag.takeOut("Ластик"))  // null

    println(bag) // [Книгу, Ручку]

    println(bag.takeOutAll()) // [Книгу, Ручку]

    println(bag) // []
}

open class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
) : Any() {
    val fullName
        get() = "$firstName $lastName"

    constructor() : this("", "", 0)

    override fun toString()
        = "${this::class.simpleName}(firstName: $firstName, lastName: $lastName, age: $age)"

    open fun speak() {
        println("На русском")
    }
}
open class Employee(
    firstName: String,
    lastName: String,
    age: Int,
    val job: String,
    val salary: Int
) : Person(firstName, lastName, age) {
    override fun toString()
            = "${super.toString().substringBeforeLast(')')}, job: $job, salary: $salary)"

    override fun speak() {
        println("На английском")
    }
}
class Programmer(
    firstName: String,
    lastName: String,
    age: Int
) : Employee(firstName, lastName, age, "Программист", 55_000) {
    override fun speak() {
        println("На языке C++")
    }
}
class Waiter(
    firstName: String,
    lastName: String,
    age: Int
) : Employee(firstName, lastName, age, "Официант", 35_000)

class Cook(
    firstName: String,
    lastName: String,
    age: Int
) : Employee(firstName, lastName, age, "Повар", 75_000)