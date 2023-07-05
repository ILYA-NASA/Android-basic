fun main() {
    println("Please, enter the number of players: ")
    val sizeTeam = readln().toInt()
    val firstTeam = Team(sizeTeam)
    val secondTeam = Team(sizeTeam)
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