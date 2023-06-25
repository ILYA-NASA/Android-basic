import kotlin.random.Random

class Team {
    private val teamList = mutableListOf<AbstractWarrior>()

    fun getTeam(sizeTeam: Int): MutableList<AbstractWarrior> {
        repeat(sizeTeam) {
            val chance = Random.nextInt(100)
            when {
                chance <= 10 -> teamList.add(General())
                chance <= 40 -> teamList.add(Captain())
                else -> teamList.add(Soldier())
            }
        }
        return teamList
    }
}