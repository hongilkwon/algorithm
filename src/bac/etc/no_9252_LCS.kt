package bac.etc

/*
    LCS(Longest Common Subsequence)

    최장 공통 부분 수열.
    https://youtu.be/ukb5aVT64uY?si=8NSxasslYVWYD_1V

    DP 문제임.
    타뷸레이션.


      A C A Y K P
    C 0 1
    A 1 1
    P
    C
    A
    K

    1. 기본이 되는 값을 채우기
    table[i][j] = table[i - 1][j - 1] + 1
    2.
*/


//var a = ""
//var b = ""
//
//lateinit var table: Array<IntArray>
//var lcsSb = StringBuilder()
//
//fun tracking(row: Int, col: Int) {
//    if (row == 0 || col == 0) {
//        return
//    }
//
//    if (a[row - 1] == b[col - 1]) {
//        lcsSb.append(a[row - 1])
//        tracking(row - 1, col - 1)
//    } else {
//        if (table[row - 1][col] > table[row][col - 1]) {
//            tracking(row - 1, col)
//        } else
//            tracking(row, col - 1)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    a = readLine()
//    b = readLine()
//
//    table = Array(a.length + 1) { IntArray(b.length + 1) { 0 } }
//
//    for (i in 1 until a.length + 1) {
//        for (j in 1 until b.length + 1) {
//            if (a[i - 1] == b[j - 1]) {
//                table[i][j] = table[i - 1][j - 1] + 1
//            } else {
//                table[i][j] = maxOf(table[i][j - 1], table[i - 1][j])
//            }
//        }
//    }
////    table.forEach { println(it.joinToString(" ")) }
//    tracking(a.length, b.length)
//
//    println(table[a.length][b.length])
//    println(lcsSb.reverse().toString())
//}