fun main() {
    // ====> Task
    var idea = "Simple Text"
    val writer = Writer(name="Mike")
    val pen = Pen(color="Red")
    val paper = Paper()

//    writer.write(idea, paper)
//    println(paper)
    // Simple Text

    // ====> Bonus
    writer.setPenColor("Red:")
    writer.write(idea, paper)
    println(paper)
    println()
    // Red:
    // Simple Text
    idea = "simple text 2"

    writer.write(idea, paper)
    idea = "simple text 3"
    writer.write(idea, paper)
    println(paper)
//    // Red:
//    // Simple Text
//    // Simple Text2
//
    println()
    writer.setPenColor("Blue:")
    idea = "Kotlin is the most beautiful language"
    writer.write(idea, paper)
    // Red:
    // Simple Text
    // Simple Text2
    // Blue:
    // Kotlin is the most beautiful language
    println()
    writer.setPenColor("Green:")
    idea = "Kotlin is the most beautiful language"
    writer.write(idea, paper)
    println()
    writer.setPenColor("Blue:")
    idea = "Kotlin is the most beautiful language"
    writer.write(idea, paper)
    println(paper)
}
class Paper {
    var paper = mutableListOf<String>()
    fun write(text: String) {
        paper += text
    }
    override fun toString(): String {
        return paper.joinToString("\n")
    }
}
open class Pen(var color: String = "") {
    fun setPenColor(color: String) { // Red
        this.color = color
    }
}
class Writer(val name: String = "Author") : Pen() {
    private var checker = ""
    fun write(text: String, paper: Paper) {
        if(color !in paper.paper) { // [Red, Blue, Green]
            paper.paper += color // Red: != Red
            checker = color
        // println("There is") ??????????
        } else if(checker != color) {
            paper.paper += color
            checker = color
        }
        println(paper.paper[paper.paper.lastIndex])
        paper.write(text)
    }
}