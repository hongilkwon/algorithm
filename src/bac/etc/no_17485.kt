package bac.etc

/*
   진우의 달 여행 (Large)

   같은 방향으로 두번 연속으로 움직일 수 없다.
   달에 도달하기 위해 필요한 연료의 최소값을 계산해 주자.

   N, M (2 ≤ N, M ≤ 1000)
   1 <= 행렬의 원소값 <= 100, 자연수

   사고과정.
   n, m의 최대값이 1000이다.
   4*(3^999) 너무 많은 경우의 수를 가진다.

   값을 저장하여, 다음 최소값을 구하는 형태로 하자!
*/

//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var board: Array<IntArray>
//
//// table[r][c][prev]는 (r, c)까지 이동시 최솟값을 저장한다.
//lateinit var table: Array<Array<IntArray>>
//val dy = arrayOf(-1, -1, -1)
//val dx = arrayOf(-1, 0, 1)
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    board = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//    table = Array(n) { Array(m) { IntArray(3) {  1_000 * 100 } } }
//
//    for (c in 0 until m) {
//        for (prev in 0 until 3) {
//            table[0][c][prev] = board[0][c]
//        }
//    }
//
//    for (r in 1 until n) {
//        for (c in 0 until m) {
//            for (prev in 0 until 3) {
//
//                val prevR = r + dy[prev]
//                val prevC = c + dx[prev]
//
//                if (prevR !in 0 until n || prevC !in 0 until m) continue
//
//                for (k in 0 until 3) {
//                    if (prev == k) continue
//                    table[r][c][prev] = min(table[r][c][prev], board[r][c] + table[prevR][prevC][k])
//                }
//            }
//        }
//    }
//
////    table.forEachIndexed { i, r ->
////        r.forEachIndexed { j, c ->
////            print(c.joinToString(prefix = "(", separator = ",", postfix = ")"))
////        }
////        println()
////    }
//
//    var minCost = 1_000 * 100
//    for (c in 0 until m) {
//        for (p in 0 until 3) {
//            minCost = min(minCost, table[n - 1][c][p])
//        }
//    }
//    println(minCost)
//    return@with Unit
//}