
// val id -> get() = field | get() { return field }
// var id -> get() = field | get() { return field }
//           set(value) = field = value | set(value) { field = value }

class Point(x: Int, y: Int) {
    var x = x
        get() = field
        private set(value) {
            if(value in 0..1920)
                field = value
        }
    var y = y
//        private set
        set(value) {
            if(value in 0..1080)
                field = value
        }
//    private var x = x
//    private var y = y

    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }


//    fun setX(value: Int) {
//        if(value in 0..1920)
//            x = value
//    }
//    fun setY(value: Int) {
//        if(value in 0..1080)
//            y = value
//    }
//    fun getX() = x
//    fun getY() = y
}

fun main() {
//    val l = listOf(5, 1)
//    l.size = 5
//    println(l.size)

//    val point = Point(5, 10)

//    point.setX(2000)
//    point.setY(-7)
//    point.x = 20
//    point.y = 7
//
//    println(point.x)
//    println(point.y)

//    println(point.getX())
//    println(point.getY())

//    val name: String = "Mike"
//    val surname: String = "Meyers"
//    val age: Int = 25
//    val p: Person = Person("Naomi", "Scott", 22)

//    p.name = "Naomi"
//    p.surname = "Scott"
//    p.age = 22

//    println(p.name)
//    println(p.surname)
//    println(p.age)

//    val p2: Person = Person("John", "Smith", 25)

//    p2.name = "John"
//    p2.surname = "Smith"
//    p2.age = 25

//    println(p2.name)
//    println(p2.surname)
//    println(p2.age)

//    val person = Person("", "MikeMikeMikeMikeMikeMikeMikeMikeMikeMike", 205)
//    println(person.fullName)
//    person.name = "Tom"
//    println(person.fullName)

//    val p1 = Person("Mike", "Meyers", 22, "777")
//    val p2 = Person("Mike", "Meyers", 22)
//    val p3 = Person()



    // (name: Tom, surname: Smith, age: 25, job: Barista, salary: 75000)
    // (name: Tom, surname: Smith, age: 25, job: Barista, salary: 75000)
    // (name: Tom, surname: Smith, age: 25, job: Barista, salary: 75000)
}
//class Person(
//    name: String,
//    surname: String,
//    age: Int,
//    phone: String?
//) {
//    val name: String = name
//    val surname: String = surname
//    val age: Int = age
//    val phone: String? = phone
//
//    var fullName: String = ""
//
//    constructor(name: String, surname: String, age: Int)
//            : this(name, surname, age, null) {
//                fullName = "..."
//            }
//    constructor() : this("", "", 0)
//}

//class Person(
//    name: String,
//    surname: String,
//    age: Int
//) {
//    var name: String
//    var surname: String
//    var age: Int
//    val fullName: String
//        get() = "$name $surname"
//
//    init {
//        if(name.length in 2..20)
//            this.name = name
//        else
//            this.name = "Guest"
//        this.surname = if(surname.length in 2..20) name else "???"
//        this.age = if(age in 1..110) age else 0
//    }
//}

//class Person(
//    var name: String,
//    var surname: String,
//    var age: Int
//) {
//    val fullName: String
//        get() = "$name $surname"
//}
//{
////    val name: String = name
////    val surname: String = surname
////    val age: Int = age
//}