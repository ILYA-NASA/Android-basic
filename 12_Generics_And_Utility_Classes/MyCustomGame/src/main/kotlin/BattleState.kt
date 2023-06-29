sealed class BattleState {
    object Progress : BattleState() {
        fun getInfo(team: Team) = """
            There are ${team.getCountWarriorsTeam()} alive warriors in the team
            The sum of their health is ${team.getSumHealthTeam()}
        """.trimIndent()
    }

    object FirstTeamWin : BattleState()
    object SecondTeamWin : BattleState()
    object DrawnGame : BattleState()
}