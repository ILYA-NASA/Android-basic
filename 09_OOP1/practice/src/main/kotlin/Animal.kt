import kotlin.random.Random

open class Animal(
    private var energy: Int,
    private var weight: Double,
    private var currentAge: Int,
    private val maxAge: Int,
    private val name: String,
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

    open fun move() {
        if (!isTooOld && energy > 5 && weight > 1) {
            energy = -5
            weight--
            currentAge = if (tryIncrementAge()) +1 else currentAge
            println("$name moving")
        }
    }

    fun printInfo() = println(
        """
        This animal is name $name,
        its energy is equal to $energy,
        weight $weight kg,
        current age $currentAge years,
        maximum age $maxAge years.
    """.trimIndent()
    )

    open fun giveOffspring(
        energy: Int = Random.nextInt(1, 10),
        weight: Double = Random.nextDouble(1.0, 5.0),
        currentAge: Int,
        maxAge: Int = this.maxAge,
        name: String = this.name,
    ) {
        println(
            """
        Another $name was born,
        its energy is equal to $energy,
        weight $weight kg,
        current age $currentAge years,
        maximum age $maxAge years.
    """.trimIndent()
        )
    }

    private fun tryIncrementAge() = Random.nextBoolean()
}