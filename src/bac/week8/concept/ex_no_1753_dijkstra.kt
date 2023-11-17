package bac.week8.concept

/*
    최단경로(다익스트라)

     (1 ≤ V ≤ 20,000, 1 ≤ E ≤ 300,000)
     서로 다른 두 정점 사이에 여러 개의 간선이 존재할 수도 있음

     다익스트라 최단거리 알고리즘.
     - "특정" 노드에서 다른 "모든"노드로 가는 최단경로를 계산한다.
     - 양의 가중치에서 사용한다.
     - 매 상황에서 가장 비용이 적은 노드를 선택한다(최적해)
     - 그리디/dp 유형의 알고리즘이다.

    1. 출발 노드를 정한다.
    2. 최단거리 테이블(Array 등) INF 초기화 한다.
    3. "방문하지 않은 노드"중에서 최단거리(비용)이 가장 짧은 노드를 선택한다. --> 이때 선택된 노드로 가는 최단거리는 추후 변경이 안된다.
    4. 3번에서 선택한 노드를 거쳐 다른 노드로 가는 비용을 계산하여 최단거리 테이블을 갱신합니다.

    * 방문하지 않은 노드중에 최단 거리 가장 짧은 노드를 선택할 때 PriorityQueue 사용한다.

 */

//import java.util.PriorityQueue
//
//var v = 0
//var e = 0
//
//// 시작점
//var k = 0
//
//val INF = 1_000_000_000
//
//val adj = Array(20_001) { mutableListOf<Pair<Int, Int>>() }
//val distance = Array(20_001) { INF }
//
//val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    v = info[0]
//    e = info[1]
//
//    k = readLine().toInt()
//
//    for (i in 1..e) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        adj[edgeInfo[0]].add(edgeInfo[1] to edgeInfo[2])
//    }
//
//    distance[k] = 0
//    priorityQueue.add(k to 0)
//
//    while (priorityQueue.isNotEmpty()) {
//        // 현재 노드에서 가장 짧은 비용을 꺼냄.
//        val edge = priorityQueue.poll()
//
//        // 거리 테이블에 기록된 값이 새로 연상되어 완화된 값보다 작으면 --> 이미 방문되어 최소값이 정해진 노드
//        if (distance[edge.first] < edge.second)
//            continue
//
//        for (next in adj[edge.first]) {
//            val idx = next.first
//            val w = next.second
//            if (distance[idx] > distance[edge.first] + w) {
//                distance[idx] = distance[edge.first] + w
//                priorityQueue.add(idx to distance[idx])
//            }
//        }
//    }
//
//    for (i in 1 ..v){
//        if (distance[i] == INF){
//            println("INF")
//        }else{
//            println(distance[i])
//        }
//    }
//}