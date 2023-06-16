import java.util.Stack

class Stack<T> {
    private val javaStackCollection = Stack<T>()

    fun push(item: T) {
        javaStackCollection.push(item)
    }
    fun pop(): T? = javaStackCollection.pop()
    fun isEmpty() = javaStackCollection.isEmpty()
    fun printAllElements() = println(javaStackCollection.joinToString(", "))
}