package lesson4

fun main() {
    val myCard = CreditCard(
        number = "5555 2222 5555 3313",
        cvv = 101,
        date = "16/22"
    )

    println(myCard.getNumber())
}

class CreditCard(
    private val number: String, // 0000 0000 0000 0000
    private val cvv: Int,
    val date: String
) {
    fun getNumber(): String {
        val result: List<String> = number.split(" ")

        val hiddenNumber: String = result.mapIndexed { index, s -> // 0000 **** **** 0000
            if (index == 0 || index == result.lastIndex) {
                s
            } else {
                "****"
            }
        }.joinToString(" ")

        return hiddenNumber
    }
}


