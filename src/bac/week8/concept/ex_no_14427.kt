package bac.week8.concept


/*
    수열과 쿼리_15
 */


//var n = 0
//lateinit var arr: Array<Int>
//var m = 0
//
//lateinit var segmentTree: Array<Pair<Int, Int>>
//
//const val INF = 1_000_000_004
//fun treeInit() {
//    segmentTree = Array(arr.size * 2) { -1 to INF }
//
//    for (i in 0 until arr.size) {
//        segmentTree[i + arr.size] = i to arr[i]
//    }
//
//    for (i in arr.size - 1 downTo 1) {
//        segmentTree[i] =
//            if (segmentTree[i * 2].second > segmentTree[(i * 2) + 1].second)
//                segmentTree[(i * 2) + 1].first to segmentTree[(i * 2) + 1].second
//            else if (segmentTree[i * 2].second == segmentTree[(i * 2) + 1].second) {
//                if (segmentTree[i * 2].first > segmentTree[(i * 2) + 1].first) {
//                    segmentTree[(i * 2) + 1].first to segmentTree[(i * 2) + 1].second
//                } else {
//                    segmentTree[i * 2].first to segmentTree[i * 2].second
//                }
//            } else
//                segmentTree[i * 2].first to segmentTree[i * 2].second
//    }
////    println(segmentTree.joinToString(" "))
//}
//
//fun treeUpdate(idx: Int, value: Int) {
//
//    arr[idx] = value
//    segmentTree[idx + arr.size] = idx to value
//
//    var i = idx + arr.size
//    while (i > 1) {
//        i /= 2
//        segmentTree[i] =
//            if (segmentTree[i * 2].second > segmentTree[(i * 2) + 1].second)
//                segmentTree[(i * 2) + 1].first to segmentTree[(i * 2) + 1].second
//            else if (segmentTree[i * 2].second == segmentTree[(i * 2) + 1].second) {
//                if (segmentTree[i * 2].first > segmentTree[(i * 2) + 1].first) {
//                    segmentTree[(i * 2) + 1].first to segmentTree[(i * 2) + 1].second
//                } else {
//                    segmentTree[i * 2].first to segmentTree[i * 2].second
//                }
//            } else
//                segmentTree[i * 2].first to segmentTree[i * 2].second
//    }
////    println(segmentTree.joinToString(" "))
//}
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    treeInit()
//    m = readLine().toInt()
//
//    for (i in 1..m) {
//        val operator = readLine().split(" ").map { it.toInt() }
//
//        if (operator[0] == 1) {
//            treeUpdate(operator[1] - 1, operator[2])
//        } else if (operator[0] == 2) {
//            println(segmentTree[1].first + 1)
//        }
//    }
//    Unit
//}