package bac.week1

/*
1
1-O

숫자가 한없이 커질수 있는것에 대한 나누기 연산
모듈러 연산(정수론)에 대해서 기억하자.

코틀린의 무제한 입력값에 대한 처리
(readLine() ?: break).toInt()
*/


fun main() = with(System.`in`.bufferedReader()) {

    while (true) {
        val n = (readLine() ?: break).toInt()
        var cnt = 1
        var one = 1

        while (true) {
            if ((one % n) == 0) {
                println(cnt)
                break
            } else {
                one = (one * 10) + 1
                // 아래코드가 없다면 시간초과가 생긴다.
                one %= n
                cnt += 1
            }
        }
    }
}

