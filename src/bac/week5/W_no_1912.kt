package bac.week5

/*
  연속합

  "연속된" 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 "한 개 이상 선택"

  n(1 ≤ n ≤ 100,000)
  10만 * 10만 반복문 돌면안됨.

  연속된합이라 생각하여 누적합을 이용하려고 하였으나, 작은 음수 나온 후 큰 양수가 나온다면 문제에 맞지가 않는다.
  즉, 구간을 기준으로 봤을때 그것이 양수인지 음수인지가 중요하다.

   */

//import kotlin.math.max
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//
//    var answer = Int.MIN_VALUE
//    var sum = 0
//    for (i in 0 until arr.size) {
//        sum += arr[i]
//        answer = max(answer, sum)
//        if (sum < 0) sum = 0
//    }
//    println(answer)
//    Unit
//}

