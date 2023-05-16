package programmers.lv2

/*
    리코쳇로봇

    시작 위치에서 목표 위치까지 최소 몇 번만에 도달할 수 있는지 말하는 게임
    상, 하, 좌, 우 4방향 중 하나를 선택해서 게임판 위의 장애물이나 맨 끝에 부딪힐 때까지 미끄러져 이동하는 것을 한 번의 이동

    최소 몇 번 이동해야 하는지 return
    만약 목표위치에 도달할 수 없다면 -1을 return

    한방향으로 쭉 진행하는건
    도달할수 없는 조건을 잘 모르겠다.

    *미끌어져 이동하는것을 구현

    맵을 탐색할때 그래프 탐색법 특징.
    dfs 깊이우선 - 일단 한쪽 방향으로 무조건 "끝까지 탐색후" 방향을 전환
    bfs 너비우선 - 한쪽 방향 탐색후 반드시 방향을 방향을 바꾼다.

 */

//import java.util.LinkedList
//import java.util.Queue
//
//lateinit var map: Array<Array<Char>>
//lateinit var visited: Array<Array<Int>>
//
//lateinit var start: Pair<Int, Int>
//lateinit var goal: Pair<Int, Int>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var answer = Int.MAX_VALUE
//
//fun go(startPoint: Pair<Int, Int>): Int {
//
//    visited[startPoint.first][startPoint.second] = 1
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    queue.add(startPoint)
//
//    while (queue.isNotEmpty()) {
//
//        val point = queue.poll()
//        if (point == goal) {
//            return visited[point.first][point.second] - 1
//        }
//
//        for (i in 0 until 4) {
//            var tempY = point.first
//            var tempX = point.second
//            //  장애물을 만나지 않았고, 맵의 범위 안에 존재한면,
//            while (true) {
//                tempY += dy[i]
//                tempX += dx[i]
//                if ((tempY !in 0 until map.size || tempX !in 0 until map.first().size) ||
//                    (map[tempY][tempX] == 'D')
//                ) {
//                    tempY -= dy[i]
//                    tempX -= dx[i]
//                    break
//                }
//            }
//
//            val ny = tempY
//            val nx = tempX
//
//            if (visited[ny][nx] == 0) {
//                visited[ny][nx] = visited[point.first][point.second] + 1
//                queue.add(ny to nx)
//            }
//        }
//    }
//    return -1
//}
//fun solution(board: Array<String>): Int {
//    var answer: Int = 0
//
//    map = Array(board.size) { Array(board.first().length) { ' ' } }
//    visited = Array(board.size) { Array(board.first().length) { 0 } }
//
//    for (i in 0 until board.size) {
//        for (j in 0 until board.first().length) {
//            if (board[i][j] == 'R')
//                start = i to j
//            if (board[i][j] == 'G')
//                goal = i to j
//            map[i][j] = board[i][j]
//        }
//    }
//    answer = go(start)
//    return answer
//}
//
//fun main() {
//    println(solution(arrayOf("...D..R", ".D.G...", "....D.D", "D....D.", "..D....")))
//}



