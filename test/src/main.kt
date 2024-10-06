fun main() {
    // ====> Task 4
    val text = "Hello, World!!!H"
    val dict = recGetSymbolCount(text)

    for((key, value) in dict.entries) {
        println("$key -> $value")
    }
    // H -> 1
    // e -> 1
    // l -> 3
    // o -> 2
    // ....

}
fun recGetSymbolCount(str: String, index: Int = 0, index_S: Int = 0, counter: Int = 0, map: MutableMap<Char, Int> = mutableMapOf()): MutableMap<Char, Int> {
    if(str[index_S] == str[index] && index_S < str.length - 1 && index < str.length - 1) {
        return recGetSymbolCount(str, index + 1, index_S, counter + 1, map)
    } else if(index == str.length - 1 && index_S < str.length - 1 && index <= str.length - 1)
        return recGetSymbolCount(str, index, index_S, counter + 1, map)
    else if(str[index_S] != str[index] && index_S < str.length - 1 && index < str.length - 1)
        return recGetSymbolCount(str, index + 1, index_S, counter, map)
//    if(index == str.length - 1 && index_S != str.length - 1)
//        return recGetSymbolCount(str, index = 0, index_S + 1, counter = 0, map)
    map.put(str[index_S], counter)
    return map
}