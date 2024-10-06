fun main() {
    // ====> Task 1
    val one = listOf(1, 3, 7)
    val two = listOf(2, 4, 5, 6, 8, 9, 10)
    val three = merge(one, two)
    println(three)
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    // ====> Task 8
    val numbers = mutableListOf(1, 2, -3, 5, -7, -9, 6, 2, 8, -4, -1, 0)
    shiftNegative(numbers)
    println(numbers)
    // [1, 2, 5, 6, 2, 8, 0, -3, -7, -9, -4, -1]
}

fun merge(arr1: List<Int>, arr2: List<Int>): MutableList<Int> {
    var result = mutableListOf<Int>(); var arr1_index = 0; var arr2_index = 0
    while(result.size < arr1.size + arr2.size) {
        if(arr1[arr1_index] < arr2[arr2_index]) {
            result += arr1[arr1_index]
            arr1_index += 1
        } else {
            result += arr2[arr2_index]
            arr2_index += 1
        }
        if(arr1_index == arr1.size || arr2_index == arr2.size) {
            while(arr1[arr1_index] < arr1.size || arr2[arr2_index] < arr2.size) {
                result += arr1[arr1_index] // O(n)
                arr1_index += 1
                result += arr2[arr2_index]
                arr2_index += 1
            }
        }
    }
    return result
}











/*fun merge(arr1: List<Int>, arr2: List<Int>): MutableList<Int> {
    var result = mutableListOf<Int>()
    var index_arr1 = 0; var bool = true; var index_arr2 = 0
    while(bool) {
        if(arr1[index_arr1] < arr2[index_arr2]) {
            result += arr1[index_arr1]
            index_arr1 += 1
        } else {
            result += arr2[index_arr2]
            index_arr2 += 1
        }
        if(index_arr1 == arr1.size || index_arr2 == arr2.size) {
            while (index_arr1 < arr1.size) {
                result += arr1[index_arr1] // O(n)
                index_arr1 += 1
            }
            while (index_arr2 < arr2.size) {
                result += arr2[index_arr2]
                index_arr2 += 1
            }
            bool = false
        }
    }
    return result
}*/
fun shiftNegative(numbers: MutableList<Int>) {
    var index = 0; var counter = 0
    while (index < numbers.size) {
        counter += 1
        if(numbers[index] < 0) {
            numbers += numbers[index]
            numbers -= numbers[index]
            index -= 1
        }
        index += 1
        if(counter == numbers.size) break
    }
}