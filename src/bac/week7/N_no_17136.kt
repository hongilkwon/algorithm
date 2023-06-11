package bac.week7

/*
   색종이 붙이기

   구현문제.

   Back Tracking
 */

//import kotlin.math.min
//
//val paper = Array(6) { 5 }
//val map = Array(10) { Array(10) { 0 } }
//
//fun check(y: Int, x: Int, size: Int): Boolean {
//
//    if(y + size-1 !in 0 until  map.size || x + size - 1 !in 0 until  map.first().size){
//        return false
//    }
//
//    for (i in y until y + size) {
//        for (j in x until x + size) {
//            if (map[i][j] == 0)
//                return false
//        }
//    }
//    return true
//}
//
//fun attach(y: Int, x: Int, size:Int, marker: Int) {
//    for (i in y until y + size)  {
//        for (j in x until x + size) {
//            map[i][j] = marker
//        }
//    }
//}
//
//var minCnt = Int.MAX_VALUE
//fun go(y: Int, x: Int, cnt: Int) {
//
//    // 최소값보다 더 커지면 탐색을 중지
//    if (cnt >= minCnt) return
//
//    // 줄바꿈
//    if (x == map.first().size) {
//        go(y + 1, 0, cnt)
//        return
//    }
//
//    // 종료조건
//    if (y == map.size) {
//        minCnt = min(minCnt, cnt)
////        println(paper.joinToString(" "))
////        map.forEach { println(it.joinToString(" ")) }
//        return
//    }
//
//    // 종이를 붙힐수 없는 자리라면, x축 1칸이동
//    if (map[y][x] == 0) {
//        go(y, x + 1, cnt)
//        return
//    }
//
//    for (paperSize in 5 downTo 1) {
//
//        if (paper[paperSize] == 0) continue
//
//        if (check(y, x, size = paperSize)) {
//            paper[paperSize] -= 1
//            attach(y, x, size = paperSize, marker = 0)
//            go(y, x + paperSize, cnt + 1)
//
//            attach(y, x, size = paperSize, marker = 1)
//            paper[paperSize] += 1
//        }
//    }
//    return
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    for (i in 0 until map.size) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    }
//    go(0, 0, 0)
//    if (minCnt == Int.MAX_VALUE)
//        println(-1)
//    else
//        println(minCnt)
//    Unit
//}