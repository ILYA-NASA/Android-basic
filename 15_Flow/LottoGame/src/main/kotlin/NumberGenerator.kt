import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object NumberGenerator {
    fun randomFlow(): Flow<Int> {
        val barrelsList = MutableList(Game.BARRELS_COUNT) { it + 1 }
        return flow {
            while (barrelsList.isNotEmpty()) {
                val currentBarrel = barrelsList.random()
                emit(currentBarrel)
                barrelsList.remove(currentBarrel)
            }
        }
    }
}