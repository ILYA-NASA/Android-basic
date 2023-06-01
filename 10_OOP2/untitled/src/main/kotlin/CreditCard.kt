open class CreditCard : BankCard() {
    private var creditPart = CREDIT_LIMIT
    private var ownPart = 0.0
    override var balance = creditPart + ownPart
    override var purchase = 0.0
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
            ownPart >= money -> {
                ownPart -= money
                purchase += money
            }
            ownPart > 0.0 && creditPart >= money - ownPart -> {
                ownPart = 0.0
                creditPart -= money - ownPart
                purchase += money

            }
            ownPart == 0.0 && creditPart >= money -> {
                creditPart -= money
                purchase += money
            }
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

    override fun getBenefitInfo() = "Not benefit"

    companion object {
        private const val CREDIT_LIMIT = 10_000.0
    }
}