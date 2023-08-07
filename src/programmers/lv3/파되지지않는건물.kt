package programmers.lv3

/*
    파괴되지 않는 건물

    시뮬레이션 /
    차이점(diff)를 계속해서 연산을 하지 않고, 한 곳에 모아서 최종 연산한다.


    1 ≤ board 행의 길이 (= N) ≤ 1,000
    1 ≤ board 열의 길이 (= M) ≤ 1,000
    1 ≤ board 원소 (각 건물의 내구도) ≤ 1,000
    1 ≤ skill 행의 길이 ≤ 250,000

    1_000_000 * 250_000

    imos를 알고있어야 풀수있다.
    https://driip.me/65d9b58c-bf02-44bf-8fba-54d394ed21e0

 */


class Solution {

    lateinit var board: Array<IntArray>
    lateinit var skills: Array<IntArray>

    val diff: Array<IntArray> = Array(1_001) { IntArray(1_001) { 0 } }
    fun checkDiffPoint(skill: IntArray) {
        val type = skill[0]

        val sy = skill[1]
        val sx = skill[2]

        val ey = skill[3]
        val ex = skill[4]

        val degree = skill[5]

        if (type == 1) {
            diff[sy][sx] -= degree
            diff[sy][ex + 1] += degree
            diff[ey+1][sx] += degree
            diff[ey + 1][ex + 1] -= degree
        }
        if (type == 2) {
            diff[sy][sx] += degree
            diff[sy][ex + 1] -= degree
            diff[ey+1][sx] -= degree
            diff[ey + 1][ex + 1] += degree
        }
    }

    fun solution(b: Array<IntArray>, s: Array<IntArray>): Int {
        var answer: Int = 0

        board = b
        skills = s

        for (i in 0 until skills.size) {
            checkDiffPoint(skills[i])
        }


        for (i in 0 until diff.size) {
            var sum = 0
            for (j in 0 until diff.first().size) {
                sum += diff[i][j]
                diff[i][j] = sum
            }
        }

        for (j in 0 until diff.first().size) {
            var sum = 0
            for (i in 0 until diff.size) {
                sum += diff[i][j]
                diff[i][j] = sum
            }
        }

        var cnt = 0
        for (i in 0 until board.size) {
            for (j in 0 until board.first().size) {
                board[i][j] += diff[i][j]
                if (board[i][j] > 0) {
                    cnt += 1
                }
            }
        }

        return cnt
    }
}