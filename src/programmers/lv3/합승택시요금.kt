package programmers.lv3


/*
    합승 택시 요금.

    플로이드 와샬(k! i! j!).

    지점갯수 n은 3 이상 200 이하인 자연수
    요금 f는 1 이상 100,000 이하인 자연수입니다
 */


//import kotlin.math.min
//
//class Solution {
//
//    var n = 0
//    var s = 0
//    var a = 0
//    var b = 0
//
//    lateinit var fares: Array<IntArray>
//
//    val INF = 1_000_000_000
//    lateinit var wMatrix: Array<IntArray>
//
//    fun floyd() {
//
//        wMatrix = Array(n + 1) { IntArray(n + 1) { INF } }
//
//        for (i in 0 until wMatrix.size) {
//            for (j in 0 until wMatrix.first().size) {
//                if (i == j) wMatrix[i][j] = 0
//            }
//        }
//
//        for (edge in fares) {
//            val u = edge[0]
//            val v = edge[1]
//            val w = edge[2]
//            wMatrix[u][v] = w
//            wMatrix[v][u] = w
//        }
//
//        for (k in 1..n) {
//            for (i in 1..n) {
//                for (j in 1..n) {
//                    wMatrix[i][j] = min(wMatrix[i][j], wMatrix[i][k] + wMatrix[k][j])
//                }
//            }
//        }
//    }
//
//    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
//
//        this.n = n
//        this.s = s
//        this.a = a
//        this.b = b
//        this.fares = fares
//
//        floyd()
//
//        var cost =  100_000 * 200 + 1
//        for (i in 1..n) {
//            if (wMatrix[s][i] ==INF) continue
//            cost = min(cost,  wMatrix[s][i] + wMatrix[i][a] + wMatrix[i][b])
//        }
//        return cost
//    }
//}