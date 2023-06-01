class CreditCard : BankCard() {
    private var creditPart = CREDIT_LIMIT
    private var ownPart = 0.0
    override var balance = creditPart + ownPart
    override fun addMoney(money: Double) {
        val debt = CREDIT_LIMIT - creditPart
        if (debt >= money) creditPart += money
        else {
            creditPart += debt
            ownPart += money - debt
        }
        balance = creditPart + ownPart
    }

    override fun toPay(money: Double) {
        when {
            ownPart >= money -> ownPart -= money
            ownPart > 0.0 && creditPart >= money - ownPart -> {
                ownPart = 0.0
                creditPart -= money - ownPart
            }
            ownPart == 0.0 && creditPart >= money -> creditPart -= money
            else -> {
                println("PAYMENT REJECTED!")
                return
            }
        }
        balance = creditPart + ownPart
    }

    override fun getCardBalanceInfo(): String = "Credit card balance equal $balance"

    override fun getAllFundsInfo(): String = """
    Credit card limit equal $CREDIT_LIMIT
    Credit part equal $creditPart
    Own part equal $ownPart""".trimIndent()

    companion object {
        const val CREDIT_LIMIT = 10_000.0
    }
}