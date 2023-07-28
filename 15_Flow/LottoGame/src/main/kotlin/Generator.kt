import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Generator {
    private val barrelsList = MutableList(90) { it + 1 }

    fun flow(): Flow<Int> {
        return flow {
            while (barrelsList.isNotEmpty()) {
                val currentBarrel = barrelsList.random()
                emit(currentBarrel)
                barrelsList.remove(currentBarrel)
                delay(300)
            }
        }
    }
}