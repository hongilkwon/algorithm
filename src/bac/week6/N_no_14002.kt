package bac.week6

/*
    가장 긴 증가하는 부분 수열 4
    N (1 ≤ N ≤ 1,000)

     1 2 2 3

           o
       o   o
       o o o
     o o o o

     Tracking
   */

//var n = 0
//
//var arr = Array(1001) { 0 }
//var cnt = Array(1001) { 0 }
//
//// tracking을 위한 자료구조는 -1로 초기화 해준다. 이유는 idx가 0부터 시작하기 때문이다.
//var prev = Array(1001) { -1 }
//
//var temp = mutableListOf<Int>()
//fun tracking(lastIdx: Int) {
//    if (lastIdx == -1) {
//        return
//    }
//    temp.add(arr[lastIdx])
//    tracking(prev[lastIdx])
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    for (i in 0 until info.size) {
//        arr[i] = info[i]
//    }
//
//    var lastIdx = 0
//    var currentValue = 0
//    for (i in 0 until n) {
//        for (j in 0 until i) {
//            // 현재 숫자 보다 작아야 된다.
//            // 지금까지 찾은 최대값 보다는 커야된다.
//            if (arr[i] > arr[j] && cnt[i] < cnt[j] + 1) {
//                cnt[i] = cnt[j] + 1
//                // tracking i -> j
//                prev[i] = j
//                //
//                if (currentValue < cnt[i]) {
//                    currentValue = cnt[i]
//                    lastIdx = i
//                }
//            }
//        }
//    }
////    println(prev_list.joinToString(" "))
//    tracking(lastIdx)
//    println(currentValue + 1)
//    println(temp.reversed().joinToString(" "))
//    Unit
//}


