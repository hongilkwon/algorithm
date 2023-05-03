package programmers.lv1


/*
   1 ≤ wallpaper의 길이 ≤ 50
   1 ≤ wallpaper[i]의 길이 ≤ 50
   wallpaper의 모든 원소의 길이는 동일합니다.

   wallpaper[i][j]는 바탕화면에서 i + 1행 j + 1열에 해당하는 칸의 상태를 나타냅니다.
   wallpaper[i][j]는 "#" 또는 "."의 값만 가집니다.

   바탕화면에는 적어도 하나의 파일이 있습니다.
   드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족해야 합니다.

    브루스 포스


  */

import kotlin.math.pow
//
//lateinit var map: Array<CharArray>
//
//var fileCnt = 0
//
//fun check(start: Pair<Int, Int>, end: Pair<Int, Int>): Boolean {
//    var cnt = 0
//    for (i in start.first..end.first) {
//        for (j in start.second ..end.second) {
//            if (map[i][j] == '#') {
//                cnt += 1
//            }
//        }
//    }
//    return cnt == fileCnt
//}
//
//fun solution(wallpaper: Array<String>): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    map = Array(wallpaper.size) { charArrayOf() }
//    for (i in 0 until wallpaper.size) {
//        map[i] = wallpaper[i].toCharArray()
//    }
//    map.forEach {
//        println(it.joinToString(" "))
//    }
//    println()
//
//    // file 개수 확인
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] == '#') {
//                fileCnt += 1
//            }
//        }
//    }
//
//    var minMove = Int.MAX_VALUE
//    for (sy in 0 until map.size) {
//        for (sx in 0 until map.first().size) {
//            val start = sy to sx
//
//            for (ey in start.first until map.size) {
//                for (ex in start.second until map.first().size) {
//                    val end = ey to ex
//                    if (check(start, end)) {
//                        val move = (ey - sy) * (ey - sy) + (ex - sx) * (ex - sx)
//                        if (move < minMove) {
//                            minMove = move
//                            answer = intArrayOf(start.first, start.second, end.first + 1, end.second + 1)
//                        }
//                    }
//                }
//            }
//        }
//    }
//    return answer
//}
