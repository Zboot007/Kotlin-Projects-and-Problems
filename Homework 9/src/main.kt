class Employee(
    name: String = "Guest",
    surname: String = "!",
    age: Int = 10,
    job: String = "Barmen",
    salary: Int = 10000
) {
    var name = name
        get() = field
        set(name) {
            field = if(name.length in 2..15)
                name
            else
                "Wrong name!"
        }
    var surname = surname
        get() = field
        set(surname) {
            field = if(surname.length in 5..20)
                surname
            else
                "Wrong surname!"
        }
    var age = age
        get() = field
        set(age) {
            field = if(age in 0..90)
                age
            else
                -1
        }
    var job = job
        get() = field
        set(job) {
            field = if (job.length in 1..25)
                job
            else
                "Wrong job!"
        }
    var salary = salary
        get() = field
        set(salary) {
            field = if(salary == 0 || salary < 0)
                1
            else
                salary
        }
    fun show(): String {
        var show = "Name: $name, Surname: $surname, Age: $age, Job: $job, Salary: $salary"
        return show
    }
}
class Cafe {
    private val employees = mutableListOf<Employee>()
    fun addEmployee(employee: Employee) {
        if(employee !in employees)
            employees += employee
        else
            println("Employee exist in staff!")
    }
    fun removeEmployee(employee: Employee) {
        if(employee in employees)
            employees -= employee
        else
            println("Employee doesn't exist in staff!")
    }
    fun addBonus(salary: Int, employee: Employee) {
        if(salary > 0)
            employee.salary += salary
        else
            println("Salary cannot be subtracted!")
    }
    fun showEmployees() {
        for(employee in employees)
            println(employee.show())
    }
}
fun main() {
    val cafe = Cafe()
    val employee_1 = Employee("Abricos", "Abricosov", 23, "Employee", 65000)
    val employee_2 = Employee("Maks", "Alexsov", 28, "Chef", 100000)
    val employee_3 = Employee("Руслан", "Фёдоров", 45, "Barmen", 25000)
    val employee_4 = Employee("Максим", "Аншаков", 35, "Waiter", 30000)
    val employee_5 = Employee("Станислав", "Стас", 29, "Waiter", 50000)
    val employee_6 = Employee("Лена", "Леновна", 67, "Waiter", 35000)
    val employee_7 = Employee("Максим", "Аншаков", 24, "Barmen", 80000)
    val employee_8 = Employee("Абдуворис", "Абдуворисов", 19,"Chef", 95000)
    cafe.addEmployee(employee_1)
    cafe.addEmployee(employee_2)
    cafe.addEmployee(employee_3)
    cafe.addEmployee(employee_4)
    cafe.addEmployee(employee_5)
    cafe.addEmployee(employee_6)
    cafe.addEmployee(employee_7)
    cafe.addEmployee(employee_8)
    cafe.showEmployees()
    println("Removed!")
    cafe.removeEmployee(employee_3)
    cafe.removeEmployee(employee_4)
    cafe.removeEmployee(employee_5)
    cafe.removeEmployee(employee_6)
    cafe.removeEmployee(employee_7)
    cafe.removeEmployee(employee_8)
    cafe.showEmployees()
    println("Added bonus!")
    cafe.addBonus(5555, employee_2)
    cafe.showEmployees()
}