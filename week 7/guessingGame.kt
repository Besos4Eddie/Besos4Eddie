
fun main() {
    var userInput: Int? = null
    while (userInput == null) {
        print("Guess the number!")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if ((userInput != null) && (userInput < 3)) {
                println("Too high, please tyr again.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Too low, please try again")
        }
    }
    println("You entered $userInput.")
}

