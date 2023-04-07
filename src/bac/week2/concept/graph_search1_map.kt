package bac.week2.concept


/*
 * 1. 맵 탐색
 * - 4방향을 탐색한다.
 * - 맵을 벗어나면 안된다.
 */

//val rows = 10
//val cols = 10
//val arr = Array(rows) { Array(cols){0} }
//
//// 방향 백터
//val dy = listOf(-1, 0, 1, 0)
//val dx = listOf(0, 1, 0, -1)
//
//fun main() {
//    val y = 5
//    val x = 5
//
//    for (i in 0 until 4) {
//        val ny = y + dy[i]
//        val nx = x + dx[i]
//
//        // 맵의 경계선 체크
//        if (ny !in 0 until 10 || nx !in 0 until 10)
//            continue
//        arr[ny][nx] = 1
//    }
//
//    arr.forEach {
//        println(it.joinToString())
//    }
//}
