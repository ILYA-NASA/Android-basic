abstract class BankCard {
    abstract val balance: Double

    abstract fun replenishBalance(amountMoney: Double)
    abstract fun toPay(amountMoney: Double)
    abstract fun getCardBalanceInfo(): String
    abstract fun getAllFundsInfo(): String
}