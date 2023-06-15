import java.util.Stack

class Stack<T>(item: T?) {
    private val javaStackCollection = Stack<T>()

    init {
        javaStackCollection.push(item)
    }

    fun push(item: T) {
        javaStackCollection.push(item)
    }

    fun pop(): T? = javaStackCollection.pop()
    fun isEmpty(): Boolean = javaStackCollection.isEmpty()
    fun printAllElements() = println(javaStackCollection.joinToString(", "))
}