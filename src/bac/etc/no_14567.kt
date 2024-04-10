package bac.etc


/*
   선수과목(위상정렬)

   공학인증을 포기할 수 없는 불쌍한 민욱이는 선수과목 조건을 반드시 지켜야만 한다.

   과목의 수 N(1 ≤ N ≤ 1_000)
   선수 조건의 수 M(0 ≤ M ≤ 500_000)
*/


//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//lateinit var inDegree: IntArray
//
//var isCycle = false
//val order = mutableListOf<Pair<Int, Int>>()
//fun topologySort() {
//
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//
//    for (i in 1 until inDegree.size) {
//        if (inDegree[i] == 0) queue.add(i to 1)
//    }
//
//    for (i in 1 until inDegree.size) {
//        if (queue.isEmpty()) {
//            isCycle = true
//            return
//        }
//
//        val node = queue.poll()
//        order.add(node)
//
//        val idx = node.first
//        val term = node.second
//
//        for (next in adjList[idx]) {
//            inDegree[next] -= 1
//
//            if (inDegree[next] == 0) {
//                queue.add(next to term + 1)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    inDegree = IntArray(n + 1) { 0 }
//
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//
//        adjList[u].add(v)
//        inDegree[v] += 1
//    }
//
//    topologySort()
//    println(order)
//
//    val temp = IntArray(n)
//    for (e in order) {
//        val idx = e.first - 1
//        val term = e.second
//        temp[idx] = term
//    }
//
//    println(temp.joinToString(" "))
//    return@with Unit
//}