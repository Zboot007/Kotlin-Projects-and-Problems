fun main() {
    val transactions = listOf(
        Transaction(50.0, "Food", "2024-01-01"),
        Transaction(200.0, "Travel", "2024-01-02"),
        Transaction(20.0, "Food", "2024-01-03"),
        Transaction(100.0, "Entertainment", "2024-01-04")
    )
    val categoryTotal = transactions.groupBy({ it.category }) { it.amount }.mapValues { it.value.sum() }
    // {Food=70.0, Travel=200.0, Entertainment=100.0}
//    val highest = transactions.groupBy({ it.category }) { it.amount }.mapKeys { it.value.max() } // {50.0=[50.0, 20.0], 200.0=[200.0], 100.0=[100.0]}
//    val highest = transactions.fold("") { acc, transaction -> acc + transaction.category.max() } // ovot ???????????
    val highest = categoryTotal.entries.reduce { maxEntry, entry ->
        if (entry.value > maxEntry.value) entry else maxEntry
    }
    val minimum = categoryTotal.values.min()

    println(categoryTotal)
    println(highest)
    println(minimum)
    println("=== Products ===")

    val products = listOf(
        Product("Shirt", "Red", 10),
        Product("Shirt", "Blue", 15),
        Product("Shirt", "Green", 5),
        Product("Shoes", "Size 10", 7),
        Product("Shoes", "Size 11", 4)
    )
    val totalQuantity = products.sumOf { it.quantity }

    println(totalQuantity)

    val totalShirtAndShoes = products.groupBy({ it.name }) { it.quantity }.mapValues { it.value.sum() }

    println(totalShirtAndShoes)

    val highestProduct = products.groupBy { it.name }.mapValues {
        entry -> entry.value.reduce { maxVariant, currentVariant ->
            if(currentVariant.quantity > maxVariant.quantity) currentVariant else maxVariant
        }
    }
    highestProduct.forEach { (productName, product) ->
        println("$productName = ${product.variant}")
    }

    println("=== Books ===") //💎

    val books = listOf(
        Book("Book A", "Author 1", 2020, "Fiction"),
        Book("Book B", "Author 2", 2018, "Non-Fiction"),
        Book("Book C", "Author 1", 2023, "Fiction"),
        Book("Book D", "Author 3", 2015, "Non-Fiction")
    )
    val groupedGenre = books.groupBy { it.genre } //💎💎💎
    val genreStats = groupedGenre.mapValues { entry ->
        val genre = entry.value
        val bookCount = genre.count()
        val oldest = genre.minOf { it.year }
        val newest = genre.maxOf { it.year }
        Triple(bookCount, oldest, newest)
    }
    println(genreStats)
    genreStats.forEach { (genre, stats) ->
        println("$genre: ${stats.first} books, oldest=${stats.second}, newest=${stats.third}")
    } //💎💎💎

    println("=== Votes ===")

    val votes = listOf(
        Vote("Alice", 300),
        Vote("Bob", 150),
        Vote("Alice", 50),
        Vote("Charlie", 200),
        Vote("Bob", 100)
    )
    val total = votes.groupBy { it.candidate }.mapValues { it.value.sumOf { it.votes } }
    println("Vote counts: $total")
    val winner = total.maxByOrNull { it.value }?.key  //💎💎💎
    println("Winner: $winner")

    println("=== Sales ===")

    val sales = listOf(
        Sale(2023, "January", "Laptop", 2000.0),
        Sale(2023, "January", "Phone", 1500.0),
        Sale(2023, "February", "Tablet", 1000.0),
        Sale(2024, "January", "Laptop", 2500.0),
        Sale(2024, "March", "Phone", 1800.0)
    )
    // Sales by year and month:
    // 2023 -> {January=3500.0, February=1000.0}
    // 2024 -> {January=2500.0, March=1800.0}
    //
    // Highest sales month per year:
    // 2023 -> January
    // 2024 -> January
    val salesByAll = sales.groupBy { it.year }.mapValues { entry -> entry.value.groupBy { it.month }.mapValues { it.value.sumOf { it.amount } } }
    val bestSale = sales.groupBy { it.year }.mapValues { entry -> entry.value.maxBy { it.amount }.month }
    println(salesByAll)
    println(bestSale)
}
data class Transaction(val amount: Double, val category: String, val date: String)
data class Product(val name: String, val variant: String, val quantity: Int)
data class Book(val title: String, val author: String, val year: Int, val genre: String)
data class Vote(val candidate: String, val votes: Int)
data class Sale(val year: Int, val month: String, val product: String, val amount: Double)