package bac.week3

/*
치킨배달

 도시의 치킨 거리는 모든 집의 치킨 거리의 합이
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
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val bac.week5.concept.getN = info[0]
//    rows = bac.week5.concept.getN + 1
//    cols = bac.week5.concept.getN + 1
//
//    val m = info[1]
//
//    map = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 1..bac.week5.concept.getN) {
//        val line = readLine().split(" ").map { it.toInt() }.toIntArray()
//        for (j in 1..bac.week5.concept.getN) {
//            map[i][j] = line[j - 1]
//        }
//    }
//
//    for (i in 1..bac.week5.concept.getN) {
//        for (j in 1..bac.week5.concept.getN) {
//            if (map[i][j] == 0) continue
//            if (map[i][j] == 1) house.add(i to j)
//            if (map[i][j] == 2) chickenShop.add(i to j)
//        }
//    }
//
//    val list = mutableListOf<Int>()
//    combination(bac.week5.concept.getN = chickenShop.size, r = m, resultList = list)
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
//fun combination(bac.week5.concept.getN: Int, r: Int, start: Int = -1, resultList: MutableList<Int>) {
//
//    if (r == resultList.size) {
//        /*logic*/
//        val tempList = MutableList(r) {
//            chickenShop[resultList[it]]
//        }
//        val cityLen = calCityLen(tempList)
//        if (result > cityLen)
//            result = cityLen
//        return
//    }
//
//    for (idx in start + 1 until bac.week5.concept.getN) {
//        resultList.add(idx)
//        combination(bac.week5.concept.getN, r, idx, resultList)
//        resultList.remove(idx)
//    }
//}

