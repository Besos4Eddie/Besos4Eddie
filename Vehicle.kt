class Vehicle(var vehicle: String, var model: String, var year: String ) {
    fun drive(vehicle: Vehicle) {
        println("My new vehicle:")
    }
}

fun main() {
    val b1 = Vehicle("Ferrari", "La Ferrari" , "2022")

    println(b1.vehicle)
    println(b1.model)
    println(b1.year)
}

