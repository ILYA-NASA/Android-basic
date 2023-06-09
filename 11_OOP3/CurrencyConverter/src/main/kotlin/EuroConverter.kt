class EuroConverter : CurrencyConverter {
    override val currencyCode: String
        get() = CODE

    override fun convertRub(amount: Double): Double = amount * RATE

    companion object {
        const val RATE = 86.9519
        const val CODE = "978"
    }
}