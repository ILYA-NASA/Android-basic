class YuanConverter : CurrencyConverter {
    override val currencyCode: String
        get() = CODE

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 11.3892
        const val CODE = "156"
    }
}