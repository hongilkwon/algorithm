package bac.etc

/*
    벽부수고 이동하기

    N(1 ≤ N ≤ 1,000), M(1 ≤ M ≤ 1,000)

    완전탐색을 할떄 시간복잡도 생각해보자

    V의 개수 N*M
    E의 개수 N*M*4
    O(N*M)

    1_000_000(bfs) * 1_000_000(모든 벽을 1개씩 지워보는 것)

    불가능하다.

    벽을 부시고 지나갈 수 있는 기회는 1번이고 부셔도 되고 안부셔도 된다.

    방문의 차원을 1개 더 늘린다.

 */

//import java.util.LinkedList
//import java.util.Queue
//
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//lateinit var visited: Array<Array<IntArray>>
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//fun bfs(start: Triple<Int, Int, Int>): Int {
//
//    val q: Queue<Triple<Int, Int, Int>> = LinkedList()
//    q.add(start)
//    visited[start.first][start.second][start.third] = 1
//
//    while (q.isNotEmpty()) {
//
//        val curNode = q.poll()
//
//        if (curNode.first == n - 1 && curNode.second == m - 1) {
//            return visited[curNode.first][curNode.second][curNode.third]
//        }
//        for (i in 0 until 4) {
//
//            val ny = curNode.first + dy[i]
//            val nx = curNode.second + dx[i]
//            var isBreak = curNode.third
//
//            if (ny !in 0 until n || nx !in 0 until m) continue
////            if (map[ny][nx] == 1) continue
//            if (visited[ny][nx][isBreak] > 0) continue
//
//            if (map[ny][nx] == 0) {
//                visited[ny][nx][isBreak] = visited[curNode.first][curNode.second][curNode.third] + 1
//                q.add(Triple(ny, nx, isBreak))
//            } else if (map[ny][nx] == 1 && isBreak == 0) {
//                isBreak = 1
//                visited[ny][nx][isBreak] = visited[curNode.first][curNode.second][curNode.third] + 1
//                q.add(Triple(ny, nx, isBreak))
//            } else if (map[ny][nx] == 1 && isBreak == 1) {
//                continue
//            }
//        }
//    }
//    return -1
//}
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
//        map[i] = readLine().map { it.digitToInt() }.toIntArray()
//    }
//
//    visited = Array(n) { Array(m) { IntArray(2) { 0 } } }
//    val dist = bfs(Triple(0, 0, 0))
//
//    println(dist)
//}