fun main() {
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
class Bag(private val items: MutableList<String> = mutableListOf()) {
    fun putIn(str: String) {
        items += str
    }
    fun contains(str: String): Boolean = str in items
    fun takeOut(str: String): String? {
        if(str in items) {
            items -= str
            return str
        }
        else return null
    }
    fun takeOutAll(): String {
        var temp = items.toString()
        items.clear()
        return temp
    }
    override fun toString(): String = "$items"
}