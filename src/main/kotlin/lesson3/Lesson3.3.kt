package lesson3

// Unit - это когда ничего не возвращает
// Any - это любой тип
// Nothing - это тип - обозначающий некую остановку кода - путем ошибки

fun main() {
    val result = doSomething7()
    println(result)
}

fun doSomething(): Int {
    return 4
}

fun doSomething2(): String {
    return "Hello"
}

// ________ UNIT ________
fun doSomething3(): Unit {
}

fun doSomething4() {
}

// ________ ANY ________
fun doSomething5(): Any {
    return 2
}

fun doSomething6(): Any {
    return "Hello my Any"
}

fun doSomething7(): Any {
    return MySuperMegaClass("Max")
}

data class MySuperMegaClass(
    val myName: String
)

// ________ NOTHING ________
// попытавшись вызвать этот метод - он покажет что возвращает nothing
//fun doNothing() = return