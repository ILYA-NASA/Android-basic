fun main() {
    val testStack = Stack("test0")
    testStack.push("test1")
    testStack.push("test2")
    testStack.push("test3")
    testStack.printAllElements()
    testStack.pop()
    testStack.printAllElements()
    testStack.pop()
    testStack.printAllElements()
    println(testStack.isEmpty())
}