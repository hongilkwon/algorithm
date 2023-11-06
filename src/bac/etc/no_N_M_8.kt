package bac.etc

/*
    n m 8

    중복조합.
 */


//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//
//val result = mutableListOf<Int>()
//fun doubleCombi(n: Int, r: Int, start: Int = 0) {
//
//    if (r == result.size) {
//        val temp = mutableListOf<Int>()
//        for (idx in result) {
//            temp.add(arr[idx])
//        }
//        println(temp.joinToString(" "))
//        return
//    }
//
//    for (i in start until n) {
//        result.add(i)
//        doubleCombi(n, r, i)
//        result.removeLast()
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    arr.sort()
//
//    doubleCombi(n, m)
//}