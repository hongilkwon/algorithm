package programmers.lv1

/*

    둘만 암호

    단순구현 문제.

    5 ≤ s의 길이 ≤ 50
    1 ≤ skip의 길이 ≤ 10
    s와 skip은 알파벳 소문자로만 이루어져 있습니다.
    skip에 포함되는 알파벳은 s에 포함되지 않습니다.

    1 ≤ index ≤ 20

    * 아스키 코드
    a는 97 z 122
    A는 65 Z 90

    Char
    code

    주의할점은 정해진 범위를 돌아서 암호화를 풀때 여러번 범위를 돌수 있다는 점이다.
    -  % 모듈러 연산을 이용해서 해결한다.

 */

//fun solution(s: String, skip: String, index: Int): String {
//    var answer: String = ""
//
//    var alpha = (97..122).toSet()
//    val skipDigit = skip.map { it.code }.toSet()
//    println(alpha.joinToString())
//    println(skipDigit.joinToString())
//
//    val encryption = (alpha - skipDigit).toList().sorted()
//    println(encryption.joinToString())
//
//    var sb = StringBuilder()
//    for (c in s) {
//        val code = c.code
//        val idx = encryption.indexOf(code)
//
////        val nIdx = (idx + index) % encryption.size
//        val nIdx =
//            if (encryption.size > idx + index)
//                idx + index
//            else{
//                var temp = idx + index
//                while (temp >= encryption.size ) {
//                    temp -= encryption.size
//                }
//                temp
//            }
//
//        val nCode = encryption[nIdx]
//        sb.append(nCode.toChar())
//    }
//
//    answer = sb.toString()
//    return answer
//}