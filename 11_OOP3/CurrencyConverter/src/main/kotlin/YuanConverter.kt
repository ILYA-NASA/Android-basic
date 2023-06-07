class YuanConverter : CurrencyConverter {
    override val currencyCode: String
        get() = "156"

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 11.3892
    }
}