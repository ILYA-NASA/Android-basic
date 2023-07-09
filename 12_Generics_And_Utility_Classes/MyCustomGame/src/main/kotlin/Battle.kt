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
        println(
            "FIRST TEAM $firstTeamWarrior\nATTACKED\nSecond team $secondTeamWarrior\nState SECOND TEAM:\n${
                getBattleState(secondTeam)
            }\n"
        )
        if (secondTeamWarrior.isKilled) {
            if (secondTeam.isDestroyed()) gameContinues = false
            return
        } else {
            secondTeamWarrior.makeAttack(firstTeamWarrior)
            println(
                "SECOND TEAM $secondTeamWarrior\nATTACKED\nFirst team $firstTeamWarrior\nState FIRST TEAM:\n${
                    getBattleState(firstTeam)
                }\n"
            )
        }
        if (firstTeam.isDestroyed() || secondTeam.isDestroyed()) gameContinues = false
    }
}
