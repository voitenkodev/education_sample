package lesson2// Условия (Мы заведома не знаем точно)
// Циклы (Для неограниченного кол-ва данных)
// null - не существует данных
// val myName: String? = null
// 1 '&&' 2 - один и два
// 1 '||' 2 - один или два


fun main(args: Array<String>) {

    val personal = Personal(
        boss = Human("Nickita", 1000.0),
        waiters = listOf(Human("Vasya", 100.0), Human("Misha", 120.0)),
        managers = listOf(Human("Petya", 200.0)),
        securities = listOf(Human("Denis", 80.0))
    )

    val cafe = Cafe(
        personal = personal,
        income = 10000.0
    )
}

class Cafe(
    val personal: Personal,
    val visitors: List<String> = emptyList(),
    var income: Double
) {

    fun presentDish(): Dish? {
        val result = if (personal.waiters.size > 0) {
            Dish(ingredients = listOf("Salad", "Fish", "Sugar"))
        } else {
            null
        }
        return result
    }

    fun canOpenCafe(): Boolean {
        return if (personal.waiters.size > 0 && personal.managers.size > 0 && personal.securities.size > 0) {
            true
        } else {
            false
        }
    }

    fun canCloseCafe(): Boolean {
        return if (getCurrentHours() > 20 || (getCurrentHours() > 18 && visitors.size == 0)) {
            true
        } else {
            false
        }
    }

    fun getCurrentHours(): Int {
        return 12
    }
}

class Dish(
    val ingredients: List<String>
)

class Personal(
    val boss: Human,
    val waiters: List<Human>,
    val managers: List<Human>,
    val securities: List<Human>
) {

    fun isPossibleToShareSalary(income: Double): Boolean {
        val bossSalary = boss.salary
        val waitersSalary = waiters.sumOf { waiter -> waiter.salary }
        val managerSalary = managers.sumOf { manager -> manager.salary }
        val securitiesSalary = securities.sumOf { security -> security.salary }
        val total = bossSalary + waitersSalary + managerSalary + securitiesSalary
        return if (total <= income) {
            true
        } else {
            false
        }
    }

}

class Human(
    val name: String,
    val salary: Double
)