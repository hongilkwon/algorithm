package bac.week4


/*
    경사로

   - 2차원 배열 대칭.
   - 경사로를 놓는 경우의 수
   - 경사로는 놓을수 있는 가능성을 잡는 기준.
 */

//var sum = 0
//
//var n = 0
//var l = 0
//var map: Array<Array<Int>> = emptyArray()
//
///* 2차원 배열 대각선 대칭 */
//
//fun symmetry(map: Array<Array<Int>>): Array<Array<Int>> {
//    val newMap = Array(map.size) { Array(map.size) { 0 } }
//    for (i in 0 until map.size) {
//        for (j in 0 until map.size) {
//            newMap[j][i] = map[i][j]
//        }
//    }
//    return newMap
//}
//
//fun go(map: Array<Array<Int>>) {
//    for (i in 0 until map.size) {
//
//        // 평지의 개수
//        var cnt = 1
//
//        for (j in 0 until map.size - 1) {
//            if (map[i][j] == map[i][j + 1]) {
//                // 평지
//                cnt += 1
//            } else if ((map[i][j] + 1 == map[i][j + 1]) && cnt >= l) {
//                // 오르막 길.
//                // 경사로 놓고 평지 개수 초기화.
//                cnt = 1
//            } else if (map[i][j] - 1 == map[i][j + 1] && cnt >= 0) {
//                // 내리막 길.
//                // 반대 방향으로 경사로 놓고 평지 개수 초기화.
//                cnt = -l + 1
//            } else {
//                break
//            }
//
//            if (j == map.size - 2) {
//                if (cnt >= 0)
//                    sum += 1
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    l = info[1]
//
//    map = Array(n) {
//        emptyArray()
//    }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        map[i] = line
//    }
////
////    map.forEach {
////        println(it.joinToString(" "))
////    }
////    println()
////    symmetry(map).forEach {
////        println(it.joinToString(" "))
////    }
//
//    go(map)
//    go(symmetry(map))
//    println(sum)
//}