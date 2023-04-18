package lesson3

fun main() {
//    var myAge = 0
//    while (myAge < 18) {
//        println("Я еще маленький, мне $myAge лет, я не могу пить")
//        myAge++
//    }
//    println("Я могу пить")

    var myAge = 0
    do {
        println("Я еще маленький, мне $myAge лет, я не могу пить")
        myAge++
    } while (myAge < 18)
    println("Я могу пить")

}