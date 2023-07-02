package bac.week8

/*
    나무 심기

    N (2 ≤ N ≤ 200,000)

    나무가 오름차순으로 심어지는게 아니라 랜덤하게 심어진다.
    --> 거리에 대한 배열의 순서가 동적으로 바뀐다.

 */

const val MOD = 1_000_000_007

var n = 0
val point = Array(200_001) { 0 }
val cost = Array(200_001) { 0 }

fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()
    for (i in 1..n) {
        point[i] = readLine().toInt()
    }

    cost[1] = 0
    for (i in 2..n) {
        for (j in 1 until i) {
            cost[i] += point[i] - point[j]
        }
    }
    Unit
}
