package stack

fun main() {
    val stack = Stack<Int>()

    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(6)

    print("{")
    print(stack.pop() ?: 0)
    print(", ")
    print(stack.pop() ?: 0)
    print(", ")
    print(stack.pop() ?: 0)
    print(", ")
    print(stack.pop() ?: 0)
    print(", ")
    print(stack.pop() ?: 0)
    print(", ")
    print(stack.pop() ?: 0)
    print("}")
}
