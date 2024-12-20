fun main() {
    val fictionBooks = listOf(
        Books.Fiction(name = "1984", author = "George Orwell", publishedDate = "1949-06-08", id = 1),
        Books.Fiction(name = "Brave New World", author = "Aldous Huxley", publishedDate = "1932-08-01", id = 2),
        Books.Fiction(name = "Fahrenheit 451", author = "Ray Bradbury", publishedDate = "1953-10-19", id = 3),
        Books.Fiction(name = "Moby Dick", author = "Herman Melville", publishedDate = "1851-10-18", id = 4),
        Books.Fiction(name = "Pride and Prejudice", author = "Jane Austen", publishedDate = "1813-01-28", id = 5),
        Books.Fiction(name = "The Great Gatsby", author = "F. Scott Fitzgerald", publishedDate = "1925-04-10", id = 6),
        Books.Fiction(name = "To Kill a Mockingbird", author = "Harper Lee", publishedDate = "1960-07-11", id = 7),
        Books.Fiction(name = "The Catcher in the Rye", author = "J.D. Salinger", publishedDate = "1951-07-16", id = 8),
        Books.Fiction(name = "War and Peace", author = "Leo Tolstoy", publishedDate = "1869-01-01", id = 9),
        Books.Fiction(name = "Crime and Punishment", author = "Fyodor Dostoevsky", publishedDate = "1866-01-01", id = 10),
        Books.Fiction(name = "The Brothers Karamazov", author = "Fyodor Dostoevsky", publishedDate = "1880-01-01", id = 11),
        Books.Fiction(name = "The Odyssey", author = "Homer", publishedDate = "800-BC", id = 12),
        Books.Fiction(name = "The Iliad", author = "Homer", publishedDate = "762-BC", id = 13),
        Books.Fiction(name = "The Divine Comedy", author = "Dante Alighieri", publishedDate = "1320-01-01", id = 14),
        Books.Fiction(name = "The Hobbit", author = "J.R.R. Tolkien", publishedDate = "1937-09-21", id = 15),
        Books.Fiction(name = "The Lord of the Rings", author = "J.R.R. Tolkien", publishedDate = "1954-07-29", id = 16),
        Books.Fiction(name = "Ulysses", author = "James Joyce", publishedDate = "1922-02-02", id = 17),
        Books.Fiction(name = "Don Quixote", author = "Miguel de Cervantes", publishedDate = "1605-01-01", id = 18),
        Books.Fiction(name = "One Hundred Years of Solitude", author = "Gabriel García Márquez", publishedDate = "1967-06-05", id = 19),
        Books.Fiction(name = "Wuthering Heights", author = "Emily Brontë", publishedDate = "1847-12-01", id = 20),
        Books.Fiction(name = "Dracula", author = "Bram Stoker", publishedDate = "1897-05-26", id = 21),
        Books.Fiction(name = "Frankenstein", author = "Mary Shelley", publishedDate = "1818-01-01", id = 22),
        Books.Fiction(name = "The Picture of Dorian Gray", author = "Oscar Wilde", publishedDate = "1890-06-20", id = 23),
        Books.Fiction(name = "Les Misérables", author = "Victor Hugo", publishedDate = "1862-01-01", id = 24),
        Books.Fiction(name = "Anna Karenina", author = "Leo Tolstoy", publishedDate = "1877-01-01", id = 25),
        Books.Fiction(name = "Jane Eyre", author = "Charlotte Brontë", publishedDate = "1847-10-16", id = 26),
        Books.Fiction(name = "The Sun Also Rises", author = "Ernest Hemingway", publishedDate = "1926-10-22", id = 27),
        Books.Fiction(name = "The Count of Monte Cristo", author = "Alexandre Dumas", publishedDate = "1844-08-28", id = 28),
        Books.Fiction(name = "The Three Musketeers", author = "Alexandre Dumas", publishedDate = "1844-03-01", id = 29),
        Books.Fiction(name = "Gone with the Wind", author = "Margaret Mitchell", publishedDate = "1936-06-30", id = 30),
        Books.Fiction(name = "Lolita", author = "Vladimir Nabokov", publishedDate = "1955-09-15", id = 31),
        Books.Fiction(name = "The Master and Margarita", author = "Mikhail Bulgakov", publishedDate = "1967-01-01", id = 32),
        Books.Fiction(name = "Slaughterhouse-Five", author = "Kurt Vonnegut", publishedDate = "1969-03-31", id = 33),
        Books.Fiction(name = "Catch-22", author = "Joseph Heller", publishedDate = "1961-11-10", id = 34),
        Books.Fiction(name = "The Bell Jar", author = "Sylvia Plath", publishedDate = "1963-01-14", id = 35),
        Books.Fiction(name = "Rebecca", author = "Daphne du Maurier", publishedDate = "1938-08-01", id = 36),
        Books.Fiction(name = "The Grapes of Wrath", author = "John Steinbeck", publishedDate = "1939-04-14", id = 37),
        Books.Fiction(name = "The Metamorphosis", author = "Franz Kafka", publishedDate = "1915-01-01", id = 38),
        Books.Fiction(name = "The Trial", author = "Franz Kafka", publishedDate = "1925-01-01", id = 39),
        Books.Fiction(name = "The Adventures of Huckleberry Finn", author = "Mark Twain", publishedDate = "1884-12-10", id = 40)
    )
    val nonFictionBooks = listOf(
        Books.NonFiction(name = "The Diary of a Young Girl", author = "Anne Frank", publishedDate = "1947-06-25", id = 1),
        Books.NonFiction(name = "The Immortal Life of Henrietta Lacks", author = "Rebecca Skloot", publishedDate = "2010-02-02", id = 2),
        Books.NonFiction(name = "Sapiens: A Brief History of Humankind", author = "Yuval Noah Harari", publishedDate = "2011-01-01", id = 3),
        Books.NonFiction(name = "Educated", author = "Tara Westover", publishedDate = "2018-02-20", id = 4),
        Books.NonFiction(name = "Becoming", author = "Michelle Obama", publishedDate = "2018-11-13", id = 5),
        Books.NonFiction(name = "The Wright Brothers", author = "David McCullough", publishedDate = "2015-05-05", id = 6),
        Books.NonFiction(name = "The Power of Habit", author = "Charles Duhigg", publishedDate = "2012-02-28", id = 7),
        Books.NonFiction(name = "Outliers", author = "Malcolm Gladwell", publishedDate = "2008-11-18", id = 8),
        Books.NonFiction(name = "The Art of War", author = "Sun Tzu", publishedDate = "5th Century BC", id = 9),
        Books.NonFiction(name = "Quiet", author = "Susan Cain", publishedDate = "2012-01-24", id = 10),
        Books.NonFiction(name = "Born a Crime", author = "Trevor Noah", publishedDate = "2016-11-15", id = 11),
        Books.NonFiction(name = "The New Jim Crow", author = "Michelle Alexander", publishedDate = "2010-01-05", id = 12),
        Books.NonFiction(name = "Guns, Germs, and Steel", author = "Jared Diamond", publishedDate = "1997-03-01", id = 13),
        Books.NonFiction(name = "The Man Who Knew Infinity", author = "Robert Kanigel", publishedDate = "1991-09-01", id = 14),
        Books.NonFiction(name = "The Selfish Gene", author = "Richard Dawkins", publishedDate = "1976-09-01", id = 15),
        Books.NonFiction(name = "Thinking, Fast and Slow", author = "Daniel Kahneman", publishedDate = "2011-10-25", id = 16),
        Books.NonFiction(name = "Why We Sleep", author = "Matthew Walker", publishedDate = "2017-10-03", id = 17),
        Books.NonFiction(name = "The Gene: An Intimate History", author = "Siddhartha Mukherjee", publishedDate = "2016-05-17", id = 18),
        Books.NonFiction(name = "A Brief History of Time", author = "Stephen Hawking", publishedDate = "1988-04-01", id = 19),
        Books.NonFiction(name = "The Emperor of All Maladies", author = "Siddhartha Mukherjee", publishedDate = "2010-11-16", id = 20),
        Books.NonFiction(name = "The Signal and the Noise", author = "Nate Silver", publishedDate = "2012-09-27", id = 21),
        Books.NonFiction(name = "The Sixth Extinction", author = "Elizabeth Kolbert", publishedDate = "2014-02-11", id = 22),
        Books.NonFiction(name = "Salt: A World History", author = "Mark Kurlansky", publishedDate = "2002-01-01", id = 23),
        Books.NonFiction(name = "Steve Jobs", author = "Walter Isaacson", publishedDate = "2011-10-24", id = 24),
        Books.NonFiction(name = "Team of Rivals", author = "Doris Kearns Goodwin", publishedDate = "2005-10-25", id = 25),
        Books.NonFiction(name = "Unbroken", author = "Laura Hillenbrand", publishedDate = "2010-11-16", id = 26),
        Books.NonFiction(name = "Into the Wild", author = "Jon Krakauer", publishedDate = "1996-01-13", id = 27),
        Books.NonFiction(name = "In Cold Blood", author = "Truman Capote", publishedDate = "1966-01-17", id = 28),
        Books.NonFiction(name = "The Warmth of Other Suns", author = "Isabel Wilkerson", publishedDate = "2010-09-07", id = 29),
        Books.NonFiction(name = "Man's Search for Meaning", author = "Viktor Frankl", publishedDate = "1946-01-01", id = 30),
        Books.NonFiction(name = "The Elements of Style", author = "William Strunk Jr.", publishedDate = "1918-01-01", id = 31),
        Books.NonFiction(name = "Homo Deus: A Brief History of Tomorrow", author = "Yuval Noah Harari", publishedDate = "2015-01-01", id = 32),
        Books.NonFiction(name = "Bad Blood", author = "John Carreyrou", publishedDate = "2018-05-21", id = 33),
        Books.NonFiction(name = "The Rise and Fall of the Third Reich", author = "William L. Shirer", publishedDate = "1960-01-01", id = 34),
        Books.NonFiction(name = "The Innovators", author = "Walter Isaacson", publishedDate = "2014-10-07", id = 35),
        Books.NonFiction(name = "Cosmos", author = "Carl Sagan", publishedDate = "1980-01-01", id = 36),
        Books.NonFiction(name = "The Devil in the White City", author = "Erik Larson", publishedDate = "2003-02-11", id = 37),
        Books.NonFiction(name = "Lean In", author = "Sheryl Sandberg", publishedDate = "2013-03-11", id = 38),
        Books.NonFiction(name = "A People's History of the United States", author = "Howard Zinn", publishedDate = "1980-01-01", id = 39),
        Books.NonFiction(name = "Quiet: The Power of Introverts", author = "Susan Cain", publishedDate = "2012-01-24", id = 40)
    )
    val books = fictionBooks + nonFictionBooks
    println(books)
    val authors_1 = books.groupingBy {
        when(it) {
            is Books.Fiction -> it.author
            is Books.NonFiction -> it.author
            else -> {}
        }
    }.eachCount()
    authors_1.forEach {
        (authors, count) ->
        println("$authors, Number of books: $count")
    }
    val zippedBooks = fictionBooks.zip(nonFictionBooks) { fiction, nonFiction ->
        Pair(fiction, nonFiction)
    }
    val authors_2 = zippedBooks.flatMap { pair ->
        listOf(pair.first.author, pair.second.author)
    }
    val authorsGrouped = authors_2.groupingBy { it }.eachCount()

    authorsGrouped.forEach { (author, count) ->
        println("Author: $author, Number of Books: $count")
    }

    val fictionAndNonfiction = books.map {
        when(it) {
            is Books.Fiction -> it.name
            is Books.NonFiction -> it.name
            else -> ""
        }
    }.filter { it.isNotEmpty() }
    println(fictionAndNonfiction)
    val listOfBooks = listOf(listOf(listOf(fictionBooks), listOf(listOf(nonFictionBooks))))
    val mappedBooks = flattenBooks(listOfBooks)
    println("Flattened books: $mappedBooks")
    println("Flattened list of books:")
//    mappedBooks.forEach {
//        when (it) {
//            is Books.Fiction -> println("Fiction: ${it.name} by ${it.author}")
//            is Books.NonFiction -> println("Non-Fiction: ${it.name} by ${it.author}")
//        }
//    }
}
/*1. Grouping by Author (Fiction and NonFiction): 💎
Group the books by their authors and count how many books each author has written across both fiction and nonfiction.

2. Map to Book Names: 💎
Create a list of all the book names from both fiction and nonfiction books.

3. FlatMap of Authors:
Assume you have multiple lists of Fiction and NonFiction books. Combine these lists and flatten them into one list of authors.

4. Group by Published Year:
Group the books by their published year and print the list of books for each year.

5. Map to IDs:
Create a list of all the book IDs from both fiction and nonfiction books.

6. Group by Genre:
Group the books by their genre (fiction or nonfiction) and count how many books belong to each genre.

7. FlatMap to Extract First Letters of Book Names:
From both fiction and nonfiction books, create a list of the first letters of each book's name.

8. Using forEach to Print Titles by Author:
Use forEach to print the titles of all books by each author in both fiction and nonfiction categories.

9. Group by Decade:
Group the books by the decade of their publication (e.g., 1990s, 2000s) and count how many books were published in each decade.

10. Map to Pair of Name and Published Date:
Create a list of pairs containing each book's name and its published date for both fiction and nonfiction categories.*/
class Books {
    data class Fiction(
        val name: String,
        val author: String,
        val publishedDate: String,
        val id: Int
    )
    data class NonFiction(
        val name: String,
        val author: String,
        val publishedDate: String,
        val id: Int
    )
}
fun flattenBooks(nested: List<*>): List<Books> {
    return nested.flatMap { element ->
        when (element) {
            is List<*> -> flattenBooks(element)    // Recurse if the element is a list
            is Books -> listOf(element)            // Return the book in a list
            else -> emptyList()                    // Handle unexpected types
        }
    }
}