package bac.etc


/*
    테트로 미노

    (4 ≤ N, M ≤ 500)

    500*500*40
    250000
    완탐 조짐.

    모든 칸에 대해 ㅗ를 제외한 모양들을 dfs로 4뎁스

 */

//import kotlin.math.max
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//
//var max = 0
//val path = mutableSetOf<Pair<Int, Int>>()
//
///*
//    [][][][]
//
//    [][][]
//        []
//
//    [][]
//    [][]
//
//    []
//    [][]
//      []
//  */
//fun go(node: Pair<Int, Int>, cnt: Int) {
//
//    if (cnt == 4) {
//        var sum = 0
//        for (point in path) {
//            sum += map[point.first][point.second]
//        }
//        max = max(max, sum)
//        return
//    }
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        if (ny to nx in path) continue
//        path.add(ny to nx)
//        go(ny to nx, cnt + 1)
//        path.remove(ny to nx)
//    }
//}
//
///*
//      []
//    [][][]
// */
//fun go2(node: Pair<Int, Int>) {
//
//    var temp = mutableListOf<Pair<Int, Int>>()
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        temp.add(ny to nx)
//    }
//
//    if (temp.size == 3) {
//        var sum = map[node.first][node.second]
//        for (p in temp) {
//            sum += map[p.first][p.second]
//        }
//        max = max(max, sum)
//    }
//
//    if (temp.size == 4) {
//        for (i in 0 until temp.size) {
//            var sum = map[node.first][node.second]
//            for (j in 0 until temp.size) {
//                if (i == j) continue
//                sum += map[temp[j].first][temp[j].second]
//            }
//            max = max(max, sum)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) { intArrayOf() }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            go(i to j, 0)
//        }
//    }
//
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            go2(i to j)
//        }
//    }
//    println(max)
//}


