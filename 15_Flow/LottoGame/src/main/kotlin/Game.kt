import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList

class Game {
    suspend fun createCard() = NumberGenerator
        .randomFlow()
        .take(CARD_ROWS_COUNT * CARD_ROWS_NUM_COUNT)
        .toList()

    companion object {
        const val CARD_ROWS_COUNT = 3
        const val CARD_ROWS_NUM_COUNT = 5
        const val BARRELS_COUNT = 90
    }
}