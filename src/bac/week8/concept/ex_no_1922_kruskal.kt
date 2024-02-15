package bac.week8.concept


/*

    최소 신장 트리(MST)

    그래프 - 간선과 노드로 연결된 자료구조.
    트리 - 순환이 없는 방향 그래프
    신장 트리 - 그래프 내의 모든 노드을 포함 하면서 순환이 없는 서브 그래프.

    최소 신장 트리 - 최소한의 비용으로 구성된 신장 트리(방향성이 중요하지 않음 - 양방향)

    크루스칼 알고리즘
    - union-find
    - 가장 적은 비용으로 모든 노드를 연결하기 위함.
    - 성능 간선의 개수가 e개 일때 O(eloge)

    간선을 거리가 "짧은" 순서로 그래프에 포함시켜 보자 (greedy)
    단, cycle이 형성되지 않도록 한다.

    * 노드가 n개라면 모든 정점이 연결되어 있다면, 간선은 n-1개
    * 구현에 있어 cycle 유무를 union-find를 사용한다.

    * 예시 문제
    컴퓨터의 수 N (1 ≤ N ≤ 1000)

    연결할 수 있는 선의 수 M (1 ≤ M ≤ 100,000)

 */

//var n = 0
//var m = 0
//
//lateinit var pArr: IntArray
//lateinit var edgeArr: Array<Triple<Int, Int, Int>>
//
//fun getParent(n: Int): Int {
//    return if (pArr[n] == n) n
//    else {
//        pArr[n] = getParent(pArr[n])
//        pArr[n]
//    }
//}
//
//fun union(a: Int, b: Int) {
//    val aParent = getParent(a)
//    val bParent = getParent(b)
//
//    if (aParent < bParent) {
//        pArr[bParent] = aParent
//    } else {
//        pArr[aParent] = bParent
//    }
//}
//
//fun find(a: Int, b: Int): Boolean {
//    val aParent = getParent(a)
//    val bParent = getParent(b)
//
//    return if (aParent == bParent) true else false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    m = readLine().toInt()
//
//    pArr = IntArray(n + 1) { it }
//
//    edgeArr = Array(m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        Triple(edgeInfo[0], edgeInfo[1], edgeInfo[2])
//    }
//
//    edgeArr.sortBy { it.third }
//
//    var cost = 0
//    for (i in 0 until edgeArr.size) {
//        val edge = edgeArr[i]
//
//        if (edge.first == edge.second) continue
//
//        if (!find(edge.first, edge.second)) {
//            union(edge.first, edge.second)
//            cost += edge.third
//        }
//    }
//    println(cost)
//}
