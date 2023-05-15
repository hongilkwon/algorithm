package programmers.lv2

/*
    리코쳇로봇

    시작 위치에서 목표 위치까지 최소 몇 번만에 도달할 수 있는지 말하는 게임
    상, 하, 좌, 우 4방향 중 하나를 선택해서 게임판 위의 장애물이나 맨 끝에 부딪힐 때까지 미끄러져 이동하는 것을 한 번의 이동

    최소 몇 번 이동해야 하는지 return 하는 solution함수를 완성하세요.
    만약 목표위치에 도달할 수 없다면 -1을 return


    한방향으로 쭉 진행하는건
    도달할수 없는 조건을 잘 모르겠다.

    미끌어져 이동하는것을 구현하지 못하였다.


 */

import kotlin.math.*

lateinit var map: Array<Array<Char>>
lateinit var start: Pair<Int, Int>
lateinit var goal: Pair<Int, Int>

val dy = arrayOf(-1, 0, 1, 0)
val dx = arrayOf(0, 1, 0, -1)

var answer = Int.MAX_VALUE
fun go(point: Pair<Int, Int>, cnt: Int){

    if (point == goal){
        answer = min(answer, cnt)
    }

    for (i in 0 until 4){
        var ny = point.first + dy[i]
        var nx = point.second + dx[i]

        if (map[ny][nx] == 'D') continue
        if ((ny !in 0 until map.size || nx !in 0 until map.first().size)) continue

        //  장애물을 만나지 않았거나, 맵의 범위 안에 존재한면,
        while (map[ny][nx] != 'D' || (ny in 0 until map.size && nx in 0 until map.first().size)){
            ny += dy[i]
            nx += dx[i]
        }

    }

}
fun solution(board: Array<String>): Int {
    var answer: Int = 0

    map = Array(board.size) { Array(board.first().length) { ' ' } }

    for (i in 0 until board.size) {
        for (j in 0 until board.first().length) {
            if (board[i][j] == 'R')
                start = i to j
            if (board[i][j] == 'G')
                goal = i to j
            map[i][j] = board[i][j]
        }
    }

    return answer
}