import kotlin.math.roundToInt

val invalidConverter = object : CurrencyConverter {
    override val currencyCode: String
        get() = "Invalid currency code"

    override fun convertRub(amount: Double) = amount
}

fun main() {
    println("Please, input currency amount: ")
    val amountCurrency = readln().toDouble()

    val convertedDollar = Converters.get("840", amountCurrency)
    printInfo(convertedDollar, amountCurrency, DollarConverter())
    val convertedEuro = Converters.get("978", amountCurrency)
    printInfo(convertedEuro, amountCurrency, EuroConverter())
    val convertedYuan = Converters.get("156", amountCurrency)
    printInfo(convertedYuan, amountCurrency, YuanConverter())
    val convertedInvalid = Converters.get("111", amountCurrency)
    printInfo(convertedInvalid, amountCurrency, invalidConverter)
}
private fun printInfo(result: Double, amount: Double, code: CurrencyConverter) {
    val roundToHundredths = (result * 100.0).roundToInt() / 100.0
    println("$roundToHundredths = $amount %${code.currencyCode}%")
}