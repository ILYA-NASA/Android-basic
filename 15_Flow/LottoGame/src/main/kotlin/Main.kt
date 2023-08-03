import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            Generator
                .cardNumFlow
                .distinctUntilChanged()
                .toList()
                .let(::println)
        }
        launch {
            Generator
                .cardNumFlow
                .distinctUntilChanged()
                .toList()
                .let(::println)
        }
        launch {
            Generator
                .cardNumFlow
                .distinctUntilChanged()
                .toList()
                .let(::println)
        }
        launch {
            Generator
                .barrelsFlow()
                .collect {
                    delay(200)
                    println(it)
                }
        }
    }
}