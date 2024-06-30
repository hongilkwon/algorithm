package bac.etc


/*
   철로(탐욕법, greedy)

   사람의 집과 사무실은 수평선 상에 있는 서로 다른 점에 위치하고 있다.
   임의의 두 사람 A, B에 대하여, A의 집 혹은 사무실의 위치가 B의 집 혹은 사무실의 위치와 같을 수 있다.

   "집과 사무실의 위치 모두 철로 선분에 포함"되는 사람들의 수가 최대가 되도록


    n (1 ≤ n ≤ 100_000)
    −100_000_000 <= hi, oi <= 100_000_000 이하의 서로 다른 정수
    1 ≤ d ≤ 200,000,000

    사고과정.

    모든 좌표를 기준으로 1칸씩 움직여서..확인한다??
    -10억 부터 - 10억이다 범위가 많다.

    그렇다면, 주어진 선분의 "끝점"을 기준으로 움직인다

    집과 사무실의 위치 "모두" 철로 선분에 포함 해야되기 떄문에, 선분의 끝나는 점인
    사무실의 위치가 중요하다
    사무실 끝나는 점을 기준으로 정렬한다

    철로를 이동시키면서 확인하면 되는데, 이때 모든 선분을 순회하면서 포함된 갯수를 카운팅 한다면,
    n도 10만이기 때문에 시간초과가 난다

    "우선순위 큐"를 사용하여 철로의 시작길이를 이탈하는 선분을 제거하고 남은 크기가 곧 포함되는 철로이다.
*/


//import java.util.*
//import kotlin.math.max
//
//var n = 0
//
//lateinit var arr: Array<Pair<Int, Int>>
//var d = 0
//
//val pq = PriorityQueue<Int>()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    arr = Array(n) { 0 to 0 }
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }
//
//        if (line[0] < line[1]) {
//            arr[i] = line[0] to line[1]
//        } else
//            arr[i] = line[1] to line[0]
//    }
//
//    d = readLine().toInt()
//
//    arr.sortWith(compareBy { it.second })
//
//    var max_cnt = 0
//    for (i in 0 until arr.size) {
//        pq.offer(arr[i].first)
//        while (pq.isNotEmpty() && pq.peek() < arr[i].second - d) {
//            pq.poll()
//        }
//        max_cnt = max(max_cnt, pq.size)
//    }
//
//    println(max_cnt)
//    return@with Unit
//}