fun main() {
    val testStack = Stack<String>()
    testStack.push("test0")
    testStack.push("test1")
    testStack.push("test2")
    testStack.printAllElements()
    testStack.pop()
    testStack.printAllElements()
    testStack.pop()
    testStack.printAllElements()
    println(testStack.isEmpty())
    testStack.pop()
    println(testStack.isEmpty())
}