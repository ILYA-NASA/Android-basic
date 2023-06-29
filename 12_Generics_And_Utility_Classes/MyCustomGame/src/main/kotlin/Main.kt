fun main() {
    val firstTeam = Team(2)
    val secondTeam = Team(2)
    firstTeam.printWarriors()
    secondTeam.printWarriors()
    val battle = Battle(firstTeam, secondTeam)
    repeat(3) { battle.makeBattleIteration() }
}