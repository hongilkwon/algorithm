package bac.week5

import java.lang.Math.max


/*
 2048

 N (1 ≤ N ≤ 20)
 0은 빈 칸을 나타내며, 이외의 값은 모두 블록을 나타낸다. 블록에 쓰여 있는 수는 2보다 크거나 같고, 1024보다 작거나 같은 2의 제곱꼴

 최대 5번 이동해서 만들 수 있는 가장 큰 블록의 값

 아예 풀지를 못함.
 기본적인 로직은 생각했지만, 1줄도 구현되지 못함.

 * 똑같은 수가 세 개가 있는 경우에는 이동하려고 하는 쪽의 칸이 먼저 합쳐진다

 1. 브루스포스 4방향중 이동시킬수 있는 5개의 방향을 전부 돌림(중복 조합)
    --> 브루스 포스는 맞으나 회전의 형태로 해결함.

 2. 이미 합쳐진 블록을 구별하기
 3. 최대블록 구하기

 */


//lateinit var map: Array<Array<Pair<Int, Boolean>>>
//var answer = 0
//
//class Board {
//
//    val map = Array(21) { Array(21) { 0 } }
//
//    fun move() {
//
//    }
//
//    // 배열회전.
//    fun rotate90() {
//        val temp = Array(21) { Array(21) { 0 } }
//        for(i in 0 until map.size){
//            for (j in 0 until map.size){
//                temp[i][j] = map[map.size - j - 1][i];
//            }
//        }
//
//        for(i in 0 until map.size){
//            for (j in 0 until map.size){
//                 map[i][j] = temp[i][j]
//            }
//        }
//    }
//
//    fun getMax(): Int {
//        var max = Int.MIN_VALUE
//        for (i in 0 until map.size) {
//            for (j in 0 until map.size) {
//                max = max(map[i][j], max)
//            }
//        }
//        return max
//    }
//
//    fun print() {
//        map.forEach {
//            println(it.joinToString(" "))
//        }
//    }
//}
//
//
//fun go(board: Board, cnt: Int) {
//
//    if (cnt == 5) {
//        board.getMax()
//        return
//    }
//
//    for (i in 0 until 4) {
//        board.move()
//        go(board, cnt + 1)
//        board.rotate90()
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val board = Board()
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        for (j in 0 until info.size) {
//            board.map[i][j] = info[j]
//        }
//    }
//
//    board.print()
//    board.rotate90()
//    println()
//    board.print()
//}