package bac.week8.concept


/*
    구간 합 구하기

     N(1 ≤ N ≤ 1,000,000)
     M(1 ≤ M ≤ 10,000),
     K(1 ≤ K ≤ 10,000)

     1인경우 변경
     2인경우 구간합 쿼리.
 */


//// 숫자의 개수
//var n: Long = 0
//
//// 변경이 일어나는 횟수
//var m: Long = 0
//
//// 구간합 쿼리 횟수
//var k: Long = 0
//
// lateinit var arr: Array<Long>
// lateinit var segmentTree: Array<Long>
//
//val orderList = mutableListOf<Triple<Long, Long, Long>>()
//fun sumSegmentTreeInit(originSize: Long) {
//
//    segmentTree = Array(originSize.toInt() * 2) { 0 }
//
//    // leaf node 채우기
//    for (i in 0 until originSize) {
//        segmentTree[(i + segmentTree.size / 2).toInt()] = arr[i.toInt()]
//    }
//    for (i in (segmentTree.size / 2) - 1 downTo 1)
//        segmentTree[i] = segmentTree[i * 2] + segmentTree[(i * 2) + 1]
//}
//
//fun update(idx: Long, value: Long) {
//    // 원본 변경
//    arr[idx.toInt()] = value
//    // 트리 변경
//    var treeIdx = idx + (segmentTree.size / 2)
//    segmentTree[treeIdx.toInt()] = value
//    // 리프노드부터 부모노드들에 차이값을 더 해줌
//    while (treeIdx > 1) {
//        treeIdx /= 2
//        segmentTree[treeIdx.toInt()] = segmentTree[(treeIdx * 2).toInt()] + segmentTree[((treeIdx * 2) + 1).toInt()]
//    }
//}
//
//fun query(startIdx: Int, endIdx: Int): Long {
//
//    var l = startIdx + (segmentTree.size / 2)
//    var r = endIdx + (segmentTree.size / 2)
//
//    var ret = 0L
//    while (l <= r) {
//        if (l % 2 == 1) {
//            ret += segmentTree[l]
//            l += 1
//        }
//        if (r % 2 == 0) {
//            ret += segmentTree[r]
//            r -= 1
//        }
//        l /= 2
//        r /= 2
//    }
//    return ret
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//    n = info[0]
//    m = info[1]
//    k = info[2]
//
//    arr = Array(n.toInt()) { readLine().toLong() }
//    for (i in 0 until m + k) {
//        val order = readLine().split(" ").map { it.toLong() }
//        orderList.add(Triple(order[0], order[1], order[2]))
//    }
//
//    sumSegmentTreeInit(n)
//
//    for (i in 0 until orderList.size) {
//        val order = orderList[i]
//        if (order.first == 1L) {
//            update(idx = (order.second - 1), value = order.third)
//        }
//        if (order.first == 2L) {
//            println(query(order.second.toInt() - 1, order.third.toInt() - 1))
//        }
//    }
//}