package bac.etc

/*
    고득점

    위, 아래 --> 알파벳 순서 조정, 되돌아옴.
    왼, 오른 --> 커서 위치, 되돌아옴.

    이름의 길이는 최대 1000
 */

//import kotlin.math.min
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//        val name = readLine()
//
//        var cnt = 0
//
//        // 수직방향 이동횟수
//        // 각 자리 마다 'A'가 원하는 문자로 변하는데 들어가는 비용
//        for (i in 0 until name.length){
//            if (name[i] != 'A')
//                cnt += min(name[i].code - 'A'.code, 'Z'.code - name[i].code + 1 )
//        }
//
//        // 수평방향 이동횟수
//        // 0부터 시작해서 모든 idx를 다 거친다면 총 name.length - 1번 이면 모든 문자들 방문하게 된다.
//        var minHorizontalMove = name.length - 1
//        for (i in 0 until name.length) {
//
//            // 현재 위치 i에서 A가 아닌 다른 문자가 등장한 인덱스
//            var next = i + 1
//            while (next < name.length && name[next] == 'A') {
//                next += 1
//            }
//
//            // (우측 --> 좌측) = i + 돌아와서 i + 뒤로 감
//            val a = i + (i + name.length - next)
//            // 좌측 -> 우측
//            val b = 2 * (name.length - next) + i
//            val temp = min(a, b)
//
//            minHorizontalMove = min(minHorizontalMove, temp)
//        }
//        cnt += minHorizontalMove
//        println(cnt)
//    }
//}