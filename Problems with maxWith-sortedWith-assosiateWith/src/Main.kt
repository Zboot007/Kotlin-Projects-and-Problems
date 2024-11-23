fun main() {
    // Problem 1: Complex Sorting of Product List
    val products = listOf(
        Product("Laptop", 1200.0, 4.5),
        Product("Phone", 800.0, 4.7),
        Product("Tablet", 500.0, 4.5),
        Product("Monitor", 300.0, 4.7),
        Product("Keyboard", 50.0, 4.5)
    )
    val sortedProducts = products.sortedWith( // 💎💎💎💎💎💎
        compareByDescending<Product> { it.rating }
            .thenBy { it.price }
            .thenBy { it.name }
    )
    println("Sorted Products: $sortedProducts")

    // Problem 2: Top Scoring Students by Subject
    val students = listOf(
        Student("Alice", "Math", 95),
        Student("Bob", "Math", 87),
        Student("Charlie", "Science", 90),
        Student("Dave", "Math", 95),
        Student("Eve", "Science", 93)
    )
    val topStudentsBySubject = students.groupBy { it.subject }
        .mapValues { it.value
            .sortedWith(
                compareByDescending<Student> { it.score }
                    .thenBy { it.name }
            )
        }
    println("Top Students by Subject: $topStudentsBySubject")

    // Problem 3: Group and Sort Employees by Department and Seniority
    val employees = listOf(
        Employee("John", "IT", 5),
        Employee("Doe", "IT", 3),
        Employee("Jane", "HR", 6),
        Employee("Mark", "Finance", 4),
        Employee("Lucy", "IT", 5)
    )
    val employeesByDept = employees.groupBy { it.department }
        .mapValues { it.value.sortedWith(
            compareByDescending<Employee> { it.experience }
                .thenBy { it.name }
            ) // 💎💎💎
        }
    println("Employees by Department: $employeesByDept")

    // Problem 4: Associate Employees with Closest Higher Salary
    val employeesWithSalaries = listOf(
        EmployeeWithSalary("John", 50000),
        EmployeeWithSalary("Doe", 55000),
        EmployeeWithSalary("Jane", 48000),
        EmployeeWithSalary("Mark", 51000),
        EmployeeWithSalary("Lucy", 60000)
    )
    val closestHigherSalary = employeesWithSalaries.associateWith { it.salary }
    println("Closest Higher Salary Map: $closestHigherSalary")

    // Problem 5: Multi-Criteria Leaderboard Ranking
    val players = listOf(
        Player("Alice", 1500, 10),
        Player("Bob", 1600, 9),
        Player("Charlie", 1600, 10),
        Player("Dave", 1550, 11),
        Player("Eve", 1500, 11)
    )
    val leaderboard = players.sortedWith(
        compareByDescending<Player> { it.score }.thenBy { it.level }.thenBy { it.name } // 💎💎💎
    )
    println("Leaderboard: $leaderboard")
    println("=== maxWith ===")
    val employees_2 = listOf(
        Staff.Employee("Alice", "Engineer", 5),
        Staff.Employee("Bob", "Manager", 8),
        Staff.Employee("Charlie", "Engineer", 7),
        Staff.Employee("Dave", "Engineer", 5),
        Staff.Employee("Eve", "Manager", 8)
    )
    val grouped = employees_2.groupBy { it.department }
    val max = grouped.mapValues { (_, deptEmployees) ->
        deptEmployees.maxWith(compareBy<Staff.Employee> { it.experience }.thenBy { it.name }
        )
    } // 💎💎💎💎
    println("max: $max")
    println("== Product ==")
    val products_2 = listOf(
        Shop.Products("Laptop", "Electronics", 4.8, 1200.0),
        Shop.Products("Phone", "Electronics", 4.8, 800.0),
        Shop.Products("Tablet", "Electronics", 4.7, 600.0),
        Shop.Products("Desk", "Furniture", 4.5, 150.0),
        Shop.Products("Chair", "Furniture", 4.5, 100.0)
    )
    val group = products_2.groupBy { it.type }.mapValues { (_, products) -> products
        .maxWith(compareBy<Shop.Products> { it.rating }.thenBy { it.price }.thenBy { it.device })
    }
    println("group: $group")
}

data class Product(val name: String, val price: Double, val rating: Double)
data class Student(val name: String, val subject: String, val score: Int)
data class Employee(val name: String, val department: String, val experience: Int)
data class EmployeeWithSalary(val name: String, val salary: Int)
data class Player(val name: String, val score: Int, val level: Int)
class Staff {
    data class Employee(val name: String, val department: String, val experience: Int)
}
class Shop {
    data class Products(val device: String, val type: String, val rating: Double, val price: Double)
}