package bac.easy


/*
    랜선 자르기

    모두 N개의 같은 길이의 랜선으로 만들고 싶었기 때문에 K개의 랜선을 잘라서 만들어야 한다.
    예를 들어 300cm 짜리 랜선에서 140cm 짜리 랜선을 두 개 잘라내면 20cm는 버려야 한다. (이미 자른 랜선은 붙일 수 없다.)
    N개보다 많이 만드는 것도 N개를 만드는 것에 포함된다. 이때 만들 수 있는 최대 랜선의 길이

    K는 1이상 10,000이하의 정수이고, N은 1이상 1,000,000이하의 정수
    N개를 만들 수 있는 랜선의 최대 길이

    이진 탐색(결정문제)
 */

//var k = 0
//var n = 0
//
//lateinit var arr: LongArray
//
//fun check(len: Long): Boolean {
//
//    var cnt = 0
//    for (i in 0 until arr.size) {
//        var temp = arr[i]
//        var tempCnt = 0
//        while (temp >= len) {
//            temp -= len
//            tempCnt += 1
//        }
//        cnt += tempCnt
//        if (cnt >= n) return true
//    }
//
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    k = info[0]
//    n = info[1]
//
//    arr = LongArray(k){
//        readLine().toLong()
//    }
//
//    var left = 1L
//    var right = arr.maxOrNull()!!
//    var maxLen = 1L
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//        if (check(mid)) {
//            maxLen = mid
//            left = mid + 1L
//        } else {
//            right = mid - 1
//        }
//    }
//    println(maxLen)
//}