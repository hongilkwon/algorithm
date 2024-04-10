package bac.etc


/*
    줄 세우기(위상정렬)

    위상정렬
    - 유향 그래프의 노드를변의 방향을 거스르지 않도록 나열하는 것을 의미
    - 예) 대학의 선수과목
    - 방향성을 가지고, 순환이 없는 그래프(Directed Acyclic Graph)이여야 한다.
    - 여러가지 순서가 나올수 있다.
    - 위상정렬의 가능 여부, 가능하다면 어떤순으로?
    * O(V+E) 모든 정점에 연결된 간선의 갯수만큼 반복 (상당히 빠른 시간복잡도를 가진다.)

    구현 Queue를 이용.
    1. 들어오는 degree 0 인 정점을 큐에 삽입한다.
    2. Queue에 꺼내여 그 노드에 연결된 모든 edge를 제거한다.
    3. edge를 제거하고, degree 0인 node가 있다면, 큐에 삽입합니다.
    4. 2-3을 반복하며, 모든 노드 방문전 queue가 빈다면, cycle이 존재하고,
       모든 노드를 방문했다면, 위상정렬된 순서를 생성한다.


    학생수 N(1 ≤ N ≤ 32_000),
    M은 키를 비교한 회수 M(1 ≤ M ≤ 100_000)이 주어진다.

    답이 여러 가지인 경우에는 아무거나 출력한다.
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
//    // 들어오는 degree 0 인 정점을 큐에 삽입
//    for (i in 1 until inDegree.size) {
//        if (inDegree[i] == 0) queue.add(i)
//    }
//
//    // 모든 노드를 방문한다.
//    for (i in 1 until inDegree.size) {
//        // 모든 노드를 방문전에 큐가 비면,
//        if (queue.isEmpty()) {
//            isCycle = true
//            return
//        }
//
//        // queue에서 꺼내어, 결과 리스트에 넣고, 그 노드와 연결된 모든 edge를 제거한다.
//        val node = queue.poll()
//        order.add(node)
//        for (next in adjList[node]) {
//            // inDegree 1개 줄이는것은 곧, 제거하는것.
//            inDegree[next] -= 1
//            // degree 0인 node가 있다면, 큐에 삽입
//            if (inDegree[next] == 0) {
//                queue.add(next)
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
//    inDegree = IntArray(n + 1)
//
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        // u -> v
//        val u = edge[1]
//        val v = edge[0]
//        adjList[u].add(v)
//        inDegree[v] += 1
//    }
//
//    topologySort()
//    val sb = StringBuilder()
//    order.reversed().forEach {
//        sb.append("$it ")
//    }
//
//    println(isCycle)
//    println(sb.toString())
//    return@with Unit
//}
