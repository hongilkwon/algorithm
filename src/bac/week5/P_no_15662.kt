package week5


/*
 톱니바퀴 (2)

 단순구현문제
 문제의 이해만 똑바로하면 구현가능하다.

 01 2 345 6 7

 1. 회전 규칙을 보고 어떻게 회전 시킬지 판별
 2. 각각 라인마다 회전방향에 따른 적용.

 */


//var t = 0
//lateinit var arr: Array<Array<Int>>
//val rotList = mutableListOf<Pair<Int, Int>>()
//
//
//fun rotateClockWise(idx: Int) {
//    val edge = arr[idx][7]
//    for (col in 7 downTo 1) {
//        arr[idx][col] = arr[idx][col - 1]
//    }
//    arr[idx][0] = edge
//}
//
//
//fun rotateCounterClockWise(idx: Int) {
//    val edge = arr[idx][0]
//    for (col in 0..6) {
//        arr[idx][col] = arr[idx][col + 1]
//    }
//    arr[idx][7] = edge
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//
//    t = readLine().toInt()
//
//    arr = Array(t) { Array(8) { 0 } }
//
//
//    for (i in 0 until t) {
//        val line = readLine().map { it.toString().toInt() }.toTypedArray()
//        arr[i] = line
//    }
////    arr.forEach {
////        println(it.joinToString(" "))
////    }
//
//    val rotNum = readLine().toInt()
//    for (i in 0 until rotNum) {
//        val info = readLine().split(" ").map { it.toInt() }
//        rotList.add(info[0] to info[1])
//    }
////    println(rotList.joinToString(" "))
//
//
//    rotList.forEach {
//        val result = Array(t) { false to 0 }
//
//        val idx = it.first - 1
//        val dir = it.second
//
//        result[idx] = true to dir
//
//        // idx 기준톱니 왼쪽
//        if (idx != 0) {
//            var currentDir = dir
//            var currentNS = arr[idx][6]
//            for (i in idx - 1 downTo 0) {
//                if (arr[i][2] == currentNS) {
//                    break
//                } else {
//                    currentNS = arr[i][6]
//                    currentDir = -currentDir
//                    result[i] = true to currentDir
//                }
//            }
//        }
//
//        // idx 기준톱니 오른쪽
//        if (idx != arr.size - 1) {
//            var currentDir = dir
//            var currentNS = arr[idx][2]
//            for (i in idx + 1 until arr.size) {
//                if (arr[i][6] == currentNS) {
//                    break
//                } else {
//                    currentNS = arr[i][2]
//                    currentDir = -currentDir
//                    result[i] = true to currentDir
//                }
//            }
//        }
//
////        println(result.joinToString(" "))
//        // 회전
//        result.forEachIndexed { index, info ->
//            if (info.first) {
//                if (info.second == 1) {
//                    rotateClockWise(index)
//                } else {
//                    rotateCounterClockWise(index)
//                }
//            }
//        }
//    }
//
////    arr.forEach {
////        println(it.joinToString(" "))
////    }
//
//    var answer = 0
//    for (row in 0 until t) {
//        answer += arr[row][0]
//    }
//    println(answer)
//}
//
