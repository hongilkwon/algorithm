package bac.week1

/*
수열
1-H

N은 2 이상 100,000 이하
10만 * 10만 100억


최댓값을 구하라 --> 최소로 시작해서 -> 최대
최솟값을 구하라 --> 최대로 시작해서 -> 최소

구간합
누적합 배열을 만드는 코드

fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(10) { it }
    val sumArr = Array(10) { 0 }

    println(arr.joinToString(" "))

    for (i in 0 until arr.size) {
        if (i == 0) {
            sumArr[i] = arr[i]
        } else {
            sumArr[i] = sumArr[i - 1] + arr[i]
        }
    }
    println(sumArr.joinToString( " "))
    Unit
}

 */


/*
*  아래 코드는 옳바른 로직을 가지고 있지만, 시간 초과가 발생한다.
*
* */

//import kotlin.math.max
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val n = info[0]
//    val date = info[1]
//    val arr = readLine().split(" ").map { it.toInt() }
//
//    var max = Int.MIN_VALUE
//    for (i in 0 until arr.size - (date - 1)) {
//        var sum = 0
//        for (j in i until i+date){
//            sum += arr[j]
//        }
//        max = max(max, sum)
//    }
//    println(max)
//}


//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val n = info[0]
//    val date = info[1]
//    val arr = readLine().split(" ").map { it.toInt() }
//    val sumArr = Array(arr.size) { 0 }
//
//    // 누적합 배열을 만드는 코드
//    for (i in 0 until arr.size) {
//        if (i == 0) {
//            sumArr[i] = arr[i]
//        } else {
//            sumArr[i] = sumArr[i - 1] + arr[i]
//        }
//    }
//
//    println(sumArr.joinToString(" "))
//
//    var max = Int.MIN_VALUE
//    for (i in date - 1 until sumArr.size) {
//
//        val sum =
//            if (i == date - 1)
//                sumArr[i]
//            else {
//                sumArr[i] - sumArr[i - date]
//            }
//        if (max < sum) {
//            max = sum
//        }
//    }
//    println(max)
//}
