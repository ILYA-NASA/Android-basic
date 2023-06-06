class DollarConverter : CurrencyConverter {
    override val currencyCode: String
        get() = "840"

    override fun convertRub(sum: Double): Double = sum * RATE

    companion object {
        const val RATE = 81.2502
    }
}