package bac.etc

/*
   청소년 상어(복잡구현 + dfs + 백트레킹.)

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

    배울점.
    이동의 조건들이 너무 까다롭다..
    backTracking 일부 조건을 원복 시키기 복잡한 경우 새롭게 생성하여 복사하여 다음 노드로 이동한다.
    *kotlin 의 copyOf clone 은 primitive 타입만 깊은 복사가됨. 2차원 배열 또는 원소가 primitive type 아니라면 주의해야됨.
*/

//import kotlin.math.max
//
//val map = Array(4) { Array(4) { Fish() } }
//
//val dy = arrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
//val dx = arrayOf(0, -1, -1, -1, 0, 1, 1, 1)
//
//data class Fish(val num: Int = -1, var dir: Int = -1, var y: Int = -1, var x: Int = -1)
//
//fun moveFish(map: Array<Array<Fish>>) {
//
//    for (fishNum in 1..16) {
//
//        var fish: Fish? = null
//
//        for (i in 0 until 4) {
//            for (j in 0 until 4) {
//                if (map[i][j].num == fishNum) {
//                    fish = map[i][j]
//                }
//            }
//        }
//
//        // 이미 잡혀먹은 물고기면 건너뜀.
//        if (fish == null) continue
//
//        var next = -1 to -1
//        for (d in fish.dir until fish.dir + 8) {
//
//            // idx 변환
//            val nd = if (d < 8) d else d % 8
//            val ny = fish.y + dy[nd]
//            val nx = fish.x + dx[nd]
//
//            // 공간의 경계를 넘는 경우.
//            if (ny !in 0 until 4 || nx !in 0 until 4) continue
//            // 상어(0)가 있는 경우.
//            if (map[ny][nx].num == 0) continue
//
//            fish.dir = nd
//            next = ny to nx
//            break
//        }
//
//        // 물고기가 이동을 할 수 없다면,
//        if (next == -1 to -1) {
//            continue
//        } else {
//            val temp = map[next.first][next.second]
//            map[fish.y][fish.x] = temp.copy(y = fish.y, x = fish.x)
//            map[next.first][next.second] = fish.copy(y = next.first, x = next.second)
//        }
//    }
//}
//
//fun sharkNextPoints(map: Array<Array<Fish>>, sharkPoint: Pair<Int, Int>): List<Pair<Int, Int>> {
//
//    val result = mutableListOf<Pair<Int, Int>>()
//
//    val dir = map[sharkPoint.first][sharkPoint.second].dir
//
//    var cy = sharkPoint.first
//    var cx = sharkPoint.second
//
//    for (i in 0 until 3) {
//        cy += dy[dir]
//        cx += dx[dir]
//
//        if (cy !in 0 until 4 || cx !in 0 until 4) continue
//        if (map[cy][cx].num == -1) continue
//
//        result.add(cy to cx)
//    }
//
//    return result
//}
//
//var maxPoint = 0
//fun go(map: Array<Array<Fish>>, sharkPoint: Pair<Int, Int>, point: Int) {
//
//    // 물고기 이동.
//    moveFish(map)
//
//    val nextPoints = sharkNextPoints(map, sharkPoint)
//
//    // 상어가 다음 이동 장소가 없다면,
//    if (nextPoints.isEmpty()) {
//        maxPoint = max(maxPoint, point)
//        return
//    }
//
//    // 상어이동.
//    for (next in nextPoints) {
//        val newMap = Array(4) { Array(4) { Fish() } }
//        for (i in 0 until map.size) {
//            for (j in 0 until map.size) {
//                newMap[i][j] = map[i][j].copy()
//            }
//        }
//
//        val shark = newMap[sharkPoint.first][sharkPoint.second]
//        val fish = newMap[next.first][next.second]
//
//        newMap[sharkPoint.first][sharkPoint.second] = shark.copy(num = -1, dir = -1)
//        newMap[next.first][next.second] = fish.copy(num = 0)
//        go(newMap, next, point + fish.num)
//    }
//
//
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    for (i in 0 until 4) {
//        val info = readLine().split(" ").map { it.toInt() }
//        for (j in 0 until 4) {
//            val fishNum = info[j * 2]
//            val dir = info[(j * 2) + 1] - 1
//            map[i][j] = Fish(fishNum, dir, i, j)
//        }
//    }
//
//    // 상어 -> 0번, 첫번째 물고기 먹음.
//    val firstFish = map[0][0]
//    map[0][0] = firstFish.copy(num = 0)
//    val point = firstFish.num
//
////    map.forEach { println(it.joinToString(" ")) }
////    println()
//
//    go(map = map, sharkPoint = 0 to 0, point = point)
//    println(maxPoint)
//    return@with Unit
//}