import java.math.BigInteger

object Fibonacci {
    fun take(n: Int): BigInteger {
        var result = n.toBigInteger()
        if (n > 1) result = take(n - 1) + take(n - 2)
        return result
    }
}