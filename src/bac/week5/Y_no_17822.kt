package bac.week5

/*
  원판 돌리기

  원판의 회전은 독립적으로 이루어진다.
  원판의 회전 방법은 미리 정해져 있고, i번째 회전할때 사용하는 변수는 xi, di, ki 이다.

   단순 구현 문제같은데 너무 복잡하다.

   */

//var n = 0
//var m = 0
//var t = 0
//
//lateinit var map: Array<Array<Int>>
//val rotateList = mutableListOf<Triple<Int, Int, Int>>()
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun Array<Array<Int>>.deepCopy(): Array<Array<Int>> {
//    val temp = Array(this.size) { Array(this.first().size) { 0 } }
//    for (row in indices) {
//        for (col in this.first().indices) {
//            temp[row][col] = this[row][col]
//        }
//    }
//    return temp
//}
//
//fun rotate(info: Triple<Int, Int, Int>) {
//    val num = info.first
//    val dir = info.second
//    val cnt = info.third
//    for (idx in 0 until n) {
//        if ((idx + 1) % num == 0) {
//            if (dir == 0)
//                repeat(cnt) { rClockWise(map[idx]) }
//            else
//                repeat(cnt) { rInverseClockWise(map[idx]) }
//        }
//    }
//}
//
//fun rClockWise(arr: Array<Int>) {
//    val temp = arr.last()
//    for (i in arr.size - 1 downTo 1) {
//        arr[i] = arr[i - 1]
//    }
//    arr[0] = temp
//}
//
//fun rInverseClockWise(arr: Array<Int>) {
//    val temp = arr.first()
//    for (i in 0..arr.size - 2) {
//        arr[i] = arr[i + 1]
//    }
//    arr[arr.size - 1] = temp
//}
//
//
//fun makeExtended(): Array<Array<Int>> {
//    val extended = Array(map.size + 2) { Array(map.first().size + 2) { 0 } }
//
//    for (i in 0 until map.size) {
//        extended[i + 1][0] = map[i][map.first().size - 1]
//    }
//
//    for (i in 0 until map.size) {
//        extended[i + 1][extended.first().size - 1] = map[i][0]
//    }
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            extended[i + 1][j + 1] = map[i][j]
//        }
//    }
//    return extended
//}
//
//fun upDate() {
//
//    val extended = makeExtended()
//    val temp = extended.deepCopy()
////    temp.forEach { println(it.joinToString(" ")) }
//    var flag = true
//    for (i in 1..extended.size - 2) {
//        for (j in 1..extended.first().size - 2) {
//            for (k in 0 until 4) {
//                val ny = i + dy[k]
//                val nx = j + dx[k]
//
//                if (ny !in 0 until extended.size || nx !in 0 until extended.first().size) continue
//                if (extended[i][j] == 0 || extended[ny][nx] == 0) continue
//                if (extended[i][j] == extended[ny][nx]) {
//                    temp[ny][nx] = 0
//                    temp[i][j] = 0
//                    flag = false
//                }
//            }
//        }
//    }
//
//    if (flag) {
//        var sum = 0.0
//        var cnt = 0.0
//        for (i in 0 until map.size) {
//            for (j in 0 until map.first().size) {
//                sum += temp[i + 1][j + 1]
//                if (temp[i + 1][j + 1] != 0)
//                    cnt += 1
//            }
//        }
//        val avg = (sum / cnt)
////        println("sum: $sum cnt: $cnt avg: $avg")
//        for (i in 0 until map.size) {
//            for (j in 0 until map.first().size) {
//                if (temp[i + 1][j + 1] == 0) continue
//                if (temp[i + 1][j + 1] > avg)
//                    temp[i + 1][j + 1] -= 1
//                else if (temp[i + 1][j + 1] < avg)
//                    temp[i + 1][j + 1] += 1
//            }
//        }
//    }
////    extended.forEach { println(it.joinToString(" ")) }
////    println()
////
////    temp.forEach { println(it.joinToString(" ")) }
////    println()
//
////     map 값 복사
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            map[i][j] = temp[i + 1][j + 1]
//        }
//    }
////    map.forEach { println(it.joinToString(" ")) }
////    println()
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    t = info[2]
//
//    map = Array(n) { emptyArray() }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    }
////    map.forEach { println(it.joinToString( " ")) }
//
//    for (i in 0 until t) {
//        val rInfo = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        rotateList.add(Triple(rInfo[0], rInfo[1], rInfo[2]))
//    }
////   println(rotateList.joinToString( " "))
//
//    for (i in 0 until rotateList.size) {
//        val info = rotateList[i]
//        rotate(info)
//        upDate()
//    }
//
//    var answer = 0
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            answer += map[i][j]
//        }
//    }
//    println(answer)
//    Unit
//}

