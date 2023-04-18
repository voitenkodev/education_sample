package lesson2

import kotlin.random.Random

fun main() {
    val ingredients = Ingredients(coffe = 3, milk = 2, shugga = 0)
    println("Здравствуйте, что предпочитаете?")

    val allCoffee = listOf(
        Coffee("Американо", false),
        Coffee("Капучино", true),
        Coffee("Эспрессо", false),
        Coffee("Лате", true),
        Coffee("Раф", true),
        Coffee("Фильтр", false),
    )

    if (ingredients.milk > 0) {
        println("Мы можем приготовить любой кофе!")
        // val randomIndex = (allCoffee.indices).random()
//        val randomIndex = (0 until allCoffee.size).random()
        val randomIndex = Random.nextInt(allCoffee.lastIndex)
        val answer1 = allCoffee[randomIndex]
        println(answer1)
    } else {
        println("К сожалению, у нас закончилось молоко. Мы можем предложить только Американо или Эспрессо.")
        val availableCoffee = allCoffee.filter { it.isNeedMilk == false }

        val randomIndex = Random.nextInt(availableCoffee.lastIndex)
        val answer1 = availableCoffee[randomIndex]
        println(answer1.name)
    }
}

data class Coffee(
    val name: String,
    val isNeedMilk: Boolean
)

data class Ingredients(
    var coffe: Int,
    var milk: Int,
    var shugga: Int
)

