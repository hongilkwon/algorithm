package bac.easy

/*
    마인 크래프트

    좌표 (i, j)의 가장 위에 있는 블록을 제거하여 인벤토리에 넣는다.
    인벤토리에서 블록 하나를 꺼내어 좌표 (i, j)의 가장 위에 있는 블록 위에 놓는다.
    1번 작업은 2초가 걸리며, 2번 작업은 1초가 걸린다.

    밤에는 무서운 몬스터들이 나오기 때문에 최대한 빨리 땅 고르기 작업을 마쳐야 한다.
    ‘땅 고르기’ 작업에 걸리는 최소 시간과 그 경우 땅의 높이를 출력하시오.

    작업을 시작할 때 인벤토리에는 B개의 블록이 들어 있다. 땅의 높이는 256블록을 초과할 수 없으며, 음수가 될 수 없다.

    땅을 고르는 데 걸리는 시간과 땅의 높이를 출력하시오.
    답이 여러 개 있다면 그중에서 땅의 높이가 가장 높은 것을 출력

    1 ≤ M, N ≤ 500, 0 ≤ B ≤ 6.4 × 10^7

    평균을 기준으로 ?
    100 0
    새로운 블록을 놓는게 빠름.
    완탐.
    ->  500*500
    250000 * 256 -> 얼마 되지 않음 해보자!

 */

//var n = 0
//var m = 0
//
//var b = 0
//lateinit var map: Array<IntArray>
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    b = info[2]
//
//    map = Array(n) { intArrayOf() }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var allBlock = b
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            allBlock += map[i][j]
//        }
//    }
//
//    val maxAvgH = allBlock / (n * m)
//    var minTime = (256 * 2) * (n * m)
//    var maxh = 0
//
//    for (h in 0..maxAvgH) {
//        var time = 0
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                if (map[i][j] > h) {
//                    time += (map[i][j] - h) * 2
//                } else if (map[i][j] < h) {
//                    time += (h - map[i][j])
//                }
//            }
//        }
//        if (minTime >= time){
//            minTime =time
//            maxh = h
//        }
//    }
//    println("$minTime $maxh")
//}