fun main(args: Array<String>) {
    val wheel = Wheel(
        size = 21.0,
        brand = "WHEEL_BRAND",
        isSnow = true
    )

    val myCar = Car(
        wheels = listOf(wheel, wheel, wheel, wheel),
        model = "Passat",
        brand = "Volkswagen",
        color = "Gray",
        motor = Motor(
            power = 280.0,
            brand = "Xiaomi",
            cilinderCount = 8
        )
    )
    println("color = ${myCar.color}")
    myCar.updateColor("Yellow")
    println("color = ${myCar.color}")

    val myFactory = Factory()

    val price = myFactory.calculatePriceOfCar(myCar)

    println("Count of wheels in my car: ${myCar.wheels.size}")
}

class Factory {

    fun calculatePriceOfCar(car: Car): Double {
        return 0.0
    }
}

data class Car(
    val wheels: List<Wheel>,
    val model: String,
    val brand: String,
    var color: String,
    val motor: Motor
) {

    fun updateColor(newColor: String) {
        color = newColor
    }
}

data class Motor(
    val power: Double,
    val brand: String,
    val cilinderCount: Int
)

data class Wheel(
    val size: Double,
    val brand: String,
    val isSnow: Boolean
)