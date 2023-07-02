package bac.week8.concept


/*
    수열과 쿼리_16
 */

//import kotlin.math.min
//
//var n = 0
//lateinit var arr: Array<Int>
//
//var m = 0
//val queryList = mutableListOf<Triple<Int, Int, Int>>()
//
//lateinit var segmentTree: Array<Int>
//
//const val INF = 1_000_000_001
//fun treeInit() {
//    segmentTree = Array(arr.size * 2) { INF }
//
//    for (i in 0 until arr.size) {
//        segmentTree[i + arr.size] = arr[i]
//    }
//
//    for (i in arr.size - 1 downTo 1) {
//        segmentTree[i] =
//            if (segmentTree[i * 2] > segmentTree[(i * 2) + 1]) segmentTree[(i * 2) + 1] else segmentTree[i * 2]
//    }
////    println(segmentTree.joinToString(" "))
//}
//
//fun treeUpdate(idx: Int, value: Int) {
//
//    arr[idx] = value
//    segmentTree[idx + arr.size] = value
//
//    var i = idx + arr.size
//    while (i > 1) {
//        i /= 2
//        segmentTree[i] =
//            if (segmentTree[i * 2] > segmentTree[(i * 2) + 1]) segmentTree[(i * 2) + 1] else segmentTree[i * 2]
//    }
////    println(segmentTree.joinToString(" "))
//}
//
//fun treeQuery(start: Int, end: Int): Int {
//
//    var l = start + arr.size
//    var r = end + arr.size
//
//    var ret = INF
//    while (l <= r) {
//        if (l % 2 == 1) {
//            ret = min(ret, segmentTree[l])
//            l += 1
//        }
//        if (r % 2 == 0) {
//            ret = min(ret, segmentTree[r])
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
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    m = readLine().toInt()
//    for (i in 1..m) {
//        val query = readLine().split(" ").map { it.toInt() }
//        queryList.add(Triple(query[0], query[1], query[2]))
//    }
//
//    treeInit()
//    for (i in 0 until queryList.size) {
//        val query = queryList[i]
//        if (query.first == 1) {
//            treeUpdate(query.second - 1, query.third)
//        } else if (query.first == 2) {
//            val min = treeQuery(query.second - 1, query.third - 1)
//            for (i in query.second - 1..query.third - 1) {
//                if (arr[i] == min) {
//                    println(i + 1)
//                    break
//                }
//            }
//        }
//    }
//    Unit
//}