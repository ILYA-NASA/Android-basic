class SecondDebitCard : DebitCard() {
    override fun getBenefitInfo() = """
        Accumulation in the amount of 0.005%
        of the amount of deposits is equal to ${balance * SAVINGS}
        """.trimIndent()

    companion object {
        private var SAVINGS = 0.005
    }
}