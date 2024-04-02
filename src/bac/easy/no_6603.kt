package bac.easy


/*
   로또(조합)
*/


//var k = 0
//lateinit var arr: IntArray
//
//
//val result = mutableListOf<Int>()
//
//val sb = StringBuilder()
//fun combination(n: Int, r: Int, start: Int = 0) {
//
//    if (result.size == r) {
//        val temp = mutableListOf<Int>()
//        for (i in 0 until result.size) {
//            val idx = result[i]
//            temp.add(arr[idx])
//        }
//        sb.append("${temp.joinToString(" ")}\n")
//        return
//    }
//
//    for (i in start until n) {
//        result.add(i)
//        combination(n, r, i + 1)
//        result.removeLast()
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//
//        val info = readLine().split(" ").map { it.toInt() }
//        k = info[0]
//
//        if (k == 0) break
//
//        arr = IntArray(k) {
//            info[it + 1]
//        }
//        arr.sort()
//
//        sb.clear()
//        combination(k, 6)
//        println(sb.toString())
//
//    }
//
//    return@with Unit
//}