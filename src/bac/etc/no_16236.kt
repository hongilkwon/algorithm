package bac.etc

/*
    아기 상어 (조건과 bfs의 성질을 잘 이용한 문제)

    N(2 ≤ N ≤ 20)

    0: 빈 칸
    1, 2, 3, 4, 5, 6: 칸에 있는 물고기의 크기
    9: 아기 상어의 위치

    가장 처음에 아기 상어의 크기는 2이고

    아기 상어는 자신의 크기보다 작은 물고기만 먹을 수 있다
    고기는 먹을 수 없지만, 그 물고기가 있는 칸은 지나갈 수 있다.

    먹을 수 있는 물고기가 1마리라면, 그 물고기를 먹으러 간다.
    먹을 수 있는 물고기가 1마리보다 많다면, 거리가 가장 가까운 물고기를 먹으러 간다
    .
    거리는 아기 상어가 있는 칸에서 물고기가 있는 칸으로 이동할 때, 지나야하는 칸의 개수의 최솟값이다.
    거리가 가까운 물고기가 많다면, 가장 위에 있는 물고기, 그러한 물고기가 여러마리라면, 가장 왼쪽에 있는 물고기를 먹는다.

    아기 상어의 이동은 1초 걸리고, 물고기를 먹는데 걸리는 시간은 없다고 가정한다.
    아기 상어는 자신의 크기와 같은 수의 물고기를 먹을 때 마다 크기가 1 증가한다.

    먹이보다 작으면 못지나감,
    먹이랑 같은면 지나만감,
    먹이보다 크면 먹음.

    1순위 최단거리
    2순위 위
    3순위 왼

    크기 2 --> 3 2마리 먹어야
 */

//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//
//lateinit var map: Array<IntArray>
//
//var exp = 0
//var babySharkSize = 2
//var babySharkPos = 0 to 0
//
//lateinit var visited: Array<IntArray>
//val feeds: MutableList<Triple<Int, Int, Int>> = mutableListOf()
//
//// 역 시계 탐색 (위 왼 좌 아래)
//val dy = arrayOf(-1, 0, 0, 1)
//val dx = arrayOf(0, -1, 1, 0)
//
//var moveCnt = 0
//fun bfs(start: Pair<Int, Int>) {
//
//    visited = Array(n) { IntArray(n) { 0 } }
//
//    val q: Queue<Pair<Int, Int>> = LinkedList()
//    q.add(start)
//    visited[start.first][start.second] = 1
//
//    while (q.isNotEmpty()) {
//
//        val curNode = q.poll()
//
//        for (i in 0 until 4) {
//            val ny = curNode.first + dy[i]
//            val nx = curNode.second + dx[i]
//
//            if (ny !in 0 until n || nx !in 0 until n) continue
//            if (visited[ny][nx] > 0) continue
//            if (map[ny][nx] > babySharkSize) continue
//
//            if (map[ny][nx] in 1 until babySharkSize) {
//                feeds.add(Triple(ny, nx, visited[curNode.first][curNode.second]))
//            }
//
//            q.add(ny to nx)
//            visited[ny][nx] = visited[curNode.first][curNode.second] + 1
//        }
//    }
//}
//
//
//fun eat() {
//
//    feeds.sortWith(compareBy<Triple<Int, Int, Int>> { it.third }.thenBy { it.first }.thenBy { it.second })
//    val feed = feeds.first()
//    feeds.clear()
//
//    map[feed.first][feed.second] = 0
//    babySharkPos = feed.first to feed.second
//    moveCnt += feed.third
//
//    exp +=1
//    if (babySharkSize == exp){
//        exp = 0
//        babySharkSize += 1
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    map = Array(n) { IntArray(n) { 0 } }
//    for (i in 0 until map.size) {
//        val line = readLine().split(" ").map { it.toInt() }
//        map[i] = line.toIntArray()
//    }
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] == 9) {
//                babySharkPos = i to j
//            }
//        }
//    }
//
//    map[babySharkPos.first][babySharkPos.second] = 0
//    while (true) {
//        bfs(babySharkPos)
//        if (feeds.isEmpty()) break
//        eat()
//
//    }
//    println(moveCnt)
//}
//




