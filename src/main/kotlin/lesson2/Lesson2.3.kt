package lesson2// Циклы

fun main(args: Array<String>) {
    val names = listOf("Max", "Nick", "Vasya", "Petya", "Alla")
    names.forEach {

    }

    for (name in names) {
        if (name.length == 4) {
            println(name)
        }
    }

    val months = listOf(31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30)

    // посмотреть кол-во дней в летних месяцах (6, 7, 8)
    // p.s. индексы в списках считаются от нулевого числа [5, 6, 7]
    for (i in 5 until 8 step 1) {
        println(months[i])
    }

    months.forEach {
        println("month days $it")
    }

    months.forEachIndexed { index, month ->
        if (index in 5..7){
            println("summer month days $month")
        }
    }
}