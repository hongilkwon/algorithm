package bac.etc


/*
    회사 문화1

    바로 상사가 직속 부하를 칭찬하면 그 부하가 부하의 직속 부하를 연쇄적으로 칭찬하는 내리 칭찬
    모든 칭찬에는 칭찬의 정도를 의미하는 수치가 있는데, 이 수치 또한 부하들에게 똑같이 칭찬 받는다.
    (2 ≤ n, m ≤ 100,000)


    직원은 1번부터 n번까지 번호가 매겨져 있다
    직속 상사의 번호는 자신의 번호보다 작으며, 최종적으로 1번이 사장


    * 한 직원은 여러번 칭찬 가능하다
*/


//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//lateinit var points: IntArray
//
//lateinit var sumPoints: IntArray
//
//fun dfs(node: Int, sumPoint: Int){
//
//    val myPoint = points[node] + sumPoint
//    sumPoints[node] = myPoint
//
//    for (next in adjList[node]){
//        dfs(next, myPoint)
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//
//    val temp = readLine().split(" ").map { it.toInt() }
//    for (i in 1 until temp.size) {
//        val u = temp[i]
//        val v = i+1
//        adjList[u].add(v)
//    }
//
//
//    points = IntArray(n + 1) { 0 }
//    for (i in 0 until m) {
//        val info2 = readLine().split(" ").map { it.toInt() }
//        points[info2[0]] += info2[1]
//    }
//
//    sumPoints = IntArray(n + 1) { 0 }
//    dfs(1, 0)
//
//    println(sumPoints.copyOfRange(1, sumPoints.size).joinToString(" "))
//    return@with Unit
//}