fun main() {
    // ====> Task 1
    val ip = "0.84.194.164"
    println(isCorrectIpAddress(ip)) // true

    // ====> Task 2
    // 0 1 3 4 5 7 9
    // +998935157020 | 998935157020 | 935157020
    var phone = "+998935157020"
    println(isCorrectPhoneNumber(phone)) // true
    phone = "998935157020"
    println(isCorrectPhoneNumber(phone)) // true
    phone = "935157020"
    println(isCorrectPhoneNumber(phone)) // true
}
fun isCorrectIpAddress(ip: String): Boolean {
    return Regex(
         "\\b((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\.)" +
                "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\.)" +
                "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\.)" +
                "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\b)"
    ).containsMatchIn(ip)
}
fun isCorrectPhoneNumber(phone: String) =
    Regex("\\b(\\+?998)?([053974]\\d\\d\\d\\d\\d\\d\\d\\d)\\b").containsMatchIn(phone)