package bac.week1

/*
트럭 주차
1-C

시간을 배열로 표한할때,

카운팅 자료구조(map, array)를 이용한다.

"매우" 중요하다
시간에 대한 개념이 들어간 문제를 이해할때,
시작(이상) --- 종료(미만)

시간을 카운팅해야된다는 생각이 핵심임

 */

fun main() = with(System.`in`.bufferedReader()) {

    val prices = readLine().split(" ").map { it.toInt() }
    val time = Array(100) { 0 }

    for (i in 1..3) {
        val parkingTime = readLine().split(" ").map { it.toInt() }
        for (j in parkingTime[0]until parkingTime[1]){
            time[j] += 1
        }
    }

    var result = 0
    time.forEach { num ->
        when(num){
            1 -> {result += prices[0]}
            2 -> {result += prices[1]*2}
            3 -> {result += prices[2]*3}
        }
    }
    println(result)
}


// 최초풀이
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val prices = readLine().split(" ").map { it.toInt() }
//    var first = readLine().split(" ").map { it.toInt() }
//    var second = readLine().split(" ").map { it.toInt() }
//    var third = readLine().split(" ").map { it.toInt() }
//
//    // 3대들 합쳐서 총 주차시간.
//    var total = first + second + third
//
//    // 최초 주차를 시작한 시점
//    val min = total.minOrNull()!!
//
//    // 전체적 시간 조정
//    total = total.map { it - min }
//
//    //마지막으로 주차를 끝낸 시점
//    val max = total.maxOrNull()!!
//
//    val arr = Array(max+1) { 0 }
//
//    first = first.map { it - min }
//    for (i in first[0]+1..first[1])
//        arr[i] += 1
//
//    second = second.map { it - min }
//    for (i in second[0]+1..second[1])
//        arr[i] += 1
//
//    third = third.map { it - min }
//    for (i in third[0]+1..third[1])
//        arr[i] += 1
//
//    var result = 0
//    arr.forEach { num ->
//        when(num){
//            1 -> {result += prices[0]}
//            2 -> {result += prices[1]*2}
//            3 -> {result += prices[2]*3}
//        }
//    }
//    println(result)
//}