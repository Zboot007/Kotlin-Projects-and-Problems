fun main() {
    // ====> property <====
    // size: Int
    // lastIndex: Int
    // indices: IntRange
    // ====> property <====



    // ====> basic methods <====
    // component1(): E | componentN(): E  N from 0 to 5
    // withIndex(): Iterable<IndexedValue>
    // isEmpty(): Boolean
    // isNotEmpty(): Boolean
    // isNullOrEmpty(): Boolean
    // orEmpty(): Collection<E>
    // ifEmpty(() -> R): R
    // ====> basic methods <====



    // ====> delete <====
    // removeFirst(): Int | removeFirstOrNull(): Int?
    // removeLast(): Int | removeLastOrNull(): Int?

    // remove(E): Boolean | -=
    // removeAt(Int): E

    // removeIf((E) -> Boolean): Boolean
    // removeAll(Iterable<E> | Collection<E> | Sequence<E> | Array<E> | (E) -> Boolean): Boolean | -=

    // retainAll(Iterable<E> | Collection<E> | Sequence<E> | Array<E> | (E) -> Boolean): Boolean

    // clear(): Unit
    // ====> delete <====



    // ====> add <====
    // addFirst(E): Unit
    // addLast(E): Unit

    // add(E): Boolean | +=
    // add(Int, E): Unit

    // addAll(Iterable<E> | Collection<E> | Sequence<E> | Array<E> | (E) -> Boolean): Boolean | +=
    // addAll(Int, Collection<E>): Boolean
    // ====> add <====



    // ====> find <====
    // indexOf(E): Int
    // lastIndexOf(E): Int

    // indexOfFirst((E) -> Boolean): Int
    // indexOfLast((E) -> Boolean): Int

    // contains(E): Boolean | in
    // containsAll(Collection<E>): Boolean

    // find((E) -> Boolean): E?
    // findLast((E) -> Boolean): E?

    // binarySearch(element: E, comparator: Comparator<E>, fromIndex: Int, toIndex: Int): Int
    // binarySearch(element: E, fromIndex: Int, toIndex: Int): Int
    // binarySearch(fromIndex: Int = 0, toIndex: Int = size, comparison: (E) -> Int): Int
    // ====> find <====



    // ====> sort <====
    // sort(): Unit | sorted(): List<E>
    // sortDescending: Unit | sortedDescending(): List<E>
    // sortBy((E) -> R): Unit | sortedBy((E) -> R): List<E>
    // sortByDescending((E) -> R): Unit | sortedByDescending((E) -> R): List<E>
    // sortWith(Comparator<E>): Unit | sortedWith(Comparator<E>): List<E>
    // ====> sort <====



    // ====> get <====
    // first(): E  | first((E) -> Boolean): E
    // firstOrNull(): E? | firstOrNull((E) -> Boolean): E?
    // firstNotNullOf((E) -> R?): R
    // firstNotNullOfOrNull((E) -> R?): R?

    // random(): E | randomOrNull(): E?
    // random(random: Random): E | randomOrNull(random: Random): E?

    // last(): E  | last((E) -> Boolean): E
    // lastOrNull(): E? | lastOrNull((E) -> Boolean): E?

    // single(): E | single((E) -> Boolean): E
    // singleOrNull(): E? | singleOrNull((E) -> Boolean): E

    // set(Int, E): Int | [Int]

    // get(Int): E | [Int]
    // getOrNull(Int): E?
    // getOrElse(Int, (Int) -> E): E

    // elementAt(Int): E | [Int]
    // elementAtOrNull(Int): E?
    // elementAtOrElse(Int, (Int) -> E): E
    // ====> get <====



    // ====> take and drop <====
    // take(count: Int): List<E> | takeLast(count: Int): List<E>
    // takeWhile((E) -> Boolean): List<E> | takeLastWhile((E) -> Boolean): List<E>

    // drop(count: Int): List<E> | dropLast(count: Int): List<E>
    // dropWhile((E) -> Boolean): List<E> | dropLastWhile((E) -> Boolean): List<E>

    // subList(start: Int, end: Int): MutableList<E>
    // slice(indices: IntRange): List<E> | slice(indices: Iterable<Int>): List<E>
    // ====> take and drop <====



    // ====> filter <====
    // filterNotNull(): List<E> | filterNotNullTo(destination: Collection<E>): Collection<E>
    // filterIsInstance<Type>(): List<Type> | filterIsInstanceTo<Type>(destination: Collection<Type>): Collection<Type>
    // filterIsInstance(classType): List<classType> | filterIsInstanceTo(destination: Collection<E>, classType): Collection<E>
    // filter((E) -> Boolean): List<E> | filterTo(destination: Collection<E>, (E) -> Boolean): Collection<E>
    // filterIndexed((index: Int, E) -> Boolean): List<E> | filterIndexedTo(destination: Collection<E>, (index: Int, E) -> Boolean): Collection<E>
    // filterNot((E) -> Boolean): List<E> | filterNotTo(destination: Collection<E>, (E) -> Boolean): Collection<E>
    // filterNotIndexed((index: Int, E) -> Boolean): List<E> | filterNotIndexedTo(destination: Collection<E>, (index: Int, E) -> Boolean): Collection<E>
    // partition((E) -> Boolean): Pair<List<E>, List<E>>
    // ====> filter <====



    // ====> map <====
    // map((E) -> R): List<R> | mapTo(destination: Collection<R>, (E) -> R): Collection<R>
    // mapIndexed((index: Int, E) -> R): List<R> | mapIndexedTo(destination: Collection<R>, (index: Int, E) -> R): Collection<R>
    // mapNotNull((E) -> R): List<R> | mapNotNullTo(destination: Collection<R>, (E) -> R): Collection<R>
    // mapIndexedNotNull((index: Int, E) -> R): List<R> | mapIndexedNotNullTo(destination: Collection<R>, (index: Int, E) -> R): Collection<R>

    // flatten(): List<E>
    // flatMap((E) -> Iterable<R>): List<R> | flatMapTo(destination: Collection<R>, (E) -> Iterable<R>): Collection<R>
    // flatMapIndexed((index: Int, E) -> Iterable<R>): List<R> | flatIndexedMapTo(destination: Collection<R>, (index: Int, E) -> Iterable<R>): Collection<R>
    // ====> map <====



    // ====> group <====
    // groupBy((E) -> K): Map<K, List<E> | groupByTo(destination: Map<K, List<E>>, (E) -> K): Map<K, List<E>>
    // groupBy((E) -> K, (E) -> V): Map<K, List<V> | groupByTo(destination: Map<K, List<V>>, (E) -> K, (E) -> V): Map<K, List<V>>

    // groupingBy((E) -> K): Grouping<Int, K>

    // associate((E) -> Pair<K, V>): Map<K, V> | associateTo(destination: Map<K, V>, (E) -> Pair<K, V>): Map<K, V>
    // associateBy((E) -> K): Map<K, E> | associateByTo(destination: Map<K, E>, (E) -> K): Map<K, E>
    // associateBy((E) -> K, (E) -> V): Map<K, V> | associateByTo(destination: Map<K, V>, (E) -> K, (E) -> V): Map<K, V>
    // associateWith((E) -> V): Map<E, V> | associateWithTo(destination: Map<E, V>, (E) -> V): Map<E, V>
    // ====> group <====



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



    // ====> set methods <====
    // distinct(): List<E>
    // distinctBy((E) -> K): List<E>

    // union(Iterable<E>): Set<E>
    // intersect(Iterable<E>): Set<E>
    // subtract(Iterable<E>): Set<E>
    // ====> set methods <====



    // =====> others <=====
    // joinTo(
    //    buffer: A,
    //    separator: CharSequence = ", ",
    //    prefix: CharSequence = "",
    //    postfix: CharSequence = "",
    //    limit: Int = -1,
    //    truncated: CharSequence = "...",
    //    transform: ((T) -> CharSequence)? = null
    //): A

    // joinToString(
    //    separator: CharSequence = ", ",
    //    prefix: CharSequence = "",
    //    postfix: CharSequence = "",
    //    limit: Int = -1,
    //    truncated: CharSequence = "...",
    //    transform: ((T) -> CharSequence)? = null
    //): String

    // reverse(): Unit | reversed(): List<E>
    // shuffle(): Unit | shuffled(): List<E>
    // shuffle(random: Random): Unit | shuffled(random: Random): List<E>

    // chunked(size: Int): List<List<E>>
    // chunked(size: Int, (List<E>) -> R): List<R>

    // zip(Iterable<R>): List<Pair<E, R>>
    // zip(Iterable<R>, transform: (E, R) -> V): List<V>
    // zipWithNext(): List<Pair<E, E>>
    // zipWithNext(transform: (E, E) -> R): List<R>
    // unZip(): Pair<List<E>, List<R>>

    // forEach((E) -> Unit): Unit | onEach((E) -> Unit): Collection<E>
    // forEachIndexed((Int, E) -> Unit): Unit | onEachIndexed((Int, E) -> Unit): Collection<E>

    // any(): Boolean
    // any((E) -> Boolean): Boolean
    // all((E) -> Boolean): Boolean
    // none(): Boolean
    // none((E) -> Boolean): Boolean

    // count(): Int
    // count((E) -> Boolean): Int

    // sum(): Int
    // sumOf((E) -> NumericType): Int
    // average(): Int

    // max(): E | min(): E
    // maxOrNull(): E? | minOrNull(): E?
    // ^maxBy((E) -> R): E | minBy((E) -> R): E
    // ^maxByOrNull((E) -> R): E? | minByOrNull((E) -> R): E?
    // maxOf((E) -> R): R | minOf((E) -> R): R
    // maxOfOrNull((E) -> R): R? | minOfOrNull((E) -> R): R?
    // maxWith(comparator: Comparator<E>): E? | maxWith(comparator: Comparator<E>): E?
    // maxWithOrNull(comparator: Comparator<E>): E? | minWithOrNull(comparator: Comparator<E>): E?

    // windowed(
    //     size: Int,
    //     step: Int = 1,
    //     partialWindows: Boolean = false
    //    ): List<List<T>>

    // windowed(
    //     size: Int,
    //     step: Int = 1,
    //     partialWindows: Boolean = false,
    //     transform: (List<T>) -> R
    //): List<R>

    // to[TypeCollection]
    // =====> others <=====
}