package bac.etc

/*
    별자리 만들기(크루스칼(mst),유니온 파인드)


    별자리를 이루는 선은 서로 다른 두 별을 일직선으로 이은 형태이다.
    모든 별들은 별자리 위의 선을 통해 서로 직/간접적으로 이어져 있어야 한다.

    별자리를 만드는 최소 비용을 구하시오.

    별의 개수 n이 주어진다. (1 ≤ n ≤ 100)
    x, y좌표가 실수 형태로 주어지며, 최대 소수점 둘째자리까지 주어진다.

    첫째 줄에 정답을 출력한다. 절대/상대 오차는 10-2까지 허용한다.

    0 1 2 3 4 5 6 7 8 9
    0 1 1 2 4 5 6 7 8 9

 */


//import kotlin.math.pow
//import kotlin.math.sqrt
//
//var n = 0
//
//val points = mutableListOf<Pair<Double, Double>>()
//val edges = mutableListOf<Triple<Int, Int, Double>>()
//
//lateinit var parentsArr: IntArray
//
//fun getParent(n: Int): Int =
//    if (parentsArr[n] == n) {
//        n
//    } else {
//        parentsArr[n] = getParent(parentsArr[n])
//        parentsArr[n]
//    }
//
//fun union(a: Int, b: Int) {
//
//    val pa = getParent(a)
//    val pb = getParent(b)
//
//    if (pa < pb) {
//        parentsArr[pb] = pa
//    } else {
//        parentsArr[pa] = pb
//    }
//}
//
//fun find(a: Int, b: Int) = (getParent(a) == getParent(b))
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toDouble() }
//        val point = info[0] to info[1]
//        points.add(point)
//    }
//
//    for (i in 0 until points.size) {
//        for (j in i + 1 until points.size) {
//            val u = points[i]
//            val v = points[j]
//            val w = sqrt((u.first - v.first).pow(2) + (u.second - v.second).pow(2))
//            edges.add(Triple(i, j, w))
//        }
//    }
//    edges.sortBy { it.third }
//
//
//    parentsArr = IntArray(n) { it }
//    var cost = 0.0
//
//    for (i in 0 until edges.size) {
//
//        val edge = edges[i]
//
//        if (edge.first == edge.second) continue
//        if (!find(edge.first, edge.second)) {
//            union(edge.first, edge.second)
//            cost += edge.third
//        }
//    }
//
//    println((cost * 100).toInt().toDouble() / 100.0)
//
//    return@with Unit
//}

