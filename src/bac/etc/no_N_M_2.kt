package bac.etc

/*
    N과 M (2)

    1-N의 자연수 중 M개 로 구성된 수열 구하기.
    중복이 발생해선 된다.

    M = 2 일때,
    즉 (1, 1) 허용 되지 않음.

    조합
 */


//var n = 0
//var m = 0
//
//val result = mutableListOf<Int>()
//fun combi(n: Int, r: Int, start: Int = 1) {
//
//    if (result.size == r) {
//        println(result.joinToString(" "))
//        return
//    }
//
//    for (i in start..n) {
//        result.add(i)
//        combi(n, r, i + 1)
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
//    combi(n, m)
//}