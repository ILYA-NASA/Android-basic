class Wheel() {
    private var currentPressure = MIN_PRESSURE
    private val permissiblePressure = MIN_PERMISSIBLE_PRESSURE..MAX_PERMISSIBLE_PRESSURE


    fun pumpUp(pressure: Double) {
        return when {
            pressure < MIN_PRESSURE -> throw TooLowPressure()
            pressure > MAX_PRESSURE -> throw TooHighPressure()
            else -> currentPressure += pressure
        }
    }

    fun getPressure() {
        if (currentPressure in permissiblePressure) println("Current pressure = $currentPressure")
        else throw IncorrectPressure()
    }

    companion object {
        const val MIN_PRESSURE = 0.0
        const val MAX_PRESSURE = 10.0
        const val MIN_PERMISSIBLE_PRESSURE = 1.6
        const val MAX_PERMISSIBLE_PRESSURE = 2.5
    }
}