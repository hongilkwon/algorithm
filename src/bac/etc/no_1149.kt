package bac.etc

/*
    RGB 거리

    N(2 ≤ N ≤ 1,000)

    칠하는 비용 최대 1000

    -> 완전탐색 가능???  45% 쯤에서 시간초과남.

    생각을 해보면.
    처음엔 3*2*2*2*2*2*2*2....

    동적계획법

    - 타뷸레이션.
    i번째 집을 빨강, 초록, 파랑으로 칠했을 때의 비용의 최소값
    - 메모이제이션.
 */

// 완전탐색 코드.
//fun go(cnt: Int, sum: Int, prev: Int = -1) {
//
//    if (cnt == rgbs.size) {
//        min = min(sum, min)
//        return
//    }
//
//    for (i in 0 until rgbs[cnt].size) {
//        if (i == prev) continue
//        go(cnt + 1, sum + rgbs[cnt][i], i)
//    }
//}

// 타뷸레이션
//import kotlin.math.min
//
//var n = 0
//
//lateinit var rgbs: Array<IntArray>
//lateinit var case: Array<IntArray>
//
//var min = 1_000 * 1_000
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    rgbs = Array(n + 1) { intArrayOf() }
//    for (i in 1..n) {
//        rgbs[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    case = Array(n + 1) { IntArray(3) { 0 } }
//
//    for (i in 1..n) {
//        case[i][0] = min(case[i - 1][1], case[i - 1][2]) + rgbs[i][0]
//        case[i][1] = min(case[i - 1][0], case[i - 1][2]) + rgbs[i][1]
//        case[i][2] = min(case[i - 1][1], case[i - 1][0]) + rgbs[i][2]
//    }
//
//    println(min(case[n][2], min(case[n][0], case[n][1])))
//}

//- 메모이제이션.
//import kotlin.math.min
//
//var n = 0
//lateinit var rgbs: Array<IntArray>
//lateinit var case: Array<IntArray>
//
//fun go(house: Int, prevColor: Int): Int {
//
//    if (house == -1) {
//        return 0
//    }
//
//    if (case[house][prevColor] != -1)
//        return case[house][prevColor]
//
//    var ret = 1_004 * 1_004
//    for (i in 0 until 3) {
//        if (prevColor == i) continue
//        ret = min(ret, go(house - 1, i) + rgbs[house][i])
//    }
//
//    case[house][prevColor] = ret
//    return case[house][prevColor]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    rgbs = Array(n) { IntArray(3) { 0 } }
//    for (i in 0 until n) {
//        rgbs[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//    case = Array(n) { IntArray(3) { -1 } }
//
//    val answer = min(go(n - 1, 0), min(go(n - 1, 1), go(n - 1, 2)))
//    println(answer)
//}