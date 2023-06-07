class DollarConverter : CurrencyConverter {
    override val currencyCode: String
        get() = "840"

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 81.2502
    }
}