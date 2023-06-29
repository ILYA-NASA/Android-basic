class Battle(
    private val firstTeam: Team,
    private val secondTeam: Team,
) {
    val gameOver = false

    private fun getBattleState(team: Team) = BattleState.Progress.getInfo(team)

    fun makeBattleIteration() {
        firstTeam.getRandomWarrior().makeAttack(secondTeam.getRandomWarrior())
        println(getBattleState(firstTeam))
        secondTeam.getRandomWarrior().makeAttack(firstTeam.getRandomWarrior())
        println(getBattleState(secondTeam))
    }
}
