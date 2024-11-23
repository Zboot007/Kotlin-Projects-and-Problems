fun main() {
    fun distributeCandies(candyType: IntArray): Int {
        return candyType.size / candyType.distinct().size
    }
}