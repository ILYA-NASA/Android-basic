fun main() {
    val debitCard = DebitCard()
    debitCard.replenishBalance(1_000.0)
    println(debitCard.getCardBalanceInfo())

    val creditCard = CreditCard()
    creditCard.replenishBalance(20_000.0)
    println(creditCard.ownPart)
    creditCard.toPay(30_000.0)
    println(creditCard.ownPart)
    println(creditCard.getCardBalanceInfo())
    println(creditCard.getAllFundsInfo())
}