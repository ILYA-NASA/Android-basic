abstract class BankCard {
    abstract val balance: Double

    abstract fun replenishBalance()
    abstract fun toPay()
    abstract fun getBalanceInfo()
    abstract fun getAvailableFundsInfo()
}