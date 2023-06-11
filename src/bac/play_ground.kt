import java.util.Stack


fun main() {
    val tempList = mutableListOf<Int>()
    val stack = Stack<Int>()
    stack.add(3)
    stack.add(1)
    println(stack)

    tempList.add(stack.pop())
    tempList.add(stack.pop())
    println(tempList.joinToString())

    stack.addAll(tempList.reversed())
    println(stack)
}