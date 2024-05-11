package bac.etc


/*
    현대모비스 자율주행 테스트 1

    1 <= n <= 100_000
    1 <= k <= 1_000_000_000

    사고과정

    1. bfs -> 트렉의 최단거리
    2. 트랙의 연결부분 처리 --> 4*4 = 16개? 처리해야할 경우가 너무 많다.
    3. 왜 트랙을 이어붙히면 최단거리가 달라질까?

    시작 - 끝 시작 - 끝 시작 - 끝.....

    예시)

    . . . # .
    . # . . .

    . . . # . . . . # .
    . # . . . . # . . .

    트랙을 1개의 최단거리
    트랙을 2개만 연결하여 최단거리를 구하면, 트랙 + 연결부위 + 트랙의 최단거리가 나온다

    그럼 트랙을 2개 연결한 최단거리 - 트랙 1개의 최단거리 = 트랙 1개 + 연결부위 까지의 최단거리가 나온다.

    (k-1)개를 연결하고 나머지 트랙 1개의 최단거리를 더해주면 최종 최단거리가 나온다.

    배운점
    가중치가 동일한 그래프의 최단거리 문제라 bfs를 사용하겠다는 건 쉽게 생각할 수있다.
    하지만, 연결할 트랙이 K(10억개)라 트랙이 1번 연결될때 어떤 특징을 잡아서 반복되는지 확인해야된다.
*/


//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.min
//
//val INF = 1_000_000_000
//
//var n = 0
//var k = 0
//
//lateinit var track: Array<CharArray>
//lateinit var doubleTrack: Array<CharArray>
//
//lateinit var visited: Array<Array<IntArray>>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun bfs(start: Int, node: Pair<Int, Int>, track: Array<CharArray>) {
//
//    if (track[node.first][node.second] == '#') {
//        return
//    }
//
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    queue.add(node)
//    visited[start][node.first][node.second] = 1
//
//    while (queue.isNotEmpty()) {
//
//        val current = queue.poll()
//
//        for (i in 0 until 4) {
//            val ny = current.first + dy[i]
//            val nx = current.second + dx[i]
//
//            if (ny !in 0 until track.size || nx !in 0 until track.first().size)
//                continue
//            if (track[ny][nx] == '#')
//                continue
//            if (visited[start][ny][nx] > 0)
//                continue
//
//            visited[start][ny][nx] = visited[start][current.first][current.second] + 1
//            queue.add(ny to nx)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    track = Array(2) {
//            readLine().toCharArray()
//    }
//    doubleTrack = Array(2) {
//        track[it].copyOf() + track[it].copyOf()
//    }
//
//    visited = Array(2) { Array(2) { IntArray(2 * n) { 0 } } }
//    bfs(start = 0, node = 0 to 0, track)
//    bfs(start = 1, node = 1 to 0, track)
////    visited.forEach { sp ->
////        sp.forEach { println(it.joinToString(" ")) }
////        println()
////    }
//    var track1 = INF
//    for (sp in 0 until 2) {
//        for (row in 0 until 2) {
//            if (visited[sp][row][n - 1] != 0)
//                track1 = min(track1, visited[sp][row][n - 1] - 1)
//        }
//    }
//
//    if (track1 == INF) {
//        println(-1)
//        return@with
//    }
//
//    visited = Array(2) { Array(2) { IntArray(2 * n) { 0 } } }
//    bfs(start = 0, node = 0 to 0, doubleTrack)
//    bfs(start = 1, node = 1 to 0, doubleTrack)
////    visited.forEach { sp ->
////        sp.forEach { println(it.joinToString(" ")) }
////        println()
////    }
//    var track2 = INF
//    for (sp in 0 until 2) {
//        for (row in 0 until 2) {
//            if (visited[sp][row][2 * n - 1] != 0)
//                track2 = min(track2, visited[sp][row][2 * n - 1]- 1)
//        }
//    }
//    if (k != 1 && track2 == INF) {
//        println(-1)
//        return@with
//    }
//
//    val answer: Long = (track2.toLong() - track1.toLong()) * (k - 1).toLong() + track1.toLong()
//    println(answer)
//
//    return@with Unit
//}