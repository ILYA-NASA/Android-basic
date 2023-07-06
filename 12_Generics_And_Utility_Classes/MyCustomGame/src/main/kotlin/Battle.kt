class Battle(
    private val firstTeam: Team,
    private val secondTeam: Team,
) {
    var gameContinues = true

    private fun getBattleState(team: Team) = BattleState.Progress.getInfo(team)

    fun makeBattleIteration() {
        var firstTeamWarrior = firstTeam.getRandomWarrior()
        var secondTeamWarrior = secondTeam.getRandomWarrior()
        if (firstTeamWarrior.isKilled || secondTeamWarrior.isKilled) {
            firstTeamWarrior = firstTeam.getRandomWarrior()
            secondTeamWarrior = secondTeam.getRandomWarrior()
        }
        firstTeamWarrior.makeAttack(secondTeam.getRandomWarrior())
        println(getBattleState(firstTeam))
        secondTeamWarrior.makeAttack(firstTeam.getRandomWarrior())
        println(getBattleState(secondTeam))
        gameContinues = firstTeam.isNotDestroyed() || secondTeam.isNotDestroyed()
    }
}
