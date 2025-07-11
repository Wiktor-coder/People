fun main() {
    val humans = 1..1_001 step 10
    val likes = 565
//
    if (likes !in humans) {
        println("Понравилось $likes людям")
    } else if (likes == 11  || likes == 111 ){
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }

}