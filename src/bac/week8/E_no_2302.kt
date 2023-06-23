package bac.week8


/*
    극장좌석

    1 <= N <= 40

    1 2 3
    1 3 2

    2 1 3

    idx ->
            idx + 1 변경하지 않는 것
            idx + 2 변경

    1 2 3 5 8 13 21 34 55
  */

var n = 0
var m = 0

// idx -> 앉을 수 있는 방법
val case = Array(41) { -1 }
val seatArr = Array(41) { 0 }
fun go(idx: Int): Int {

    if (idx >= n) return 1

    // 좌석에 앉을 수 없는 상태라면, 즉, vip 고정석이라면,
    if (seatArr[idx] == 1) return go(idx + 1)

    if (case[idx] != -1) return case[idx]

    var ret = 0
    if (seatArr[idx + 1] == 0)
        ret += (go(idx + 2) + go(idx + 1))
    else
        ret += go(idx + 1)

    case[idx] = ret
    return case[idx]
}

fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()
    m = readLine().toInt()

    for (i in 1 .. m){
        val vip = readLine().toInt()
        seatArr[vip] = 1
    }

    println(go(1))
}
