package week5


/*
    배열 돌리기 4

    배열 A의 값의 최솟값을 구해보자. 회전 연산은 모두 한 번씩 사용해야 하며, 순서는 임의로 정해도 된다.
    단순구현.

    회전연산에 대한 이해
    최소값
    순열

 */

//import kotlin.math.min
//
//var n = 0
//var m = 0
//var r = 0
//
//lateinit var originMap: Array<Array<Int>>
//val rotateInfo = mutableListOf<Triple<Int, Int, Int>>()
//
//var answer = Int.MAX_VALUE
//
///*
//
// */
//
//
//fun MutableList<Triple<Int, Int, Int>>.swap(i: Int, j: Int) {
//    val temp = this[j]
//    this[j] = this[i]
//    this[i] = temp
//}
//
//fun makePermutation(size: Int, r: Int, depth: Int = 0) {
//
//    if (r == depth) {
//        val result = rotateInfo.subList(fromIndex = 0, toIndex = r)
//
//        val temp = Array(n) { Array(m) { 0 } }
//        for (i in 0 until originMap.size) {
//            for (j in 0 until originMap[0].size) {
//                temp[i][j] = originMap[i][j]
//            }
//        }
//
//        result.forEach {
//           rotate(temp, it)
//        }
//
//        val min = temp.map { it.sum() }.min()
//        answer = min(answer, min)
//        return
//    }
//
//    for (idx in depth until size) {
//        rotateInfo.swap(idx, depth)
//        makePermutation(size, r, depth + 1)
//        rotateInfo.swap(depth, idx)
//    }
//}
//
//
//fun rotate(map: Array<Array<Int>>, info: Triple<Int, Int, Int>): Array<Array<Int>> {
//
//    var start = (info.first - info.third - 1) to (info.second - info.third - 1)
//    var end = (info.first + info.third - 1) to (info.second + info.third - 1)
//
//    // 임시 배열 생성.
//    val temp = Array(n) { Array(m) { 0 } }
//    for (i in 0 until map.size) {
//        for (j in 0 until map[0].size) {
//            temp[i][j] = map[i][j]
//        }
//    }
//
//    while (start.first < end.first && start.second < end.second) {
//
////        println("start: $start")
////        println("end: $end")
//
//        val topRow = start.first
//        for (col in end.second downTo start.second + 1) {
//            temp[topRow][col] = map[topRow][col - 1]
//        }
//
//        val bottomRow = end.first
//        for (col in start.second..end.second - 1) {
//            temp[bottomRow][col] = map[bottomRow][col + 1]
//        }
//
//        val leftCol = start.second
//        for (row in start.first..end.first - 1) {
//            temp[row][leftCol] = map[row + 1][leftCol]
//        }
//
//        val rightRow = end.second
//        for (row in end.first downTo start.first + 1) {
//            temp[row][rightRow] = map[row - 1][rightRow]
//        }
//
//        // 회전 좌표 이동
//        start = start.first + 1 to start.second + 1
//        end = end.first - 1 to end.second - 1
//
////        temp.forEach {
////            println(it.joinToString(" "))
////        }
//    }
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map[0].size) {
//            map[i][j] = temp[i][j]
//        }
//    }
//    return map
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    r = info[2]
//
//    originMap = Array(n) { Array(m) { 0 } }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        originMap[i] = line
//    }
//
//    for (i in 0 until r) {
//        val line = readLine().split(" ").map { it.toInt() }
//        val tri = Triple(line[0], line[1], line[2])
//        rotateInfo.add(tri)
//    }
//
////    map.forEach {
////        println(it.joinToString(" "))
////    }
//
//    makePermutation(rotateInfo.size, rotateInfo.size)
//    println(answer)
//}