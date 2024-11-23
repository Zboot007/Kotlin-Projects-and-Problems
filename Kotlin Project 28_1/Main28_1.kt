data class Person7(
    val name: String,
    val age: Int,
    val country: String,
    val gender: String
)

fun testFun(list: List<Person7>)
    : Map<String, List<Person7>> {
    val dict = mutableMapOf<String, MutableList<Person7>>()

    for(person in list) {
        if (person.country !in dict)
            dict[person.country] = mutableListOf()

        dict[person.country]!! += person
    }
    return dict
}

fun main() {
//    val nums = listOf(1, 2, 3, 4, 5)

//    println(nums.fold(mutableListOf<Pair<Int, String>>()) { list, num ->
//        list += num to (num * 10).toString()
//        list
//    })

//    println(nums.fold(mutableListOf<Int>()) { list, num ->
//        if(num % 2 == 0)
//            list += num
//        list
//    })
//    println(nums.fold(listOf<Int>()) { list, num ->
//        list + if(num % 2 != 0) listOf(num) else emptyList() })


//    val nums2 = listOf(3, 7, 1, 9)
//    val nums3 = listOf(2, 8, 4, 6, 1, 10, 12)

//     all
//    println(nums2.fold(true) { acc, num -> acc && num % 2 != 0 }) // true
//    println(nums3.fold(true) { acc, num -> acc && num % 2 == 0 }) // false
//    // any
//    println(nums2.fold(false) { acc, num -> acc || num % 2 == 0 }) // false
//    println(nums3.fold(false) { acc, num -> acc || num % 2 != 0 }) // true

//    val s = "Hello, World!!!"
//
//    println(s.foldIndexed(mutableMapOf<Char, List<Int>>()) { index, dict, char ->
//        dict[char] = (dict[char] ?: listOf()) + listOf(index)
//        dict
//    })

//    val s = "Hello, World!!!"
    // H: 1
    // e: 1
    // l: 3

//    println(s.groupingBy { it }.keyOf('l'))
//    println(s.mapIndexed { index, symbol -> symbol to index }
//             .groupBy({ it.first }) { it.second })
//    println(s.groupBy { it }
//             .mapValues { (_, value) -> value.size })

//    val people = listOf(
//        Person7("Mike", 25, "USA", "male"),
//        Person7("John", 22, "French", "male"),
//        Person7("Tom", 28, "USA", "male"),
//        Person7("Nicole", 20, "USA", "female"),
//        Person7("Tomas", 22, "Russia", "male"),
//        Person7("Jessica", 27, "French", "female"),
//        Person7("Naomi", 22, "Germany", "female"),
//        Person7("Scott", 25, "Germany", "male"),
//        Person7("Teresa", 25, "USA", "female"),
//        Person7("Sarah", 25, "French", "female")
//    )

//    people.associate {
//        it.country to it.name
//    }.forEach { (country, name) ->
//        println("$country: $name")
//    }
//    people.associateBy(Person7::country, Person7::name)
//          .forEach { (country, name) ->
//        println("$country: $name")
//    }
//    people.associateWith { it.name }
//          .forEach { (country, name) ->
//        println("$country: $name")
//    }

//    people.groupBy(Person7::country, Person7::name)
//          .forEach { (country, people2) ->
//              println("$country: $people2")
//          }

//    people.groupBy(Person7::gender, Person7::name)
//        .forEach { (country, people2) ->
//            println("$country: $people2")
//        }

    // USA: [ Person7("Mike", 25, "USA", "male"), ...]
    // French: ...

    // male: [..., ]
    // female: [..., ]

//    people.groupBy(Person7::age, Person7::name)
//        .toSortedMap()
//        .forEach { (country, people2) ->
//            println("$country: $people2")
//        }

    // 25: [..., ...]
    // ...




    // ====> group <====
    // groupBy((E) -> K): Map<K, List<E>> | groupByTo(destination: Map<K, List<E>>, (E) -> K): Map<K, List<E>>
    // groupBy((E) -> K, (E) -> V): Map<K, List<V>> | groupByTo(destination: Map<K, List<V>>, (E) -> K, (E) -> V): Map<K, List<V>>

    // groupingBy((E) -> K): Grouping<E, K>

    // associate((E) -> Pair<K, V>): Map<K, V> | associateTo(destination: Map<K, V>, (E) -> Pair<K, V>): Map<K, V>
    // associateBy((E) -> K): Map<K, E> | associateByTo(destination: Map<K, E>, (E) -> K): Map<K, E>
    // associateBy((E) -> K, (E) -> V): Map<K, V> | associateByTo(destination: Map<K, V>, (E) -> K, (E) -> V): Map<K, V>
    // associateWith((E) -> V): Map<E, V> | associateWithTo(destination: Map<E, V>, (E) -> V): Map<E, V>
    // ====> group <====



//    val nums = listOf<Int>(1, 2, 3, 4, 5)
//    val symbols = "Mike"
//    println(nums.runningReduce { acc, num -> acc + num })
    // 1
    // 3
    // 6
    // 10
    // 15

//    println(symbols.foldIndexed("") {
//        index, acc, char ->
//        "$acc${if(index == 0) "" else "--"}$char"
//    })
//    println(nums.fold(0) { acc, num -> acc + num })

//    println(nums.reduce { acc, num -> acc * num })
//    println(Regex("([a-zA-Z])")
//            .replace(symbols) { "${it.value}--" }
//                .trim('-'))
    // M--i--k--e


    // ====> reduce <====
    // reduce((acc: E, item: E) -> E): E | reduceOrNull((acc: E, item: E) -> E): E?
    // reduceIndexed((index: Int, acc: E, item: E) -> E): E | reduceIndexedOrNull((index: Int, acc: E, item: E) -> E): E?

    // reduceRight((acc: E, item: E) -> E): E | reduceRightOrNull((acc: E, item: E) -> E): E?
    // reduceRightIndexed((index: Int, acc: E, item: E) -> E): E | reduceRightIndexedOrNull((index: Int, acc: E, item: E) -> E): E?

    // fold(initial: R, (R, E) -> R): R | foldIndexed(initial: R, (index: Int, R, E) -> R): R
    // foldRight(initial: R, (R, E) -> R): R | foldRightIndexed(initial: R, (index: Int, R, E) -> R): R

    // runningReduce((acc: E, item: E) -> E): List<E> | runningReduceIndexed((index: Int, acc: E, item: E) -> E): List<E>
    // runningFold(initial: R, (acc: R, item: E) -> R): List<R> | runningFoldIndexed(initial: R, (index: Int, acc: R, item: E) -> R): List<R>
    // scan(initial: R, (acc: R, item: E) -> R): List<R> | scanIndexed(initial: R, (index: Int, acc: R, item: E) -> R): List<R>
    // ====> reduce <====
}