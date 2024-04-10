package bac.etc

import bac.week1.go
import kotlin.math.max


/*
   청소년 상어(복잡구현 + dfs)


   물고기이동

   1. 번호가 작은 물고기부터 순서대로 이동
   2. 한 칸을 이동,
   이동할 수 있는 칸 - 빈 칸과 다른 물고기가 있는 칸,
   이동할 수 없는 칸 - 상어가 있거나, 공간의 경계를 넘는 칸.
   3. 물고기는 방향이 이동할 수 있는 칸을 향할 때까지 방향을 45도 반시계 회전시킨다.
   만약, 이동할 수 있는 칸이 없으면 이동을 하지 않는다.
   4. 서로 위치를 바꾼다.

   상어이동

   1.한 번에 여러 개의 칸을 이동
   2.도착한 칸 물고기를 먹고, 그 물고기의 방향을 가지게 된다.
   이동하는 중에 지나가는 칸에 있는 물고기는 먹지 않는다
   3.물고기가 없는 칸으로는 이동할 수 없다.
   4.상어가 이동할 수 있는 칸이 없으면 공간에서 벗어나 집으로 간다.

*/


val map = Array(4) { Array(4) { 0 to 0 } }

val dy = arrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
val dx = arrayOf(0, -1, -1, -1, 0, 1, 1, 1)

data class Fish(val num: Int, var dir: Int, var y: Int, var x: Int)

fun moveFish() {

    for (fishNum in 1..16) {
        // 번호가 가장 작은 물고기 부터 이동.
        var fish: Fish? = null
        for (i in 0 until 4) {
            for (j in 0 until 4) {
                if (map[i][j].first == fishNum)
                    fish = Fish(map[i][j].first, map[i][j].second, i, j)
            }
        }

        // 이미 잡혀먹은 물고기면 건너뜀.
        if (fish == null) continue

        var next = 0 to 0
        for (d in fish.dir until fish.dir + 8) {

            // idx 변환
            val nd = if (d < 8) d else d % 8
            val ny = fish.y + dy[nd]
            val nx = fish.x + dx[nd]

            // 공간의 경계를 넘는 경우.
            if (ny !in 0 until 4 || nx !in 0 until 4) continue
            // 상어(0)가 있는 경우.
            if (map[ny][nx].first == 0) continue

            fish.dir = d
            next = ny to nx
            break
        }
        // 물고기가 이동을 할 수 없다면,
        if (next == 0 to 0) {
            continue
        } else {
            val temp = map[next.first][next.second]
            map[fish.y][fish.x] = temp
            map[next.first][next.second] = fish.num to fish.dir
        }
    }
}

fun sharkNextPoints(sharkPoint: Pair<Int, Int>): List<Pair<Int, Int>> {

    val mutableList = mutableListOf<Pair<Int, Int>>()

    val dir = map[sharkPoint.first][sharkPoint.second].second

    return mutableList
}

var maxEatFish = 0
fun go(sharkPoint: Pair<Int, Int>) {

    // 물고기 이동.
    moveFish()
    map.forEach { println(it.joinToString()) }

    // 상어가 더 이상 못 움직인다면,
}

fun main() = with(System.`in`.bufferedReader()) {

    for (i in 0 until 4) {
        val info = readLine().split(" ").map { it.toInt() }
        for (j in 0 until 4) {
            map[i][j] = info[j * 2] to info[(j * 2) + 1] - 1
        }
    }

    // 상어 -> 0번, 첫번째 물고기 먹음.
    val firstFish = map[0][0]
    map[0][0] = 0 to firstFish.second
    maxEatFish = firstFish.first

    go(0 to 0)

    return@with Unit
}