package bac.etc

/*
    부분합(투포인터)

    10_000 이하의 자연수로 이루어진 길이 N짜리 수열
    S 이상이 되는 것 중, 가장 짧은 것의 길이

    N (10 ≤ N < 100_000)
    S (0 < S ≤ 100_000_000)

    10 15

    #
    5 1 3 5 10 7 4 9 2 8
             #
 */


//import kotlin.math.min
//
//var n = 0
//var s = 0
//
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    s = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//
//    var intervalSum = 0
//    var p2 = 0
//    var min = 100_000
//    for (p1 in 0 until arr.size) {
//
//        while (intervalSum < s && p2 < arr.size) {
//            intervalSum += arr[p2]
//            p2 += 1
//        }
//        if (intervalSum >= s)
//            min = min(min, p2 - p1)
//        intervalSum -= arr[p1]
//    }
//
//    if (min == 100_000)
//        println(0)
//    else
//        println(min)
//}