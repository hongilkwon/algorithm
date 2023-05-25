package bac.week3



/*
    사다리 조작
 */

//import kotlin.math.min
//
//lateinit var bridge: Array<IntArray>
//
//var n = 0
//var m = 0
//var h = 0
//
//
//fun check(): Boolean {
//    for (i in 1..n) {
//        var start = i
//        for (j in 1..h) {
//            if (bridge[j][start] == 1)
//                start += 1
//            else if (bridge[j][start - 1] == 1)
//                start -=1
//        }
//        if (start != i) return false
//    }
//    return true
//}
//
//
//var result = Int.MAX_VALUE
//
//fun createBridge(cnt: Int, here: Int) {
//
//    if (cnt > 3 || cnt >= result) return
//    if (check()) {
//        result = min(result, cnt)
//        return
//    }
//
//    for (i in here..h) {
//        for (j in 1..n) {
//            if (bridge[i][j] == 1 || bridge[i][j - 1] == 1 || bridge[i][j + 1] == 1) continue
//            bridge[i][j] = 1
//            createBridge(cnt + 1, i)
//            bridge[i][j] = 0
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
//    h = info[2]
//
//    bridge = Array(h + 2) { IntArray(n + 2) { 0 } }
//
//    for (i in 0 until m) {
//        val bri = readLine().split(" ").map { it.toInt() }
//        bridge[bri[0]][bri[1]] = 1
//    }
//
//    createBridge(0, 1)
//
//    val answer = if (result == Int.MAX_VALUE) {
//        -1
//    } else {
//        result
//    }
//    println(answer)
//}