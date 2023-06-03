package bac.week7

/*
    알약

    * 아예 못풀음.

    1개 -> W
    0.5개 -> H

    N ≤ 30

    2^60

    "서로 다른 문자열의 개수는 총 몇 개"
    "W가 1개 먼저 나타나야 그 다음 H가 올 수 있다."

    1개
    WH

    n=2 -> 2개
    WH WH
    W WH H

    n=3 -> 5개
      WH WH WH
    W WH WH H

    WWHH WH
    WH WWHH

    WWW HHH

    n=4 -> 14개

    하향식 방법.
    메모이제이션 기준
    (1개짜리 알약, 0.5개 짜리 알약)

 */


//var n = 0
//
//val case = Array(31) { Array<Long>(31) { 0 } }
//
//fun go(w: Int, h: Int): Long {
//    // 모든 약을 소진하면 1개의 방법을 반환한다.
//    if (w == 0 && h == 0) {
//        return 1
//    }
//
//    if (case[w][h] != 0L) return case[w][h]
//
//    var result: Long = 0
//    if (w > 0){ result += go(w-1, h + 1)}
//    if (h > 0){ result += go(w, h - 1)}
//
//    case[w][h] = result
//    return result
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//        val n = readLine().toInt()
//        if (n == 0) break
//        val answer = go(n, 0)
//        println(answer)
//    }
//}