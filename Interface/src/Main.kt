abstract class Animal {
    abstract fun makeSound()
}
interface Swimmable {
    fun swim()
}
interface Runnable {
    fun run()
}
class Fish : Animal(), Swimmable {
    override fun swim() {
        println("Плавает")
    }
    override fun makeSound() {
        println("Буль-буль")
    }
}
class Dog : Animal(), Runnable, Swimmable {
    override fun makeSound() {
        println("Гав-гав")
    }

    override fun swim() {
        println("Собака плывет")
    }
    override fun run() {
        println("Бегает")
    }

}
class Human : Runnable, Swimmable {
    override fun run() {
        println("Человек бегает")
    }
    fun makeSound() {
        println("Привет")
    }
    override fun swim() {
        println("Человек плавает")
    }

}
fun main() {
    val human = Human()
    val dog = Dog()
    val fish = Fish()

    val animals = listOf(human, dog, fish)
    for(animal in animals) {
        println(animal)
    }
}