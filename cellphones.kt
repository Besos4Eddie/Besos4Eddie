class CellPhones(val brand: String, val model: String, val price: String) {
    fun displayInfo() {
        println("$brand\n$model\n$$price")
    }
}

fun main() {
    val cp1 = CellPhones("Samsung", "Galaxy S24", "799")
    val cp2 = CellPhones("Apple", "iPhone 14", "1,200")

    cp1.displayInfo()
    println()
    cp2.displayInfo()
}

