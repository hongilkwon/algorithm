package programmers.lv1

/*
    기사단원의무기

    1 ≤ number ≤ 100,000
    2 ≤ limit ≤ 100
    1 ≤ power ≤ limit

    단순 구현문제.
    약수를 구하는 방법을 정리하자.

    number가 10만 이기 때문에 2중 반복을 하면 시간초과가 난다.
    100_000 * 100_000 = 10_000_000_000(100)

    약수 n = a * b

    n의 제곱근 만큼만 반복하면 모든 약수를 확인할 수 있다.

 */

import kotlin.math.floor
import kotlin.math.sqrt

fun solution(number: Int, limit: Int, power: Int): Int {
    var answer: Int = 0

    val divisors = mutableSetOf<Int>()
    for (i in 1..number) {
        for (j in 1..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                divisors.add(j)
                divisors.add(i / j)
            }
        }
        answer += if (divisors.size > limit) {
            power
        } else {
            divisors.size
        }
        divisors.clear()
    }
    return answer
}