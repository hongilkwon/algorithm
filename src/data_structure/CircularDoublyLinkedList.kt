package data_structure


//class CircularDoublyLinkedList {
//    class Node(var key: Int?, prev: Node?, next: Node?) {
//        var prev: Node
//        var next: Node
//
//        init {
//            this.prev = prev ?: this
//            this.next = next ?: this
//        }
//    }
//
//    private val head: Node = Node(null, null, null)
//    var size = 0
//
//
//    /*
//
//       1. a = b일 수 있지만, a의 next 링크를 따라 가다보면 b가 있다.
//       2. a ---> b 두 노드 사이에 head 노드는 존재하지 않는다.
//       3. a ---> b 두 노드 사이에 x 노드는 존재하지 않는다.
//
//       a ---> b 의 연결을 뗴어 내어 x노드 다음에 연결
//     */
//    private fun splice(a: Node, b: Node, x: Node) {
//        val ap = a.prev
//        val bn = b.next
//        val xn = x.next
//
//        ap.next = bn
//        bn.prev = ap
//
//        x.next = a
//        a.prev = x
//
//        b.next = xn
//        xn.prev = b
//    }
//
//    /*
//        원형 연결 상태에서 node(a)를 node(x) 뒤로 이동
//     */
//    private fun moveAfter(a: Node, x: Node) = splice(a, a, x)
//
//
//    /*
//        원형 연결 상태에서 node(a)를 node(x) 앞으로 이동
//     */
//    private fun moveBefore(a: Node, x: Node) = splice(a, a, x.prev)
//
//    /*
//        입력된 key 값을 가진 노드를 생성해서, node(x) 뒤로 삽입
//     */
//    private fun insertAfter(key: Int, x: Node) {
//        val node = Node(key, null, null)
//        moveAfter(node, x)
//    }
//
//    /*
//        입력된 key 값을 가진 노드를 생성해서, node(x) 앞으로 삽입
//     */
//    private fun insertBefore(key: Int, x: Node) {
//        val node = Node(key, null, null)
//        moveBefore(node, x)
//    }
//
//    /*
//       원형 연결 리스트에 key을 head 기준 다음 노드에 삽입힌다.
//    */
//    fun pushFront(key: Int) {
//        insertAfter(key, head)
//        size += 1
//    }
//
//    /*
//       원형 연결 리스트에 key을 head 기준 이전 노드에 삽입힌다.
//    */
//    fun pushBack(key: Int) {
//        insertBefore(key, head)
//        size += 1
//    }
//
//    private fun searchNode(key: Int): Node? {
//        var node = head.next
//        while (node.key != null) {
//            if (key == node.key)
//                return node
//            node = node.next
//        }
//        return null
//    }
//
//    private fun removeNode(node: Node) {
//        if (node.key == null) return
//        val prev = node.prev
//        val next = node.next
//
//        prev.next = next
//        next.prev = prev
//    }
//
//    fun popFront() = removeNode(head.next)
//
//    fun popBack() = removeNode(head.prev)
//
//    fun deleteByKey(key: Int): Int? {
//        val node = searchNode(key) ?: return null
//        removeNode(node)
//        size -= 1
//        return node.key
//    }
//
//    override fun toString(): String {
//        val sb = StringBuilder()
//        var node = head.next
//        while (node.key != null) {
//            sb.append("${node.key} -> ")
//            node = node.next
//        }
//        return sb.toString()
//    }
//}
//
//fun main() {
//
//    val list = CircularDoublyLinkedList()
//    list.pushFront(3)
//    list.pushFront(10)
//    list.pushFront(9)
//    list.pushFront(116)
//    list.pushBack(2023)
//
//    println(list)
//    list.deleteByKey(10)
//    println(list)
//}