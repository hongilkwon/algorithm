package bac.week5

/*
  감시

  회전의 항상 90도 방향으로 해야 하며, 감시하려고 하는 방향이 가로 또는 세로 방향
  CCTV는 CCTV를 통과할 수 있다.

  map 최대크기는 8*8  = 2^6

  cctv 최대 8개
  4^8  = 2^16

  2^22= 1024*1204*4

  사각 지대의 최소 크기 구하기.
   */

//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<Array<Int>>
//val cctvList = mutableListOf<Triple<Int, Int, Int>>()
//
//var answer = Int.MAX_VALUE
//
//fun type1(point: Pair<Int, Int>, direct: Int, map: Array<Array<Int>>) {
//    val y = point.first
//    val x = point.second
//    when (direct) {
//        0 -> {
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//
//        1 -> {
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//
//        2 -> {
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//
//        3 -> {
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//    }
//}
//
//fun type2(point: Pair<Int, Int>, direct: Int, map: Array<Array<Int>>) {
//    val y = point.first
//    val x = point.second
//    when (direct) {
//        0, 2 -> {
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//
//        1, 3 -> {
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//    }
//}
//
//fun type3(point: Pair<Int, Int>, direct: Int, map: Array<Array<Int>>) {
//    val y = point.first
//    val x = point.second
//    when (direct) {
//        // 위&왼쪽
//        0 -> {
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//        // 왼쪽&아래
//        1 -> {
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//        // 아래&오른쪽
//        2 -> {
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//        // 오른쪽&위
//        3 -> {
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//    }
//}
//
//fun type4(point: Pair<Int, Int>, direct: Int, map: Array<Array<Int>>) {
//    val y = point.first
//    val x = point.second
//    when (direct) {
//        // 위&왼쪽&오른쪽
//        0 -> {
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//        // 왼쪽&위&아래
//        1 -> {
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//        // 아래&왼쪽&오른쪽
//        2 -> {
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//        }
//        // 오른쪽&위&아래
//        3 -> {
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//    }
//}
//
//fun type5(point: Pair<Int, Int>, direct: Int, map: Array<Array<Int>>) {
//    val y = point.first
//    val x = point.second
//    when (direct) {
//        0, 1, 2, 3 -> {
//            for (i in x + 1 until m) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y + 1 until n) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//            for (i in x - 1 downTo 0) {
//                if (map[y][i] == 6) break
//                if (map[y][i] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[y][i] = 7
//            }
//            for (i in y - 1 downTo 0) {
//                if (map[i][x] == 6) break
//                if (map[i][x] in arrayOf(1, 2, 3, 4, 5)) continue
//                map[i][x] = 7
//            }
//        }
//    }
//}
//
//fun check(info: Triple<Int, Int, Int>, direct: Int, map: Array<Array<Int>>): Array<Array<Int>> {
//    val point = info.first to info.second
//    when (info.third) {
//        1 -> {
//            type1(point, direct, map)
//        }
//
//        2 -> {
//            type2(point, direct, map)
//        }
//
//        3 -> {
//            type3(point, direct, map)
//        }
//
//        4 -> {
//            type4(point, direct, map)
//        }
//
//        5 -> {
//            type5(point, direct, map)
//        }
//    }
//    return map
//}
//
//fun solve(depth: Int, map: Array<Array<Int>>) {
//
//    if (depth == cctvList.size) {
//        var cnt = 0
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                if (map[i][j] == 0) cnt += 1
//            }
//        }
////        map.forEach {
////            println(it.joinToString( " "))
////        }
////        println()
//        answer = min(answer, cnt)
//        return
//    }
//
//    for (dir in 0 until 4) {
//        val tempMap = Array(n){Array(m){ 0 }}
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                tempMap[i][j] = map[i][j]
//            }
//        }
//        val cMap = check(cctvList[depth], dir, tempMap)
//        solve(depth+1, cMap)
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) { emptyArray() }
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        map[i] = line
//    }
//
////    map.forEach {
////        println(it.joinToString( " "))
////    }
//
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (map[i][j] != 0 && map[i][j] != 6) {
//                cctvList.add(Triple(i, j, map[i][j]))
//            }
//        }
//    }
////    println(cctvList.joinToString( " "))
//
//    solve(0, map)
//    println(answer)
//    Unit
//}

