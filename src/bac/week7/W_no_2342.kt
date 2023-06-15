package bac.week7



/*
    Dance Revolution

    수열의 길이
    0< arr.size <100_000

    0 -> 어딘가 (2)

    제자리 -> 1
    인접  -> 3
    반대 -> 4

    어떤발을 움직여야 하는지 -> 힘을 최소로 사용한다.

*/

import kotlin.math.*

lateinit var arr: Array<Int>

// 현재 진행 idx, 왼발, 오른발 -> 최소 힘
val case = Array(100_001) { Array(5) { Array(5) { -1 } } }

fun calPower(start: Int, end: Int): Int {

    if (start == 0)
        return 2

    var power = 0
    if (start == 1) {
        when (end) {
            1 -> power = 1
            2 -> power = 3
            3 -> power = 4
            4 -> power = 3
        }
    }

    if (start == 2) {
        when (end) {
            1 -> power = 3
            2 -> power = 1
            3 -> power = 3
            4 -> power = 4
        }
    }

    if (start == 3) {
        when (end) {
            1 -> power = 4
            2 -> power = 3
            3 -> power = 1
            4 -> power = 3
        }
    }

    if (start == 4) {
        when (end) {
            1 -> power = 3
            2 -> power = 4
            3 -> power = 3
            4 -> power = 1
        }
    }

    return power
}

fun go(idx: Int, left: Int, right: Int): Int {

    if (arr[idx] == 0)
        return 0

    if (case[idx][left][right] != -1) {
        return case[idx][left][right]
    }

    var result = 1_000_000_000

    if (arr[idx] != right)
        result = min(result, go(idx + 1, arr[idx], right) + calPower(left, arr[idx]))

    if (arr[idx] != left)
        result = min(result, go(idx + 1, left, arr[idx]) + calPower(right, arr[idx]))

    case[idx][left][right] = result
    return case[idx][left][right]
}

fun main() = with(System.`in`.bufferedReader()) {

    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
    println(go(0, 0, 0))
    Unit
}
