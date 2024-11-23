fun main() {}
fun isHappy(n: Int): Boolean {
    var slow = n
    var fast = getNext(n)
    while(fast != 1 && slow != fast) {
        slow = getNext(slow)
        fast = getNext(getNext(fast))
    }
    return fast == 1
}
fun getNext(n: Int): Int {
    var sum = 0
    var num = n
    while(num > 0) {
        val digit = num % 10
        sum += digit * digit
        num /= 10
    }
    return sum
}