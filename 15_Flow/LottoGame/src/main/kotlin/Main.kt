import kotlinx.coroutines.*
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList

fun main() {
    runBlocking {
        launch {
            NumberGenerator
                .randomFlow()
                .take(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT)
                .toList()
                .let(::println)
        }
        launch {
            NumberGenerator
                .randomFlow()
                .take(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT)
                .toList()
                .let(::println)
        }
        launch {
            NumberGenerator
                .randomFlow()
                .take(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT)
                .toList()
                .let(::println)
        }
        launch {
            NumberGenerator
                .randomFlow()
                .take(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT)
                .toList()
                .let(::println)
        }
        launch {
            NumberGenerator
                .randomFlow()
                .take(Game.CARD_ROWS_COUNT * Game.CARD_ROWS_NUM_COUNT)
                .toList()
                .let(::println)
        }
        launch {
            NumberGenerator
                .randomFlow()
                .collect {
                    delay(200)
                    println(it)
                }
        }
    }
}