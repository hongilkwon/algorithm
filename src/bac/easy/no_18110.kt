package bac.easy

/*
    solved.ac

    난이도 의견은 그 사용자가 생각한 난이도를 의미하는 정수 하나로 주어진다

    아직 아무 의견이 없다면 문제의 난이도는 0으로 결정한다.
    의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사평균으로 결정한다.

    제외되는 사람의 수는 위, 아래에서 각각 반올림
    계산된 평균도 정수로 반올림

     (0 ≤ n ≤ 3 * 100_000)

 */

//import kotlin.math.roundToInt
//
//var n = 0
//lateinit var arr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    arr = IntArray(n) { readLine().toInt() }
//
//    val points = 0
//    if (arr.isEmpty()) {
//        println(points)
//    } else {
//        val temp = (arr.size.toDouble() * 15.0 / 100.0).roundToInt()
////        println("temp ${temp}")
//
//        var sum = 0
//        arr.sort()
//        for (i in temp until arr.size - temp) {
//            sum += arr[i]
//        }
////        println("sum ${sum}")
//        val avg = (sum.toDouble() / (arr.size - (temp * 2)).toDouble()).roundToInt()
//        println(avg)
//    }
//}