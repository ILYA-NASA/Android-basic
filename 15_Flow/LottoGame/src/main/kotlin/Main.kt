import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            Generator.flow().collect {
                println(it)
            }
        }
    }
}