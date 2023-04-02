package bac.week5

import bac.week1.list

/*
  드래곤 커브

  규칙성을 찾아야된다고 생각을 하였지만, 규칙을 30분가량 전혀 파악하지 못함.
  특히나 방향이 아니라 좌표를기준으로 생각을 해서 그런지 더더욱 찾기 힘들어짐.

   * -1을 1로 잘못써서 3-4시간 버림.

   구현
   * 시계 방향으로 90도 회전시킨
   * 드래곤 커브는 격자 밖으로 벗어나지 않는다. 드래곤 커브는 서로 겹칠 수 있다.

   1. 각 커브의 정보를 이용해서 모든 커브를 그린다.
   - 세대가 진행될 때 커브의 규칙성을 파악한다.
   - 0 ≤ g ≤ 10 -> 방향별 모든 세대를 미리 알수 있다.
   2. 칸을 반복하며 카운팅.

 */

var n = 0
lateinit var curveArr: Array<Array<Int>>

val map = Array(101) { Array(101) { 0 } }

val dy = arrayOf(0, -1, 0, 1)
val dx = arrayOf(1, 0, -1, 0)

val curveInfo = Array(4) {
    Array(11) {
        mutableListOf<Int>()
    }
}

fun createCurveInfo() {
    for (start in 0..3) {
        val direction = mutableListOf(start)
        for (gen in 0..10) {
            if (gen == 0) {
                curveInfo[start][gen].addAll(direction)
            } else if (gen == 1) {
                direction.add((direction.first() + 1) % 4)
                curveInfo[start][gen].addAll(direction)
            } else {
                val temp = mutableListOf<Int>()
                temp.addAll(direction)

                val half = (temp.size / 2)
                for (i in 0 until half) {
                    direction.add((temp[i] + 2) % 4)
                }
                for (i in half until temp.size) {
                    direction.add((temp[i]))
                }
                curveInfo[start][gen].addAll(direction)
            }
        }
    }
}

fun drawCurve(info: Array<Int>) {

    val startPoint = info[1] to info[0]
    val startDirection = info[2]
    val generation = info[3]

    map[startPoint.first][startPoint.second] = 1

    var point = startPoint
    for (i in 0 until curveInfo[startDirection][generation].size) {
        val direction = curveInfo[startDirection][generation][i]
        val ny = point.first + dy[direction]
        val nx = point.second + dx[direction]
        point = ny to nx
        map[ny][nx] = 1
    }
}

fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()
    curveArr = Array(n) { emptyArray() }

    for (i in 0 until n) {
        val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
        curveArr[i] = info
    }

//    curveArr.forEach { println(it.joinToString(" ")) }

    createCurveInfo()
//    curveInfo.forEachIndexed { index, arr ->
//        if (index == 0) {
//            arr.forEach { println(it.joinToString(" ")) }
//        }
//    }

    for (i in 0 until curveArr.size) {
        drawCurve(curveArr[i])
    }

//    map.forEach { println(it.joinToString(" ")) }


    var answer = 0
    for (i in 0 until map.size - 1) {
        for (j in 0 until map[0].size - 1) {
            if (
                map[i][j] == 1 &&
                map[i+1][j] == 1 &&
                map[i][j+1] == 1 &&
                map[i+1][j+1] == 1
            ){
                answer += 1
            }
        }
    }
    println(answer)
    Unit
}

