package bac.week7

import kotlin.math.min

/*
    1학년

    상근이는 아직 학교에서 음수를 배우지 않았고, 20을 넘는 수는 모른다.
    상근이가 만들 수 있는 올바른 등식의 수

    하향식 방법.
    메모이제이션을 할떄 동일한 값이 연속적으로 사용되도록,
    상태를 잡아야 되는데 그게 너무 크면 속도가 매우 느리다.


 */

//var n = 0
//lateinit var arr: Array<Int>
//lateinit var case: Array<Array<Long>>
//
// 수식의 인덱스, 이전까지 결과 --> 올바른 등식의 개수
//fun go(idx: Int, preVal: Int): Long {
//
//    if (idx == n - 2) {
//        return if (preVal == arr[n - 1]) 1 else 0
//    }
//
//    if (preVal !in 0..20) {
//        return 0
//    }
//
//    if (case[idx][preVal] != -1L) {
//        return case[idx][preVal]
//    }
//
//    var ret: Long = 0
//    ret += go(idx + 1, preVal + arr[idx+1])
//    ret += go(idx + 1, preVal - arr[idx+1])
//    case[idx][preVal] = ret
//    return ret
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    case = Array(101) { Array(21) { -1L } }
//
//    println(go(0, arr[0]))
//    Unit
//}

//fun go(plus: Int, minus: Int, preValue: Int, cnt: Int): Long {
//    println("call")
//    if (cnt == n - 2) {
//        if (preValue == arr[n - 1])
//            answer += 1
//        return 0
//    }
//
//    if (preValue !in 0..20) {
//        return 0
//    }
//
//    if (case[plus][minus] != -1L) {
//        return case[plus][minus]
//    }
//
//    var ret: Long = 0
//    ret += go(plus + 1, minus, preValue - arr[cnt], cnt + 1)
//    ret += go(plus, minus + 1, preValue + arr[cnt], cnt + 1)
//
//    return case[plus][minus]
//}