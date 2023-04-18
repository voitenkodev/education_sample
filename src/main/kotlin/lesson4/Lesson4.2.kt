package lesson4

fun main() {

    val carFactory = CarFactory()

}

class CarFactory {

    fun buildCar() {
        // ... some logic
        buildMotor()

        buildWheel()
        buildWheel()
        buildWheel()
        buildWheel()
    }

    private fun buildMotor(){
    }

    private fun buildWheel(){
    }
}