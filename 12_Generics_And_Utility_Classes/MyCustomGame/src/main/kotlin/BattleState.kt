sealed class BattleState {
    object Progress : BattleState() {
        fun getInfo(team: Team) = """
            There are ${team.getCountWarriorsTeam()} alive warriors in the team
            The sum of their health is ${team.getSumHealthTeam()}
        """.trimIndent()
    }

    object FirstTeamWin : BattleState() {
        fun getInfo() = "First team potential win"
    }

    object SecondTeamWin : BattleState() {
        fun getInfo() = "Second team potential win"
    }

    object DrawnGame : BattleState() {
        fun getInfo() = "Potential drawn game"
    }
}