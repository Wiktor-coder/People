fun main() {
    val humans = 1..Int.MAX_VALUE step 10
    val likes = 4141

    val lastTwoDigits = likes % 100  // Последние две цифры (Int)
    val lastDigit = likes % 10       // Последняя цифра (Int)

    // Проверяем особые случаи
    val isSpecialCase = lastTwoDigits in 11..14

    if (likes !in humans) {
        println("Понравилось $likes людям")
    } else if (isSpecialCase) {
        println("Понравилось $likes людям")
    } else if (lastDigit == 1) {
        println("Понравилось $likes человеку")
    }
}