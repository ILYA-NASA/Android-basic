fun main() {
    val firstTeam = Team(5)
    val secondTeam = Team(5)
    println("First team warriors:")
    firstTeam.printWarriors()
    println()
    println("Second team warriors:")
    secondTeam.printWarriors()
    println()
    val battle = Battle(firstTeam, secondTeam)
    var roundCount = 1
    while (firstTeam.isNotDestroyed() || secondTeam.isNotDestroyed()) {
        println("Round №$roundCount")
        battle.makeBattleIteration()
        roundCount++
        println()
    }
    println("First team warriors:")
    firstTeam.printWarriors()
    println()
    println("Second team warriors:")
    secondTeam.printWarriors()
}