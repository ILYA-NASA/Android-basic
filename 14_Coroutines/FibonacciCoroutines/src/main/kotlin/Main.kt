import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { println(Fibonacci.take(5)) }
    launch {
        delay(500)
        println(Fibonacci.take(10))
    }
    delay(1000)
    println(Fibonacci.take(15))
}
