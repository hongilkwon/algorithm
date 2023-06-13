package bac.week7

/*
   물통

   (1 ≤ a, b < 100_000)

   a, b
   채우거나,
   비우거나,
   이동하고,

   BFS를 이용한 경우의 수 문제.

 */

//import java.util.*
//import kotlin.math.max
//import kotlin.math.min
//
//var a = 0
//var b = 0
//
//var c = 0
//var d = 0
//
//fun fillA(cb: Int, cnt: Int) {
//    if (caseMap[a to cb] != null) return
//    caseMap[a to cb] = cnt + 1
//    queue.add(a to cb)
//}
//
//fun emptyA(cb: Int, cnt: Int) {
//    if (caseMap[0 to cb] != null) return
//    caseMap[0 to cb] = cnt + 1
//    queue.add(0 to cb)
//}
//
//fun moveAtoB(ca: Int, cb: Int, cnt: Int) {
//
//    val nCa = max(0, ca + cb - b)
//    val nCb = min(ca + cb, b)
//
//    if (caseMap[nCa to nCb] != null) return
//    caseMap[nCa to nCb] = cnt + 1
//    queue.add(nCa to nCb)
//}
//
//fun fillB(ca: Int, cnt: Int) {
//    if (caseMap[ca to b] != null) return
//    caseMap[ca to b] = cnt + 1
//    queue.add(ca to b)
//}
//
//fun emptyB(ca: Int, cnt: Int) {
//    if (caseMap[ca to 0] != null) return
//    caseMap[ca to 0] = cnt + 1
//    queue.add(ca to 0)
//}
//
//fun moveBtoA(ca: Int, cb: Int, cnt: Int) {
//
//    val nCa = min(ca + cb, a)
//    val nCb = max(0, ca + cb - a)
//
//    if (caseMap[nCa to nCb] != null) return
//    caseMap[nCa to nCb] = cnt + 1
//    queue.add(nCa to nCb)
//}
//
//val caseMap = mutableMapOf<Pair<Int, Int>, Int>()
//val queue: Queue<Pair<Int, Int>> = LinkedList()
//
//// 너비우선탐색을 이용하여 각 경우가 종료되었을때 물의 양을 저장한다.
//fun go(initPoint: Pair<Int, Int>) {
//
//    queue.add(initPoint)
//
//    caseMap[initPoint] = 1
//
//    while (queue.isNotEmpty()) {
//
//        val point = queue.poll()
//
//        val currentA = point.first
//        val currentB = point.second
//
//        fillA(cb = currentB, cnt = caseMap[point]!!)
//        emptyA(cb = currentB, cnt = caseMap[point]!!)
//        moveAtoB(currentA, currentB, cnt = caseMap[point]!!)
//
//        fillB(ca = currentA, cnt = caseMap[point]!!)
//        emptyB(ca = currentA, cnt = caseMap[point]!!)
//        moveBtoA(currentA, currentB, cnt = caseMap[point]!!)
//    }
//
//    if (caseMap[c to d] != null){
//        println(caseMap[c to d]!! - 1)
//    }else{
//        println(-1)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    a = info[0]
//    b = info[1]
//    c = info[2]
//    d = info[3]
//
//    go(0 to 0)
//    Unit
//}