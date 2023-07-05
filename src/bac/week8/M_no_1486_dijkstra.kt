package bac.week8

/*
    등산

    플로이드 워셜

    정수 좌표 중 높이의 차이가 T보다 크지 않은 곳으로만 이동가능하다.

    1 <= n m <= 25
    1 <= t <= 52
    1 <= D <= 1_000_000

    'A'-'Z'일 때는 0-25를 뜻하는 것이고, 'a'-'z'일 때는, 26-51
    (A 아스키 코드 65  / a 아스키 코드 97)

    어두워지는 시간 D가 주어졌을 때, 세준이가 D보다 크지 않은 시간 동안 올라갈 수 있는 최대 높이

    각 노드를 움직일때, 들어가는 가중치가 다름
    높이가 같거나 낮으면 - 1초
    현재 위치보다 높다면  (높은곳 - 낮은곳)^2

    원점으로 돌아온다.

    (y, x) -> 1차원 배열 (y * 100 + x)
    최대 25, 25 => 2500 + 25 = 2525

    * 해결하지 못함 왜 메모리 초과가 나오는지 전혀 모르겠음.

 */

//import kotlin.math.abs
//import kotlin.math.max
//import kotlin.math.min
//
//var n = 0
//var m = 0
//var t = 0
//var d = 0
//
//const val INF = 1_000_000_000
//
//lateinit var map: Array<Array<Int>>
//
//val nodes = mutableListOf<Int>()
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val wMatrix = Array(2526) { Array(2526) { INF } }
//fun initWeightMatrix() {
//
//    // 대각선 요소 초기화
//    for (i in 0 until wMatrix.size) {
//        for (j in 0 until wMatrix.size) {
//            if (i == j) wMatrix[i][j] = 0
//        }
//    }
//
//    // 연결 노드 가중치 담기
//    for (y in 0 until map.size) {
//        for (x in 0 until map.first().size) {
//            for (i in 0 until 4) {
//
//                val ny = y + dy[i]
//                val nx = x + dx[i]
//
//                if (ny !in 0 until n || nx !in 0 until m) continue
//
//                val uHeight = map[y][x]
//                val vHeight = map[ny][nx]
//                val diff = abs(uHeight - vHeight)
//
//                if (t >= diff) {
//                    val w = if (vHeight > uHeight) {
//                        diff * diff
//                    } else {
//                        1
//                    }
////                    println("($y, $x) ($ny, $nx) $w")
//                    wMatrix[(y * 100) + x][(ny * 100) + nx] = w
//                }
//            }
//        }
//    }
//}
//
//fun floyd() {
//    for (k in 0 until nodes.size) {
//        for (i in 0 until nodes.size) {
//            for (j in 0 until nodes.size) {
//
//                val mid = nodes[k]
//                val y = nodes[i]
//                val x = nodes[j]
//
//                wMatrix[y][x] = min(wMatrix[y][x], wMatrix[y][mid] + wMatrix[mid][x])
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    t = info[2]
//    d = info[3]
//
//    map = Array(n) { Array(m) { 0 } }
//
//    for (i in 0 until n) {
//        map[i] = readLine().toCharArray().map {
//            if (it.code in 'A'.code..'Z'.code) {
//                it.code - 'A'.code
//            } else {
//                it.code - 'a'.code + 26
//            }
//        }.toTypedArray()
//    }
////    map.forEach { println(it.joinToString(" ")) }
//
//    //  (y, x) -> 1차원 배열 (y * 100 + x)
//    for (y in 0 until n) {
//        for (x in 0 until m) {
//            nodes.add((y * 100) + x)
//        }
//    }
//
//    initWeightMatrix()
//    floyd()
//
//    var answer = map[0][0]
//    for (i in nodes) {
//        if (i == 0) continue
//        val time = wMatrix[0][i] + wMatrix[i][0]
//        if (d >= time) {
//            answer = max(answer, map[i / 100][i % 100])
//        }
//    }
//
//    println(answer)
//    Unit
//}
