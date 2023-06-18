import kotlin.random.Random

fun main() {
    val pistol = Weapons.createPistol()
}

fun Int.getRandomChance() = this >= Random.nextInt(100)