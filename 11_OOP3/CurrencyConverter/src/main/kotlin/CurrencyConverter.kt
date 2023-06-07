interface CurrencyConverter {
    val currencyCode: String
    fun convertRub(amount: Double): Double
}