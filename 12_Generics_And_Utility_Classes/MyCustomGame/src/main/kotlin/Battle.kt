class Battle(
    private val firstTeam: Team,
    private val secondTeam: Team,
) {
    var gameContinues = true

    private fun getBattleState(team: Team) = BattleState.Progress.getInfo(team)

    fun makeBattleIteration() {
        val firstTeamWarrior = firstTeam.getRandomAliveWarrior()
        val secondTeamWarrior = secondTeam.getRandomAliveWarrior()
        firstTeamWarrior.makeAttack(secondTeamWarrior)
        println("First attacked Second. State second team:\n${getBattleState(secondTeam)}\n")
        secondTeamWarrior.makeAttack(firstTeamWarrior)
        println("Second attacked First. State first team:\n${getBattleState(firstTeam)}")
        if (firstTeam.isDestroyed() || secondTeam.isDestroyed()) gameContinues = false
    }
}
