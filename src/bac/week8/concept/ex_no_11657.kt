package bac.week8.concept

/*
    벨만포드

    음수 가중치의 간선이 있는 그래프의 최단거리.

    N = 노드의 개수
    E = 간선의 개수.

    1. 출발 노드를 설정한다.
    2. 최단거리 테이블을 초기화 한다(INF)
    3. 다음 과정을 N-1번 반복한다.
        - "전체 간선" E개를 하나씩 확인합니다.
        - 각 간선을 거쳐 다른 노드로 가는 비용을 계산하여 최단거리 테이블을 갱신한다.

    * 3번의 동작을 반복할때 최단거리 테이블의 거리가 더 작은 값으로 갱신된다면,
    음의 간선 순환이 존재한다.

 */

const val INF = Long.MAX_VALUE

var n = 0
var m = 0

lateinit var edgeArr: Array<Triple<Int, Int, Int>>
lateinit var dist: Array<Long>

var containsCycle = false
fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    n = info[0]
    m = info[1]
    edgeArr = Array(m + 1) { Triple(0, 0, 0) }

    for (i in 1..m) {
        val eInfo = readLine().split(" ").map { it.toInt() }
        edgeArr[i] = Triple(eInfo[0], eInfo[1], eInfo[2])
    }


    dist = Array(n + 1) { INF }
    dist[1] = 0

    // 모든 node를 순회한다.
    for (i in 1..n) {
        // 반복마다 모든 간선을 확인 한다.
        for (j in 1..m) {
            val curNode = edgeArr[j].first
            val nextNode = edgeArr[j].second
            val weight = edgeArr[j].third
            //
            if (dist[curNode] != INF && dist[nextNode] > dist[curNode] + weight) {
                if (i == n) {
                    containsCycle = true
                }
                dist[nextNode] = dist[curNode] + weight
            }
        }
    }

//    println(dist.joinToString(" "))
    if (containsCycle) {
        println(-1)
    } else {
        for (i in 2 until dist.size) {
            if (dist[i] == INF) println(-1) else println(dist[i])
        }
    }
}