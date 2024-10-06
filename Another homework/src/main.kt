fun main() {
    val ruEnDictionary = mapOf(
        "бежать" to mutableListOf("run", "escape"),
        "побег" to mutableListOf("escape", "runaway", "shoot"),
        "плавать" to mutableListOf("swim", "sail", "float"),
        "всплывать" to mutableListOf("emerge", "surface", "float"))
    val enRuDictionary = getEnRuDictionary(ruEnDictionary)
    println(enRuDictionary)
}
fun getEnRuDictionary(ruEn: Map<String, MutableList<String>>): Map<String, MutableList<String>> {
    var result = mutableMapOf<String, MutableList<String>>()

    for(entry in ruEn.entries) {
        for(value in entry.value) {
            result.put(value, mutableListOf())//O(n^2)
        }
        for(value in entry.value) {
            for(key in result.keys) { //O(n^3)
                if (key in value) {
                    result.get(key)?.add(entry.key)
                }
            }
        }
    }
    return result
}