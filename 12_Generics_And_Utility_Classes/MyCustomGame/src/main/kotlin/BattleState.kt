sealed class BattleState {
    object Progress : BattleState() {
        fun getInfo(team: Team) = """
            There are ${team.getCountWarriorsTeam()} alive warriors in the team
            The sum of their health is ${team.getSumHealthTeam()}
        """.trimIndent()
    }

    object FirstTeamWin : BattleState() {
        fun getInfo() = "FIRST TEAM WIN!"
    }

    object SecondTeamWin : BattleState() {
        fun getInfo() = "SECOND TEAM WIN!"
    }

    object DrawnGame : BattleState() {
        fun getInfo() = "DRAWN GAME!"
    }

    object TeamContent : BattleState() {
        fun getInfo(firstTeam: Team, secondTeam: Team) {
            println()
            println("First team warriors:")
            firstTeam.printWarriors()
            println()
            println("Second team warriors:")
            secondTeam.printWarriors()
            println()
        }
    }
}