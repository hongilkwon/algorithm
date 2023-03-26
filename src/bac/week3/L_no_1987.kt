package bac.week3


/*
알파벳
 */

//import kotlin.math.max
//
//var rows = 0
//var cols = 0
//
//lateinit var map: Array<CharArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val usedAlphaList = mutableSetOf<Char>()
//
//var max = Int.MIN_VALUE
//
//fun dfs(point: Pair<Int, Int>) {
//
//    max = max(max, usedAlphaList.size)
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until rows || nx !in 0 until cols) continue
//
//        if ( map[ny][nx] !in usedAlphaList ) {
//            usedAlphaList.add(map[ny][nx])
//            dfs(ny to nx)
//            usedAlphaList.remove(map[ny][nx])
//        }
//    }
//}
//
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { CharArray(cols) { ' ' } }
//
//
//    for (i in 0 until rows) {
//        map[i] = readLine().toCharArray()
//    }
//
//    usedAlphaList.add(map[0][0])
//    dfs(0 to 0)
//    println(max)
//}


