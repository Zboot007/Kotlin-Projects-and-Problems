fun divide(val1: Int, val2: Int) = val1 / val2
fun validateAge(age: Int) = if(age < 18) error("Exception: Age must be 18 or older") else "Age is valid"
fun main() {
    try {
        divide(10, 2) // 5
        divide(10, 0) // throws Exception: "Division by zero is not allowed"
    } catch(e: Exception) {
        println(e.message)
    }
    try {
        validateAge(20) // "Age is valid"
        validateAge(15) // throws Exception: "Age must be 18 or older"
    } catch(e: Exception) {

    }
}