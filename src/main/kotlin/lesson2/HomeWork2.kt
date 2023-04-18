package lesson2

import kotlin.random.Random

fun main() {
    val x = Random.nextInt(50)
    val y = Random.nextInt(50)

    val znak = arrayOf("+", "-", "*", "/")
    val randomZnak = znak.random()
    val result = when (randomZnak) {
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> x / y
        else -> throw IllegalArgumentException("Неизвестный оператор: $randomZnak")}

    val z = result


    if (z > 100) {
        println("Дохуя")
    } else if (z < 0) {
        println("Нихуя")
    } else {
        println(z)
    }

    }

