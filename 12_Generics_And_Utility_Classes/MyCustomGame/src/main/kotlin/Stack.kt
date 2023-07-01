import java.util.Stack

class Stack<T> {
    private val javaStackCollection = Stack<T>()

    fun push(item: T) {
        javaStackCollection.push(item)
    }
    fun pop(): T? = javaStackCollection.pop()
    fun isNotEmpty() = javaStackCollection.isNotEmpty()
    fun getCountElements() = javaStackCollection.count()
    fun printAllElements() = println(javaStackCollection.joinToString("\n"))
}