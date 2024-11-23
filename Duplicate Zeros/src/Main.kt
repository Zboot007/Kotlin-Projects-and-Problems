fun main() {
    val list = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
    println(list.toList())        // [1,0,2,3,0,4,5,0]
    duplicateZeros(list) // [1,0,0,2,3,0,0,4]
    println(list.toList())        // [1,0,0,2,3,0,0,4]
}

// 1, 0
// capacitor = 2
// 1, 0, 0
// changer = 3
// 1, 0, 0, 3

fun duplicateZeros(arr: IntArray): Unit {
    var changer = 0
    var capacitor = 0
    var index = 0
    while(index < arr.lastIndex) {
        if(arr[index] == 0) {
            capacitor = arr[index + 1]
            arr[index + 1] = 0

            for(innerIndex in index + 2..<arr.size) {
                val temp = arr[innerIndex]
                arr[innerIndex] = capacitor
                capacitor = temp
            }

            index += 1
        }
        index += 1
    }
}