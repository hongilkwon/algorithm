package bac.easy


/*
    경로찾기
    정점의 개수 N (1 ≤ N ≤ 100)

    그래프의 인접 행렬

    플로이드 와샬의 일부로 사용되는 로직

    "양수인 경로"가 있으면 i번째 줄의 j번째 숫자를 1로, 없으면 0으로 출력
 */


//var n = 0
//
//lateinit var matrix: Array<IntArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    matrix = Array(n){
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    for (k in 0 until n) {
//        for (u in 0 until n) {
//            for (v in 0 until n) {
//                if (matrix[u][k] == 1 && matrix[k][v] == 1)
//                    matrix[u][v] = 1
//            }
//        }
//    }
//
//    matrix.forEach { println(it.joinToString(" ")) }
//    return@with Unit
//}
