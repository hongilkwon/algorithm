package bac.etc


/*
    음악프로그램(위상정렬)

    1 <= N <= 1_000
    1 <= M <= 100
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
//val order = mutableListOf<Int>()
//
//fun topologySort() {
//
//    val queue: Queue<Int> = LinkedList()
//
//    // inDegree 가 0이면 가장 앞서기 때문에, queue에 삽입.
//    for (i in 1 until inDegree.size) {
//        if (inDegree[i] == 0) queue.add(i)
//    }
//
//    for (i in 1 until inDegree.size) {
//        // 모든 노드의 순서를 정하기 전에 queue가 비워지면 cycle이 존재.
//        if (queue.isEmpty()) {
//            isCycle = true
//            return
//        }
//
//        // queue에서 꺼내서 연결된 모든 edge를 제거한다.
//        val node = queue.poll()
//        order.add(node)
//
//        for (next in adjList[node]) {
//            // inDegree 줄이는 방식으로 제거
//            inDegree[next] -= 1
//
//            // inDegree 가 0인 노드가 되었다면, Queue에 삽입
//            if (inDegree[next] == 0) {
//                queue.add(next)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info1 = readLine().split(" ").map { it.toInt() }
//    n = info1[0]
//    m = info1[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    inDegree = IntArray(n + 1) { 0 }
//
//    for (i in 0 until m) {
//        val info2 = readLine().split(" ").map { it.toInt() }
//        if (info2[0] == 1) continue
//        for (j in 1 until info2[0]) {
//            val u = info2[j]
//            val v = info2[j + 1]
////            println("$u -> $v")
//            adjList[u].add(v)
//            inDegree[v] += 1
//        }
//    }
//
//    topologySort()
//
//    if (isCycle) {
//        println(0)
//    } else {
//        val sb = StringBuilder()
//        for (i in order) {
//            sb.append("${i}\n")
//        }
//
//        println(sb.toString())
//    }
//
//    return@with Unit
//}
