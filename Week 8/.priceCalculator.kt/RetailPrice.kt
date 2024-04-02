fun main() {
    println("Enter the wholesale cost of the item:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input for wholesale cost.")
        return
    }

    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input for markup percentage.")
        return
    }

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * (markupPercentage / 100)
    return wholesaleCost + markupAmount
}
