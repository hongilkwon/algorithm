package bac.week8


/*
    파티

    플로이드와샬

    일반적으로 node의 개수가, n <= 400 이하여야 여유롭게 작동을 하는데,
    여기서는 n <= 1000임에도 불구하고 작동한다.

    kotlin
    lateinit var wMatrix: Array<IntArray>
    lateinit var wMatrix: Array<Array<Int>> --> 메모리 초과남.
 */


//import kotlin.math.min
//import kotlin.math.max
//
//var n = 0
//var m = 0
//
//var x = 0
//
//const val INF = 1_000_000_000
//lateinit var wMatrix: Array<IntArray>
//
//fun floyd() {
//
//    for (i in 0 until wMatrix.size) {
//        for (j in 0 until wMatrix.size) {
//            if (i == j)
//                wMatrix[i][j] = 0
//        }
//    }
//
//    for (k in 1..n) {
//        for (i in 1..n) {
//            for (j in 1..n) {
//                wMatrix[i][j] = min(wMatrix[i][j], wMatrix[i][k] + wMatrix[k][j])
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    x = info[2]
//
//    wMatrix = Array(n + 1) { IntArray(n + 1) { INF } }
//
//    for (i in 1..m) {
//        val eInfo = readLine().split(" ").map { it.toInt() }
//        wMatrix[eInfo[0]][eInfo[1]] = eInfo[2]
//    }
//
//
//    floyd()
//    var answer = -1
//    for (i in 1..n) {
//            answer = max(answer, wMatrix[i][x] + wMatrix[x][i])
//    }
//    println(answer)
//    Unit
//}
