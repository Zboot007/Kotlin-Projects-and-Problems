fun twoSum(nums: IntArray, target: Int): IntArray {
    (0..<nums.lastIndex).forEach { outer ->
        ((outer + 1)..nums.lastIndex).forEach { inner ->
            if((nums[outer] + nums[inner]) == target)
                return intArrayOf(outer, inner)
        }
    }
    return intArrayOf()
}
fun removeDuplicates(nums: IntArray)
    = nums.size - nums.size
fun plusOne(digits: IntArray): IntArray {
    return (digits.joinToString("")
        .toBigInteger() + (1).toBigInteger())
        .toString()
        .map(Char::digitToInt)
        .toIntArray();
}

fun addLetters(arr: List<Char>): Char {
    if(arr.isEmpty())
        return 'z'

    val r = (arr.sumOf { it.code - 96 } % 26)
    return if(r == 0) 'z' else (r + 96).toChar()
}
fun babyCount(x: String): Int? {
    val r = Regex("[a][b][y]", RegexOption.IGNORE_CASE).findAll(x)
    return if(r.count() == 0) null else r.count() / 4
}
fun main() {

    println(babyCount("baby"))
    println(babyCount("abby"))
    println(babyCount("bbbbbbbb"))
    println(babyCount("Why the hell are there so many babies?!"))
    println(babyCount("Anyone remember life before babies?"))
    println(babyCount("Happy babies boom ba by?"))
    println(babyCount("b a b y"))
    println(babyCount(""))
    println(babyCount("none her"))

//    println(twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
//    println(twoSum(intArrayOf(0,0,1,1,1,2,2,3,3,4), 9).toList())
//    println(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)))
//    println(addLetters(listOf('a', 'b', 'c'))) // f
//    println(addLetters(listOf('y', 'c', 'b'))) // d
//    println(addLetters(listOf('z'))) // z
//    println((listOf('z').sumOf { it.code - 97 } % 25 + 1)) // z
//    println(addLetters(listOf())) // z
}