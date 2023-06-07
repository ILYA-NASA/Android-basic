object Converters {

    fun get(currencyCode: String, amount: Double) = when (currencyCode) {
        "840" -> DollarConverter().convertRub(amount)
        "978" -> EuroConverter().convertRub(amount)
        "156" -> YuanConverter().convertRub(amount)
        else -> invalidConverter.convertRub(amount)
    }
}