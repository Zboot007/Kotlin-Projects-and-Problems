import java.util.Dictionary
import java.util.Hashtable

fun main() {
    homeWork_1()
    homeWork_2()
    homeWork_3()
    val arr1 = arrayOf<Int>(5, 7, 3)
    val arr2 = arrayOf<Int>(1, 3, 8, 12, 15)
    val arr3 = arrayOf<Int>(3, 1, 5, 8, 10)
    println(homeWork_4(arr1))
    println(homeWork_4(arr2))
    println(homeWork_4(arr3))
    val nums1 = arrayOf(5, 1, 7, 3) // ""
    val nums2 = arrayOf(1, 8, 2, 10, 13) // "(2,8)"
    val nums3 = arrayOf(4, 5, 1, 7, 2)  // "(4,5), (7, 2)"
    homeWork_4T2(nums1, 9)
    homeWork_4T2(nums2, 10)
    homeWork_4T2(nums3, 9)
    val numbers = arrayOf(5, 2, 1, 8, 3, 7, 10, 12, 11, 4)
    homeWork_4T3(numbers)
    val array1 = arrayListOf(33, 52, 11, 80)
    val array2 = arrayListOf(18, 42, 14, 51, 73)
    homeWork_4T4(array1)
    homeWork_4T4(array2)
    val strArr1 = arrayOf("X++", "X--", "--X", "X++", "++X", "++X")
    val strArr2 = arrayOf("--X", "X--", "X++", "--X", "++X", "X--", "--X")
    homeWork_4T5(strArr1)
    homeWork_4T5(strArr2)
    val s1 = "this is a simple text"
    val s2 = "JAvA is thE most PoPuLar LanguaGe in thE wOrld!"
    homeWork_5T1(s1)
    homeWork_5T1(s2)
    homeWork_5T2(s1)
    homeWork_5T2(s2)
    val num1 = "12345"
    val num2 = "745"
    val num3 = "7"
    homeWork_5T3(num1)
    homeWork_5T3(num2)
    homeWork_5T3(num3)
    val text1 = "A man, a plan, a canal, Panama!"
    val text2 = "Never a foot too far, even."
    val text3 = "Red roses run no risk sir, on Nurse’s order."
    homeWork_5T4(text1)
    homeWork_5T4(text2)
    homeWork_5T4(text3)
    homeWork_5T5(text1)
    homeWork_5T5(text2)
    homeWork_5T5(text3)
    val str1 = "si4mple tex5t a3 thi1s i2s"
    val str2 = "i7n Kotl1in th8e i2s th3e worl9d! pop5ular lan6guage mos4t"
    homeWork_5Bonus(str1)
    homeWork_5Bonus(str2)
    val names = arrayOf<String>(
        " anna sofia-rob ", "- teresa palmer", "Jessica Simpson",
        " -mike meyers ", " tom "
    )
    homeWork_6T1(names)
    val text = "this is a simple text"
    homeWork_6T2(text, 'i')
    homeWork_6T2(text, 'e')
    homeWork_6T2(text, 'z')
    homeWork_6T2(text, 'a')
    val txt1 = "Mike is playing golf"
    val txt2 = "Naomi is swimming"
    val txt3 = "Tom doesn't like Nicole"
    homeWork_6T3(txt1)
    homeWork_6T3(txt2)
    homeWork_6T3(txt3)
    val words = arrayOf<String>("nru", "wkor", "palpe", "mingswi")
    val positions = arrayOf<String>("120", "0231", "10324", "4560123")
    homeWork_6T4(words, positions)
    val texts = mutableListOf<String>(
        "Tom", "Teresa", "Mike", "Naomi", "Sarah",
        "Nicole", "Jessica", "Monika", "John", "Samanta"
    )
    homeWork_7T1(texts)
    val nums = ArrayList<Int>(listOf(5, 1, 7, 4, 5, 5, 8, 2, 1, 3, 5, 1, 2, 8))
    homeWork_7T2(nums, 5)
    homeWork_7T2(nums, 1)
    homeWork_7T2(nums, 3)
    homeWork_7T2(nums, 9)
    val strArray = ArrayList<String>(
        listOf(
            "5314232", "285", "372", "824", "928",
            "432321", "5555", "913"
        )
    )
    homeWork_7T3(strArray)
    val ar1 = ArrayList<Int>(listOf(1, 1, 2, 3, 5))
    val ar2 = ArrayList<Int>(listOf(5, 7, 7, 7, 8, 8, 9, 9, 10))
    val ar3 = ArrayList<Int>(listOf(2, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10, 12, 12, 12, 12))
    homeWork_7T4(ar1)
    homeWork_7T4(ar2)
    homeWork_7T4(ar3)
    val list1 = ArrayList<Int>(listOf(2, 2, 1, 1, 1, 1, 1, 3, 2))
    val list2 = ArrayList<Int>(listOf(1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 2, 1, 1, 3))
    val list3 = ArrayList<Int>(listOf(3, 3, 2, 2, 1, 1, 2, 2, 3, 3, 3, 2, 2, 1, 2, 2, 2, 3))
    homeWork_7T5(list1)
    homeWork_7T5(list2)
    homeWork_7T5(list3)
    val green = ArrayList<Int>(listOf(1, 3, 2))
    val red = ArrayList<Int>(listOf(5, 2, 3, 8, 4))
    homeWork_8T1(green, red)
    homeWork_8T2(green, red)
    homeWork_8T2(red, green)
    homeWork_8T3(green, red)
    homeWork_8T4(green, red)
    // ====> Task 5
    val yellow = ArrayList(listOf(1, 3))
    val blue = ArrayList(listOf(5, 3, 7, 1, 2))
    val purple = ArrayList(listOf(7, 3, 2, 5))
    println(homeWork_8T5(yellow, blue))
    println(homeWork_8T5(yellow, purple))
    println(homeWork_8T6(blue, yellow))
    println(homeWork_8T6(purple, yellow))
    val phoneList = mapOf(
        "Tom" to "903357021",
        "Sam" to "946652112",
        "Jessica" to "933814015"
    )
    homeWork_9T1(phoneList)
    val ruEnDictionary = mapOf(
        "бежать" to mutableListOf("run", "escape"),
        "побег" to mutableListOf("escape", "runaway", "shoot"),
        "плавать" to mutableListOf("swim", "sail", "float"),
        "всплывать" to mutableListOf("emerge", "surface", "float"))
    var enRuDictionary = homeWork_9T2(ruEnDictionary)
    println(enRuDictionary)
}
fun homeWork_1() {
    print("Введите количество друзей:")
    val friends = Integer.parseInt(readln())
    println("Количество друзуй $friends")
    val result = when(friends) {
        in (0..<1) -> "Остаемся дома"
        in (1..3) -> "Едем в ресторан"
        in (4..<5) -> "Идем в Испанию"
        else -> "Идём в кино"
    }
    println(result)
}
fun homeWork_2() {
    print("Введите первое число:")
    val num_1 = Integer.parseInt(readln())
    print("Введите второе число:")
    val num_2 = Integer.parseInt(readln())
    println("$num_1 + $num_2 = ${num_1 + num_2}")
    print("Введите оператор для примера +, *, /, - :")
    val operator: String = readln()
    when(operator.trim()) {
        "*" -> println("$num_1 * $num_2 = ${num_1 * num_2}")
        "/" -> println("$num_1 / $num_2 = ${num_1 / num_2}")
        "+" -> println("$num_1 + $num_2 = ${num_1 + num_2}")
        "-" -> println("$num_1 - $num_2 = ${num_1 - num_2}")
        else -> println("Неверный оператор!")
    }
    var result = 0; var min = 0; var max = 0; var counter = 0;
    while(true) {
        print("Введите число: ")
        var input = Integer.parseInt(readln())
        if(input < 0)
            break
        if(counter == 0) {
            min = input; result = min; max = result
        }
        if(input > max)
            max = input
        else if(min > input)
            min = input
        counter += 1
        result += input
    }
    println("\nСумма равна: $result")
    println("Максимальное число равна: $max")
    println("Минимальное число равна: $min")
}
fun homeWork_3() {
    println("Таск 1")
    print("Введите число которое будет умножаться: ")
    val num = Integer.parseInt(readln().trim())
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(element in list.indices)
        print("\n${list[element]} * $num = ${list[element] * num}")
    println("\nТаск 2")
    var count_2 = 0; var count_3 = 0; var count_4 = 0; var count_5 = 0;
    val array = arrayOf(5, 2, 3, 4, 4, 3, 4, 5, 4, 5, 3, 2, 4, 2, 3)
    for(arr in array) {
        when(arr) {
            2 -> count_2 += 1
            3 -> count_3 += 1
            4 -> count_4 += 1
            5 -> count_5 += 1
        }
    }
    println("Чисел 2: $count_2")
    println("Чисел 3: $count_3")
    println("Чисел 4: $count_4")
    println("Чисел 5: $count_5")
    println("Таск 3")
    val fruits = arrayOf("banana", "apple", "orange", "orange", "banana", "apple", "apple", "orange")
    var apples = arrayListOf<String>(); var oranges = arrayListOf<String>(); var bananas = arrayListOf<String>();
    for(fruit in fruits) {
        when(fruit) {
            "apple" -> apples.add(fruit)
            "banana" -> bananas.add(fruit)
            "orange" -> oranges.add(fruit)
        }
    }
    println("Количество яблок: $apples")
    println("Количество апельсинов: $oranges")
    println("Количество бананов: $bananas")
    println("Таск 4")
    val numbers = arrayOf<Int>( 5, -2, 1, 3, -5, -7, 8, 4, 3, -4, -1, 2 )
    var count_positive = 0; var count_negative = 0;
    for(number in numbers) {
        if(number >= 0)
            count_positive += 1
        else
            count_negative += 1
    }
    println("Отрицательных чисел: $count_negative")
    println("Положительных чисел: $count_positive")
}
fun homeWork_4(array: Array<Int>): Boolean {
    print("Task 1")
    var index = 1;
    while (index != array.size) {
        var current = array[index - 1]
        var next = array[index]
        if(index != array.size)
            index += 1
        if(current > next)
            return false
    }
    return true
}
fun homeWork_4T2(nums: Array<Int>, combination: Int) {
    for(num_index in nums.indices) {
        for(every_num_index in nums.indices) {
            if(num_index < every_num_index && nums[num_index] + nums[every_num_index] == combination)
                print("(${nums[num_index]}, ${nums[every_num_index]})")
        }
    }
    println()
}
fun homeWork_4T3(numbers: Array<Int>) {
    val arr = arrayListOf<Int>()
    for(index in numbers.indices) {
        if(numbers[index] % 2 == 0)
            arr.add(index)
    }
    println(arr)
}
fun homeWork_4T4(array: ArrayList<Int>) {
    for(index in 0 until array.size / 2) {
        var first = array[index]
        var last = array[array.size - index - 1]
        array[index] = last
        array[array.size - index - 1] = first
    }
    println(array)
}
fun homeWork_4T5(strArr: Array<String>) {
    var count = 0
    for(expression in strArr) {
        if("+" in expression)
            count += 1
        else
            count -= 1
    }
    println(count)
}
fun homeWork_5T1(str: String) {
    var counter = 0
    for(ch in str) {
        if("aeiouAEIOU".contains(ch))
            counter += 1
    }
    println(counter)
}
fun homeWork_5T2(str: String) {
    var temp = ""
    for(char_index in str.indices) {
        if(!"aeiouAEIOU".contains(str[char_index]))
            temp += str[char_index]
    }
    println(temp)
}
fun homeWork_5T3(str: String) {
    var sum = 0
    for(num in str)
        sum += Integer.parseInt(Character.toString(num))
    println(sum)
}
fun homeWork_5T4(str: String): Boolean{
    var result = ""
    for(char_index in str.indices)
        if(!" ,.!?’".contains(str[char_index]))
            result += str[char_index].toLowerCase()
    if(result == result.reversed())
        return true
    return false
}
fun homeWork_5T5(str: String) {
    var strArr = str.split(" ")
    var temp = strArr.toMutableList()
    for(word_index in strArr.indices)
        if (strArr[word_index].length >= 5)
            temp[word_index] = strArr[word_index].reversed()
    println(temp.joinToString(" "))
}
fun homeWork_5Bonus(str: String) {
    var arr = str.split(" ")
    var array = arrayOfNulls<String>(arr.size); var position = 0
    for(word in arr) {
        for(char_index in word.indices) {
            if(word[char_index].isDigit()) {
                position = Integer.parseInt(Character.toString(word[char_index]))
                array[position - 1] = word.replaceFirst("$position", "")
            }
        }
    }
    println(array.joinToString(" "))
}
fun homeWork_6T1(names: Array<String>) {
    var temp = arrayListOf<String>()
    for(arr_index in names.indices)
        temp.add(names[arr_index].replaceFirst("-", " "))
    println(temp)
    var arr = listOf<String>()
    for(str in temp) {
        arr = str.trim().split(" ")
        println(arr)
    }
}
fun homeWork_6T2(text: String, ch: Char) {
    var counter = 0
    for(letter in text)
        if(letter == ch)
            counter += 1
    println(counter)
}
fun homeWork_6T3(text: String) {
    var temp = ""
    var strArr = text.split(" ")
    for(word in strArr)
        temp += word.substring(1) + word[0] + "ay "
    println(temp)
}
fun homeWork_6T4(words: Array<String>, positions: Array<String>) {
    var result = arrayListOf<String>()
    for(index in positions.indices) {
        var temp = ""
        for(nums in positions[index]) {
            for(ch in words[index]) {
                if(Integer.parseInt(nums.toString()) == words[index].indexOf(ch))
                    temp += ch
            }
        }
        result.add(temp)
    }
    println(result)
}
//??
fun homeWork_7T1(names: MutableList<String>) {
    for (name in names)
        if (name.contains("a"))
            names.remove(name)
    println(names)
}
//??
fun homeWork_7T2(nums: ArrayList<Int>, remover: Int) {
    var counter = 0
    for(index in nums.indices) {
        if(remover == nums[index]) {
            nums.removeAt(index)
            counter += 1
        }
    }
    println("$remover is $counter in array was removed.")
}
fun homeWork_7T3(array: ArrayList<String>) {
    var result = ArrayList<String>(); var sum = 0
    for(index in array.indices) {
        for(num in array[index])
            sum += Integer.parseInt(num.toString())
        if(sum % 2 != 0)
            result.add(array[index])
        sum = 0
    }
    println(result)
}
fun homeWork_7T4(arr: ArrayList<Int>) {
    for(index in arr.indices)
        if(index < arr.size && arr[index] == arr[index + 1])
            arr.remove(arr[index])
    println(arr)
}
fun homeWork_7T5(numbers: ArrayList<Int>) {
    var checker = true
    while (checker) {
        checker = false
        var index = 0
        while (index < numbers.size - 2) {
            if (numbers.get(index) == numbers.get(index + 1) && numbers.get(index + 1) == numbers.get(index + 2)) {
                val innerIndex = index + 2
                while (innerIndex < numbers.size && numbers.get(index) == numbers.get(innerIndex)) {
                    numbers.removeAt(innerIndex)
                }
                numbers.removeAt(index + 1)
                numbers.removeAt(index)
                checker = true
                break
            }
            index += 1
        }
    }
//    println(numbers)
}
fun homeWork_8T1(arr1: ArrayList<Int>, arr2: ArrayList<Int>) {
    var result = ArrayList<Int>()
    for(value in arr2)
        if(arr1.contains(value))
            result.add(value)
    println(result)
}
fun homeWork_8T2(arr1: ArrayList<Int>, arr2: ArrayList<Int>) {
    var result = ArrayList<Int>()
    for(value in arr1)
        if(!arr2.contains(value))
            result.add(value)
    println(result)
}
fun homeWork_8T3(arr1: ArrayList<Int>, arr2: ArrayList<Int>) {
    var result = ArrayList<Int>()
    for(value in arr1)
        if(!arr2.contains(value))
            result.add(value)
    for(value in arr2)
        if(!arr1.contains(value))
            result.add(value)
    println(result)
}
fun homeWork_8T4(arr1: ArrayList<Int>, arr2: ArrayList<Int>) {
    var result = ArrayList<Int>()
    for(value in arr1)
        result.add(value)
    for(value in arr2)
        result.add(value)
    println(result)
}
fun homeWork_8T5(arr1: ArrayList<Int>, arr2: ArrayList<Int>): Boolean {
    var bool = false
    for (value in arr1) {
        if (arr2.contains(value))
            bool = true
        else
            return false
    }
    return bool
}
fun homeWork_8T6(arr1: ArrayList<Int>, arr2: ArrayList<Int>): Boolean {
    return homeWork_8T5(arr2, arr1)
}
fun homeWork_9T1(phoneList: Map<String, String>) {
    var result = HashMap<String, String>()
    for(entry in phoneList.entries)
        result.put(entry.value, entry.key)
    println(result)
}
fun homeWork_9T2(ruEnDictionary: Map<String, MutableList<String>>): Map<String, List<String>> {
    var result = HashMap<String, List<String>>()
    for(entry in ruEnDictionary.entries) {
        var ruWord = entry.key
        var enWords = entry.value
        for(enword in enWords) {
            if(!result.containsKey(enword))
                result.put(enword, mutableListOf<String>())
            result.get(enword)
        }
    }
    return result
}