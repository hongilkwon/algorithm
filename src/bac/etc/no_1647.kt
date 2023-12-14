package bac.etc

/*
    도시 분할 계획

    길은 어느 방향으로든지 다닐 수 있는 편리한 길이다.
    각 길마다 길을 유지하는데 드는 유지비가 있다.
    임의의 두 집 사이에 경로가 항상 존재한다.

    일단 분리된 두 마을 사이에 있는 길들은 필요가 없으므로 없앨 수 있다.

    N은 2이상 100,000이하인 정수이고,
    M은 1이상 1,000,000이하인 정수
 */

//import kotlin.math.max
//
//var n = 0
//var m = 0
//
//val edges = mutableListOf<Triple<Int, Int, Int>>()
//lateinit var arr: IntArray
//
//fun getParent(n: Int): Int =
//    if (arr[n] == n) {
//        n
//    } else {
//        arr[n] = getParent(arr[n])
//        arr[n]
//    }
//
//fun union(a: Int, b: Int) {
//    val pA = getParent(a)
//    val pB = getParent(b)
//
//    if (pA < pB) {
//        arr[pB] = pA
//    } else {
//        arr[pA] = pB
//    }
//}
//
//fun find(a: Int, b: Int) = (getParent(a) == getParent(b))
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        edges.add(Triple(edge[0], edge[1], edge[2]))
//    }
//
//    arr = IntArray(n + 1) { it }
//    edges.sortBy { it.third }
//
//    var cost = 0
//    var max = 0
//    for (i in 0 until edges.size) {
//        val edge = edges[i]
//        if (edge.first == edge.second) continue
//        if (!find(edge.first, edge.second)) {
//            union(edge.first, edge.second)
//            cost += edge.third
//            max = max(max, edge.third)
//        }
//    }
//    println(cost - max)
//}
