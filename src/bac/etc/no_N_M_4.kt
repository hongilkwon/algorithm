package bac.etc

/*
    N과 M (4)

    1부터 N까지 자연수 중에서 M개를 고른 수열
    같은 수를 여러 번 골라도 된다.

    중복조합
 */


//var n = 0
//var m = 0
//
//val result = mutableListOf<Int>()
//fun doubleCombi(n: Int, r: Int, start: Int = 1) {
//
//    if (r == result.size) {
//        println(result.joinToString(" "))
//        return
//    }
//
//    for (i in start .. n){
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
//    doubleCombi(n, m)
//}