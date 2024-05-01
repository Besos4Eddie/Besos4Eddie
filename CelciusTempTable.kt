fun celsius(fahrenheit: Double): Double {
    return (5.0 / 9.0) * (fahrenheit - 32)
}
fun main() {
    println("Fahrenheit  Celsius")
    println("---------------------")
    for (f in 0..20) {
        val c= celsius(f.toDouble())
        println("$f°F        ${"%.2f".format(c)}°C")
    }
}

Variables and constant code:

fun main() {
    println("The hero announces her presence to the world.")

    val heroName: String = "Madrigal"
    println(heroName)

    var playerLevel: Int = 4
    println(playerLevel1)


    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
