package bac.week7

/*
    자두문제

    자두가 받을 수 있는 자두의 최대 개수를

    T 떨어지는 시간 (1 ≤ T ≤1,000)
    W 이동횟수 (1 ≤ W ≤ 30)

    완전탐색을 하기엔 경우의 수(모든 경우의수 2^30)도 크고 연산횟수(모든 경우의수 2^30*1000)도 많다
    자료구조에 모두 담을수있는가? (배열 기준 1000만)
    -> 동적프로그래밍.

    하향식 방법.
    메모이제이션 기준
    (시간, 현재위치, 이동횟수)

 */

//import kotlin.math.max
//
//var t = 0
//var w = 0
//
//// 2^(0-30) * (1-1000)
//val case = Array(1001) { Array(2) { Array(31) { -1 } } }
//val treeOrder = Array(1001) { 0 }
//
//fun go(time: Int, treeNum: Int, moveCnt: Int): Int {
//
//    // 종료조건(시간이 다되면 멈춘다)
//    if (time == t) return 0
//
//    // 메모이제이션(기록을 통한 이전값 활용)
//    if (case[time][treeNum][moveCnt] != -1)
//        return case[time][treeNum][moveCnt]
//
//    val current = if (treeNum == (treeOrder[time] - 1)) 1 else 0
//
//    val prevMax = if (moveCnt > 0) max(
//        go(time + 1, if (treeNum == 0) 1 else 0, moveCnt - 1),
//        go(time + 1, treeNum, moveCnt)
//
//    )else
//        go(time + 1, treeNum, moveCnt)
//
//
//    case[time][treeNum][moveCnt] = current + prevMax
//    return case[time][treeNum][moveCnt]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    t = info[0]
//    w = info[1]
//
//    for (i in 0 until t) {
//        val treeNum = readLine().toInt()
//        treeOrder[i] = treeNum
//    }
//
//    val answer = max(go(0, 0, w), go(0, 1, w - 1))
//    println(answer)
//    Unit
//}