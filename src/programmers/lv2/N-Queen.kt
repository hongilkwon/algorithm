package programmers.lv2


/*
    N-Queen

    체스판의 가로 세로의 세로의 길이 n이 매개변수로 주어질 때, n개의 퀸이 조건에 만족 하도록 배치할 수 있는 방법의 수
    1<= n <= 12

    1. n = 12 라면
    12*12 = 144

    144C12 = 103_619_293_824_707_388

    -> 너무 큼... 완전탐색으로 하면 안됨.

    Backtracking
    https://www.youtube.com/watch?v=gcuZ_VGIcn4

    1. n * (n^2) ^ (n^2)
    * 1개의 row 1개의 퀸만 배치될 수 있다.
    2. n * n ^ n
    * 대각선의 특성을 이용하여.
    * HashSet을 이용하여 Queen을 놓을수 있는지 확인한다.
    3. n ^ n
 */

//class Solution {
//
//    lateinit var map: Array<IntArray>
//    var n = 0
//
//    val points = mutableListOf<Pair<Int, Int>>()
//
//    val colSet = HashSet<Int>()
//
//    // 왼쪽 위에서 오른쪽 아래 대각방향
//    val diagonalSet1 = HashSet<Int>()
//
//    // 오른쪽 위에서 왼쪽 아래 대각방향
//    val diagonalSet2 = HashSet<Int>()
//    fun go(): Int {
//
//        // 종료조건
//        if (points.size == n) {
//            return 1
//        }
//
//        var result = 0
//        val row = points.size
//        for (col in 0 until n) {
//            // backtracking
//            if (col in colSet) continue
//            if (row - col in diagonalSet1) continue
//            if (row + col in diagonalSet2) continue
//
//            colSet.add(col)
//            diagonalSet1.add(row - col)
//            diagonalSet2.add(row + col)
//            points.add(row to col)
//            result += go()
//
//            colSet.remove(col)
//            diagonalSet1.remove(row - col)
//            diagonalSet2.remove(row + col)
//            points.removeLast()
//        }
//        return result
//    }
//
//    fun solution(n: Int): Int {
//        var answer = 0
//
//        this.n = n
//        this.map = Array(n) { IntArray(n) { 0 } }
//
//        answer = go()
//        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(4)
//}