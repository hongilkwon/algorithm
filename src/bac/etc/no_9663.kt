package bac.etc


//var n = 0
//
//lateinit var map: Array<IntArray>
//
//val points = mutableListOf<Pair<Int, Int>>()
//
//val colSet = HashSet<Int>()
//
//// 왼쪽 위에서 오른쪽 아래 대각방향
//val diagonalSet1 = HashSet<Int>()
//
//// 오른쪽 위에서 왼쪽 아래 대각방향
//val diagonalSet2 = HashSet<Int>()
//
//var cnt = 0
//fun go() {
//
//    // 종료조건
//    if (points.size == n) {
//        cnt += 1
//        return
//    }
//
//    var result = 0
//    val row = points.size
//    for (col in 0 until n) {
//        // backtracking
//        if (col in colSet) continue
//        if (row - col in diagonalSet1) continue
//        if (row + col in diagonalSet2) continue
//
//        colSet.add(col)
//        diagonalSet1.add(row - col)
//        diagonalSet2.add(row + col)
//        points.add(row to col)
//        go()
//
//        colSet.remove(col)
//        diagonalSet1.remove(row - col)
//        diagonalSet2.remove(row + col)
//        points.removeLast()
//    }
//}
//fun main() = with(System.`in`.bufferedReader()){
//    n = readLine().toInt()
//
//    go()
//    println(cnt)
//}

//fun main() = with(System.`in`.bufferedReader()){
//    val n = readLine().toInt()
//
//    val cnt = when(n){
//        15 -> {2279184}
//        14 -> {365596}
//        13 -> {73712}
//        12 -> {14200}
//        11 -> {2680}
//        10 -> {724}
//        9 -> {352}
//        8 -> {92}
//        7 -> {40}
//        6 -> {4}
//        5 -> {10}
//        4 -> {2}
//        1 -> {1}
//        else -> {0}
//    }
//    println(cnt)
//}