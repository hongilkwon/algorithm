package bac.etc


/*
   지정좌석 배치하기 1

    각 학생의 (좌석 높이 + 키)는 자신보다
    앞 행의 같은 열에 있는 모든 학생의 (좌석 높이 + 키)보다 커야 한다.

    좌석을 배치하던 달구 교수님은, 학생들의 시야를 확보하면서 모든 학생을 희망하는 행에 앉히는 것이 불가능할 수도 있다는 것을 깨달았다.
    학생들의 시야를 확보하면서 모든 학생을 희망하는 "행".. 열은 희망하지 않음

*/

//var n = 0
//var m = 0
//var d = 0
//
//lateinit var map: Array<IntArray>
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    d = info[2]
//
//    map = Array(n) { intArrayOf() }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    for (i in 1..n) {
//        for (j in 0 until m) {
//            map[i - 1][j] += (d * i)
//        }
//    }
//
//    for (i in 0 until n) {
//        map[i].sort()
//    }
//
//    var isPossible = true
//    for (col in 0 until m) {
//        for (row in 0 until n - 1) {
//            if (map[row][col] >= map[row + 1][col]) {
//                isPossible = false
//            }
//        }
//    }
//
//    if (isPossible) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//    return@with Unit
//}