package leetcode


/*
   Range Sum Query 2D - Immutable
*/


//class NumMatrix(matrix: Array<IntArray>) {
//
//    val row = matrix.size
//    val col = matrix[0].size
//
//    val prefixSum = Array(row + 1) { IntArray(col + 1) { 0 } }
//
//    init {
//        for (i in 0 until row) {
//            for (j in 0 until col) {
//                prefixSum[i + 1][j + 1] = prefixSum[i + 1][j] + prefixSum[i][j + 1] - prefixSum[i][j] + matrix[i][j]
//            }
//        }
//    }
//
//    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int =
//        prefixSum[row2 + 1][col2 + 1] - prefixSum[row2 + 1][col1] - prefixSum[row1][col2 + 1] + prefixSum[row1][col1]
//
//
//}