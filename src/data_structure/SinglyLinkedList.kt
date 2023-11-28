package data_structure


//class SinglyLinkedList: Iterable<Int> {
//    private data class Node(val key: Int, var next: Node? = null)
//
//    private var head: Node? = null
//
//    private var _size = 0
//    val size
//        get() = _size
//
//    fun pushFront(key: Int) {
//        val newNode = Node(key)
//        newNode.next = head
//        head = newNode
//        _size += 1
//    }
//
//    fun pushBack(key: Int) {
//        val newNode = Node(key)
//        if (_size == 0) {
//            head = newNode
//        } else {
//            var tail = head
//            while (tail?.next != null) {
//                tail = tail.next
//            }
//            tail?.next = newNode
//        }
//        _size += 1
//    }
//
//    fun popFront(): Int? =
//        if (_size == 0) {
//            null
//        } else {
//            val temp = head!!
//            val key = temp.key
//
//            head = temp.next
//            temp.next = null
//            _size -= 1
//            key
//        }
//
//
//    fun popBack(): Int? =
//        if (_size == 0) {
//            null
//        } else if (_size == 1) {
//            val key = head?.key
//            head = null
//            _size -= 1
//            key
//        } else {
//            var prev: Node? = null
//            var tail = head
//
//            while (tail?.next != null) {
//                prev = tail
//                tail = tail.next
//            }
//            val key = tail?.key
//            prev?.next = null
//            _size -= 1
//            key
//        }
//
//    fun search(key: Int): Int? {
//        var node = head
//        while (node != null) {
//            if (key == node.key) break
//            node = node.next
//        }
//
//        return node?.key
//    }
//
//    private class SinglyLinkedListIterator(val list: SinglyLinkedList) : Iterator<Int> {
//
//        var index = 0
//        var lastNode = list.head
//        override fun hasNext(): Boolean {
//           return index < list.size
//        }
//
//        override fun next(): Int {
//           if (lastNode == null) throw IndexOutOfBoundsException()
//            val key = lastNode!!.key
//            lastNode = lastNode!!.next
//            index++
//            return key
//        }
//    }
//    override fun iterator(): Iterator<Int> {
//        return SinglyLinkedListIterator(this)
//    }
//
//    override fun toString(): String {
//        val sb = StringBuilder()
//        var node = head
//        while (node != null) {
//            sb.append("${node.key} ")
//            node = node.next
//        }
//        return sb.toString()
//    }
//}
//
//fun main() {
//    val list = SinglyLinkedList()
//
//    list.pushFront(1)
//    list.pushFront(2)
//    list.pushFront(3)
//    list.pushFront(4)
//
//    for (v in list){
//        println(v)
//    }
//}