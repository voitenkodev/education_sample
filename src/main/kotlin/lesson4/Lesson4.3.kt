package lesson4

// const - константа (константное значение),неизменное никогда
// оптимизация (для констант выделяется память при старте приложения)
const val myName = "Nick"

fun main() {
    val home = Home()
    home.floor
    home.openBasement()
}

class Home {

    val floor: Int = 5

    fun openBasement() {
        val myNumber: Int = 55
    }

    fun asd(){
//        myNumber = не могу использовать, она в другой части иерахии (в другом методе)
    }
}