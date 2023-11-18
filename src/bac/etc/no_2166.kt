package bac.etc


/*
    다각형의 면적

    기하문제....
    https://gaussian37.github.io/math-algorithm-polygon_area/

    n각형 넓이 구하는 공식을 알고 있어야 풀수 있음.

    소수점 아래 둘째 자리에서 반올림하여 첫째 자리까지 출력

    2차원 평면상에 N(3 ≤ N ≤ 10,000)개의 점

    소수점 반올림 2째자리.
    (10.0 * num)roundToInt / 10.0

    BigDecimal로도 하는 법 알아두기.
 */

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.abs

var n = 0

lateinit var arr: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()

    arr = Array(2) { IntArray(n + 1) }

    for (i in 0 until n) {
        val p = readLine().split(" ").map { it.toInt() }
        arr[0][i] = p[0]
        arr[1][i] = p[1]
    }

    arr[0][n] = arr[0][0]
    arr[1][n] = arr[1][0]

    var a = 0L
    var b = 0L
    for (i in 0 until arr[0].size - 1) {
        a += arr[0][i].toLong() * arr[1][i + 1].toLong()
        b += arr[1][i].toLong() * arr[0][i + 1].toLong()
    }

    val answer = abs(a - b).toDouble()/2
    println(BigDecimal(answer).setScale(1, RoundingMode.HALF_UP))

}




