fun main(args: Array<String>) {

    val calculator = Calculator()


    println(calculator.div(a = 6, b = 3))

    println(calculator.minus(6, 2))
}


class Calculator {

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun div(a: Int, b: Int): Int {
        return a / b
    }

    fun mult(a: Int, b: Int): Int {
        return a * b
    }
}


