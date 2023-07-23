package bac.week8

import java.util.*


/*
    미확인 도착지

    최단거리로 노드를 탐색할떄,
    특정 간선을 지나갔다는 것을 이용해서
    어떤 노드로 가는지 맞추는것.

     자연수 * 짝수  = 짝수

     짝수 + 짝수 = 짝수
     짝수 + 홀수 = 홀수

     * 특정 간선의 가중치를 홀수로 셋팅하여 그 간선을 지났는지 확인함.

 */

//var n = 0
//var m = 0
//var t = 0
//lateinit var destinationArr: IntArray
//
//var s = 0
//var g = 0
//var h = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//
//const val INF = 1_000_000_000
//lateinit var dist: IntArray
//
//fun dijkstra(start: Int) {
//
//
//    dist = IntArray(n + 1) { INF }
//    dist[start] = 0
//
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//        val edge = pq.poll()
//        val selectedNode = edge.first
//
//        if (dist[selectedNode] < edge.second) continue
//
//        for (next in adjList[selectedNode]) {
//            val v = next.first
//            val w = next.second
//            val cost = dist[selectedNode] + w
//            if (dist[v] > cost) {
//                dist[v] = cost
//                pq.add(v to cost)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        m = info[1]
//        t = info[2]
//
//        val info2 = readLine().split(" ").map { it.toInt() }
//        s = info2[0]
//        g = info2[1]
//        h = info2[2]
//
//        adjList = Array(n + 1) { mutableListOf() }
//        for (i in 1..m) {
//            val eInfo = readLine().split(" ").map { it.toInt() }
//            val u = eInfo[0]
//            val v = eInfo[1]
//            var w = eInfo[2] * 2
//
//            if ((u == g && v == h) || (u == h && v == g)) {
//                w -= 1
//            }
//
//            adjList[u].add(v to w)
//            adjList[v].add(u to w)
//        }
//
//        destinationArr = IntArray(t) { -1 }
//
//        for (i in 0 until t) {
//            destinationArr[i] = readLine().toInt()
//        }
//        destinationArr.sort()
//
//        dijkstra(s)
//        for (i in 0 until t) {
//            if (dist[destinationArr[i]] % 2 == 1)
//                print("${destinationArr[i]} ")
//        }
//        println()
//    }
//    Unit
//}
