import kotlin.math.roundToInt

fun main() {
    println(roundToHundredths(DollarConverter().convertRub(10.0)))
    println(roundToHundredths(EuroConverter().convertRub(10.0)))
    println(roundToHundredths(YuanConverter().convertRub(10.0)))
}

fun roundToHundredths(arg: Double) = (arg  * 100.0).roundToInt() / 100.0