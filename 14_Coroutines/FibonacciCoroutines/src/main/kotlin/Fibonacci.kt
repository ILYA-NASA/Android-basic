import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.isActive
import java.math.BigInteger

object Fibonacci {
    suspend fun take(n: Int): BigInteger {
        var result = n.toBigInteger()
        if (currentCoroutineContext().isActive) {
            if (n > 1) result = take(n - 1) + take(n - 2)
        }
        return result
    }
}