package bac.week5

import bac.week1.list


/*

    주사위 윷놀이

    그래프+구현문제

    1. 기본적인 직사각형이 아닌 독특한 형태의 map을 구현
    - 생긴 형태가 2차원 배열로 구현할 수 없음.
    - 인접리스트 형태로 구현해야된다.
    2개가 인접한 노드일 경우를 주의한다.
    총 33개의 노드.

    2. 10번의 주사위 값을 4개의 말이 어떻게 나눠서 움직일지  -> 완전탐색
    3. 최대값

 */

var dice = emptyArray<Int>()

val adj = Array(33) { mutableListOf<Int>() }

val score = arrayOf(
    0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
    22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
    13, 16, 19, 25, 22, 24, 28, 27, 26, 30,
    35, 0
)

fun createAdjArr() {
    // 시작점 0부터 도착전 노드 까지.
    for (i in 0..19) {
        adj[i].add(i + 1)
    }
    adj[5].add(21)
    adj[21].add(22)
    adj[22].add(23)
    adj[23].add(24)

    adj[10].add(25)
    adj[25].add(26)
    adj[26].add(24)

    adj[15].add(27)
    adj[27].add(28)
    adj[28].add(29)
    adj[29].add(24)

    adj[24].add(30)
    adj[30].add(31)
    adj[31].add(20)
    adj[20].add(32)
}

fun main() = with(System.`in`.bufferedReader()) {
    dice = readLine().split(" ").map { it.toInt() }.toTypedArray()

}


