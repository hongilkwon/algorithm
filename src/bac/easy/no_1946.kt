package bac.easy


/*
   신입사원

   모든 지원자와 비교했을 때 서류심사 성적과 면접시험 성적 중 적어도 하나가 다른 지원자보다 떨어지지 않는 자만 선발한다는 원칙

    1 ≤ N ≤ 100_000

    1. n의 범위를 고려하면, 이중 반복문을 사용하면안된다.

    2. 일단 "순위"에 관련된 문제이기 때문에 정렬을 시도하고,
    각 케이스를 분석하여 O(N)시간에 문제를 해결할수 있도록 해보자.


    일단, 정렬시 첫번쨰 과목의 1등은 무조건 선발됨.
    그 이후, 두번쨰 과목이

    case 1.
    1 4
    2 3
    3 2
    4 1
    5 5 (x)

    case 2.
    1 4
    2 5 (x)
    3 6 (x)
    4 2
    5 7 (x)
    6 1
    7 3 (x)
*/


//var tc = 0
//var n = 0
//
//lateinit var arr: Array<Pair<Int, Int>>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    tc = readLine().toInt()
//
//    for (t in 0 until tc) {
//
//        n = readLine().toInt()
//        arr = Array(n) { 0 to 0 }
//        for (i in 0 until arr.size) {
//            val score = readLine().split(" ").map { it.toInt() }
//            arr[i] = score[0] to score[1]
//        }
//
//        arr.sortBy { it.first }
//        var current = arr[0]
//
//        var cnt = 0
//        for (i in 1 until arr.size) {
//            if (current.second > arr[i].second) {
//                current = arr[i]
//                cnt += 1
//            }
//        }
//        println(cnt+1)
//    }
//    return@with Unit
//}