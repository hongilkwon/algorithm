package bac.week6


/*
    게임

    게임 횟수 : X
    이긴 게임 : Y (Z%)
    Z는 형택이의 승률이고, 소수점은 버린다. 예를 들어, X=53, Y=47이라면, Z=88이다.

   형택이는 앞으로의 모든 게임에서 지지 않는다
   승률이 올라가려면 최소 몇승을 해야되는가.

   Z가 절대 변하지 않는다면 -1을 출력한다.

   1 ≤ X ≤ 1,000,000,000
   0 ≤ Y ≤ X

   * 백분율 구할떄, 나누기할때 값이 온전히 보전되지 않는것에 주의 해야된다.

   */

import kotlin.math.min

var total: Long = 0
var win: Long = 0
var winRate: Long = 0
fun check(mid: Long): Boolean {

    val nTotal = total + mid
    val nWin = win + mid

    val nWinRate = (nWin*100 / nTotal)

    return nWinRate != winRate
}

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toLong() }
    total = info[0]
    win = info[1]

    winRate = (win * 100 / total)

    if (winRate in arrayOf(99L, 100L)) {
        println(-1)
        return@with
    }

    var left: Long = 1
    var right: Long = 1_000_000_000

    var answer = Long.MAX_VALUE

    while (left <= right) {
        val mid: Long = (left + right) / 2

        if (check(mid)) {
            answer = min(mid, answer)
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    println(answer)
    Unit
}
