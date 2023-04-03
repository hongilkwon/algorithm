package bac.week5

import kotlin.math.max
import kotlin.math.min

/*
  연속합

  "연속된 "몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 "한 개 이상 선택"

  n(1 ≤ n ≤ 100,000)
  10만 * 10만 반복문 돌면안됨.

 */


fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.toTypedArray()


    val sumArr = Array(arr.size) { 0 }
    sumArr[0] = arr[0]

    for (i in 1 until arr.size) {
        sumArr[i] += sumArr[i - 1] + arr[i]
    }

    println(sumArr.joinToString(" "))

    var answer = Int.MIN_VALUE

    var minIdx = 0
    var minValue = Int.MAX_VALUE

    var maxIdx = 0
    var maxValue = Int.MIN_VALUE

    for (i in 0 until sumArr.size) {
        if (sumArr[i] >= maxValue) {
            maxValue = sumArr[i]
            maxIdx = i
        }
        if (sumArr[i] <= minValue) {
            minValue = sumArr[i]
            minIdx = i
        }
        if (maxIdx >= minIdx){
            println("maxIdx:$maxIdx  minIdx:$minIdx")
            answer = sumArr[maxIdx] - sumArr[minIdx]
        }
    }

    println("answer:$answer")
    Unit
}

