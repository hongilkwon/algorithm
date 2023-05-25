package bac.week3


/*
    뮤탈리스크

    공격의 유형이 6개를 벗어나지 않는다 ->
    큐브 형태의 bfs 최단거리를 생각해야된다.

    공격 유형에 따른 그래프를 생각할 수 있어야 풀 수 있다.

 */

//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.max
//
//lateinit var hpArr: IntArray
//
//val attack = arrayOf(
//    arrayOf(9, 3, 1),
//    arrayOf(9, 1, 3),
//    arrayOf(3, 9, 1),
//    arrayOf(3, 1, 9),
//    arrayOf(1, 3, 9),
//    arrayOf(1, 9, 3),
//)
//
//lateinit var visited: Array<Array<Array<Int>>>
//
//fun bfs(life: Triple<Int, Int, Int>): Int {
//
//    visited[life.first][life.second][life.third] = 1
//    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
//    queue.add(life)
//
//    while (queue.isNotEmpty()) {
//
//        val l = queue.poll()
//
//        if (visited[0][0][0] != 0) break
//
//        for (i in 0 until attack.size) {
//            // 범위를 벗어나지 않도록 한다. 즉 index가 음수가되는걸 방지한다.
//            val na = max(l.first - attack[i][0], 0)
//            val nb = max(l.second - attack[i][1], 0)
//            val nc = max(l.third - attack[i][2], 0)
//
//            if (visited[na][nb][nc] > 0) continue
//            visited[na][nb][nc] += visited[l.first][l.second][l.third] + 1
//            queue.add(Triple(na, nb, nc))
//        }
//    }
//
//    return visited[0][0][0]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//
//    hpArr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    visited = Array(61) { Array(61) { Array(61) { 0 } } }
//
//    val triple = when (n) {
//        1 -> Triple(hpArr[0], 0, 0)
//        2 -> Triple(hpArr[0], hpArr[1], 0)
//        3 -> Triple(hpArr[0], hpArr[1], hpArr[2])
//        else -> Triple(0, 0, 0)
//    }
//
//    val cnt = bfs(triple)
//    println(cnt - 1)
//}