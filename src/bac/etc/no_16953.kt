package bac.etc

/*
    A → B

    A, B (1 ≤ A < B ≤ 1_000_000_000)

    A = 1
    B = 1_000_000_000

    특히 A*10 + 1 Int범위를 넘어설 수 있다.
    자료형에 조심해야 된다.

    * 값을 반환하는 재귀! 미리 확인하고 안간다
 */

//import kotlin.math.min
//
//var a: Long = 0
//var b: Long = 0
//
//val INF = 1_000_000_000L
//fun go(num: Long): Long {
//
//    if (num == b) {
//        return 1
//    }
//
//    var cnt = INF
//    if ((num * 2) <= b) cnt = min(cnt, go(num * 2) + 1)
//    if ((num * 10) + 1 <= b) cnt = min(cnt, go(num * 10 + 1) + 1)
//
//    return cnt
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    a = info[0].toLong()
//    b = info[1].toLong()
//
//    val result = go(a)
//
//    if (result >= INF)
//        println(-1)
//    else
//        println(result)
//}