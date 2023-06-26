import kotlin.random.Random

class Team(sizeTeam: Int) {
    private val teamList = mutableListOf<AbstractWarrior>()
    private fun getTeam(sizeTeam: Int) {
        repeat(sizeTeam) {
            val chance = Random.nextInt(100)
            when {
                chance <= 10 -> teamList.add(General())
                chance <= 40 -> teamList.add(Captain())
                else -> teamList.add(Soldier())
            }
        }
    }

    init {
        this.getTeam(sizeTeam)
    }

    fun printWarriors() = teamList.forEachIndexed { index, warrior ->
        println("${index + 1}: $warrior")
    }
}
