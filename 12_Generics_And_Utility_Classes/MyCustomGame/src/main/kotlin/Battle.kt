class Battle(
    val firstCommand: Team,
    val secondCommand: Team
) {
    val gameOver = false

    fun getBattleState() = BattleState.Progress
    fun getResult() {}
}
