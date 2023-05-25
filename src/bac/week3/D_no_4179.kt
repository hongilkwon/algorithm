package bac.week3

/*
   불

    탈출 성공 및 실패의 기준을 잡는게 매우 어려웠다.
    2개 점에서 bfs 결과값을 비교,
    또한 시작점이 여러개인 bfs를 사용시(불이 퍼지는 과정) 나타날수 있는 결과를 예측하기 힘들다.

    특이케이스
    - 불이 존재하지 않을 수 있다.

    *틀린 문제 나중에 다시 푼다.
 */

//import java.util.LinkedList
//import java.util.Queue
//
//var rows = 0
//var cols = 0
//
//lateinit var map: Array<CharArray>
//lateinit var fireVisited: Array<IntArray>
//lateinit var personVisited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val answer = mutableListOf<Int>()
//
//fun personBfs(point: Pair<Int, Int>, isFire: Boolean) {
//
//    personVisited[point.first][point.second] = 1
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    queue.add(point)
//
//    while (queue.isNotEmpty()) {
//
//        val p = queue.poll()
//
//        if (p.first == 0 || p.first == rows-1 || p.second == 0 || p.second == cols-1) {
//            answer.add(personVisited[p.first][p.second])
//        }
//
//        for (i in 0 until 4) {
//            val ny = p.first + dy[i]
//            val nx = p.second + dx[i]
//
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//            if (map[ny][nx] == '#') continue
//            if (personVisited[ny][nx] >= 1) continue
//            if (isFire){
//                if (fireVisited[ny][nx] <= (personVisited[p.first][p.second] + 1)) continue
//            }
//
//            personVisited[ny][nx] = personVisited[p.first][p.second] + 1
//            queue.add(ny to nx)
//        }
//    }
//}
//
//fun fireBfs(points: List<Pair<Int, Int>>) {
//
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    points.forEach { queue.add(it) }
//
//    val point = points.first()
//    fireVisited[point.first][point.second] = 1
//
//    while (queue.isNotEmpty()) {
//
//        val p = queue.poll()
//
//        for (i in 0 until 4) {
//            val ny = p.first + dy[i]
//            val nx = p.second + dx[i]
//
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//            if (map[ny][nx] == '#') continue
//            if (fireVisited[ny][nx] >= 1) continue
//
//            fireVisited[ny][nx] = fireVisited[p.first][p.second] + 1
//            queue.add(ny to nx)
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { CharArray(cols) { ' ' } }
//    personVisited = Array(rows) { IntArray(cols) { 0 } }
//    fireVisited = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until rows) {
//        map[i] = readLine().toCharArray()
//    }
//
//    var startP = 0 to 0
//    val fireList = mutableListOf<Pair<Int, Int>>()
//
//    out@ for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] == 'J') {
//                startP = i to j
//            }
//            if (map[i][j] == 'F'){
//                fireList.add(i to j)
//            }
//        }
//    }
//
//    var isFire = true
//    if (fireList.isNotEmpty()){
//        fireBfs(fireList)
//    }else{
//        isFire = false
//    }
//    personBfs(startP, isFire)
//
//    if (answer.isNotEmpty()){
//       println(answer.minOrNull())
//    }else{
//        println("IMPOSSIBLE")
//    }
//    Unit
//}


