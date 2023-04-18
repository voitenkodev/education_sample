package lesson4

fun main() {
    val workWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    val shortWorkWeek = workWeek.map {
        it.substring(0, 3) // 0 1 2 (по третий - не включительно)
    }

   println(shortWorkWeek)
}