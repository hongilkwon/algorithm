package bac.week3.concept



/*
    숨박꼭질

    1. 수빈이 앞에 동생이 있는 경우
    2. 수빈이 뒤에 동생이 있는 경우
 */

//import java.util.LinkedList
//import java.util.Queue
//
//lateinit var visited: Array<Int>
//
//fun bfs(point: Int) {
//
//    visited[point] = 1
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
//            if (np !in 0..100_000) continue
//            if (visited[np] > 0) continue
//
//            visited[np] = visited[p] + 1
//            queue.add(np)
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val su = info[0]
//    val bro = info[1]
//
//    visited = Array(100_001) { 0 }
//
//    var answer = 0
//    if (su >= bro) {
//        answer = su - bro
//    } else {
//        bfs(su)
//        answer= visited[bro] - 1
//    }
//
//    println(answer)
//}