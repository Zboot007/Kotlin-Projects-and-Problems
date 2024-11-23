import java.util.*


//class Person(
//    val firstName: String,
//    val lastName: String,
//    val age: Int
//) {
//    val fullName: String
//        get() = "$firstName $lastName"
//    operator fun component1() = firstName
//    operator fun component2() = lastName
//    operator fun component3() = age
//    operator fun component4() = fullName
//
//    fun copy(
//        firstName: String = this.firstName,
//        lastName: String = this.lastName,
//        age: Int = this.age
//    ) = Person(firstName = firstName, lastName = lastName, age = age)
//
//    override fun equals(other: Any?): Boolean {
//        if(other == null || other !is Person)
//            return false
//
//        if(this === other)
//            return true
//
//        return firstName == other.firstName && lastName == other.lastName && age == other.age
//    }
//    override fun hashCode()
//        = Objects.hash(firstName, lastName, age)
//    override fun toString()
//        = "${this.javaClass.name}(firstName: $firstName, lastName: $lastName, age: $age)"
//}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
) : Any(), Comparable<Person> {
    val fullName: String
        get() = "$firstName $lastName"
    override fun compareTo(other: Person) = firstName.compareTo(other.firstName)

}


data class MyPair<TFirst, TSecond>(
    val first: TFirst,
    val second: TSecond
) {
    override fun toString() = "($first, $second)"
}

fun main() {
//    val pair1 = MyPair<Int, String>(1, "Mike")
//    val pair2 = MyPair<Int, String>(1, "Mike")
//
//
//    println(pair1)
//    println(pair1 == pair2)
//    val (first, second) = pair1
//
//    println(first)
//    println(second)

//    val p1 = Person("Naomi", "Scott", 22)
//    val p2 = Person("Naomi", "Scott", 22)
//    val p3 = p1
//
//
//
//    println("===== toString =====")
//    println(p1)
//
//    println("===== equals =====")
//    println(p1 == p2) // true   // println(p1.equals(p2))
//    println(p1 == p3) // true
//    println(p1 === p2) // false
//    println(p1 === p3) // true
//
//    println("===== hashCode =====")
//    println(p1.hashCode()) // 1
//    println(p2.hashCode()) // 1
//    println(p3.hashCode()) // 1
//
//    println("===== component =====")
////    val firstName = p1.component1()
////    val lastName = p1.component2()
////    val age = p1.component3()
//
//    val (firstName, lastName, age) = p1
//
//    println(firstName)
//    println(lastName)
//    println(age)
//
//    println("===== copy =====")
//    val p4 = p1.copy()
//    val p5 = p1.copy(lastName = "Smith")
//    val p6 = p1.copy(age = 25)
//
//    println(p4)
//    println(p5)
//    println(p6)


//    val l = listOf(1, 2, null)

//    println(l)

//    val iter = l.iterator()

//    if(iter.hasNext())
//        println(iter.next())
//
//    if(iter.hasNext())
//        println(iter.next())

//    if(iter.hasNext())
//    println(iter.next())
}