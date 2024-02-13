package bac.easy


/*
    점프 점프(bfs, dp)

    * 항상 최소 최단거리 반환 문제를 자주 틀린다...

    최소 몇 번 점프를 해야 갈 수 있는지 구하는 프로그램을 작성하시오.
    만약, 가장 오른쪽 끝으로 갈 수 없는 경우에는 -1을 출력

    N(1 ≤ N ≤ 1,000)
    Ai (0 ≤ Ai ≤ 100)

    1. *완탐으로 풀면 안되는 이유.

    n = 1_000 이고
    100 100 100 100 ..... 100
    이라면 100*100*100*100... 너무 많은 경우의수.

    2. bfs visited로 방문 횟수를 제한한다.

    3. dp table을 이용하여 기존 최단거리를 이용한다.

 */

//    /*
//        bfs 풀이
//     */
//
//var n = 0
//lateinit var arr: IntArray
//
//lateinit var visited: IntArray
//
//fun go(start: Int) {
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(start)
//    visited[start] = 1
//
//    while (queue.isNotEmpty()) {
//        val node = queue.poll()
//
//        if (node + arr[node] >= n - 1) {
//            println(visited[node])
//            return
//        }
//
//        for (i in 1..arr[node]) {
//            val next = node + i
//            if (visited[next] == 0) {
//                visited[next] = visited[node] + 1
//                queue.add(next)
//            }
//        }
//    }
//    println(-1)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    if (n == 1) {
//        println(0)
//    } else {
//        visited = IntArray(n) { 0 }
//        go(0)
//    }
//
//    return@with Unit
//}


/*
    dp 풀이
 */

//import kotlin.math.min
//
//var n = 0
//lateinit var arr: IntArray
//
//val INF = 1_000_000_000
//val table = IntArray(1000) { INF }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    table[0] = 0
//    for (i in 0 until n) {
//        if (arr[i] != 0) {
//            for (j in 1..arr[i]) {
//                if (i + j > n - 1) continue
//                table[i + j] = min(table[i] + 1, table[i + j])
//            }
//        }
//    }
////    println(table.joinToString(" "))
//    if (table[n - 1] == INF)
//        println(-1)
//    else
//        println(table[n-1])
//
//    return@with Unit
//}


