package bac.easy


/*
    계단 오르기.

    계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
    연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
    마지막 도착 계단은 반드시 밟아야 한다.

    총 점수의 최댓값

    계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.

    일단, 완탐으로 풀려다가 시간초과남.
    dp top-down 방식을 쓰려면 2개 상태가 필요함.
    tabulation으로 풀어야됨

    dp 문제는 실버로만 출제가 되어도 빡세다.
 */


//import kotlin.math.max
//
//var n = 0
//val arr: IntArray = IntArray(301) { 0 }
//val table: IntArray = IntArray(301) { 0 }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    for (i in 1 until arr.size) {
//        arr[i] = (readLine() ?: break).toInt()
//    }
//
//    table[1] = arr[1]
//    table[2] = arr[2] + table[1]
//    table[3] = arr[3] + max(arr[2], arr[1])
//
//    for (i in 4..n) {
//        table[i] = arr[i] + max(arr[i - 1] + table[i - 3], table[i - 2])
//    }
//
//    println(table[n])
//}