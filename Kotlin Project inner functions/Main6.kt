import kotlin.math.pow

fun add2(a: Int, b: Int) = a + b
fun sub2(a: Int, b: Int) = a - b
fun mul2(a: Int, b: Int) = a * b
fun div2(a: Int, b: Int) = a / b
fun mod2(a: Int, b: Int) = a % b
fun pow2(a: Int, b: Int) = a.toDouble().pow(b.toDouble()).toInt()
fun tt2(a: Int, b: Int) = a % b + 3
fun calc(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)

fun getCounter(): () -> Unit {
    var count = 1

    fun up() { println(count++) }
    return ::up
}

fun outer(): List<() -> Int> {
    val arr = mutableListOf<() -> Int>()
    fun t(num: Int): () -> Int = { num }
    var index = 0
    while(index < 5) {
        arr += t(index)
        index += 1
    }

    return arr
}



fun main() {


    //    val list: List<() -> Int> = outer()
//
//    println(list[0]()) // 5
//    println(list[1]()) // 5
//    println(list[2]()) // 5
//    println(list[3]()) // 5
//    println(list[4]()) // 5

//    val counter = getCounter()
//    counter()
//    counter()
//    counter()
//    counter()
//    counter()

//    println(calc(5, 10) { a: Int, b: Int -> a + b })  // 15
//    println(calc(50, 10, func={ a, b -> a * b })) // 5
//    println(calc(50, 10, ::sub2)) // 40
//    println(calc(5, 10, ::mul2))  // 50
//    println(calc(5, 10, ::mod2))  // 5
//    println(calc(2, 5, ::pow2))   // 32
//    println(calc(5, 2, ::tt2))    // 4

//    val abs2: (Int) -> Int = { num ->
//        if(num < 0) -num
//        else num
//    }
    // 5 % 2 + 3

    // () -> Unit
    // { println("...") }
    // (Int) -> Int
    // { num: Int -> if(num < 0) -num else num } | { if(it) -it else it }
    // (Int, Int) -> Int
    // { a, b -> a + b }
    // (List<String>) -> Map<String, Map<String, List<String>>>
    // { names ->
    //  ...
    //  ...
    // }
    // (Int) -> (Int) -> Int
    // { num1 -> { num2 -> num1 + num2 } }

    //    var f: (Int, Int) -> Int
    //    f = ::add2
    //    println(f(5, 10))
    //    f = ::sub2
    //    println(f(5, 10))






    val pult = createPult()

    pult["display"]()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 0
    // Volume => 1

    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["up"]()
    pult["down"]()
    pult["down"]()

    pult["display"]()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 2
    // Volume => 1

    pult["volumeUp"]()
    pult["volumeUp"]()
    pult["volumeUp"]()
    pult["volumeUp"]()
    pult["volumeUp"]()
    pult["volumeUp"]()

    pult["display"]()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 2
    // Volume => 5

    pult["volumeDown"]()

    pult["display"]()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 2
    // Volume => 4

    pult["mute"]()
//    pult["mute"]()

    pult["display"]()
    // Tv => Выкл
    // Mute => Выкл
    // Channel => 2
    // Volume => 5

    pult["onOff"]()
//    pult["onOff"]()

    pult["display"]()
    // Tv => Вкл
    // Mute => Выкл
    // Channel => 2
    // Volume => 5






}