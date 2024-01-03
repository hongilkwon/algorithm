package bac.etc


/*
    뱀과 사다리 게임.

    즉, 사다리를 이용해 이동한 칸의 번호는 원래 있던 칸의 번호보다 크고, 뱀을 이용해 이동한 칸의 번호는 원래 있던 칸의 번호보다 작아진다.

    100번 칸에 도착하기 위해 주사위를 굴려야 하는 횟수의 최솟값

    사다리의 수N(1 ≤ N ≤ 15)
    뱀의 수 M(1 ≤ M ≤ 15)

    dp로 방향을 잡으면 문제가 생각보다 어려워지는데,

    "사다리 또는 뱀을 선택적으로 타거나 안타거나 할 수 없다"
    "뱀을 타고 내려가야 이득인 경우가 존재한다."

 */


//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var m = 0
//
//lateinit var map: IntArray
//
//lateinit var dist: IntArray
//fun bfs(start: Int) {
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(start)
//    dist[start] = 1
//
//    while (queue.isNotEmpty()) {
//        val node = queue.poll()
//
//        if (node == 100) {
//            return
//        }
//        // 주사위 1 - 6칸 진행
//        for (i in 1 until 7) {
//            var next = node + i
//            if (next > 100) continue
//
//            // 만약 사다리 또는 뱀을 타게 된다면 다음 좌표 변경.
//            if (map[next] != 0) {
//                next = map[next]
//            }
//            // 최단거리를 기록하지 않았다면
//            if (dist[next] != 0) {
//                continue
//            }
//            dist[next] = dist[node] + 1
//            queue.add(next)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = IntArray(101) { 0 }
//
//    for (i in 0 until n) {
//        val temp = readLine().split(" ").map { it.toInt() }
//        map[temp[0]] = temp[1]
//    }
//
//    for (i in 0 until m) {
//        val temp = readLine().split(" ").map { it.toInt() }
//        map[temp[0]] = temp[1]
//    }
//
//    dist = IntArray(101) { 0 }
//    bfs(1)
//
////    println(dist.joinToString(" "))
//    println(dist[100] - 1)
//    return@with Unit
//}