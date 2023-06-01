class DebitCard : BankCard() {
    override var balance: Double = 0.0

    override fun addMoney(money: Double) {
        balance += money
    }

    override fun toPay(money: Double) {
        if (balance >= money) balance -= money
        else {
            println("PAYMENT REJECTED!")
            return
        }
    }

    override fun getCardBalanceInfo() = "Debit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds debit card equal $balance"
}