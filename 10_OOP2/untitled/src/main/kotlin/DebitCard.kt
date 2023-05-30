class DebitCard: BankCard() {
    override var balance: Double = 0.0

    override fun replenishBalance(amountMoney: Double) {
        balance += amountMoney
    }

    override fun toPay(amountMoney: Double) {
        balance -= amountMoney
    }

    override fun getCardBalanceInfo() = "Debit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds equal ${balance + CreditCard().balance}"
}