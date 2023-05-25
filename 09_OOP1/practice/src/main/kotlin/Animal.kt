import kotlin.random.Random

open class Animal(
    private var energy: Int,
    private var weight: Int,
    private var currentAge: Int,
    private val maxAge: Int,
    protected val name: String,
): NatureReserve() {
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

    open fun move(message: String = "$name moving") {
        if (!isTooOld || energy >= 5 || weight >= 1) {
            energy -= 5
            weight--
            currentAge = if (tryIncrementAge()) +1 else currentAge
            println(message)
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
        weight: Int = Random.nextInt(1, 5),
        currentAge: Int,
        maxAge: Int = this.maxAge,
        name: String = this.name,
    ): Animal {
        println(
            """
        Another $name was born,
        its energy is equal to $energy,
        weight $weight kg,
        current age $currentAge years,
        maximum age $maxAge years.
    """.trimIndent()
        )
        return Animal(energy, weight, currentAge, maxAge, name)
    }

    private fun tryIncrementAge() = Random.nextBoolean()
}