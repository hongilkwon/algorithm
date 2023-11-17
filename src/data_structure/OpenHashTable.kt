//package data_structure
//
//class OpenHashTable<K, V>(private var initTableSize: Int = DEFAULT_TABLE_SIZE) {
//
//    companion object {
//        private const val DEFAULT_TABLE_SIZE = 20
//        private const val FULL = -1
//    }
//
//    private enum class State {
//        OCCUPIED,
//        EMPTY
//    }
//
//    private data class Slot<K, V>(var state: State, var key: K? = null, var value: V? = null) {
//        var hashCode = key.hashCode()
//    }
//
//    var size: Int = 0
//    private var table: Array<Slot<K, V>> = Array(initTableSize) {
//        Slot(state = State.EMPTY)
//    }
//
//    constructor(vararg args: Pair<K, V>) : this(0) {
//        table = Array(args.size * 2) { Slot(state = State.EMPTY) }
//        args.forEach {
//            put(it.first, it.second)
//        }
//        size = args.size
//    }
//
//    /*
//        table 안에 key 값이 이미 존재 한다면, 해당 slot idx 반환.
//        key 값이 없다면, key가 삽입되 어야할 slot idx 반환
//     */
//    private fun findSlot(key: K): Int {
//
//        val start = hashValue(key)
//        var idx = hashValue(key)
//
//        while (table[idx].state == State.OCCUPIED && table[idx].key != key) {
//            idx = reHash(idx)
//            if (idx == start) {
//                return FULL
//            }
//        }
//        return idx
//    }
//
//    /*
//       <key, Value> 데이터를 입력받아서,
//       기존에 있던 Key면 데이터를 업데이트 합니다, 없다면 새로운 데이터를 슬롯에 저장 합니다.
//    */
//    fun put(key: K, value: V): K {
//
//        val idx = findSlot(key)
//
//        if (idx == FULL) {
//            // table 공간이 부족으로 reSize
//            // 테이블을 모두 탐색는데 idx를 못 찾았기 때문에 table size를 2배로 키운뒤,
//            // 모든 데이터를 옮겨 주어야 한다.
//            // reSize() 추후에 구현
//        }
//
//        if (table[idx].state == State.OCCUPIED) {
//            // 이미 동일한 key가 있기 때문에 업데이트
//            table[idx].value = value
//        } else {
//            // 새로운 데이터를 슬롯에 저장.
//            table[idx].apply {
//                this.state = State.OCCUPIED
//                this.key = key
//                this.value = value
//            }
//            size += 1
//        }
//        return key
//    }
//
//    fun search(key: K): V? {
//        val idx = findSlot(key)
//        return if (table[idx].state == State.OCCUPIED) {
//            table[idx].value
//        } else {
//            null
//        }
//    }
//
//    fun remove(key: K) {
//        var i = findSlot(key)
//
//        if (table[i].state == State.EMPTY) {
//            // 없는 키를 지움.
//            return
//        }
//
//        var j = i
//        while (true) {
//            table[i].apply {
//                this.state = State.EMPTY
//                this.key = null
//                this.value = null
//            }
//            // 삭제한 idx empty slot에 끌어올려 저장할 slot의 idx를 찾는다.
//
//            while (true) {
//                j = reHash(j)
//                // 끌어 올릴 데이터가 없음.
//                if (table[j].state == State.EMPTY) {
//                    size -= 1
//                    return
//                }
//
//                val k = hashValue(table[j].key!!)
//                /*  i = 지워진 빈 슬롯 idx,
//                    j = 빈 슬롯을 채우기 위해, 끌어 올려야 데이터가 들어있는 슬롯 idx
//                    k = 해시충돌이 없고, 해당 슬롯이 비어있다면 있어야될 idx
//
//                    k는 i와는 같아도 되지만 j랑은 같으면 안됨.
//                    if not (i < k <= j or j < i < k or k <= j < i)
//
//                 */
//
//                if (k in i + 1..j ||
//                    i in j + 1 until k ||
//                    j in k until i
//                ) {
//                    continue
//                }
//                break
//            }
//            // 데이터 옮김
//            table[i].apply {
//                this.state = State.OCCUPIED
//                this.key = table[j].key
//                this.value = table[j].value
//            }
//            table[j].apply {
//                this.state = State.EMPTY
//                this.key = null
//                this.value = null
//            }
//            i = j
//        }
//    }
//
//    override fun toString(): String {
//        val sb = StringBuilder()
//        table.forEachIndexed { index, slot ->
//            sb.append("table idx: $index data: $slot\n")
//        }
//        return sb.toString()
//    }
//
//    private fun hashValue(key: K): Int =
//        key.hashCode() % table.size
//
//    private fun reHash(hashValue: Int): Int =
//        (hashValue + 1) % table.size
//}
//
//fun main() {
//    val openHashTable = OpenHashTable<String, Int>(
//        "홍일권" to 33,
//        "김영옥" to 65,
//        "홍우식" to 65,
//        "홍아름" to 36,
//    )
//
//    println(openHashTable)
//}