package bac.week4

import kotlin.math.abs
import kotlin.math.min

/*
   게리맨더링

    그래프 문제.

    1. 모든 노드를 2개의 종류로 나눈다.
    2. 각 나눠진 종류 마다 조건(인접 및 1개 이상)에 맞게 나눠졌는지 확인.
    3. 최소값을 갱신한다.

*/

//var n = 0
//
//lateinit var numArr: IntArray
//lateinit var adj: Array<IntArray>
//
//val red = mutableListOf<Int>()
//val blue = mutableListOf<Int>()
//
//var min = Int.MAX_VALUE
//
//lateinit var visited: Array<Int>
//
//fun dfs(nodes: List<Int>, v: Int) {
//    visited[v] = 1
//    for (newV in adj[v]) {
//        if (visited[newV] == 1) continue
//        if (newV !in nodes) continue
//        dfs(nodes, newV)
//    }
//}
//
//fun check(): Boolean {
//    val result = true
//    for (i in 1 until visited.size) {
//        if (visited[i] != 1) {
//            return false
//        }
//    }
//    return true
//}
//
//fun go(bac.week5.concept.getN: Int) {
//
//    for (i in 0 until (1 shl bac.week5.concept.getN)) {
//        for (j in 0 until bac.week5.concept.getN) {
//            if (i and (1 shl j) != 0) {
//                red.add(j + 1)
//            } else {
//                blue.add(j + 1)
//            }
//        }
////        println("red: $red")
////        println("blue: $blue")
//
//        if (red.isEmpty() || blue.isEmpty())
//            continue
//
//        visited = Array(bac.week5.concept.getN + 1) { 0 }
//        dfs(red, red.first())
//        dfs(blue, blue.first())
//
//
//        if (check()) {
//            /* 최소값 갱신 */
//
//            var sumRed = 0
//            var sumBlue = 0
//            for (i in 0 until numArr.size) {
//                if (i in red) {
//                    sumRed += numArr[i]
//                }
//                if (i in blue) {
//                    sumBlue += numArr[i]
//                }
//            }
//            val new = abs(sumRed - sumBlue)
//            min = min(min, new)
//        }
//
//        red.clear()
//        blue.clear()
//    }
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    bac.week5.concept.getN = readLine().toInt()
//
//    numArr = IntArray(bac.week5.concept.getN + 1) { 0 }
//    visited = Array(bac.week5.concept.getN + 1) { 0 }
//
//    readLine().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
//        numArr[index + 1] = i
//    }
//
//    adj = Array(bac.week5.concept.getN + 1) { intArrayOf() }
//
//    for (i in 1..bac.week5.concept.getN) {
//        val line = readLine().split(" ").map { it.toInt() }
//        val arr = IntArray(line.size - 1) { 0 }
//        line.forEachIndexed { index, int ->
//            if (index > 0)
//                arr[index - 1] = int
//        }
//
//        adj[i] = arr
//    }
//
////    adj.forEachIndexed { index, ints ->
////        println("$index : ${ints.joinToString(" ")}")
////    }
//
//    go(bac.week5.concept.getN)
//    if (min == Int.MAX_VALUE)
//        println(-1)
//    else
//        println(min)
//}