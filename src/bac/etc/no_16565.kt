package bac.etc

/*
   N 포커(수학, DP)

   딜러와 플레이어가 1:1로 플레이
   포카드 (four of a kind)" 족보를 만들 수 있다면 플레이어의 승리, 만들 수 없다면 딜러의 승리
   N개의 카드를 뽑았을 때 플레이어가 이기는 경우의 수

    문양 4개: ♥, ♠, ◆, ♣,
    숫자 13개: A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K

   포카드 (four of a kind)는 뽑은 N장의 카드 중에 "같은 숫자를 가진, 다른 문양의 4장의 카드"가 존재하는 경우

    플레이어가 이기는 경우의 수는 N장의 카드에 이러한 카드 조합을 1쌍 이상 포함하고 있는 경우의 수
    플레이어가 이기는 경우의 수를 10,007로 나눈 나머지
    (1 ≤ N ≤ 52)

    사고과정.
    52개 중에 4개..

    n = 1 0
    n = 2 0
    n = 3 0

    * 포카드가 1셋트 나올수 있음.
    n = 4 13
    n = 5 13 * (48)
    n = 6 13 * (48 * 47)
    n = 7 13 * (48 * 47 * 46)

    * 포카드가 2셋트 나올수 있음.
    n = 8 13

    1. 포함 & 배제의 원리를 알고있어야... 풀 수있다.

    포카드가 2셋트 이상 - 3셋트 미만 나올 수 있는 갯수를 뽑는다고 가정해보자!

    A( ♥, ♠, ◆, ♣) 4개를 뽑고 나머지 4-11장을 뽑는다 가정을하면,
    이중에 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K에서도 또 다른 포카드가 완성이될 수 있다.
    즉, 교집합 처리를 해주어야 한다.

    포함배제의 원리에서
    집합이 2개
    |A| + |B| = |A| + |B| -|A ∩ B|
    집합이 3개
    |A| + |B| +|C| = |A| + |B| + |C| - |A ∩ B| - |A ∩ C| - |B ∩ C| + |A ∩ B ∩ C|
    .
    .
    .
    1개의 집합들 - 2개의 교집합 + 3개의 교집합 - 4개의 교집합 + 5개의 교집합 ...

    2. combination DP로 생성하기.

*/

//var n = 0
//
//const val MOD = 10_007
//
//// n C r => combiTable[n][r]
//var combiTable: Array<IntArray> = Array(53) { IntArray(53) { 0 } }
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    // nC0 = 1, nCn = 1
//    for (i in 0..52) {
//        combiTable[i][0] = 1
//    }
//    // nCr = n-1 C r + n-1 C r-1
//    for (n in 1..52) {
//        for (r in 1..52) {
//            combiTable[n][r] = (combiTable[n - 1][r] + combiTable[n - 1][r - 1]) % MOD
//        }
//    }
//
//    var ret = 0
//    // 총 13개의 포카드의 집합.
//    for (i in 1..13) {
//        // n = 1, 2, 3 일떄
//        if (n - (i * 4) < 0) break
//        if (i % 2 == 1) {
//            ret = (ret + combiTable[13][i] * combiTable[52 - (4 * i)][n - (4 * i)]) % MOD
//        } else {
//            ret = (ret - (combiTable[13][i] * combiTable[52 - (4 * i)][n - (4 * i)]) % MOD + MOD) % MOD
//        }
//    }
//
//    println(ret)
//    return@with Unit
//}