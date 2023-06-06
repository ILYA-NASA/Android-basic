interface CurrencyConverter {
    val currencyCode: String
    fun convertRub(sum: Double): Double
}