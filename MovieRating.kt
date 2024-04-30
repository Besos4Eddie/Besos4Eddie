import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Enter movie rating and age
    println("Enter the movie rating (G, PG, PG-13, R, or NC-17): ")
    val movieRating = scanner.nextLine()
    println("Enter your age: ")
    val age = scanner.nextInt()

    // The user is allowed to watch the movie
    val allowed = isAllowedToWatch(movieRating, age)

    // Display the result
    if (allowed) {
        println("You are allowed to watch the movie.")
    } else {
        println("Sorry, you are not allowed to watch the movie.")
    }
}

fun isAllowedToWatch(movieRating: String, age: Int): Boolean {
    return when (movieRating.toUpperCase()) {
        "G", "PG" -> true
        "PG-13" -> age >= 13
        "R", "NC-17" -> age >= 17
        else -> false
    }
}
