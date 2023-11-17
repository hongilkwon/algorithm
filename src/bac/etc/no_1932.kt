package bac.etc


/*
    정수 삼각형

    삼각형의 크기 1- 500

    1*2*3*4*5...*500
    경우의수가 너무 많음...

    dp문제
    타뷸레이션.
 */

//import kotlin.math.max
//
//var n = 0
//lateinit var tower: Array<IntArray>
//
//lateinit var case: Array<IntArray>
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    tower = Array(n) { IntArray(n) { -1 } }
//    for (i in 0 until tower.size) {
//        val line = readLine().split(" ").map { it.toInt() }
//        for (j in 0 until line.size) {
//            tower[i][j] = line[j]
//        }
//    }
////    tower.forEach { println(it.joinToString(" ")) }
//    case = Array(n + 1) { IntArray(n + 1) { -1 } }
//    case[1][1] = tower[0][0]
//
//    for (i in 2 .. n) {
//        for (j in 1 .. n) {
//            case[i][j] = max(case[i - 1][j - 1], case[i - 1][j]) + tower[i - 1][j - 1]
//        }
//    }
//    println(case[n].maxOrNull())
//}