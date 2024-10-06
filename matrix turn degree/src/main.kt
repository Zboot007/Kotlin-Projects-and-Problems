fun main() {
    testRotate()
}
fun rotate(matrix: List<List<Int>>, deg: Int): List<List<Int>> {
    var result = MutableList(matrix[0].size) { MutableList(matrix.size) { 0 } }
    if(deg % 360 == 90) {
        for(i in matrix.indices) {
            for(j in matrix[i].indices) {
                result[j][matrix.size - 1 - i] = matrix[i][j]
            }
        }
    } else if(deg % 360 == 180) {
        for(i in matrix.indices) {
            for(j in matrix[i].indices) {
                result[matrix.size - 1 - i][matrix.size - 1 - j] = matrix[i][j]
            }
        }
    } else if(deg % 360 == 270) {
        for(i in matrix.indices) {
            for(j in matrix[i].indices) {
                result[matrix.size - 1 - i][j] = matrix[i][j]
            }
        }
    } else {
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                result[i][j] = matrix[i][j]
            }
        }
    }
    return result
}
fun testRotate() {
    // [1, 2, 3]
    // [4, 5, 6]
    // [7, 8, 9]

    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(matrix)
    println(rotate(matrix, 90))
    // [7, 4, 1]
    // [8, 5, 2]
    // [9, 6, 3]

    println(rotate(matrix, 180))
    // [9, 8, 7]
    // [6, 5, 4]
    // [3, 2, 1]

    println(rotate(matrix, 270))
    // [3, 6, 9]
    // [2, 5, 8]
    // [1, 4, 7]

    println(rotate(matrix, 360))
    // [1, 2, 3]
    // [4, 5, 6]
    // [7, 8, 9]
}

