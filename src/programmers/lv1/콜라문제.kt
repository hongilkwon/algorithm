package programmers.lv1

/*
    콜라문제

    1 ≤ b < a ≤ n ≤ 1,000,000
    정답은 항상 int 범위를 넘지 않게 주어집니다.

    빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때,
    빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제


 */


fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0

    var num = n
    while (num / a != 0) {
        answer += (num / a) * b
        num = (num / a) * b + (num % a)
    }

    return answer
}