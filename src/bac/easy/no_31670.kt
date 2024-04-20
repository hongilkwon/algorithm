package bac.easy


/*
   특별한 마법 공격(dp)

   모든 서로 인접한 두 학생 중 한 명 이상을 단죄해야 한다.

   2 5 4 1 3

   2 5 중 선택
   5 4 중 선택
   4 1 중 선택
   .
   .
   2*2*2... 너무 많은 경우의 수

   DP로 풀어야 된다.
   상향식 방식
   하향식 방식
*/

//import kotlin.math.min
//
//var n = 0
//lateinit var arr: LongArray
//
//val INF = 1e18.toLong()
//
//val cache = Array(10_0001) { LongArray(2) { -1 } }
//
//fun go(idx: Int, prevSelected: Int): Long {
//
//    if (idx == n)
//        return 0
//
//    if (cache[idx][prevSelected] != -1L) return cache[idx][prevSelected]
//
//    var ret = INF
//
//    if (prevSelected == 0) {
//        // 이전 idx 값을 단죄 하지 않은 경우, 현재 idx를 무조건 단죄한다.
//        ret = min(ret, go(idx + 1, 1) + arr[idx])
//    } else {
//        // 이전 idx 값을 단죄한 경우
//
//        // 현재 idx를 단죄 하지 않음.
//        ret = min(ret, go(idx + 1, 0))
//        // 현재 idx를 단죄
//        ret = min(ret, go(idx + 1, 1) + arr[idx])
//    }
//
//    cache[idx][prevSelected] = ret
//    return cache[idx][prevSelected]
//
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toLong() }.toLongArray()
//
//    val answer = min(go(1, 0), arr[0] + go(1, 1))
//    println(answer)
//
//    return@with Unit
//}