fun main() {
    val firstTeam = Team(2)
    val secondTeam = Team(2)
    println("First team warriors:")
    firstTeam.printWarriors()
    println()
    println("Second team warriors:")
    secondTeam.printWarriors()
    println()
    val battle = Battle(firstTeam, secondTeam)
    for (i in 1..15) {
        println("Round №${i}")
        battle.makeBattleIteration()
        println()
    }
}