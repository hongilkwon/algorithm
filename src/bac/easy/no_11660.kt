package bac.easy


/*
    구간합구하기 5

    누적합
    (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100_000)

    N*N = 1_000_000
    M*N*N = 100_000_000_000 --> 100억

    누적합을 통해
    M*N = 100_000_000 --> 1억으로 줄이고 출력을 한번에 sb를 이용한다.
 */


//var n = 0
//var m = 0
//
//lateinit var board: Array<IntArray>
//lateinit var preSum: Array<IntArray>
//
//val bw = System.out.bufferedWriter()
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    board = Array(n + 1) {
//        IntArray(n + 1) { 0 }
//    }
//    for (i in 1..n) {
//        val temp = readLine().split(" ").map { it.toInt() }
//        for (j in 1..n) {
//            board[i][j] = temp[j - 1]
//        }
//    }
//
//    preSum = Array(n + 1) { IntArray(n + 1) { 0 } }
//
//    for (i in 1..n) {
//        for (j in 1..n) {
//            if (j == 1) {
//                preSum[i][1] = board[i][1]
//            } else {
//                preSum[i][j] = preSum[i][j - 1] + board[i][j]
//            }
//        }
//    }
//
////    preSum.forEach { println(it.joinToString(" ")) }
//    var x1 = 0
//    var y1 = 0
//    var x2 = 0
//    var y2 = 0
//
//    val sb = StringBuilder()
//    repeat(m) {
//        val points = readLine().split(" ").map { it.toInt() }
//        x1 = points[0]
//        y1 = points[1]
//        x2 = points[2]
//        y2 = points[3]
//
//        var sum = 0
//        for (i in x1..x2) {
//            sum += preSum[i][y2] - preSum[i][y1 - 1]
//        }
//        sb.append("$sum\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}