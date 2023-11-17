package data_structure


//class ChainingHashTable<K, V>(private var initTableSize: Int = DEFAULT_TABLE_SIZE) {
//
//    companion object {
//        private const val DEFAULT_TABLE_SIZE = 20
//    }
//
//    private var size = 0
//    private var table: Array<Node<K, V>?> = Array(initTableSize) { null }
//
//    private class Node<K, V>(val key: K, var value: V, var next: Node<K, V>? = null) {
//        val hashCode = key.hashCode()
//
//        override fun toString(): String {
//            return "(key: $key value: $value)"
//        }
//    }
//
//    constructor(vararg args: Pair<K, V>) : this(if (args.size > DEFAULT_TABLE_SIZE) args.size else DEFAULT_TABLE_SIZE) {
//
//        val tableSize = if (args.size > DEFAULT_TABLE_SIZE) args.size else DEFAULT_TABLE_SIZE
//        table = Array(tableSize) { null }
//        args.forEach {
//            put(it.first, it.second)
//        }
//    }
//
//    /*
//        key를 입력받아 현재 hashTable 해당하는 key값을 가진 Node가 있는지 확인합니다.
//        있다면 node를 반환하고 없으면 null을 반환 합니다.
//     */
//    private fun findNode(key: K): Node<K, V>? {
//        val idx = hashValue(key)
//
//        var p = table[idx]
//
//        while (p != null) {
//            if (p.key == key)
//                return p
//            p = p.next
//        }
//        return p
//    }
//
//    /*
//       <key, Value> 데이터를 입력받아서,
//       기존에 있던 Key면 데이터를 업데이트 합니다, 없다면 새로운 데이터를 해당 idx의 Chain 가장 앞에 삽입 합니다.
//    */
//    fun put(key: K, value: V): K {
//
//        val node = findNode(key)
//        if (node != null && node.key == key) {
//            // 값을 업데이트
//            node.value = value
//        } else {
//            // 새로운 노드 삽입.
//            table[hashValue(key)] = Node(key, value, table[hashValue(key)])
//            size += 1
//        }
//        return key
//    }
//
//    /*
//        key 값에 대응 하는 value를 리턴한다.
//     */
//    fun search(key: K): V? {
//        val idx = hashValue(key)
//
//        var p = table[idx]
//
//        while (p != null) {
//            if (p.key == key)
//                return p.value
//            p = p.next
//        }
//        return null
//    }
//
//    /*
//        해당 key가 table에 존재한다면, key 값에 대응 하는 value를 삭제하고 key 반환.
//        key가 table에 없다면, 무시한다.
//     */
//    fun delete(key: K) {
//
//        val node = findNode(key) ?: return
//
//        // 삭제할 노드의 앞선 노드를 찾는다.
//        var prev = table[hashValue(key)]!!
//        // 삭제할 노드가 체인의 가장 앞쪽 이라면,
//        if (prev.key == node.key){
//            table[hashValue(key)] = null
//        }else{
//            while (prev.next?.key != node.key){
//                val next = prev.next ?: return
//                prev = next
//            }
//            prev.next = node.next
//            size -= 1
//        }
//    }
//
//    fun hashValue(key: K) = key.hashCode() % table.size
//
//    override fun toString(): String {
//        val sb = StringBuilder()
//        table.forEachIndexed { idx, chain ->
//            sb.append("idx: $idx ")
//            var node = chain
//            while (node != null) {
//                sb.append(node.toString())
//                node = node.next
//            }
//            sb.append("\n")
//        }
//        return sb.toString()
//    }
//}

//fun main() {
//
//    val chainingHashTable = ChainingHashTable(
//        1 to 1,
//        2 to 2,
//        3 to 3,
//        4 to 4,
//    )
//    chainingHashTable.put(24, 24)
//    chainingHashTable.put(25, 25)
//    chainingHashTable.put(4, 104)
//    println(chainingHashTable)
//
//    chainingHashTable.delete(4)
//    chainingHashTable.delete(3)
//    chainingHashTable.delete(0)
//
//    println(chainingHashTable)
//}