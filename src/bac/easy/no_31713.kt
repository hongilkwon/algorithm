package bac.easy


/*
   행운을 빌어요(아이디어, 수학, 정수론)

   줄기와 잎을 "남김없이 모두 써서" 클로버를 만들기 위해,
   포닉스가 더 가져와야 하는 클로버 줄기와 잎 개수의 합의 최솟값을 구해주자.

   완전탐색 -> 시간초과

   줄기가 부족한경우?
   잎이 부족한 경우?

*/

//var julgi = 0
//var leaf = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//    val sb = StringBuilder()
//
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//
//        julgi = info[0]
//        leaf = info[1]
//
//        var cnt = 0
//
//        // 잎이 많아서 줄기를 최소한으로 늘린다.
//        while (leaf > julgi * 4) {
//            cnt += 1
//            julgi += 1
//        }
//
//        // 줄기가 많아서 잎을 최소한으로 늘린다.
//        while (leaf < julgi * 3) {
//            cnt += 1
//            leaf += 1
//        }
//
//        sb.append("$cnt\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}

//import java.lang.Integer.min
//
//var julgi = 0
//var leaf = 0
//
//var min = 1000 * 3
//fun go(cnt: Int, leaf: Int) {
//
//    if (leaf <= 0) {
////        println("cnt: $cnt, leaf: $leaf")
//        var temp =
//            if (cnt >= julgi) {
//                cnt - julgi + (-leaf)
//            } else {
//                (julgi) * 3 + leaf
//            }
//
//        min = min(min, temp)
//        return
//    }
//
//    go(cnt + 1, leaf - 3)
//    go(cnt + 1, leaf - 4)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    val sb = StringBuilder()
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//
//        julgi = info[0]
//        leaf = info[1]
//
//        min = 1000 * 3
//        go(0, leaf)
//        sb.append("$min\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}