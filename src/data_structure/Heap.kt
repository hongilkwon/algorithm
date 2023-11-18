package data_structure

import kotlin.math.pow


class MaxHeap(vararg args: Int) {

    val tree = Array<Int?>(calTreeSize(args.size)) { null }

    init {
        for (i in 0 until args.size) {
            tree[i] = args[i]
        }
        makeHeap()
    }

    private fun calTreeSize(arrSize: Int): Int = 2.0.pow(calculateHeight(arrSize).toDouble()).toInt() - 1

    fun calculateHeight(size: Int): Int {

        var h = 0
        var temp = size

        while (temp > 0) {
            temp /= 2
            h += 1
        }

        return h
    }

    /*
        배열이 heap 성질을 만족하도록
        마지막 노드에서 부터 순회하면서 힙성질을 만들어 올라온다.
     */
    fun makeHeap() {
        val end = tree.indexOfLast { it != null }
        for (i in end downTo 0) {
            if (isLeaf(i)) continue
            heapifyDown(i)
        }
    }

    /*
        해당 노드가 Leaf node 인지 확인한다.
     */
    private fun isLeaf(idx: Int): Boolean =
        getChild(idx, 'L') == null && getChild(idx, 'R') == null

    /*
        옵션에 따라 해당 노드의 자식의 값을 가지고 온다.
     */
    private fun getChild(idx: Int, option: Char): Int? {

        val dir = if (option == 'L') 1 else 2

        return try {
            tree[(idx * 2) + dir]
        } catch (e: IndexOutOfBoundsException) {
            null
        }
    }

    /*
        가장 최소 형태의 root left right 중 힙성질을 만족하도록
        1. 두 자식을 먼저 비교
        2. root와 더 큰 자식을 비교
     */
    private fun heapifyDown(idx: Int) {
        var i = idx
        while (!isLeaf(i)) {
            val left = getChild(i, 'L') ?: -1
            val right = getChild(i, 'R') ?: -1

            val tempIdx = if (left > right) (2 * i) + 1 else (2 * i) + 2

            val maxIdx =
                if (tempIdx == (2 * i) + 1) {
                    if (tree[i]!! > left) i else (2 * i) + 1
                } else {
                    if (tree[i]!! > right) i else (2 * i) + 2
                }

            if (i != maxIdx){
                swap(i, maxIdx)
                i = maxIdx
            }else{
                break
            }
        }
    }

    private fun swap(a: Int, b: Int) {
        val temp = tree[a]
        tree[a] = tree[b]
        tree[b] = temp
    }

    fun insert(num: Int){
        // 배열의 공간 확인 및 reSize

    }
}

fun main() {

    val heap = MaxHeap(2, 8, 6, 1, 10, 15, 3, 12, 11)

}