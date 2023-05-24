import kotlin.random.Random

class Animal(
    var energy: Int,
    var weight: Double,
    var currentAge: Int,
    val maxAge: Int,
    val name: String,
) {
    private val isTooOld = currentAge >= maxAge

    fun sleep() {
        if (!isTooOld) {
            energy += 5
            currentAge++
            println("$name sleeping")
        }
    }

    fun eat() {
        if (!isTooOld) {
            energy += 3
            weight++
            println("$name eating")
        }
    }

    fun move() {
        if (!isTooOld && energy > 5 && weight > 1) {
            energy = -5
            weight--
            currentAge = if (tryIncrementAge()) +1 else currentAge
            println("$name moving")
        }
    }

    private fun tryIncrementAge() = Random.nextBoolean()
}