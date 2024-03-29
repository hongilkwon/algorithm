package bac.easy


/*
   구간합 구하기4 (누적합)

   1 ≤ N ≤ 100_000
   1 ≤ M ≤ 100,_000
   1 ≤ i ≤ j ≤ N

*/


//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//lateinit var prefixSum: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    prefixSum = IntArray(n) { 0 }
//    prefixSum[0] = arr[0]
//    for (i in 1 until n) {
//        prefixSum[i] = prefixSum[i - 1] + arr[i]
//    }
//
//    val sb = StringBuilder()
//    repeat(m) {
//        val range = readLine().split(" ").map { it.toInt() }
//        val s = range[0] - 1
//        val e = range[1] - 1
//
//        val sum =
//            if (s == 0){
//               prefixSum[e]
//            }
//            else {
//               prefixSum[e] - prefixSum[s - 1]
//            }
//
//       sb.append("$sum\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}