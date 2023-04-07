package bac.week2

/*
미로탐색
2-A

그래프의 간선에 가중치가 부여되어 있지 않다면,
BFS 이용하여 최단거리를 계산가능하다.

   지도에서 접근가능한 지역인지(index 범위)확인을 가장 먼저한다.
   if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
   if (map[ny][nx] == 0) continue

 */

//var rows: Int = 0
//var cols: Int = 0
//lateinit var arrSD: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//lateinit var q: Queue<Pair<Int, Int>>
//
//fun bfs(map: Array<IntArray>, point: Pair<Int, Int>) {
//
//    arrSD[point.first][point.second] = 1
//    q.add(point)
//
//    while (q.isNotEmpty()) {
//
//        val p = q.peek()
//        q.poll()
//
//        for (i in 0 until 4){
//            val ny = p.first + dy[i]
//            val nx = p.second + dx[i]
//
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//            if (map[ny][nx] == 0) continue
//            if (arrSD[ny][nx] != 0) continue
//
//            arrSD[ny][nx] = arrSD[p.first][p.second] +1
//            q.add(ny to nx)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    rows = info[0]
//    cols = info[1]
//
//    val map = Array(rows) { IntArray(cols) { 0 } }
//    arrSD = Array(rows) { IntArray(cols) { 0 } }
//    q = LinkedList()
//
//    for (i in 0 until rows) {
//        val arr = readLine().toString().map { it.toString().toInt() }
//        for (j in 0 until arr.size) {
//            map[i][j] = arr[j]
//        }
//    }
//
//    bfs(map, 0 to 0)
//    println(arrSD[rows-1][cols-1])
//}