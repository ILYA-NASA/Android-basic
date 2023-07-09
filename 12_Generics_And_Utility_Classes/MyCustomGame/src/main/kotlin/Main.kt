fun main() {
    println("Please, enter the number of warriors for each teams: ")
    val sizeTeam = readln().toInt()
    val firstTeam = Team(sizeTeam)
    val secondTeam = Team(sizeTeam)
    BattleState.TeamContent.getInfo(firstTeam, secondTeam)
    val battle = Battle(firstTeam, secondTeam)
    var roundCount = 1
    while (battle.gameContinues) {
        println("ROUND №$roundCount")
        battle.makeBattleIteration()
        roundCount++
        println("---------------------------------")
    }
    when {
        firstTeam.isDestroyed() && secondTeam.isDestroyed() -> println(BattleState.DrawnGame.getInfo())
        firstTeam.isDestroyed() -> println(BattleState.SecondTeamWin.getInfo())
        secondTeam.isDestroyed() -> println(BattleState.FirstTeamWin.getInfo())
    }
    BattleState.TeamContent.getInfo(firstTeam, secondTeam)
}