package bac.etc

/*
    회장뽑기(bfs)

    최단거리

    몇 사람을 통하면 모두가 서로 알 수 있다

    각 회원의 점수를 정할 때 주의할 점은 어떤 두 회원이 친구사이이면서 동시에 친구의 친구사이이면, 이 두사람은 친구사이라고 본다
    회장은 회원들 중에서 점수가 가장 작은 사람이 된다

    회장의 점수와 회장이 될 수 있는 모든 사람을 찾는

 */

//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//
//lateinit var points: IntArray
//
//lateinit var dist: IntArray
//fun bfs(start: Int) {
//
//    dist = IntArray(n + 1) { 0 }
//
//    val queue: Queue<Int> = LinkedList()
//
//    dist[start] = 1
//    queue.add(start)
//
//    while (queue.isNotEmpty()) {
//
//        val node = queue.poll()
//
//        for (next in adjList[node]) {
//            if (dist[next] == 0) {
//                dist[next] = dist[node] + 1
//                queue.add(next)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    adjList = Array(n + 1) { mutableListOf() }
//
//    while (true) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val (u, v) = edge
//
//        if (u == -1 && v == -1)
//            break
//
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    points = IntArray(n + 1) { 0 }
//    points[0] = 51
//    for (i in 1..n) {
//        bfs(i)
//        points[i] = dist.maxOrNull() ?: 0
//    }
//
//    val minPoint = points.minOrNull() ?: 0
//    val tempList = mutableListOf<Int>()
//    for (i in 1..n) {
//        if (points[i] == minPoint) {
//            tempList.add(i)
//        }
//    }
//
//    println("${minPoint - 1} ${tempList.size}")
//    println(tempList.joinToString(" "))
//    return@with Unit
//}
