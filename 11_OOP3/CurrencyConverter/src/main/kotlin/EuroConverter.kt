class EuroConverter : CurrencyConverter {
    override val currencyCode: String
        get() = "978"

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 86.9519
    }
}