package bac.week6

/*
    연속부분 최대곱

    N은 10,000 이하의 자연수
    1만 * 1만 = 100_000_000 1억
    1.0 보다 작은 수를 곱하면 작아진다.

    greedy
    이전까지 연속된곱이 1보다 작아진다면, 차라리 다음 원소를 초항으로 바꾸는게 낫다.


    반올림.
    println("${%.2f}".format(it))
    println((it*100).roundToInt() / 100.0)

 */

//import kotlin.math.*
//
//var n = 0
//lateinit var arr: Array<Double>
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    arr = Array(n) { readLine().toDouble() }
//
//
//    var answer = Double.MIN_VALUE
//    var temp = arr[0]
//    for (i in 1 until n) {
//        if (1 > temp) {
//            temp = arr[i]
//        } else {
//            temp *= arr[i]
//        }
//        answer = max(answer, temp)
//    }
//    println("%.3f".format(answer))
//}

//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    arr = Array(n) { readLine().toDouble() }
//
//    var max = Double.MIN_VALUE
//
//    for (i in 0 until n) {
//        val s = i
//        for (j in 0 until i) {
//           val e = j
//           for (k in j .. i){
//               /*
//               *
//               * */
//           }
//        }
//    }
//
//    println(max)
//}

