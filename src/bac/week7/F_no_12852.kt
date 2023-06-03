package bac.week7


/*
    1로 만들기.

    X가 3으로 나누어 떨어지면, 3으로 나눈다.
    X가 2로 나누어 떨어지면, 2로 나눈다.
    1을 뺀다.

    1<= n <= 10^6

    N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다

    첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
    둘째 줄에는 N을 1로 만드는 방법에 포함되어 있는 수를 공백으로 구분해서 순서대로 출력한다. 정답이 여러 가지인 경우에는 아무거나 출력한다.

    상향식 방식
    테이블 기준
    (N)
 */

//import kotlin.math.min
//
//var n = 0
//
//val case = Array(1_000_000 + 1) { 1_000_001 }
//
//fun trace(n: Int) {
//
//    if (n == 1){
//        print("$n ")
//        return
//    }
//
//    print("$n ")
//    if (n % 3 == 0 && case[n] == (case[n / 3] + 1))
//        trace(n / 3)
//    else if (n % 2 == 0 && case[n] == (case[n / 2] + 1))
//        trace(n / 2)
//    else if ((n - 1 >= 0) && (case[n] == (case[n - 1] + 1)))
//        trace(n - 1)
//    return
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    case[0] = 0
//    case[1] = 0
//
//    // 기존 방법을 최소로 업데이트 하는 방식.
//    for (i in 2..n) {
//        if (i % 3 == 0) {
//            case[i] = min(case[i / 3] + 1, case[i])
//        }
//        if (i % 2 == 0) {
//            case[i] = min(case[i / 2] + 1, case[i])
//        }
//        case[i] = min(case[i - 1] + 1, case[i])
//    }
//
////    case.forEachIndexed { index, i ->
////        if (index <= n) print("$i ")
////    }
////    println()
//    println(case[n])
//    trace(n)
//}


// 틀림 왜틀린지 모름..
//var n = 0
//
//var cnt3 = 0
//var cnt2 = 0
//var cnt1 = 0
//
//fun go(num: Int, xTree: Int, xTwo: Int, plusOne: Int){
//
//    if (num == n) {
//        return
//    }
//
//    var temp = num
//    if (temp * 3 <= n) {
//        cnt3 += 1
//        temp *= 3
//        go(temp, xTree + 1, xTwo, plusOne)
//    } else if (temp * 2 <= n) {
//        cnt2 += 1
//        temp *= 2
//        go(temp, xTree, xTwo + 1, plusOne)
//    } else if (temp + 1 <= n) {
//        cnt1 += 1
//        temp += 1
//        go(temp, xTree, xTwo, plusOne + 1)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    go(1,0,0,0)
//    println("${cnt3+cnt2+cnt1}")
//
//    val sb = StringBuilder("$n ")
//    repeat(cnt1){
//        sb.append("${n-1} ")
//        n -= 1
//    }
//    repeat(cnt2){
//        sb.append("${n/2} ")
//        n /= 2
//    }
//    repeat(cnt3){
//        sb.append("${n/3} ")
//        n /= 3
//    }
//    print(sb.toString())
//    Unit
//}