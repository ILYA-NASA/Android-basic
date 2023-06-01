class FirstCreditCard : CreditCard() {
    override fun getBenefitInfo() = """
        Bonus points in the amount of 1%
        of purchases are equal to ${purchase * BONUS}
        """.trimIndent()

    companion object {
        private const val BONUS = 0.01
    }
}