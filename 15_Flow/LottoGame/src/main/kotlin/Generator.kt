import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

object Generator {
    val cardNumFlow = flow<Int> {
        repeat(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT) {
            emit(Random.nextInt(Game.BARRELS_COUNT + 1))
        }
    }
    private val barrelsList = MutableList(Game.BARRELS_COUNT) { it + 1 }

    fun barrelsFlow(): Flow<Int> {
        return flow {
            while (barrelsList.isNotEmpty()) {
                val currentBarrel = barrelsList.random()
                emit(currentBarrel)
                barrelsList.remove(currentBarrel)
            }
        }
    }
}