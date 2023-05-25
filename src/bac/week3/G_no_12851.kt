package bac.week3

/*

숨박꼭질2

특정 노드에 도착하는 경우의 수를 구하는 문제
특정노드에 도달할 수 있는 직전 노드들의 경우의 수의 합이다.

 */

//import java.util.LinkedList
//import java.util.Queue
//
//lateinit var visited: Array<Int>
//lateinit var cnt: Array<Int>
//fun bfs(point: Int) {
//
//    visited[point] = 1
//    cnt[point] = 1
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(point)
//
//    while (queue.isNotEmpty()) {
//
//        val p = queue.poll()
//
//        for (i in 0 until 3) {
//            val np =
//                when (i) {
//                    0 -> p - 1
//                    1 -> p + 1
//                    else -> p * 2
//                }
//
//            if (np !in 0..200_000) continue
//
//            if (visited[np] == 0) {
//                visited[np] = visited[p] + 1
//                cnt[np] += cnt[p]
//                queue.add(np)
//            } else if (visited[np] == visited[p] + 1) {
//                cnt[np] += cnt[p]
//            }
//        }
//    }
//}
//
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val su = info[0]
//    val bro = info[1]
//
//    visited = Array(200_001) { 0 }
//    cnt = Array(200_001) { 0 }
//
//    var answer = 0
//
//    if (su >= bro) {
//        answer = su - bro
//        println(answer)
//        println(1)
//    } else {
//        bfs(su)
//        answer = visited[bro] - 1
//        println(answer)
//        println(cnt[bro])
//    }
//}