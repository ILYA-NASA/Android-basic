import kotlinx.coroutines.*

suspend fun main()  {

    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch {
        println(Fibonacci.take(10))
    }

    scope.launch {
        println(Fibonacci.take(15))
    }

    scope.launch {
        while (scope.isActive) {
            delay(300)
            print(".")
        }
    }

    println(Fibonacci.take(5))
    println(Fibonacci.take(35))

}
