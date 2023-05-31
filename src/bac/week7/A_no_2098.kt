package bac.week7


/*
    외판원 순회(해밀턴 순환 + 최소비용)

    (2 ≤ N ≤ 16)
    행렬의 성분은 1,000,000 이하의 양의 정수

    해밀턴 경로 알고리즘(완전탐색)
    n은 정점의 개수 O(x^n)

    정점을 방문하는 순서는 상관이 없다.

    {a,b,c} -> d
    {a,c,b} -> d

    dp/bitMasking/알고리즘 노하우
    너무 어려운 문제다.
 */

//import kotlin.math.*
//
//var n = 0
//lateinit var w: Array<Array<Int>>
//
//val case = Array(16) { Array(1 shl 16) { -1 } }
//
//fun go(node: Int, visited: Int): Int {
//    // 모든 정점을 방문 하고, 순회 즉, 시작 노드로 돌아와야 종료.
//    if (visited == (1 shl n) - 1) {
//        return if(w[node][0] == 0) 1_000_000_000 else w[node][0]
//    }
//    // 최소값이 구해져 있으면,
//    if (case[node][visited] != -1) {
//        return case[node][visited]
//    }
//
//    var minDis = 1_000_000_000
//    for (i in 0 until n) {
//        // 이미 방문한 노드
//        if (visited and (1 shl i) != 0) continue
//        // 간선이 없는 경우
//        if (w[node][i] == 0) continue
//        minDis = min(minDis, go(i, visited or (1 shl i)) + w[node][i])
//    }
//    case[node][visited] = minDis
//    return case[node][visited]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    w = Array(n) { Array(n) { 0 } }
//
//    for (i in 0 until n) {
//        w[i] = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    }
//
//    println(go(node = 0, visited = 1))
//}