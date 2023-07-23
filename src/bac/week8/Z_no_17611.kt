package bac.week8


/*
    직각 다각형
    어떻게 그어야 많이 교차하는가...?

    기하문제 x
    - 구현
    - 좌표이동
    -

    -500,000 ≤ xi, yi ≤ 500,000
    --> 너무 많고 음수가 섞여있어서, 알고리즘 푸는데 방해됨.

    꼭지점들의 순서는 시계방향으로 들어옴 -> 카운팅이 가능함.
*/

//import kotlin.math.max
//
//var n = 0
//lateinit var arr: Array<Pair<Int, Int>>
//lateinit var xCntArr: IntArray
//lateinit var yCntArr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    arr = Array(100_004) { 0 to 0 }
//
//    xCntArr = IntArray(1000_004) { 0 }
//    yCntArr = IntArray(1000_004) { 0 }
//
//
//    for (i in 0 until n) {
//        val pInfo = readLine().split(" ").map { it.toInt() }
//        // 평행이동.
//        val x = pInfo[0] + 500_000
//        val y = pInfo[1] + 500_000
//        arr[i] = x to y
//    }
//
//    // 시계방향 입력이기 때문에 시작점을 마지막에 한번더 추가해준다.
//    arr[n] = arr[0]
//    for (i in 0 until n) {
//        val (x1, y1) = arr[i]
//        val (x2, y2) = arr[i + 1]
//
//        if (x1 != x2) {
//            var start = 0
//            var end = 0
//            if (x1 < x2) {
//                start = x1
//                end = x2
//            } else {
//                start = x2
//                end = x1
//            }
//            for (j in start + 1..end) {
//                xCntArr[j] += 1
//            }
//        }
//
//        if (y1 != y2) {
//            var start = 0
//            var end = 0
//            if (y1 < y2) {
//                start = y1
//                end = y2
//            } else {
//                start = y2
//                end = y1
//            }
//            for (j in start + 1..end) {
//                yCntArr[j] += 1
//            }
//        }
//    }
//
//    val maxCnt = max(xCntArr.maxOrNull() ?: 0, yCntArr.maxOrNull() ?: 0)
//    println(maxCnt)
//    Unit
//}

