import kotlinx.coroutines.*

suspend fun main() {
    val firstCard = Game().createCard().toMutableList()
    println("Numbers first game card: $firstCard")
    val secondCard = Game().createCard().toMutableList()
    println("Numbers second game card: $secondCard")

    runBlocking {
        launch {
            println("START GAME!")
            NumberGenerator
                .randomFlow()
                .collect {
                    println("Number current barrel is $it")
                    if (firstCard.contains(it)) firstCard.remove(it)
                    if (secondCard.contains(it)) secondCard.remove(it)
                    if (firstCard.isEmpty() || secondCard.isEmpty()) {
                        cancel()
                        println(
                            when {
                                firstCard.isEmpty() && secondCard.isNotEmpty() -> "OWNER FIRST GAME CARD WON!"
                                secondCard.isEmpty() && firstCard.isNotEmpty() -> "OWNER SECOND GAME CARD WON!"
                                else -> "FRIENDSHIP WON!"
                            }
                        )
                    }
                    delay(300)
                    println("Current numbers first game card: $firstCard \nCurrent numbers second game card: $secondCard")
                }
        }
    }
}