package programmers.lv2

/*
    배달


    마을의 개수 N, 각 마을을 연결하는 도로의 정보 road, 음식 배달이 가능한 시간 K가 매개변수로 주어질 때,
    음식 주문을 받을 수 있는 마을의 개수를 return

    1 <= N <= 50
    1 <= road.length <= 2_000
    1 <= K <= 500_000

    플로이드 와샬 / 다익스트라 둘다 가능해 보이지만,
    일단 노드가 고정된 상태에서 가중치를 구하는것이다 보니까, 효율성이 좀더 높은 다익스트라를 사용한다.
 */


//import java.util.*
//
//class Solution {
//
//    var n = 0
//    lateinit var road: Array<IntArray>
//    var k = 0
//
//    val INF = 1_000_000_000
//
//    lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//    lateinit var dist: IntArray
//
//    // w 기준 오름차순
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    fun dijkstra(node: Int) {
//        dist[node] = 0
//        pq.add(node to 0)
//
//        while (pq.isNotEmpty()){
//            // 현재 노드에서 가장 짧은 비용을 꺼냄.
//            val e = pq.poll()
//
//            // 이미 방문되어 최소값이 정해진 노드
//            if (dist[e.first] < e.second)
//                continue
//
//            for (next in adjList[e.first]) {
//                val v = next.first
//                val w = next.second
//                if (dist[v] > dist[e.first] + w) {
//                    dist[v] = dist[e.first] + w
//                    pq.add(v to dist[v])
//                }
//            }
//        }
//    }
//
//    fun solution(n: Int, road: Array<IntArray>, k: Int): Int {
//        var answer = 0
//
//        this.n = n
//        this.road = road
//        this.k = k
//
//        dist = IntArray(n + 1) { INF }
//        adjList = Array(n + 1) { mutableListOf() }
//
//        for (i in 0 until road.size) {
//            val u = road[i][0]
//            val v = road[i][1]
//            val w = road[i][2]
//            // 양방향
//            adjList[u].add(v to w)
//            adjList[v].add(u to w)
//        }
//
//        dijkstra(1)
//
//        var cnt = 0
//        for (i in 0 until dist.size){
//            if (dist[i] <= k) cnt += 1
//        }
//
//        return cnt
//    }
//}