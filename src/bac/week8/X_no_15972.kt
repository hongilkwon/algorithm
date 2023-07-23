package bac.week8


/*
    물탱크

    존나 어렵다.

    구현자체도 매우 어렵다. --> 배열을 통한 상태값.
    dijkstra 알고리즘의 원리를 이용하여 해결한다.

    ** 어떤 상태를 저장하기 위해 배열의 차원을 1번 늘린다.

    해설을 보고 이해하고 따라 해도 매우 어렵다.
*/

//import java.util.*
//import kotlin.math.max
//import kotlin.math.min
//
//
//var n = 0
//var m = 0
//var h = 0
//
//// y, x, 구멍의 방향을 (위, 오른, 아래, 왼) -> (0, 1, 2, 3)
//lateinit var roomsArr: Array<Array<IntArray>>
//lateinit var heightArr: Array<IntArray>
//
//val pq = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third })
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//// 바깥 구멍의 높이로 높이로 완화
//fun enqueue(y: Int, x: Int, h: Int) {
//    if (heightArr[y][x] > h) {
//        heightArr[y][x] = h
//        pq.add(Triple(y, x, h))
//    }
//    return
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    h = info[2]
//
//    roomsArr = Array(n + 2) { Array(m + 2) { IntArray(4) { -1 } } }
//    heightArr = Array(n + 2) { IntArray(m + 2) { 0 } }
//
//    // 가로벽 (n+1 개)
//    // roomsArr[0][j], roomsArr[n+1][j] 바깥구멍
//    for (i in 1..n + 1) {
//        val wInfo = readLine().split(" ").map { it.toInt() }
//        for (j in 1..m) {
//            val hole = wInfo[j - 1]
//            roomsArr[i - 1][j][2] = hole
//            roomsArr[i][j][0] = hole
//        }
//    }
//
//    // 세로벽 (n개)
//    for (i in 1..n) {
//        val wInfo = readLine().split(" ").map { it.toInt() }
//        for (j in 1..m + 1) {
//            val hole = wInfo[j - 1]
//            roomsArr[i][j - 1][1] = hole
//            roomsArr[i][j][3] = hole
//        }
//    }
//
//    // 물채우기.
//    for (i in 1..n) {
//        for (j in 1..m) {
//            heightArr[i][j] = h
//        }
//    }
//
//    // 외부로 되어있는 구멍을 통한 물뺴기.
//    for (i in 1..n + 1) {
//        // 왼쪽 roomsArr[i][0] 외벽을 뜻한다.
//        if (roomsArr[i][0][1] != -1) {
//            enqueue(i, 1, roomsArr[i][0][1])
//        }
//        // 오른쪽
//        if (roomsArr[i][m + 1][3] != -1) {
//            enqueue(i, m, roomsArr[i][m + 1][3])
//        }
//    }
//    for (i in 1..m + 1) {
//        // 위 roomsArr[0][1] 외벽을 뜻한다.
//        if (roomsArr[0][i][2] != -1) {
//            enqueue(1, i, roomsArr[0][i][2])
//        }
//        // 아래
//        if (roomsArr[n + 1][i][0] != -1) {
//            enqueue(n, i, roomsArr[n + 1][i][0])
//        }
//    }
//
////    println(pq)
//    // 내부 구멍 물 흐름.
//    while (pq.isNotEmpty()) {
//        val room = pq.poll()
//
//        val y = room.first
//        val x = room.second
//        val h = room.third
//
//        if (heightArr[y][x] != h) continue
//
//        for (i in 0 until 4){
//            if(roomsArr[y][x][i] == -1) continue
//
//            val ny = y + dy[i]
//            val nx = x + dx[i]
//            if (ny !in 1..n || nx !in 1..m ) continue
//
//            // 현재 있는 공간의 이동할 방향의 으로 뚫려 있는 구멍의 높이 / 이동할 공간의 높이
//            val temp = min(roomsArr[y][x][i], heightArr[ny][nx])
//            val nextH = max(heightArr[y][x], temp)
//
//            if (heightArr[ny][nx] > nextH) {
//                heightArr[ny][nx] = nextH
//                pq.add(Triple(ny, nx, nextH))
//            }
//        }
//    }
//
//    var answer = 0
//    for (i in 1 ..n){
//        for (j in 1 ..m){
//            answer += heightArr[i][j]
//        }
//    }
//    println(answer)
//    Unit
//}

