abstract class BankCard {
    protected abstract var balance: Double
    protected abstract var purchase: Double

    abstract fun addMoney(money: Double)
    abstract fun toPay(money: Double)
    abstract fun getCardBalanceInfo(): String
    abstract fun getAllFundsInfo(): String
    abstract fun getBenefitInfo(): String
}