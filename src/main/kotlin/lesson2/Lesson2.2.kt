package lesson2

import kotlin.random.Random

// When

fun main(args: Array<String>) {
    val a = Random.nextInt(10)

    // Аналогичиеное можно написать в When ->
    if (a == 1) {
        println("Hello 1")
    } else if (a == 2) {
        println("Hello 2")
    } else if (a == 3) {
        println("Hello 3")
    } else {
        println("Hello else")

    }

    // Аналог

    when (a) {
        1 -> {
            println("Hello 1")
        }

        2 -> {
            println("Hello 2")
        }

        3 -> {
            println("Hello 3")
        }

        else -> {
            println("Hello else")
        }
    }

    // Аналог
    when (a) {
        1 -> println("Hello 1")
        2 -> println("Hello 2")
        3 -> println("Hello 3")
        else -> println("Hello else")
    }

    val myName = "Alex"

    when {
        myName.length > 0 -> {

        }
        myName == "Max" -> {

        }
        a > 0 -> {

        }
        else -> {

        }
    }
}