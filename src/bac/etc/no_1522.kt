package bac.etc


/*
   문자열 교환(투포인터, 슬라이딩 윈도우)

   a를 모두 연속으로 만들기 위해서 필요한 교환의 회수를 최소값.
   원형이기 때문에, 처음과 끝은 서로 인접해 있는 것

   문자열의 길이는 최대 1_000

   사고과정
   예시 이해하기

   ab ab ab ab ab ab ab a
   3회??? 어떻게 하면 3회만에?

   1회
    *       *
   ab ab ab ab ab ab ab a
   aa ab ab bb ab ab ab a

   2회
       *       *
   aa ab ab bb ab ab ab a
   aa aa ab bb bb ab ab a

   3회
                  *   *
   aa aa ab bb bb ab ab a
   aa aa ab bb bb bb aa a

   ???? 모르겠다!

   슬라이딩 윈도우로 풀기!
   간단하게 생각을 해보면, (aa..aaa)(bbb..b)인 최종 형태를 가져야한다.
   예시를 보면, 총 8개의 a가 최종적으로 연속해야된다.

   8개 짜리 윈도우를 밀어가면서 교환 갯수(윈도우 내부의 b의 갯수), 최소값을 갱신한다.[ ]
   [ab ab ab ab] ab ab ab a

   a]b ab ab ab [ab ab ab a

     0] 0 0 [0 0

*/

//import kotlin.math.min
//
//lateinit var s: CharArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    s = readLine().toCharArray()
//    var windowSize = 0
//    for (i in 0 until s.size) {
//        if (s[i] == 'a')
//            windowSize += 1
//    }
//
//    var cnt = s.size
//    for (i in 0 until s.size) {
//        val window =
//            if (i + (windowSize - 1) < s.size) {
//                s.copyOfRange(i, i + windowSize)
//            } else {
//                s.copyOfRange(i, s.size) + s.copyOfRange(0, windowSize - (s.size - i))
//            }
//        val temp = window.count { it == 'b' }
//        cnt = min(cnt, temp)
//    }
//
//    println(cnt)
//    return@with Unit
//}