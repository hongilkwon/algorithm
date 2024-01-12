package bac.easy


/*
    쉬운 최단거리
    bfs

    . 원래 갈 수 없는 땅인 위치는 0을 출력하고, 원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치는 -1을 출력한다.
 */


//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//var start = 0 to 0
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//
//lateinit var dist: Array<IntArray>
//fun bfs(start: Pair<Int, Int>) {
//
//    val q: Queue<Pair<Int, Int>> = LinkedList()
//    q.add(start)
//    dist[start.first][start.second] = 1
//
//    while (q.isNotEmpty()) {
//        val node = q.poll()
//
//        for (i in 0 until 4) {
//            val ny = node.first + dy[i]
//            val nx = node.second + dx[i]
//
//            if (ny !in 0 until n || nx !in 0 until m) continue
//            if (map[ny][nx] == 0) continue
//            if (dist[ny][nx] > 0) continue
//
//            dist[ny][nx] = dist[node.first][node.second] + 1
//            q.add(ny to nx)
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) { IntArray(m) { 0 } }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }
//        for (j in 0 until m) {
//            map[i][j] = line[j]
//            if (map[i][j] == 2)
//                start = i to j
//        }
//    }
//
//    dist = Array(n) { IntArray(m) { 0 } }
//    bfs(start)
//
//    val sb = StringBuilder()
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (map[i][j] == 0)
//                sb.append("${0} ")
//            else
//                sb.append("${dist[i][j] - 1} ")
//        }
//        sb.append("\n")
//    }
//
//    println(sb.toString())
//    return@with Unit
//}
