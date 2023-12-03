package bac.easy

/*
    설탕배달.

    3 ≤ N ≤ 5000
    상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

    Greedy /dp 모두 가능하지만,
    일단 greedy 풀이가 출제자가 의도한것 같다.
 */


//import kotlin.math.min
//
//var n = 0
//var minCnt = 5001 / 3
//
//fun go(n: Int, cnt3: Int, cnt5: Int) {
//
//    if (n <= 0) {
//        if (n == 0) {
//            val totalCnt = cnt3 + cnt5
//            minCnt = min(minCnt, totalCnt)
//        }
//        return
//    }
//
//    go(n - 5, cnt3, cnt5 + 1)
//    go(n - 3, cnt3 + 1, cnt5)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    go(n, 0, 0)
//    println(minCnt)
//}

/*
    dp(tabulation) 풀이
 */
//import kotlin.math.min
//
//var n = 0
//lateinit var table: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    table = IntArray(5001) { -1 }
//
//    table[3] = 1
//    table[5] = 1
//
//    for (i in 6..n) {
//        if (table[i - 5] > 0 && table[i - 3] < 0) table[i] = table[i - 5] + 1
//        else if (table[i - 3] > 0 && table[i - 5] < 0) table[i] = table[i - 3] + 1
//        else if (table[i - 5] > 0 && table[i - 3] > 0) table[i] = min(table[i - 3], table[i - 5]) + 1
//    }
//    println(table[n])
//}

/*
    Greedy 풀이

    5kg
    3kg

    * 3과 5는 서로소 이다. --> 서로 곱에 영향을 주지 않는다.
    5kg짜리 포대를 더 많이 만들어야 최소화할 수 있음.

 */

//var n = 0L
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toLong()
//
//    var cnt = 0L
//    while (true) {
//
//        if (n % 5 == 0L) {
//            cnt += (n / 5)
//            n -= (n / 5) * 5
//        } else {
//            cnt += 1
//            n -= 3
//        }
//
//        if (n <= 0) {
//            break
//        }
//    }
//
//    if (n == 0L) {
//        println(cnt)
//    } else {
//        println(-1)
//    }
//}

/*
    완전탐색

    5x + 3y = n
 */
//import kotlin.math.min
//
//var n = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    var min = 5001 / 3
//    for (i in 0..n step 5) {
//        for (j in 0..n step 3) {
//            if (i + j == n) {
//                min = min(min, (i / 5) + (j / 3))
//            }
//        }
//    }
//    if (min == 5001 / 3)
//        println(-1)
//    else
//        println(min)
//}