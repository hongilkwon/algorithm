package bac.etc


/*
   전력난(mst)

   길의 가로등을 켜 두면 하루에 길의 미터 수만큼 돈이 들어가는데,
   도시에 있는 모든 두 집 쌍에 대해, 불이 켜진 길만으로 서로를 왕래해야됨.

   위 조건을 지키면서 절약할 수 있는 최대 액수

   x번 집과 y번 집 사이에 양방향 도로가 있으며 그 거리가 z미터라는 뜻
   항상 연결 그래프의 형태

   집의 수 m,  길의 수 n이
   1 ≤ m ≤ 200_000,
   m-1 ≤ n ≤ 200_000

*/

//var m = 0
//var n = 0
//
//lateinit var parentArr: IntArray
//val edges: MutableList<Triple<Int, Int, Int>> = mutableListOf()
//
//
//fun getParent(n: Int): Int =
//    if (n == parentArr[n]) {
//        parentArr[n]
//    } else {
//        parentArr[n] = getParent(parentArr[n])
//        parentArr[n]
//    }
//
//
//fun union(a: Int, b: Int) {
//
//    val pa = getParent(a)
//    val pb = getParent(b)
//
//    if (pa < pb) {
//        parentArr[pb] = pa
//    } else {
//        parentArr[pa] = pb
//    }
//}
//
//
//fun find(a: Int, b: Int): Boolean =
//    getParent(a) == getParent(b)
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//        val info = readLine().split(" ").map { it.toInt() }
//        m = info[0]
//        n = info[1]
//
//        if (n == 0 && m == 0)
//            break
//
//        parentArr = IntArray(m + 1) { it }
//        edges.clear()
//        var totalCost = 0
//        for (i in 0 until n) {
//            val edge = readLine().split(" ").map { it.toInt() }
//            val (u, v, w) = edge
//            totalCost += w
//            edges.add(Triple(u, v, w))
//            edges.add(Triple(v, u, w))
//        }
//        edges.sortBy { it.third }
//
//        var cost = 0
//        for (i in 0 until edges.size) {
//            val (u, v, w) = edges[i]
//            if (!find(u, v)){
//                union(u, v)
//                cost += w
//            }
//        }
//        println(totalCost-cost)
//    }
//    return@with Unit
//}