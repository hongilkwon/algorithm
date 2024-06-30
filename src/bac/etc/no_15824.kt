package bac.etc

/*
   너 봄에는 캡사이신이 맛있단다.(수학, 집합론, 아이디어)

    스코빌 지수.
    매운 정도는 가장 높은 수치인 8과 가장 낮은 수치인 2의 차이인 6만큼의 매운맛

    주헌이의 목표는 이 음식점의 모든 음식 조합을 먹어보는 것
    주헌이는 까다로워서 한 번 먹어본 조합은 다시 먹지 않는다

    모든 스코빌 지수는 0보다 크거나 같고 231-1보다 작거나 같은 정수

    모든 조합의 주헌고통지수 합을 1_000_000_007로 나눈 나머지를 출력

    1 ≤ N ≤ 300_000

    사고과정.
    일단.. N이 30만이라 2중반복또는 combi를 사용할 수없다...

    예시 이해
    3
    5 2 8

    2 5 -> 3
    2 8 -> 6
    5 8 -> 3
    2,5,8 -> 6

    3+6+3+6 = 18

    1. 모든 조합을 전부 구해서 최소값과 최대값의 차이를 구함.
    O(2^n) 2의 30만 제곱....불가능함

    n = 1 () (a)
    n = 2 () (a) (b) (a, b)
    n = 3 () (a) (b) (c) (a, b) (a, c) (b, c) (a, b, c) 8개
    n = 4 () (a) (b) (c) (d) (a, b) (a, c) (a, d) (b, c) (b, d) (c, d) (a, b, c) (a, b, d) (a, c, d) (b, c, d) (a, b, c, d) 16개
    n = 300_000 ....

    몰라서 해설봄. https://thinking-face.tistory.com/156

    2. 최소값과 최대값을 미리 지정하여 가능한 조합의 개수를 곱하자!
    O(n^2) 3000*3000 = 9000_000(가능)  30만*30만 -> 불가능

    3
    5 2 8
    -> 정렬 [2, 5, 8]

    최소값 2 최대값 5 -> 1개 (2^0)
    최소값 2 최대값 8 -> 2개 (2^1)
    최소값 5 최대값 8 -> 1개 (2^0)

    3.
    O(n) ->30만 가능
    3
    5 2 8
    -> 정렬 [2, 5, 8]

     2가 최댓값인 조합 -> [2] (2^0)
     2가 최소값인 조합 -> [2] [2, 5] [2, 8] [2, 5, 8] (2^2)

     5가 최댓값인 조합 -> [5] [2, 5] (2^1)
     5가 최소값인 조합 -> [5] [5, 8] (2^1)

     8가 최댓값인 조합 -> [8] [2, 8] [5, 8] [2,5,8] (2^2)
     8가 최소값인 조합 -> [8] (2^0)
*/


//var n = 0
//lateinit var menu: IntArray
//
//const val MOD_NUM = 1_000_000_007
//lateinit var twoPow: LongArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    menu = readLine().split(" ").map { it.toInt() }.toIntArray()
//    menu.sort()
//
//
//    twoPow = LongArray(n + 1) { 0L }
//    twoPow[0] = 1L
//    for (i in 1 until twoPow.size) {
//        twoPow[i] = (twoPow[i - 1] * 2) % MOD_NUM
//    }
//
//    var s = 0L
//    for (i in 0 until menu.size) {
//        val num = menu[i]
//        val maxCnt = twoPow[i]
//        val minCnt = twoPow[menu.size - 1 - i]
//
//        s += num * (maxCnt - minCnt)
//        s %= MOD_NUM
//    }
//    s %= MOD_NUM
//    println(s)
//    return@with Unit
//}