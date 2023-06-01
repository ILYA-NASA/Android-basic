open class DebitCard : BankCard() {
    override var balance = 0.0
    override var purchase = 0.0
    override fun addMoney(money: Double) {
        balance += money
    }

    override fun toPay(money: Double) {
        if (balance >= money) {
            balance -= money
            purchase += money
        }
        else {
            println("PAYMENT REJECTED!")
            return
        }
    }

    override fun getCardBalanceInfo() = "Debit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds debit card equal $balance"
    override fun getBenefitInfo() = "Not benefit"
}