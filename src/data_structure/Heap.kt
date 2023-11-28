package data_structure

//import kotlin.math.pow
//
//
//class MaxHeap(vararg args: Int) {
//
//    var tree = Array<Int?>(calTreeSize(args.size)) { null }
//
//    init {
//        for (i in 0 until args.size) {
//            tree[i] = args[i]
//        }
//        makeHeap()
//    }
//
//    private fun calTreeSize(arrSize: Int): Int = 2.0.pow(calculateHeight(arrSize).toDouble()).toInt() - 1
//
//    private fun calculateHeight(size: Int): Int {
//
//        var h = 0
//        var temp = size
//
//        while (temp > 0) {
//            temp /= 2
//            h += 1
//        }
//
//        return h
//    }
//
//    /*
//        배열이 heap 성질을 만족하도록
//        마지막 노드에서 부터 순회하면서 힙성질을 만들어 올라온다.
//     */
//    fun makeHeap() {
//        val end = tree.indexOfLast { it != null }
//        for (i in end downTo 0) {
//            if (isLeaf(i)) continue
//            heapifyDown(i)
//        }
//    }
//
//    /*
//        해당 노드가 Leaf node 인지 확인한다.
//     */
//    private fun isLeaf(idx: Int): Boolean =
//        getChild(idx, 'L') == null && getChild(idx, 'R') == null
//
//    /*
//        옵션에 따라 해당 노드의 자식의 값을 가지고 온다.
//     */
//    private fun getChild(idx: Int, option: Char): Int? {
//
//        val dir = if (option == 'L') 1 else 2
//
//        return try {
//            tree[(idx * 2) + dir]
//        } catch (e: IndexOutOfBoundsException) {
//            null
//        }
//    }
//
//    /*
//        가장 최소 형태의 root left right 중 힙성질을 만족하도록
//        1. 두 자식을 먼저 비교
//        2. root와 더 큰 자식을 비교
//     */
//    private fun heapifyDown(idx: Int) {
//        var i = idx
//        while (!isLeaf(i)) {
//            val left = getChild(i, 'L') ?: -1
//            val right = getChild(i, 'R') ?: -1
//
//            val tempIdx = if (left > right) (2 * i) + 1 else (2 * i) + 2
//
//            val maxIdx =
//                if (tempIdx == (2 * i) + 1) {
//                    if (tree[i]!! > left) i else (2 * i) + 1
//                } else {
//                    if (tree[i]!! > right) i else (2 * i) + 2
//                }
//
//            if (i != maxIdx) {
//                swap(i, maxIdx)
//                i = maxIdx
//            } else {
//                break
//            }
//        }
//    }
//
//    private fun swap(a: Int, b: Int) {
//        val temp = tree[a]
//        tree[a] = tree[b]
//        tree[b] = temp
//    }
//
//    /*
//        새로운 값이 들어오면 heap 성질에 맞도록 알맞은 위치에 데이터를 저장한다.
//     */
//    fun insert(num: Int) {
//        // 배열의 공간 확인 및 reSize
//        if (tree.isEmpty() || tree[tree.lastIndex] != null)
//            resize()
//
//        // leaf node에 삽입.
//        val emptyIdx = tree.indexOfFirst { it == null }
//        tree[emptyIdx] = num
//        heapifyUp(emptyIdx)
//    }
//
//    /*
//        tree의 크기를 2배로 증가시킨다.
//   */
//    private fun resize() {
//        val temp = Array<Int?>((tree.size + 1) * 2 + 1) { null }
//        for (i in 0 until tree.size){
//            temp[i] = tree[i]
//        }
//        tree = temp
//    }
//
//    /*
//        정해진 idx에서 root 까지 부모 노드와 비교하여 위치를 변경한다.
//        O(logN)
//     */
//    private fun heapifyUp(idx: Int) {
//        var temp = idx
//        // root node idx는 0이다.
//        while (temp > 0 && tree[(temp - 1) / 2]!! < tree[temp]!!) {
//            swap((temp - 1) / 2, temp)
//            temp = (temp - 1) / 2
//        }
//    }
//
//    /*
//        Root인 가장 큰값을 반환한다.
//     */
//    fun findMax() = tree.first()
//
//    /*
//        root idx를 비워서 지우고,
//        가장 큰 값의 root와  마지막 leaf node와 값을 교환후
//        heapifyDown으로 heap 성질은 만족 시킨다.
//     */
//    fun deleteMax(): Int{
//
//        if (tree.isEmpty()) return -1
//
//        val maxValue = tree[0]!!
//        tree[0] = null
//        swap(0,  tree.indexOfLast { it != null })
//
//        heapifyDown(0)
//        return maxValue
//    }
//
//}
//
//fun main() {
//
//    val heap = MaxHeap(2, 8, 6, 1, 10, 15, 3, 12, 11)
//    println(heap.tree.joinToString(" "))
//
//    heap.insert(14)
//    println(heap.tree.joinToString(" "))
//
//    heap.findMax()
//    heap.deleteMax()
//    println(heap.tree.joinToString(" "))
//}