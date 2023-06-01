class FirstDebitCard : DebitCard() {
    override fun getBenefitInfo() = """
        Cashback of 5% of purchases provided
        spending more than 5,000 equal to ${if (purchase >= MIN_SUM_FOR_CASHBACK) purchase * CASHBACK else 0.0}
        """.trimIndent()

    companion object {
        private const val CASHBACK = 0.05
        private const val MIN_SUM_FOR_CASHBACK = 5_000.0
    }
}