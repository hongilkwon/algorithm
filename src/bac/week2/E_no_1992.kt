package bac.week2

/*
쿼드트리
2-E

재귀문제
idx 계산을 잘못하면 힘들어진다.
종료조건과 무엇을 재귀의 기준으로 잡는가를 잘해야 된다.

큰 맵에서 작은 맵으로 부분 딥카피할때, 기준은 작은 맵의 i, j 기준으로 한다

 */

//lateinit var map: Array<IntArray>
//
//fun quadTree(map: Array<IntArray>): String {
//
//    if (checkZero(map)) {
//        return "0"
//    }
//    if (checkOne(map)) {
//        return "1"
//    }
//    if (map.size == 2) {
//        var str = "("
//        for (i in 0 until map.size) {
//            for (j in 0 until map.first().size) {
//                str += map[i][j].toString()
//            }
//        }
//        str += ")"
//        return str
//    }
//
//    val nm1 = Array(map.size / 2) { i ->
//        IntArray(map.size / 2) { j ->
//            map[i][j]
//        }
//    }
//
//    val nm2 = Array(map.size / 2) { i ->
//        IntArray(map.size / 2) { j ->
//            map[i][map.size / 2 + j]
//        }
//    }
//
//    val nm3 = Array(map.size / 2) { i ->
//        IntArray(map.size / 2) { j ->
//            map[map.size / 2 + i][j]
//        }
//    }


//
//    val nm4 = Array(map.size / 2) { i ->
//        IntArray(map.size / 2) { j ->
//            map[map.size / 2 + i][map.size / 2 + j]
//        }
//    }
//
//    return "(" + quadTree(nm1) +
//            quadTree(nm2) +
//            quadTree(nm3) +
//            quadTree(nm4) + ")"
//}
//
//fun checkZero(map: Array<IntArray>): Boolean {
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] != 0)
//                return false
//        }
//    }
//    return true
//}
//
//fun checkOne(map: Array<IntArray>): Boolean {
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] != 1)
//                return false
//        }
//    }
//    return true
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    map = Array(n) { IntArray(n) { 0 } }
//
//    for (i in 0 until n) {
//        val line = readLine().toCharArray().map { it.toString().toInt() }.toIntArray()
//        map[i] = line
//    }
//    println(quadTree(map))
//}
