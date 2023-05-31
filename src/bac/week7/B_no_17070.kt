package bac.week7

/*
    파이프 옮기기 1

    가장 처음에 파이프는 (1, 1)와 (1, 2)를 차지하고 있고, 방향은 가로이다.
    회전은 45도만 회전시킬 수 있으며

    가로 -> 가로, 대각
    세로 -> 세로, 대각
    대각 -> 가로, 세로, 대각

    N(3 ≤ N ≤ 16)
    빈 칸은 0, 벽은 1로

   출력: 파이프의 한쪽 끝을 (N, N)로 이동시키는 방법의 개수
   없다면, 0을 출력한다. 방법의 수는 항상 1,000,000보다 작거나 같다.

   "특정 포인트로 갈수 있는 방법을 정할 때, 이동하는 방법을 나눠서 생각해야된다"

 */

//var n = 0
//
//lateinit var map: Array<Array<Int>>
//lateinit var case: Array<Array<Array<Int>>>
//fun check(y: Int, x: Int, dir: Int): Boolean {
//
//    if (y !in 0 until n || x !in 0 until n) return false
//
//    if (dir == 0 || dir == 1) {
//        if (map[y][x] == 0) return true
//    } else if (dir == 2) {
//        if (map[y][x] == 0 && map[y - 1][x] == 0 && map[y][x - 1] == 0) return true
//    }
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) { readLine().split(" ").map { it.toInt() }.toTypedArray() }
//    case = Array(n) { Array(n) { Array(3) { 0 } } }
//
//    case[0][1][0] = 1
//
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            // 현재 가로 위치 -> 가로, 대각 이동확인.
//            if (check(i, j + 1, 0)) {
//                case[i][j + 1][0] += case[i][j][0]
//            }
//            if (check(i + 1, j + 1, 2)) {
//                case[i + 1][j + 1][2] += case[i][j][0]
//            }
//
//            // 현재 세로 위치 -> 세로, 대각 이동확인.
//            if (check(i + 1, j, 1)) {
//                case[i + 1][j][1] += case[i][j][1]
//            }
//            if (check(i + 1, j + 1, 2)) {
//                case[i + 1][j + 1][2] += case[i][j][1]
//            }
//
//            // 현재 대각선 위치 -> 가로, 세로, 대각 이동확인.
//            if (check(i, j + 1, 0)) {
//                case[i][j + 1][0] += case[i][j][2]
//            }
//            if (check(i + 1, j, 1)) {
//                case[i + 1][j][1] += case[i][j][2]
//            }
//            if (check(i + 1, j + 1, 2)) {
//                case[i + 1][j + 1][2] += case[i][j][2]
//            }
//        }
//    }
//    val answer = case[n - 1][n - 1][0] + case[n - 1][n - 1][1] + case[n - 1][n - 1][2]
//    println(answer)
//    Unit
//}