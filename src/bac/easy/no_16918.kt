package bac.easy

import kotlin.system.exitProcess


/*
   봄버맨(구현, 시뮬레이션)

   3초가 지난 후에 폭발
   폭탄이 있던 칸이 파괴되어 빈 칸이 되며, 인접한 네 칸도 함께 파괴
   인접한 칸에 폭탄이 있는 경우에는 인접한 폭탄은 폭발 없이 파괴된다. 따라서, 연쇄 반응은 없다.

    R, C, N (1 ≤ R, C, N ≤ 200)

    최대 (200*200)의 맵을 200번 완탐하면
    8_000_000 (8백만)

    사고과정

    1. 초기맵이 주어짐.
    2. 1초동안 아무것도 안함
    3. 빈곳에 모두 폭탄 설치
    4. 3초전에 폭탄 터짐.

    *3과 4를 반복한다.

    처음 만 1초를 쉰다?

    0초 초기상태
    1초 쉼
    2초 빈곳에 폭탄 설치 완료
    3초 폭발(0초때 설치한 폭탄)
    4초 빈곳에 폭탄 설치 완료
    5초 폭발(2초때 설치한 폭탄)
    6초 빈곳에 폭탄 설치 완료
    7초 폭발(4초때 설치한 폭탄)
    8초 빈곳에 폭탄 설치 완료
    9초 폭발(6초때 설치한 폭탄)
    10초 빈곳에 폭탄 설치 완료
    11초 폭발(8초때 설치한 폭탄)
    .
    .
    .

    -> 짝수 초에 폭탄은 설치
    ->

*/

//var r = 0
//var c = 0
//var n = 0
//
//lateinit var originMap: Array<CharArray>
//lateinit var resultMap: Array<CharArray>
//
//data class Bomb(var time: Int = 3)
//
//lateinit var map: Array<Array<Bomb?>>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    r = info[0]
//    c = info[1]
//    n = info[2]
//
//    originMap = Array(r) {
//        readLine().toCharArray()
//    }
//
//    map = Array(r) { Array(c) { null } }
//    for (i in 0 until originMap.size) {
//        for (j in 0 until originMap.first().size) {
//            if (originMap[i][j] == 'O') {
//                map[i][j] = Bomb()
//            }
//        }
//    }
//
//    if (n == 1) {
//        originMap.forEach { println(it.joinToString("")) }
//        return@with Unit
//    }
//
//    var time = 1
//    for (i in 0 until r) {
//        for (j in 0 until c) {
//            if (map[i][j] != null) {
//                val bomb = map[i][j]!!
//                bomb.time -= 1
//            }
//        }
//    }
//
//    while (time != n) {
//        time += 1
//
//        for (i in 0 until r) {
//            for (j in 0 until c) {
//                if (map[i][j] != null) {
//                    val bomb = map[i][j]!!
//                    bomb.time -= 1
//                }
//            }
//        }
//
//        if ((time % 2) == 0) {
//            // 폭탄 설치
//            for (i in 0 until r) {
//                for (j in 0 until c) {
//                    if (map[i][j] == null) {
//                        map[i][j] = Bomb()
//                    }
//                }
//            }
//        }
//
//        if ((time % 2) == 1) {
//            // 폭파!
//            val temp = mutableSetOf<Pair<Int, Int>>()
//            for (i in 0 until r) {
//                for (j in 0 until c) {
//                    if (map[i][j] != null && map[i][j]?.time == 0) {
//                        temp.add(i to j)
//                        for (d in 0 until 4) {
//                            val nI = i + dy[d]
//                            val nJ = j + dx[d]
//                            if (nI !in 0 until r || nJ !in 0 until c)
//                                continue
//                            temp.add(nI to nJ)
//                        }
//                    }
//                }
//            }
//
//            for (point in temp){
//                map[point.first][point.second] = null
//            }
//        }
//    }
//
//    resultMap = Array(r) { CharArray(c) { ' ' } }
//    for (i in 0 until r) {
//        for (j in 0 until c) {
//            if (map[i][j] != null)
//                resultMap[i][j] = 'O'
//            else
//                resultMap[i][j] = '.'
//        }
//    }
//
//    resultMap.forEach { println(it.joinToString("")) }
//    return@with Unit
//}