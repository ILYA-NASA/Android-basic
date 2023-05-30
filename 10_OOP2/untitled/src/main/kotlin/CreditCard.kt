class CreditCard : BankCard() {
    var creditPart = CREDIT_LIMIT
    var ownPart = 0.0
    override var balance = creditPart + ownPart
    override fun replenishBalance(amountMoney: Double) {
        if (creditPart < CREDIT_LIMIT) creditPart += amountMoney
        else ownPart += amountMoney
        balance = creditPart + ownPart
//        TODO("Не допустить превышение лимита")
    }

    override fun toPay(amountMoney: Double) {
        if (ownPart > 0) ownPart -= amountMoney
        else creditPart -= amountMoney
        balance = creditPart + ownPart
//        TODO("Не допустить списания в минус")
    }

    override fun getCardBalanceInfo(): String = "Credit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds equal ${balance + DebitCard().balance}" //TODO добиться вывода общего баланса

    companion object {
        const val CREDIT_LIMIT = 100_000.0
    }
}