package bac.week2

/*
2-K
교수가된 현우

정수 N (1 <= N <= 1000000000)
10억

 정수론 지식이 필요한 문제이다.
 자리수 --> @*10  --> 2*5

 주어진 정수 n이 10억까지 이기 때문에

         for (i in 1..bac.week5.concept.getN) {
            var temp = i
            while ((temp % 2) == 0) {
                cnt2 += 1
                temp /= 2
            }
            while ((temp % 5) == 0) {
                cnt5 += 1
                temp /= 5
            }
        }

  이런 형태로 자리수를 판별하다보면 시간초과된다.
  2 4 8 16.. 제곱수
  5 25 125.. 제곱수
  가

     1*2*3*4*5*6*7*8*9*10
/2     1   1   1   1   1
/4         1       1
/8                 1

    위와 같이 10!이라면 제곱수를 통한 반복 나누기로 더 빠른 연산이 가능하다
 */


//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val testCase = readLine().toInt()
//
//    repeat(testCase) {
//        val bac.week5.concept.getN = readLine().toInt()
//
//        var cnt2 = 0
//        var cnt5 = 0
//
//        var j = 1
//        while(j <= bac.week5.concept.getN) {
//            j *= 2
//            cnt2 += bac.week5.concept.getN / j
//        }
//
//        var bac.week5.concept.getK = 1
//        while(bac.week5.concept.getK <= bac.week5.concept.getN) {
//            bac.week5.concept.getK *= 5
//            cnt5 += bac.week5.concept.getN / bac.week5.concept.getK
//        }
//
//        if (cnt2 >= cnt5)
//            println(cnt5)
//        else
//            println(cnt2)
//    }
//}