class DollarConverter : CurrencyConverter {
    override val currencyCode: String
        get() = CODE

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 81.2502
        const val CODE = "840"
    }
}