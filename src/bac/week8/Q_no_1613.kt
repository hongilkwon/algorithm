package bac.week8


/*
    역사

    플로이드
    모든 정점에서 모든 정점.
    경로를 좀 더 파악하기 쉬운 인접행렬.

 */


//var n = 0
//var k = 0
//
//var s = 0
//
//lateinit var adjMatrix: Array<Array<Int>>
//
//fun floyd() {
//
//    for (m in 1 .. n) {
//        for (i in 1 .. n) {
//            for (j in 1 .. n) {
//                if (adjMatrix[i][m] == -1 && adjMatrix[m][j] == -1)
//                    adjMatrix[i][j] = -1
//                if (adjMatrix[i][m] == 1 && adjMatrix[m][j] == 1)
//                    adjMatrix[i][j] = 1
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
//    k = info[1]
//
//    adjMatrix = Array(n + 1) { Array(n + 1) { 0 } }
//    for (i in 0 until k) {
//        val eInfo = readLine().split(" ").map { it.toInt() }
//        adjMatrix[eInfo[0]][eInfo[1]] = -1
//        adjMatrix[eInfo[1]][eInfo[0]] = 1
//    }
//
//    floyd()
////    adjMatrix.forEach {
////        println(it.joinToString(" "))
////    }
//
//    s = readLine().toInt()
//    for (i in 1..s) {
//        val query = readLine().split(" ").map { it.toInt() }
//        println(adjMatrix[query[0]][query[1]])
//    }
//    Unit
//}
