package bac.etc


/*
    최소 스패닝 트리.
    (kruskal algorithm)

     정점의 개수 V(1 ≤ V ≤ 10,000)
     간선의 개수 E(1 ≤ E ≤ 100,000)
 */

//var v = 0
//var e = 0
//
//lateinit var arr: IntArray
//lateinit var edgeArr: Array<Triple<Int, Int, Int>>
//fun getParent(n: Int): Int =
//    if (n == arr[n]) {
//        n
//    } else {
//        arr[n] = getParent(arr[n])
//        arr[n]
//    }
//
//fun union(a: Int, b: Int) {
//    val parentA = getParent(a)
//    val parentB = getParent(b)
//
//    if (parentA < parentB) {
//        arr[parentB] = parentA
//    } else {
//        arr[parentA] = parentB
//    }
//}
//
//fun find(a: Int, b: Int) = getParent(a) == getParent(b)
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    v = info[0]
//    e = info[1]
//
//    arr = IntArray(v + 1) { it }
//    edgeArr = Array(e) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        Triple(edge[0], edge[1], edge[2])
//    }
//    edgeArr.sortBy { it.third }
//
//    var cost = 0
//    for (i in 0 until edgeArr.size) {
//        // 가중치가 최소인 간선을 선택한다.
//        val edge = edgeArr[i]
//
//        // 최소스패닝 트리 집합에 포함 시킨다.
//        if (!find(edge.first, edge.second)) {
//            union(edge.first, edge.second)
//            cost += edge.third
//        }
//    }
//    println(cost)
//}