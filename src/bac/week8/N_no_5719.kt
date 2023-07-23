package bac.week8

/*
    거의 최단경로

    최단거리 특정점에서 시작(dijkstra)

 */

//import java.util.*
//
//const val INF = 1_000_000_000
//
//var n = 0
//var m = 0
//
//var s = 0
//var d = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//lateinit var adjMatrix: Array<Array<Int>>
//lateinit var dist: Array<Int>
//
//val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//
//fun dijkstra(startNode: Int) {
//    dist = Array(n) { INF }
//    pq.clear()
//    // 시작 노드 거리 테이블 초기화 및 우선순위 큐에 넣음
//    dist[startNode] = 0
//    pq.add(startNode to 0)
//
//    while (pq.isNotEmpty()) {
//        // 현재 위치에서 최소비용으로 갈 수 있는 노드를 꺼냄.
//        val edge = pq.poll()
//        val selectedNode = edge.first
//
//        // 이미 최소값이 정해진 노드 -> 이미 방문했다면 넘어감.
//        if (dist[selectedNode] < edge.second)
//            continue
//
//        for (nEdge in adjList[selectedNode]) {
//
//            val v = nEdge.first
//            val cost = dist[selectedNode] + nEdge.second
//
//            // 최단거리 간선이라면 하지 않음.
//            if (adjMatrix[selectedNode][v] == -1) continue
//            // 선택된 노드를 거쳐가는 비용이 짧다면 테이블을 갱신하고, 정점에 도달하는 최단거리 페어를 큐에 넣는다.
//            if (dist[v] > cost) {
//                dist[v] = cost
//                pq.add(v to cost)
//            }
//        }
//
////        for (i in 0 until n) {
////
////            // 최단거리 간선이라면 하지 않음.
////            if (adjMatrix[selectedNode][i] == -1) continue
////
////            val cost = dist[selectedNode] + adjMatrix[selectedNode][i]
////            // 선택된 노드를 거쳐가는 비용이 짧다면 테이블을 갱신하고, 정점에 도달하는 최단거리 페어를 큐에 넣는다.
////            if (dist[i] > cost) {
////                dist[i] = cost
////                pq.add(i to cost)
////            }
////        }
//    }
//}
//
//fun erase() {
//
//    val q: Queue<Int> = LinkedList()
//    q.add(d)
//
//    while (q.isNotEmpty()) {
//        val nodeIdx = q.poll()
//        for (i in 0 until n) {
//            // 끝 노드부터 뒤로 가면서
//            // 인접행렬을 통해여  i---> nodeidx 가는 간선이 있고, 그 간선이 최단거리 간선이라면 (dist[nodeIdx] == dist[i] + adjMatrix[i][nodeIdx])
//            // 다음 에는 없는 간선처럼 표기한다.
//            if (dist[nodeIdx] == dist[i] + adjMatrix[i][nodeIdx] && adjMatrix[i][nodeIdx] != -1) {
//                adjMatrix[i][nodeIdx] = -1
//                q.add(i)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//        val info1 = readLine().split(" ").map { it.toInt() }
//        n = info1[0]
//        m = info1[1]
//
//        if (n == 0 && m == 0) break
//
//        val info2 = readLine().split(" ").map { it.toInt() }
//        s = info2[0]
//        d = info2[1]
//
//        adjList = Array(n) { mutableListOf() }
//        adjMatrix = Array(n) { Array(n) { -1 } }
//
//
//        for (i in 1..m) {
//            val edgeInfo = readLine().split(" ").map { it.toInt() }
//            adjList[edgeInfo[0]].add(edgeInfo[1] to edgeInfo[2])
//            adjMatrix[edgeInfo[0]][edgeInfo[1]] = edgeInfo[2]
//        }
//
//        dijkstra(s)
//        erase()
//        dijkstra(s)
//        println(if (dist[d] == INF) -1 else dist[d])
//    }
//
//    Unit
//}
