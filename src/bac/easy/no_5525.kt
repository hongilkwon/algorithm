package bac.easy

/*
    IOIOI (좋은문제)

    분야: String

    * 문자열 매칭에 좋은 문제

    1 ≤ N ≤ 1_000_000
    2N+1 ≤ M ≤ 1_000_000

    S에 P(n)이 몇 군데 포함되어 있는지 출력한다.

    1) s 문자열을 모두 순회하면서, P(n)과 비교를 한다면?
    예) M = 1_000_000 이고, N = 1000 이라면  IOIOIOIO...IOI의 길이는 (1000*2)+1
    1_000_000 * 2000 => 20억 시간초과

    문자열의 특징을 찾는 것이 상당히 중요한 것
    IOI가 반복

 */


//var n = 0
//var m = 0
//var s = ""
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    m = readLine().toInt()
//    s = readLine()
//
//    var i = 0
//    var cnt = 0
//    var ioiCnt = 0
//
//    while (i < m - 2) {
//        if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I') {
//            ioiCnt += 1
//            if (ioiCnt == n) {
//                cnt += 1
//                ioiCnt -= 1
//            }
//            i += 2
//        } else {
//            ioiCnt = 0
//            i += 1
//        }
//    }
//    println(cnt)
//}