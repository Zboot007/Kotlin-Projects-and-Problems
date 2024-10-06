abstract class Animal {
    abstract fun makeNoise(): Unit
}
class Dog : Animal() {
    override fun makeNoise() {
        println("Гав")
    }
}
class Cat : Animal() {
    override fun makeNoise() {
        println("Мяу")
    }
}
class Cow : Animal() {
    override fun makeNoise() {
        println("Муу")
    }
}
abstract class Bird : Animal()
interface FlyBird {
    fun fly(): Unit
}
interface RunBird {
    fun run(): Unit
}
class Eagle : Bird(), FlyBird {
    override fun makeNoise() {
        println("Чик-чирик")
    }
    override fun fly() {
        println("Скорость полета 32км в час")
    }
}
class Sparrow : Bird(), FlyBird {
    override fun makeNoise() {
        println("Чик-чирик")
    }
    override fun fly() {
        println("Скорость полета 25км в час")
    }
}
class Ostrich : Bird(), RunBird {
    override fun makeNoise() {
        println("Гиф гиф ура")
    }
    override fun run() {
        println("Скорость бега до 45км в час")
    }
}
//interface A {
//    fun methodA(): Unit
//}
//interface B: A {
//    fun methodB(): Unit
//}
//interface G {
//    val property: Int
//}
//
//class C: A, G {
//    override val property: Int
//        get() = 5
//    override fun methodA(): Unit = println("method a")
//}

interface I {
    fun test(): Unit = println("interface I")
}
interface J {
    fun test(): Unit = println("interface J")
}

class D : I, J {
    override fun test() {
        super<I>.test()
        println("class D")
        super<J>.test()
    }
}

fun interface FunInterface {
    fun test(): Unit
    fun test2(): Unit = println("")
}

//class Person5(
//    val firstName: String,
//    val lastName: String,
//    val age: Int
//): Comparable<Person5> {
//    override fun toString()
//        = "Person(firstName: $firstName, lastName: $lastName, age: $age)"
//
//    override fun compareTo(other: Person5): Int {
//        val r = lastName.compareTo(other.lastName)
//        if(r == 0)
//            return firstName.compareTo(other.firstName)
//        return r
//    }
//}

class Person5(
    val firstName: String,
    val lastName: String,
    val age: Int
) {
    override fun toString()
            = "Person(firstName: $firstName, lastName: $lastName, age: $age)"

}
// 5 - 2 -> 3
// 2 - 5 -> -3
// 5 - 5 -> 0

// -1
// 0
// 1

// p1.compareTo(p2) < 0                           -> p1 < p2
// p1.compareTo(p2) > 0                           -> p1 > p2
// p1.compareTo(p2) == 0 || p1.compareTo(p2) < 0  -> p1 <= p2
// p1.compareTo(p2) == 0 || p1.compareTo(p2) > 0  -> p1 >= p2

//class StringSorted : Comparator<String> {
//    override fun compare(o1: String?, o2: String?): Int {
//        val r = o1!!.length.compareTo(o2!!.length)
//        if(r == 0)
//            return o1.compareTo(o2)
//        return r
//    }
//}

class Bag(private val items: MutableList<String> = mutableListOf())
    : Iterable<String> {
    fun putIn(str: String) {
        items += str
    }
    fun contains(str: String): Boolean = str in items
    override fun toString(): String = "$items"
    override fun iterator() = BagIterator(items)
}
class BagIterator(
    private val data: List<String>
) : Iterator<String> {
    private var index = -1

    override fun hasNext() = (index + 1) < data.size
    override fun next() = data[index + 1]

}
fun main() {

//    val list = listOf(1, 2, 3)
//    val set = setOf(1, 2, 3)
//    val map = mapOf(2 to "two", 3 to "three", 4 to "four")
//    val name = "Mike"
//    val bag = Bag()
//    bag.putIn("Book"); bag.putIn("Laptop"); bag.putIn("Pencil")
//
//    for(item in bag)
//        print("$item ")
//    println("\n" + "=".repeat(20))
//    for(num in list)
//        print("$num ")
//    println("\n" + "=".repeat(20))
//    for(num in set)
//        print("$num ")
//    println("\n" + "=".repeat(20))
//    for((key, value) in map)
//        print("($key, $value) ")
//    println("\n" + "=".repeat(20))
//    for(symbol in name)
//        print("$symbol ")
//    println("\n" + "=".repeat(20))

//    val names = listOf("Mike", "Tom", "Anna", "Sam", "Nicole")
//    val numbers = listOf(5, 3, 1, 4, 2)
//    val people = listOf(
//        Person5("Tom", "Smith", 22),
//        Person5("Naomi", "Scott", 25),
//        Person5("Jessica", "Scott", 19),
//        Person5("Teresa", "Scott", 21),
//        Person5("Mike", "Meyers", 24),
//    )
//    val compareString = StringSorted()
//    val namesSorted = names.sortedWith(compareString)
//    val namesSorted = names.sortedWith { o1, o2 -> o1!!.length.compareTo(o2!!.length) }
//    val namesSorted = names.sortedByDescending { it.length }
//    for(name in namesSorted)
//        println(name)
//    println("=".repeat(20))

//    val numbersSorted = numbers.sortedDescending()
//    for(number in numbersSorted)
//        println(number)
//    println("=".repeat(20))

//    val peopleSorted = people.sortedByDescending { it.age }
//    for(person in peopleSorted)
//        println(person)
//    println("=".repeat(20))




//    val t: FunInterface = FunInterface { println("" ) }


//    val d = D()
//    d.test()

//    val eagle = Eagle()
//    val sparrow = Sparrow()
//    val ostrich = Ostrich()
//
//    val flyBirds: List<FlyBird> = listOf(eagle, sparrow)
//    val runBirds: List<RunBird> = listOf(ostrich)
//
//    for(flies in flyBirds)
//        flies.fly()
//
//    for(runs in runBirds)
//        runs.run()

//    val dog = Dog()
//    val cat = Cat()
//    val cow = Cow()
//    val eagle = Eagle()
//
//    dog.makeNoise()
//    cat.makeNoise()
//    cow.makeNoise()
//    eagle.makeNoise()


    // ====> Task
    val idea = "Simple Text"
    val writer = Writer(name="Mike")
    val pen = Pen(color="Red")
    val paper = Paper()

    // ...

    println(paper)
    // Simple Text

    // ====> Bonus

    // ....
    println(paper)

    // Red:
    // Simple Text

    // ....
    println(paper)
    // Red:
    // Simple Text
    // Simple Text2

    // ....
    println(paper)
    // Red:
    // Simple Text
    // Simple Text2
    // Blue:
    // Kotlin is the most beautiful language
}
class Paper
class Pen
class Writer