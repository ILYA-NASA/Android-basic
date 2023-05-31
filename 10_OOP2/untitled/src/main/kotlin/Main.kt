fun main() {
    val debitCard = DebitCard()
    println(debitCard.getCardBalanceInfo())
    debitCard.addMoney(5000.0)
    println("After topping up the card by 5 000:\n"
            + debitCard.getCardBalanceInfo())

    println()
    val creditCard = CreditCard()
    println("Credit card with limit of ${creditCard.getCreditLimit()}")
    creditCard.addMoney(5000.0)
    println("After topping up the card by 5 000:\n" +
            "Credit part equal ${creditCard.creditPart}\n" +
            "Own part equal ${creditCard.ownPart}")
    println()
    creditCard.toPay(5000.0)
    println("After payment by 5 000:\n" +
            "Credit part equal ${creditCard.creditPart}\n" +
            "Own part equal ${creditCard.ownPart}")
    println()
    creditCard.toPay(3000.0)
    println("After payment by 3 000:\n" +
            "Credit part equal ${creditCard.creditPart}\n" +
            "Own part equal ${creditCard.ownPart}")
    println()
    creditCard.addMoney(2000.0)
    println("After topping up the card by 2 000:\n" +
            "Credit part equal ${creditCard.creditPart}\n" +
            "Own part equal ${creditCard.ownPart}")
    println()
    creditCard.addMoney(2000.0)
    println("After topping up the card by 2 000:\n" +
            "Credit part equal ${creditCard.creditPart}\n" +
            "Own part equal ${creditCard.ownPart}")
}