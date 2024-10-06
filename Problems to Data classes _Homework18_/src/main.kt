/*Problem 1: Book Inventory
//Create a data class named Book that has the following properties:
//
//title: String
//author: String
//isbn: String
//publishedYear: Int
//Write a function that takes a list of Book objects and -
- returns the book with the most recent publication year.*/
/*Problem 2: Student Grades
//Define a data class named Student with these properties:
//
//name: String
//id: Int
//grades: List<Double>
//Write a function that takes a list of Student objects and -
- returns a list of students who have an average grade greater than 75%.*/
/*Problem 3: Address Book
//Create a data class named Contact with the following properties:
//
//name: String
//phoneNumber: String
//email: String
//Implement a function to create a list of Contact objects, and -
- add functionality to search for a contact by name, returning the contact's information.*/
/*Problem 4: Movie Collection
//Define a data class called Movie with the following attributes:
//
//title: String
//director: String
//releaseYear: Int
//rating: Double
//Write a function that accepts a list of Movie objects and -
- returns the top N movies based on their ratings.*/
/*Problem 5: E-Commerce Order
//Create a data class named Order with these properties:
//
//orderId: String
//customerName: String
//product: String
//quantity: Int
//pricePerUnit: Double
//Implement a function that calculates the total price for a list of orders, -
- considering the quantity of each product.
THERE IS CHANGES IN MAIN MORE DIFFICULT*/
/*Bonus Challenge: Serialize and Deserialize
//Select one of the data classes you've created and -
//- implement serialization and deserialization using Kotlin's -
- kotlinx.serialization library.*/
// #1
data class Book(
    val title: String,
    val author: String,
    val isbn: String,
    val publishedYear: Int
)
fun getRecentPublished(listOfBooks: List<Book>): Book {
    var maximum = 0
    var indexOfObjects = 0
    var index = 0
    while(index < listOfBooks.size) {
        if(listOfBooks[index].publishedYear > maximum) {
            maximum = listOfBooks[index].publishedYear
            indexOfObjects = index
        }
        index += 1
    }
    return listOfBooks[indexOfObjects]
}
// #2
data class Student(
    val name: String,
    val id: Int,
    val grades: List<Double>
)
fun getStudentsWithAverageGradeAbove75(listOfStudents: List<Student>): List<Student> {
    var average = 0.0
    var devider = 1
    val studentsListAboveAverage = mutableListOf<Student>()
    for(student in listOfStudents) {
        //method #2
        //val average = student.grades.average()
        for(grades in student.grades) {
            average += grades / devider
            devider += 1
        }
        if(average < 75) {
            studentsListAboveAverage += student
        }
        average = 0.0
    }
    return studentsListAboveAverage
}
// #3
data class Contact(
    val name: String,
    val phoneNumber: String,
    val email: String
)
fun findContactByName(listOfContacts: List<Contact>, nameToSearch: String): Contact? {
    for(contact in listOfContacts) {
        if(contact.name == nameToSearch) {
            return contact
        }
    }
    return null
}
// #4
data class Movie(
    val title: String,
    val director: String,
    val releaseYear: Int,
    val rating: Double
)
fun getTopNMovies(listOfMovies: List<Movie>, topN: Int): List<Movie> {
    var listMovies = listOfMovies.sortedByDescending { it.rating }
    val topMovies = mutableListOf<Movie>()
    for(movie in listMovies) {
        if(topMovies.size < topN) {
            topMovies += movie
        }
    }
    return topMovies
}
// #5
data class Product(
    val name: String,
    val price: Double,
    val sku: String
)
class ShoppingCart {
    private var productList = mutableListOf<Product>()
    fun addProduct(product: Any) {
        if(product !is Product) {
            return
        } else {
            productList += product
        }
    }
    fun calculateTotalPrice(): Double {
        var totalPrice = 0.0
        for(product in productList) {
            totalPrice += product.price
        }
        return totalPrice
    }
    fun listAllProducts() : Iterator<Product> = object : Iterator<Product> {
        private var index = -1
        override fun hasNext(): Boolean = index < productList.size - 1

        override fun next(): Product {
            index += 1
            return productList[index]
        }

    }
}
// Bonus
data class Employee(
    val name: String,
    val salary: Double,
    val performanceRating: Int
)
fun calculateTotalBonus(listOfEmployees: List<Employee>): Double {
    var totalBonus = 0.0
    for(employee in listOfEmployees) {
        if(employee.performanceRating == 5)
            totalBonus += employee.salary * 2 / 10
        else if(employee.performanceRating == 4)
            totalBonus += employee.salary * 1 / 10
        else
            totalBonus += 0
    }
    return totalBonus
}
fun main() {
    println("\nProblem #1")

    val book_1 = Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925)
    val book_2 = Book("1984", "George Orwell", "9780451524935", 1949)
    val book_3 = Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960)
    val book_4 = Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951)
    val book_5 = Book("Pride and Prejudice", "Jane Austen", "9780141439518", 1813)
    val book_6 = Book("The Hobbit", "J.R.R. Tolkien", "9780547928227", 1937)
    val book_7 = Book("Fahrenheit 451", "Ray Bradbury", "9781451673319", 1953)
    val book_8 = Book("The Alchemist", "Paulo Coelho", "9780062315007", 1988)
    val book_9 = Book("Brave New World", "Aldous Huxley", "9780060850524", 1932)
    val book_10 = Book("Moby Dick", "Herman Melville", "9781503280786", 1851)

    println(book_1); println(book_2); println(book_3); println(book_4); println(book_5); println(book_6); println(book_7); println(book_8); println(book_9); println(book_10)

    val listOfBooks = listOf(book_1, book_2, book_3, book_4, book_5, book_6, book_7, book_8, book_9, book_10)

    println("Recent published book is: " + getRecentPublished(listOfBooks))

    println("\nProblem #2")

    val student1 = Student("Alice", 1, listOf(85.0, 90.0, 78.0))
    val student2 = Student("Bob", 2, listOf(60.0, 70.0, 65.0))
    val student3 = Student("Charlie", 3, listOf(88.0, 92.0, 94.0))
    val student4 = Student("David", 4, listOf(50.0, 55.0, 45.0))
    val student5 = Student("Eve", 5, listOf(76.0, 80.0, 72.0))

    val listOfStudents = listOf(student1, student2, student3, student4, student5)
    val passingStudents = getStudentsWithAverageGradeAbove75(listOfStudents)

    println("Students with average grade above 75%: ${passingStudents.joinToString { it.name }}")

    println("\nProblem #3")

    val contact1 = Contact("Alice Smith", "123-456-7890", "alice@example.com")
    val contact2 = Contact("Bob Johnson", "234-567-8901", "bob@example.com")
    val contact3 = Contact("Charlie Brown", "345-678-9012", "charlie@example.com")
    val contact4 = Contact("David Wilson", "456-789-0123", "david@example.com")
    val contact5 = Contact("Eve Davis", "567-890-1234", "eve@example.com")

    val contactList = listOf(contact1, contact2, contact3, contact4, contact5)

    val nameToSearch = "Charlie Brown"
    val foundContact = findContactByName(contactList, nameToSearch)

    if (foundContact != null) {
        println("Contact found: Name: ${foundContact.name}, Phone: ${foundContact.phoneNumber}, Email: ${foundContact.email}")
    } else {
        println("Contact not found: $nameToSearch")
    }

    println("\nProblem #4")

    val movie1 = Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3)
    val movie2 = Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2)
    val movie3 = Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0)
    val movie4 = Movie("Pulp Fiction", "Quentin Tarantino", 1994, 8.9)
    val movie5 = Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", 2003, 8.9)
    val movie6 = Movie("Forrest Gump", "Robert Zemeckis", 1994, 8.8)
    val movie7 = Movie("Fight Club", "David Fincher", 1999, 8.8)
    val movie8 = Movie("Inception", "Christopher Nolan", 2010, 8.8)
    val movie9 = Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7)
    val movie10 = Movie("Goodfellas", "Martin Scorsese", 1990, 8.7)

    val movieList = listOf(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10)

    val topN = 5
    val topMovies = getTopNMovies(movieList, topN)

    println("Top $topN Movies:")

    for (movie in topMovies) {
        println("${movie.title} (Rating: ${movie.rating})")
    }

    println("\nProblem #5")

    val shoppingCart = ShoppingCart()

    val product1 = Product("Laptop", 999.99, "SKU001")
    val product2 = Product("Smartphone", 499.99, "SKU002")
    val product3 = Product("Headphones", 199.99, "SKU003")
    val product4 = Product("Smartwatch", 299.99, "SKU004")
    val product5 = Product("Tablet", 399.99, "SKU005")

    shoppingCart.addProduct(product1)
    shoppingCart.addProduct(product2)
    shoppingCart.addProduct(product3)
    shoppingCart.addProduct(product4)
    shoppingCart.addProduct(product5)

    val totalPrice = shoppingCart.calculateTotalPrice()
    println("Total price of products in the cart: $${"%.2f".format(totalPrice)}")

    println("\nProducts in the shopping cart:")
    for (product in shoppingCart.listAllProducts()) {
        println("${product.name} - $${"%.2f".format(product.price)} (SKU: ${product.sku})")
    }

    println("\nProblem #Bonus")

    val employee1 = Employee("Alice", 60000.0, 5)
    val employee2 = Employee("Bob", 55000.0, 4)
    val employee3 = Employee("Charlie", 45000.0, 3)
    val employee4 = Employee("Diana", 70000.0, 5)
    val employee5 = Employee("Eve", 50000.0, 4)

    val employeeList = listOf(employee1, employee2, employee3, employee4, employee5)

    val totalBonus = calculateTotalBonus(employeeList)

    println("\nTotal bonus payout for all employees: $${"%.2f".format(totalBonus)}")
}