package bac.etc


/*
    문자열 복사

    그리디(greedy)

     S의 길이는 1,000을 넘지 않으며,
     P의 길이는 1,000을 넘지 않는다.

     *String contains()
     - O(nm)
     n은 string 길이. m은 찾고자하는 string 길이

 */


//var S = ""
//var P = ""
//fun main() = with(System.`in`.bufferedReader()) {
//
//    S = readLine()
//    P = readLine()
//
//    var cnt = 0
//    var temp = ""
//    for (i in 0 until P.length) {
//
//        if (S.contains(temp + P[i])) {
//            temp += P[i]
//        } else {
//            cnt += 1
//            temp = P[i].toString()
//        }
//
//        // 마지막 예외처리.
//        if (i == P.length - 1) {
//            if (S.contains(temp))
//                cnt += 1
//        }
//    }
//
//
//    println(cnt)
//
//    return@with Unit
//}
