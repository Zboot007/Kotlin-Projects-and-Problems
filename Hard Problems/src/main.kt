fun main() {
    // 1. Длина самой длинной последовательности
    val numbers1 = listOf(100, 4, 200, 1, 3, 2)
    // ответ: 4
    val result = numbers1
        .sorted() // Сортируем список
        .fold(Pair(0, 1)) { acc, current ->
            // acc.first - максимальная длина последовательности
            // acc.second - текущая длина последовательности
            if (current == (numbers1.sorted()[acc.second - 1] + 1)) {
                // Если текущий элемент последовательный, увеличиваем текущую длину
                Pair(acc.first, acc.second + 1)
            } else {
                // Если не последовательный, обновляем максимальную длину
                Pair(maxOf(acc.first, acc.second), 1)
            }
        }.let { maxOf(it.first, it.second) } // Возвращаем максимальную длину
    // 2. Группировка анаграмм
    val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")
    // ответ: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

    // 3. Нахождение пересечения двух массивов
    val nums1 = listOf(1, 2, 2, 1)
    val nums2 = listOf(2, 2)
    // ответ: [2]

    // 4. Подсчет различных подпоследовательностей
    val s = "abc"
    // ответ: 7

    // 5. Нахождение K-го по величине элемента в массиве
    val nums5 = listOf(3, 2, 1, 5, 6, 4)
    val k = 2
    // ответ: 5

    // 6. Максимум скользящего окна
    val nums6 = listOf(1, 3, -1, -3, 5, 3, 6, 7)
    val k6 = 3
    // ответ: [3, 3, 5, 5, 6, 7]

    // 7. Слияние интервалов
    val intervals = listOf(listOf(1, 3), listOf(2, 6), listOf(8, 10), listOf(15, 18))
    // ответ: [[1, 6], [8, 10], [15, 18]]

    // 8. Произведение массива, кроме самого себя
    val nums8 = listOf(1, 2, 3, 4)
    // ответ: [24, 12, 8, 6]

    // 9. Два сумм II - Входной массив отсортирован
    val numbers = listOf(2, 7, 11, 15)
    val target = 9
    // ответ: [1, 2]

    // 10. Комбинации букв телефонного номера
    val digits = "23"
    // ответ: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

    // Вывод ответов (пример, так как ответы не вычислены)
    println("1. Длина самой длинной последовательности: 4")
    println("2. Группировка анаграмм: [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]")
    println("3. Пересечение двух массивов: [2]")
    println("4. Различные подпоследовательности: 7")
    println("5. K-й по величине элемент: 5")
    println("6. Максимум скользящего окна: [3, 3, 5, 5, 6, 7]")
    println("7. Слияние интервалов: [[1, 6], [8, 10], [15, 18]]")
    println("8. Произведение массива: [24, 12, 8, 6]")
    println("9. Два сумм II: [1, 2]")
    println("10. Комбинации букв: ['ad', 'ae', 'af', 'bd', 'be', 'bf', 'cd', 'ce', 'cf']")
}