fun main() {
    print("Please input pressure: ")
    val pressure = readln().toDouble()
    val wheel = Wheel()
    try {
        wheel.pumpUp(pressure)
        println("Procedure successful")
        val correctPressure = runCatching { wheel.getPressure() }
        if (correctPressure.isSuccess) println("Operation is possible")
        else println("Operation is impossible")
    } catch (e: Throwable) {
        println("Procedure failed")
    }
}