import kotlinx.coroutines.*

fun main() = runBlocking {

    launch {
        println(Fibonacci.take(5))
    }

    launch {
        println(Fibonacci.take(10))
    }

    yield() // пропускаем все корутины, чтобы сохранить порядок
    println(Fibonacci.take(15))

    withTimeout(1) { // исключение обрабатывается в библиотеке
        println(Fibonacci.take(15)) // получаем результат до TimeoutCancellationException
    }

}
