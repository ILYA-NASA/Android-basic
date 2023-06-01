abstract class BankCard {
    protected abstract val balance: Double

    abstract fun addMoney(money: Double)
    abstract fun toPay(money: Double)
    abstract fun getCardBalanceInfo(): String
    abstract fun getAllFundsInfo(): String
}