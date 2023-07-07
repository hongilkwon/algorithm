package bac.week8


/*
    달빛 여우

    N, M(2 ≤ N ≤ 4,000, 1 ≤ M ≤ 100,000)

    실수형(double 연산을 줄이기 위해 가중치를 2배로 입력받는다.)


    * 다익스트라의 그리디 및 dp의 성질을 이용한문제
    시간초과는 언어특성상 어쩔수 없는것같다.
 */

//import kotlin.math.min
//import java.util.*
//
//
//const val INF = 1_000_000_000
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//lateinit var distFox: Array<Int>
//lateinit var distWolf: Array<Array<Int>>
//fun goFox(start: Int) {
//
//    distFox = Array(n + 1) { INF }
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    distFox[start] = 0
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//
//        val edge = pq.poll()
//        val selectedNode = edge.first
//
//        if (distFox[selectedNode] < edge.second) continue
//        for (next in adjList[selectedNode]) {
//            val v = next.first
//            val w = next.second
//            val cost = distFox[selectedNode] + w
//            if (distFox[v] > cost) {
//                distFox[v] = cost
//                pq.add(v to cost)
//            }
//        }
//    }
//}
//
//fun goWolf(start: Int) {
//    // 홀수번째/짝수번쨰로 간선을 지나고 있는 상태를 기록하기 위해 2차원 배열로 만든다.
//    // distWolf[nodeIdx][0] = 짝수 간선 distWolf[nodeIdx][1] = 홀수 간선.
//    distWolf = Array(n + 1) { Array(2) { INF } }
//    distWolf[start][0] = 0
//
//    val pq = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third })
//    // first = nodeIdx, second = flag, third = w
//    pq.add(Triple(start, 0, 0))
//
//    while (pq.isNotEmpty()) {
//
//        val edge = pq.poll()
//        val selectedNode = edge.first
//        val flag = edge.second
//
//        if (distWolf[selectedNode][flag] < edge.third) continue
//
//        for (next in adjList[selectedNode]) {
//
//            val v = next.first
//            val w = if (flag == 0) next.second / 2 else next.second * 2
//            val cost = distWolf[selectedNode][flag] + w
//
//            val nFlag = if (flag == 1) 0 else 1
//            if (distWolf[v][nFlag] > cost) {
//                distWolf[v][nFlag] = cost
//                pq.add(Triple(v, nFlag, cost))
//            }
//        }
//    }
//}
//
//val bw = System.out.bufferedWriter()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    adjList = Array(n + 1) { mutableListOf() }
//
//
//    for (i in 1..m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        adjList[edgeInfo[0]].add(edgeInfo[1] to edgeInfo[2] * 2)
//        adjList[edgeInfo[1]].add(edgeInfo[0] to edgeInfo[2] * 2)
//    }
//
//    goFox(1)
//    goWolf(1)
////    println(distFox.joinToString(" "))
////    distWolf.forEach {
////        print("["+it.joinToString(",")+"] ")
////    }
//
//    var cnt = 0
//    for (i in 2..n) {
//        val d = min(distWolf[i][0], distWolf[i][1])
//        if (d > distFox[i])
//            cnt += 1
//    }
//    bw.write(cnt.toString())
//    bw.flush()
//    bw.close()
//    Unit
//}