import kotlin.random.Random

fun main() {
    val general = General()
    println(general.isKilled)
}

fun Int.getRandomChance() = this >= Random.nextInt(100)