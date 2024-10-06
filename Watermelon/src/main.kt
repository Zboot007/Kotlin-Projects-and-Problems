fun main() { val input = readln(); println(watermelon(input)) }
fun watermelon(input: String) = if(input.toInt() % 2 == 0 && input.toInt() > 2) "YES" else "NO"