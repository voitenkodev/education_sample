package lesson2

import kotlin.random.Random

fun main(args: Array<String>) {
    val a = 20
    val b = Random.nextInt(30)

    if (a > b) {
        println("a > b")
    } else if (a == b) {
        println("a == b")
    } else {
        println("else")
    }

    if (b < 10) {
        println("b < 10")
    }

    if (b < 20) {
        println("b < 20")
    }

    if (b < 4) {
        println("b < 4")
    }
}