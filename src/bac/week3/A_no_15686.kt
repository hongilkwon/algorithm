package bac.week3

/*
    치킨배달

     도시의 치킨 거리는 모든 집의 치킨 거리의 합

      N(2 ≤ N ≤ 50) 지도의 크기
      M(1 ≤ M ≤ 13) 골라야되는 치킨집,

      완전탐색 문제
      모든 치킨집중에 m개 빼고 폐업 시키고, 치킨 거리를 구한 값의 최소값을 구한다.

      * 특정한 의미를 가지는 좌표들은 따로 자료구조를 생성해서 담아본다.

 */

//import kotlin.math.*
//
//var rows = 0
//var cols = 0
//lateinit var map: Array<IntArray>
//
//val house = mutableListOf<Pair<Int, Int>>()
//val chickenShop = mutableListOf<Pair<Int, Int>>()
//var result = Int.MAX_VALUE
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val n = info[0]
//    rows = n + 1
//    cols = n + 1
//
//    val m = info[1]
//
//    map = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 1..n) {
//        val line = readLine().split(" ").map { it.toInt() }.toIntArray()
//        for (j in 1..n) {
//            map[i][j] = line[j - 1]
//        }
//    }
//
//    for (i in 1..n) {
//        for (j in 1..n) {
//            if (map[i][j] == 0) continue
//            if (map[i][j] == 1) house.add(i to j)
//            if (map[i][j] == 2) chickenShop.add(i to j)
//        }
//    }
//
//    val list = mutableListOf<Int>()
//    combination(n = chickenShop.size, r = m, resultList = list)
//    println(result)
//}
//
//fun calCityLen(chickenShops: List<Pair<Int, Int>>): Int {
//
//    var cityLen = 0
//
//    for (i in 0 until house.size) {
//        var min = Int.MAX_VALUE
//        for (j in 0 until chickenShops.size) {
//
//            val p1 = house[i]
//            val p2 = chickenShops[j]
//
//            val len = abs(p1.first - p2.first) + abs(p1.second - p2.second)
//            if (min > len) {
//                min = len
//            }
//        }
//        cityLen += min
//    }
//    return cityLen
//}
//
//fun combination(n: Int, r: Int, start: Int = 0, resultList: MutableList<Int>) {
//
//    if (r == resultList.size) {
//        /* logic */
//        // 임시로 m개의 치킨집 위치를 담음
//        val tempList = MutableList(r) {
//            chickenShop[resultList[it]]
//        }
//        // 도신의 치킨 거리를 구함.
//        val cityLen = calCityLen(tempList)
//        if (result > cityLen)
//            result = cityLen
//        return
//    }
//
//    for (idx in start  until n) {
//        resultList.add(idx)
//        combination(n, r, idx+1, resultList)
//        resultList.remove(idx)
//    }
//}

