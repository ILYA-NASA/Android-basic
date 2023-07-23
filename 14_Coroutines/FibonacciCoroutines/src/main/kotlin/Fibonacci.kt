import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.yield
import java.math.BigInteger

object Fibonacci {
    suspend fun take(n: Int): BigInteger {
        var result = n.toBigInteger()
        try {
            withTimeout(3000) {
                if (n > 1) result = take(n - 1) + take(n - 2)
            }
        } catch (e: TimeoutCancellationException) {
            yield()
            print("${e.message}, invalid number is ")
        }
        return result
    }
}