package bac.week7

/*
   나무 재테크

    봄
    - 나이만큼 양분을 먹음(나이 어린 나무부터 먹음)
    - 나이 1증가.
    - 양분을 못먹으면 즉시 죽음
    여름
    - 죽은 나무마다 나이를 2로 나눈 값이 나무가 있던 칸에 양분으로 추가(소수점 아래는 버림)
    가을
    - 나무가 번식한다. 번식하는 나무는 나이가 5의 배수이어야 하며, 인접한 8개의 칸에 나이가 1인 나무가 생긴다.
    여름
    - S2D2가 땅을 돌아다니면서 땅에 양분을 추가
    춢력
    "K년이 지난 후 상도의 땅에 살아있는 나무의 개수"

 */

//// 땅크기.
//var n = 0
//
//// 나무의 개수
//var m = 0
//
//// k년
//var k = 0
//
//// S2D2가 땅을 돌아다니면서 땅에 양분
//lateinit var a: Array<Array<Int>>
//
//lateinit var map: Array<Array<Area>>
//
//val dy = arrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
//val dx = arrayOf(0, 1, 1, 1, 0, -1, -1, -1)
//
//data class Area(var energy: Int, val namuList: MutableList<Namu>)
//data class Namu(var isAlive: Boolean, var age: Int) {
//    fun isBreeding() = (age % 5) == 0
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    k = info[2]
//
//    a = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toTypedArray()
//    }
//    map = Array(n + 1) { Array(n + 1) { Area(energy = 5, mutableListOf()) } }
//
//    for (i in 0 until m) {
//        val namuInfo = readLine().split(" ").map { it.toInt() }
//        val y = namuInfo[0]
//        val x = namuInfo[1]
//        val z = namuInfo[2]
//        map[y][x].namuList.add(Namu(isAlive = true, age = z))
//    }
//
//    repeat(k) {
//
//        for (i in 1..n) {
//            for (j in 1..n) {
//                map[i][j].namuList.sortBy { it.age }
//                for (k in 0 until map[i][j].namuList.size) {
//                    val namu = map[i][j].namuList[k]
//                    if (map[i][j].energy >= namu.age) {
//                        map[i][j].energy -= namu.age
//                        namu.age += 1
//                    } else {
//                        namu.isAlive = false
//                    }
//                }
//            }
//        }
//
//        for (i in 1..n) {
//            for (j in 1..n) {
//                val iterator = map[i][j].namuList.iterator()
//                while (iterator.hasNext()) {
//                    val namu = iterator.next()
//                    if (!namu.isAlive) {
//                        map[i][j].energy += namu.age / 2
//                        iterator.remove()
//                    }
//                }
//            }
//        }
//
//        for (i in 1..n) {
//            for (j in 1..n) {
//                for (k in 0 until map[i][j].namuList.size) {
//                    if (map[i][j].namuList[k].isBreeding()) {
//                        for (l in 0 until 8) {
//                            val ny = i + dy[l]
//                            val nx = j + dx[l]
//                            if (ny in 1..n && nx in 1..n) {
//                                map[ny][nx].namuList.add(Namu(isAlive = true, age = 1))
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        for (i in 1..n) {
//            for (j in 1..n) {
//                map[i][j].energy += a[i - 1][j - 1]
//            }
//        }
//    }
//
//    var cnt = 0
//    for (i in 1..n) {
//        for (j in 1..n) {
//            cnt += map[i][j].namuList.size
//        }
//    }
//    println(cnt)
//    Unit
//}