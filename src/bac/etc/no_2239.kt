package bac.etc


/*
    스도쿠

    하다 만 스도쿠 퍼즐이 주어졌을 때, 마저 끝내는

    9*9

    9!*9!...너무 큼..

    완전탐색을 하면서 백트레킹을 쓰자!
    가장 사전식으로 앞서는것을 갱신하자 --> 시간초과
    당연하게 1..9 반복을 돌다보면 제일 처음 나오는 결과가 가장 사전순 앞에 있음.

 */

//import kotlin.system.exitProcess
//
//lateinit var sudoku: Array<IntArray>
//
//val emptyPoints = mutableListOf<Pair<Int, Int>>()
//
//val rowSets = Array(9) { mutableSetOf<Int>() }
//val colSets = Array(9) { mutableSetOf<Int>() }
//val rangeSets = Array(9) { mutableSetOf<Int>() }
//
//fun getRangeIdx(i: Int, j: Int): Int =
//    if (i in 0..2 && j in 0..2) {
//        0
//    } else if (i in 0..2 && j in 3..5) {
//        1
//    } else if (i in 0..2 && j in 6..8) {
//        2
//    } else if (i in 3..5 && j in 0..2) {
//        3
//    } else if (i in 3..5 && j in 3..5) {
//        4
//    } else if (i in 3..5 && j in 6..8) {
//        5
//    } else if (i in 6..8 && j in 0..2) {
//        6
//    } else if (i in 6..8 && j in 3..5) {
//        7
//    } else if (i in 6..8 && j in 6..8) {
//        8
//    } else {
//        -1
//    }
//
//fun go(idx: Int) {
//
//    if (idx == emptyPoints.size) {
//        sudoku.forEach {
//            println(it.joinToString(""))
//        }
//        exitProcess(0)
//    }
//
//    val point = emptyPoints[idx]
//    val r = point.first
//    val c = point.second
//
//    for (i in 1..9) {
//
//        if (i in rowSets[r]) continue
//        if (i in colSets[c]) continue
//        if (i in rangeSets[getRangeIdx(r, c)]) continue
//
//        rowSets[r].add(i)
//        colSets[c].add(i)
//        rangeSets[getRangeIdx(r, c)].add(i)
//        sudoku[r][c] = i
//        go(idx + 1)
//
//        rowSets[r].remove(i)
//        colSets[c].remove(i)
//        rangeSets[getRangeIdx(r, c)].remove(i)
//        sudoku[r][c] = 0
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    sudoku = Array(9) { IntArray(9) { 0 } }
//
//    for (i in 0 until 9) {
//        val line = readLine()
//        for (j in 0 until line.length) {
//            sudoku[i][j] = line[j].digitToInt()
//        }
//    }
//
//    for (i in 0 until 9) {
//        for (j in 0 until 9) {
//            if (sudoku[i][j] == 0) emptyPoints.add(i to j)
//            if (sudoku[i][j] != 0){
//                rowSets[i].add(sudoku[i][j])
//                colSets[j].add(sudoku[i][j])
//                rangeSets[getRangeIdx(i, j)].add(sudoku[i][j])
//            }
//        }
//    }
//
////    println("rowSets")
////    rowSets.forEach { println(it) }
////    println("colSets")
////    colSets.forEach { println(it) }
////    println("rangeSets")
////    rangeSets.forEach { println(it) }
//    go(0)
//}
