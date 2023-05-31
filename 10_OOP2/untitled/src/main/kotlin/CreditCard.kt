class CreditCard : BankCard() {
    var creditPart = CREDIT_LIMIT
    var ownPart = 0.0
    override var balance = creditPart + ownPart
    override fun addMoney(amountMoney: Double) {
        if (creditPart <= CREDIT_LIMIT - amountMoney) creditPart += amountMoney
        else ownPart += amountMoney
        balance = creditPart + ownPart
    }

    override fun toPay(amountMoney: Double) {
        when {
            ownPart >= amountMoney -> ownPart -= amountMoney
            creditPart >= amountMoney -> creditPart -= amountMoney
            else -> {
                println("There is not enough money on the credit card")
                return
            }
        }
        balance = creditPart + ownPart
    }

    override fun getCardBalanceInfo(): String = "Credit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds equal ${balance + DebitCard().balance}" //TODO добиться вывода общего баланса

    fun getCreditLimit() = CREDIT_LIMIT

    companion object {
        const val CREDIT_LIMIT = 10_000.0
    }
}