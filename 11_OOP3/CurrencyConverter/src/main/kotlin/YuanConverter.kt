class YuanConverter : CurrencyConverter {
    override val currencyCode: String
        get() = "156"

    override fun convertRub(sum: Double): Double = sum * RATE

    companion object {
        const val RATE = 11.3892
    }
}