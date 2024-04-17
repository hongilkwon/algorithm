package bac.easy


/*
   쿠키의 신체 측정(단순구현)

   5 ≤ N ≤ 1,000
*/


//var n = 0
//lateinit var map: Array<CharArray>
//
//var heartPoint = -1 to -1
//
//
//// 왼쪽,아래,오른쪽,위
//val dy = arrayOf(0,  1, 0, -1)
//val dx = arrayOf(-1, 0, 1, 0)
//
//fun calLength(start: Pair<Int, Int>, dir: Int): Int {
//
//    var len = 0
//
//    var ny = start.first
//    var nx = start.second
//
//    while (true) {
//        ny += dy[dir]
//        nx += dx[dir]
//        if (ny !in 0 until n || nx !in 0 until n) break
//        if (map[ny][nx] == '_') break
//
//        len += 1
//    }
//
//    return len
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) {
//        readLine().toString().toCharArray()
//    }
//
//    outer@ for (i in 0 until n) {
//        for (j in 0 until n) {
//            if (map[i][j] == '*') {
//                heartPoint = i + 1 to j
//                break@outer
//            }
//        }
//    }
//
//
//    val leftArm = calLength(heartPoint, 0)
//    val rightArm = calLength(heartPoint, 2)
//    val waist = calLength(heartPoint, 1)
//    val leftLeg = calLength(heartPoint.first + waist to heartPoint.second - 1, 1)
//    val rightLeg = calLength(heartPoint.first + waist to heartPoint.second + 1, 1)
//
//    val temp = arrayOf(leftArm, rightArm, waist, leftLeg, rightLeg)
//
//    println("${heartPoint.first + 1} ${heartPoint.second + 1}")
//    println(temp.joinToString(" "))
//
//    return@with Unit
//}