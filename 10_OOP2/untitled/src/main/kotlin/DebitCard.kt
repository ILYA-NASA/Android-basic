class DebitCard : BankCard() {
    override var balance: Double = 0.0

    override fun addMoney(amountMoney: Double) {
        balance += amountMoney
    }

    override fun toPay(amountMoney: Double) {
        if (balance >= amountMoney) balance -= amountMoney
        else {
            println("There is not enough money on the credit card")
            return
        }
    }

    override fun getCardBalanceInfo() = "Debit card balance equal $balance"

    override fun getAllFundsInfo() = "All funds equal ${balance + CreditCard().balance}"
}