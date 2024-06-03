package bac.etc


/*
   수영장 만들기(bfs, 탐색 활용).

    물은 항상 높이가 더 낮은 곳으로만 흐르고,
    직육면체 위의 표면에는 물이 없다. 그리고,
    땅의 높이는 0이고, 땅은 물을 무한대로 흡수 할 수 있다.

    1 <= N,M <= 50
    1 <= 높이 <= 9

    사고과정.

    어떻게 하면 수영장이 만들어지지? 상대적으로 높을곳으로 4방향이 둘러 쌓여 있다.

    물의 높이는 어떻게 정해지는가? 둘러쌓인 4개의 면중 가장 높이가 작은것으로 물이 채워진다.

    서로 단차가 생기는 물의 높이는 어떻게 할것인가???
    -> 탐색을 시작점을 기준으로 높이가 낮은 곳으로 하며,
    탐색을 끝내면, 물을 채워야됨.

    * 직육면체의 땅의 테두리 지역과 단 1개의 블록이라도 붙어 있다면? 물이 빠져서 물이 고일 수 없다.

    DFS ? BFS ?
    -> 어떤 탐색방법을 사용해도 문제를 푸는데 지장은 없어 보인다.
    하지만, 재귀적 방법인 DFS를 사용하면, 범위를 넘어서는 경우 함수의 종료가 쉽지 않음.

    * 왜 지속적으로 메모리 초과가 일어나는지 알수 없다. 동일한 로직을 python 작성하였을 경우 무리없이 통과한다.
    ????
*/


//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var pool: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var waterHeight = 9
//var points = mutableListOf<Pair<Int, Int>>()
//
//
//fun bfs(start: Pair<Int, Int>): Boolean {
//
//    val limitHeight = pool[start.first][start.second]
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    val visited = Array(n) { BooleanArray(m) { false } }
//
//    visited[start.first][start.second] = true
//    points.add(start)
//    queue.add(start)
//
//    while (queue.isNotEmpty()) {
//
//        val node = queue.poll()
//
//        for (i in 0 until 4) {
//            val ny = node.first + dy[i]
//            val nx = node.second + dx[i]
//            //  범위를 넘어서는 경우 함수의 종료
//            if (ny !in 0 until n || nx !in 0 until m)
//                return false
//
//            if (limitHeight < pool[ny][nx]) {
//                waterHeight = min(waterHeight, pool[ny][nx])
//                continue
//            }
//            if (visited[ny][nx]) continue
//
//            visited[ny][nx] = true
//            points.add(ny to nx)
//            queue.add(ny to nx)
//        }
//    }
//    return true
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    pool = Array(n) {
//        readLine().toString().map { it.digitToInt() }.toIntArray()
//    }
//
//    var cnt = 0
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            waterHeight = 9
//            points.clear()
//
//            val ret = bfs(i to j)
//            if (ret) {
//                for (p in points) {
//                    cnt += waterHeight - pool[p.first][p.second]
//                    pool[p.first][p.second] = waterHeight
//                }
//            }
//        }
//    }
//
//    println(cnt)
//    return@with Unit
//}