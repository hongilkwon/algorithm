package bac.etc


/*
   전기가 부족해(MST, 유니온파인드)

   N개의 도시가 있고 M개의 두 도시를 연결하는 케이블의 정보와 K개의 YNY발전소가 설치된 도시가 주어지면,
   케이블 설치 비용을 "최소로 사용"하여 "모든 도시"에 전기가 공급할 수 있도록 해야된다..

   한 도시가 두 개의 발전소에서 전기를 공급받으면 낭비가 되므로 케이블이 연결되어있는 도시에는 발전소가 반드시 하나만 존재해야 한다.

   도시의 개수 N(1 ≤ N ≤ 1_000)
   케이블의 수 M(1 ≤ M ≤ 100_000)

   사고과정.

   문제의 해설을 보면 이해가 쉬운데 그냥 떠올리기에는 생각보다 어렵다.

   각 도시는 1개의 발전소로만 전력을 공급받아야한다.
   그 발전소하 어떤것이든 상관은 없다.

   MST를 구현할때 실제로 발전소들은 떨어져있지만, 만약 같은 집단이라 가정을한다면
   각각의 엣지들은 1개의 발전소와

*/


//var n = 0
//var m = 0
//var k = 0
//
//lateinit var powerPlants: List<Int>
//
//lateinit var parentArr: IntArray
//var edges = mutableListOf<Triple<Int, Int, Int>>()
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
//    val aParent = getParent(a)
//    val bParent = getParent(b)
//
//    if (aParent < bParent) {
//        parentArr[bParent] = aParent
//    } else {
//        parentArr[aParent] = bParent
//    }
//}
//
//fun find(a: Int, b: Int): Boolean =
//    getParent(a) == getParent(b)
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    k = info[2]
//
//    powerPlants = readLine().split(" ").map { it.toInt() }
//
//    parentArr = IntArray(n + 1) {
//        if (it in powerPlants)
//            0
//        else
//            it
//    }
//
//    for (i in 0 until m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val u = edgeInfo[0]
//        val v = edgeInfo[1]
//        val w = edgeInfo[2]
//
//        edges.add(Triple(u, v, w))
//    }
//
//    edges.sortBy { it.third }
//
//    var cost = 0
//    for (edge in edges) {
//        val (u, v, d) = edge
//        if (!find(u, v)){
//            union(u, v)
//            cost += d
//        }
//    }
//
//    println(cost)
//    return@with Unit
//}