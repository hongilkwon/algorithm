package bac.week7


/*
    성냥개비

    성냥개비의 개수가 주어졌을 때,
    성냥개비를 모두 사용해서 만들 수 있는 가장 작은 수와 큰 수를 찾는 프로그램

    모두 양수이어야 하고, 숫자는 0으로 시작할 수 없다.

    (2 ≤ n ≤ 100)

 */

// 0 1 2 3 4 5 6 7 8 9
// 6 2 5 5 4 5 6 3 7 6
//val required = arrayOf(6, 2, 5, 5, 4, 5, 6, 3, 7, 6)
//
//var n = 0
//fun calMaxValue(n: Int): String {
//    var temp = n
//
//    val sb = StringBuilder()
//    if (temp % 2 == 1) {
//        temp -= required[7]
//        sb.append("7")
//    }
//
//    while (temp > 0) {
//        temp -= required[1]
//        sb.append("1")
//    }
//
//    return sb.toString()
//}
//
//
//fun minStr(a: String, b: String): String {
//    if (a.length == b.length)
//        return if (a < b) a else b
//    else
//        return if (a.length < b.length) a else b
//}
//
//// TopDown
////var min = "11111111111111111111111111111111111111111111111111"
////var case = Array(101){ min }
////fun calMinValue(march: Int): String {
////
////    if (march == 0) { return "" }
////    if (case[march] != min) return case[march]
////
////    var result = min
////    for (i in 0 until required.size) {
////        if (i == 0 && march == n) continue
////        if (march - required[i] >= 0)
////            result = minStr(result, i.toString() + calMinValue(march - required[i]))
////    }
////
////    case[march] = result
////    return case[march]
////}
//
////BottomUp
//var min = "11111111111111111111111111111111111111111111111111"
//var case = Array(101) { min }
//fun calMinValue() {
//    case[0]= ""
//    for (i in 2 until case.size) {
//        for (j in 0 until required.size) {
//            // 성냥의 개수가 안된다면
//            if (i - required[j] < 0) continue
//            // 첫번쨰가 0이면
//            if (j == 0 && case[i - required[j]] == "") continue
//            case[i] = minStr(case[i], case[i - required[j]]+j.toString())
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//    calMinValue()
//    repeat(tc) {
//        n = readLine().toInt()
//        println("${case[n]} ${calMaxValue(n)}")
////        case = Array(101){ min }
//    }
//    Unit
//}