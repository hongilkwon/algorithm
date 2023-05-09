package programmers.lv1

/*
    과일장수

    과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)

    k 최상품 점수 3 ≤ k ≤ 9
    m 1박스의 포장되는 개수 3 ≤ m ≤ 10

    7 ≤ score의 길이 ≤ 1,000,000
    1 ≤ score[i] ≤ k
    이익이 발생하지 않는 경우에는 0을 return 해주세요.

    상자 1개의 이익 = (최저 사과 점수) x (한 상자에 담긴 사과 개수)
    최대이익

    처음에 무엇을 묻는 문제인지 잘 감이 안온다.

    최대이익을 만들어내려면,
    1. 만들수 있는 박스의 개수는 정해져있다.
    2. 한상자에 담긴 사과개수 역시 정해져 있다.
    3 -> 최저 사과의 점수를 최대한 높게 해서 포장한다.

 */


//fun solution(k: Int, m: Int, score: IntArray): Int {
//    var answer: Int = 0
//
//    score.sortDescending()
//
//    var total = 0
//    for (i in 0 until score.size step (m)) {
//        if ((i + m) - 1 < score.size) {
//           total += (score[(i + m) - 1] * m)
//        }
//    }
//
//    return total
//}

fun main() {

}