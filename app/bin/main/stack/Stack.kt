package stack

class Node<T>(var data: T, var next: Node<T>? = null, var previous: Node<T>? = null) {}

class Stack<T>(var begin: Node<T>? = null, var end: Node<T>? = null) {
    fun push(value: T) {
        var aux = begin
        var auxPrevious: Node<T>? = null

        if(begin == null) {
            begin = Node(value)
        } else {
            while(aux != null) {
                auxPrevious = aux
                aux = aux.next
            }
            aux = Node(value)
            aux.previous = auxPrevious
            auxPrevious?.next = aux
            end = aux
        }
    }

    fun pop(): T? {
        if(end == null) {
            return null
        } else {
            val aux = end
            val auxPrevious = end?.previous

            auxPrevious?.next = null
            end?.previous = null
            end = auxPrevious

            return aux?.data
        }
    }
}
