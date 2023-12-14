package bac.easy


/*
    색종이 만들기

    주어진 종이의 한 변의 길이 N과 각 정사각형칸의 색(하얀색 또는 파란색)이 주어질 때
     잘라진 하얀색 색종이와 파란색 색종이의 개수를 구하는 프로그램

 */


//var n = 0
//
//lateinit var map: Array<IntArray>
//
//var whiteCnt = 0
//var blueCnt = 0
//
//fun check(color: Int, s: Pair<Int, Int>, size: Int): Boolean {
//
//    for (i in s.first until  s.first + size) {
//        for (j in s.second until  s.second + size) {
//            if (color != map[i][j]) return false
//        }
//    }
//
//    if (color == 0) {
//        whiteCnt += 1
//    } else {
//        blueCnt += 1
//    }
//    return true
//}
//
//fun go(s: Pair<Int, Int>, size: Int) {
//
//    if (check(map[s.first][s.second], s, size)) {
//        return
//    }
//
//    val ns = size / 2
//    // 1
//    go(s.first to s.second, ns)
//    // 2
//    go(s.first to s.second + ns, ns)
//    // 3
//    go(s.first + ns to s.second, ns)
//    // 4
//    go(s.first + ns to s.second + ns, ns)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) { intArrayOf() }
//
//
//    for (i in 0 until map.size) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    go(0 to 0, n)
//    println(whiteCnt)
//    println(blueCnt)
//}