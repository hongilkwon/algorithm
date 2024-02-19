package bac.easy


/*
    퇴사(완전탐색, dp, 삼성)

    N일 동안 최대한 많은 상담
    하루에 하나씩 서로 다른 사람의 상담

    상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi
    백준이가 얻을 수 있는 최대 수익을 구하는 프로그램


    N=15 완탐 2^15 충분히 가능하다.

 ... 그리디?? 현재 최선의 선택이 결론적으로 최선의 선택으로 이어지는가????
    *dp

 */

//import kotlin.math.max
//
//var n = 0
//
//lateinit var arr: Array<Pair<Int, Int>>
//
//var maxPay = 0
//fun go(day: Int, pay: Int) {
//
//    if (day >= n) {
//        maxPay = max(maxPay, pay)
//        return
//    }
//
//    // 상담이 가능하면 하고.
//    if (day + arr[day].first <= n)
//        go(day + arr[day].first, pay + arr[day].second)
//
//    // 상담은 언제든 안할 수 있다.
//    go(day + 1, pay)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    arr = Array(n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        info[0] to info[1]
//    }
//
//    go(0, 0)
//    println(maxPay)
//    return@with Unit
//}


var n = 0

lateinit var arr: Array<Pair<Int, Int>>
lateinit var table: IntArray

fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()

    arr = Array(n) {
        val info = readLine().split(" ").map { it.toInt() }
        info[0] to info[1]
    }

    table = IntArray(n+1) { 0 }
    for (i in 0 until n) {

        val t = arr[i].first
        val p = arr[i].second

        for (j in i + t until arr.size) {
            if (table[j] < table[i] + p) {
                table[j] = table[i] + p
            }
        }
    }

    println(table.joinToString(" "))
    println(table[n])
    return@with Unit
}