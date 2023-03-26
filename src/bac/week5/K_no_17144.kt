package bac.week5


/*
    미세먼지 안녕!

    1. 문제가 긴편에 속해서 이해하는데 시간이 걸린다.
    2. 그렇게 이해하는건 어렵지 않다.
    3. 예시를 통해

    1초뒤 확산 및 공기청정기의 작동을 구현한다.
    확산
    회전
 */

//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var row = 0
//var col = 0
//var time = 0
//
//var conditioners = mutableListOf<Pair<Int, Int>>()
//
//var map: Array<Array<Int>> = emptyArray()
//var temp: Array<Array<Int>> = emptyArray()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    row = info[0]
//    col = info[1]
//    time = info[2]
//
//    map = Array(row) { emptyArray() }
//
//    for (i in 0 until row) {
//        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        map[i] = line
//    }
//
////    map.forEach {
////        println(it.joinToString(" "))
////    }
//
//    for (i in 0 until row) {
//        for (j in 0 until col) {
//            if (map[i][j] == -1) {
//                conditioners.add(i to j)
//            }
//        }
//    }
//
//
//    var answer = 0
//
//    temp = Array(row) { Array(col) { 0 } }
//    repeat(1) {
//        // 1. 확산(확산은 미세먼지가 있는 모든 칸에서 "동시에" 일어난다.)
//        // 코틀린 2차원 배열 복사 정리한다. 반드시
//
//        for (i in 0 until row) {
//            for (j in 0 until col) {
//                temp[i][j] = map[i][j]
//            }
//        }
//
//        for (i in 0 until row) {
//            for (j in 0 until col) {
//                if (i to j !in conditioners) {
//
//                    for (k in 0 until 4) {
//
//                        val ny = i + dy[k]
//                        val nx = j + dx[k]
//                        if (ny !in 0 until row || nx !in 0 until col) continue
//                        if (ny to nx in conditioners) continue
//
//                        val out = map[i][j] / 5
//                        val come = map[ny][nx] / 5
//                        temp[i][j] -= out
//                        temp[i][j] += come
//                    }
//                }
//            }
//        }
//
//        for (i in 0 until row) {
//            for (j in 0 until col) {
//                map[i][j] = temp[i][j]
//                temp[i][j] = 0
//            }
//        }
//
//        // 2. 회전.
//        val top = conditioners[0]
//        val arr = arrayOf(map[0][0], map[0][col-1], map[top.first][col-1])
//
//        for (i in 0 .. top.first) {
//            for (j in 0 until col){
//                if (i == 0 && j < col - 1){
//                    map[i][j] = map[i][j+1]
//                }
//            }
//        }
//    }
//
//    map.forEach {
//        println(it.joinToString(" "))
//    }
//
//    println(answer)
//    Unit
//}