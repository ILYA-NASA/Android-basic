import kotlin.random.Random

fun main() {
    println(5.getRandom())
    println(50.getRandom())
    println(100.getRandom())
}

fun Int.getRandom() = this > Random.nextInt(100)