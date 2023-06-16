import kotlin.random.Random

fun main() {
    println(5.getRandomChance())
    println(50.getRandomChance())
    println(100.getRandomChance())
}

fun Int.getRandomChance() = this >= Random.nextInt(100)