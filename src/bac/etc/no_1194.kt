package bac.etc


/*
    달이 차 오른다, 가자! (BFS)

    이동 횟수의 최솟값을 구하는 프로그램
    (1 ≤ N, M ≤ 50)

    재방문을 허용함?
    노드를 방문할때 열쇠의 상태에 따라 나눔.

    1개의 상태를 더 저장할 차원이 필요함 ---> lateinit var visited: Array<Array<IntArray>>
 */


//import java.util.*
//
//
//var row = 0
//var col = 0
//
//lateinit var map: Array<CharArray>
//lateinit var start: Triple<Int, Int, Int>
//lateinit var visited: Array<Array<IntArray>>
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//
//val keyArr = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
//val doorArr = charArrayOf('A', 'B', 'C', 'D', 'E', 'F')
//
//fun isExistKey(door: Char, curKeys: Int): Boolean =
//    curKeys and (1 shl keyArr.indexOf(door.lowercaseChar())) != 0
//
//fun bfs(start: Triple<Int, Int, Int>): Int {
//
//    val q: Queue<Triple<Int, Int, Int>> = LinkedList()
//    q.add(start)
//
//    visited[start.first][start.second][start.third] = 1
//    map[start.first][start.second] = '.'
//
//    while (q.isNotEmpty()) {
//
//        val curNode = q.poll()
//        val key = curNode.third
//
//        for (i in 0 until 4) {
//
//            val ny = curNode.first + dy[i]
//            val nx = curNode.second + dx[i]
//
//            if (ny !in 0 until row || nx !in 0 until col) continue
//            if (map[ny][nx] == '#') continue
//            // 특정 키의 상태를 가지고 이미 방문 했다면
//            if (visited[ny][nx][key] > 0) continue
//
//            if (map[ny][nx] in keyArr) {
//                // 열쇠를 만나는 경우.
//                val idx = keyArr.indexOf(map[ny][nx])
//                val nKeys = key or (1 shl idx)
//                visited[ny][nx][nKeys] = visited[curNode.first][curNode.second][curNode.third] + 1
//                q.add(Triple(ny, nx, nKeys))
//            } else if (map[ny][nx] in doorArr) {
//                // 문을 만나는 경우.
//                if (isExistKey(map[ny][nx], key)) {
//                    visited[ny][nx][key] = visited[curNode.first][curNode.second][curNode.third] + 1
//                    q.add(Triple(ny, nx, key))
//                }
//            } else if (map[ny][nx] == '.') {
//                visited[ny][nx][key] = visited[curNode.first][curNode.second][curNode.third] + 1
//                q.add(Triple(ny, nx, key))
//            } else if (map[ny][nx] == '1') {
//                return visited[curNode.first][curNode.second][curNode.third]
//            }
//        }
//    }
//    return -1
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    row = info[0]
//    col = info[1]
//
//    map = Array(row) { charArrayOf() }
//    for (i in 0 until row) {
//        map[i] = readLine().toCharArray()
//    }
//
//    for (i in 0 until row) {
//        for (j in 0 until col) {
//            if (map[i][j] == '0') {
//                start = Triple(i, j, 0)
//            }
//        }
//    }
//
//    visited = Array(row) { Array(col) { IntArray(1 shl 6) { 0 } } }
//
//    val answer = bfs(start)
//    println(answer)
//}

