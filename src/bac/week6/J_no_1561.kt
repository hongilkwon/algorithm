package bac.week6

/*
    놀이공원

    마지막 아이가 타게 되는 "놀이기구의 번호" 출력

    N(1 ≤ N ≤ 2,000,000,000) 20억.
    M(1 ≤ M ≤ 10,000)

    만일 여러 개의 놀이기구가 동시에 비어 있으면, 더 작은 번호가 적혀 있는 놀이기구를 먼저 탑승
    * 시간을 기준으로 순회 한다면, 20억*30분 -> 600억분



    예시2
    7명 2개

    사람 1 2 3 4 5 6 7
    기구 1 2 2 1 2 1 2
    시간 0 0 2 3 4 6 6

    예시3
    7명 2개

    사람 1 2 3 4 5 6 7
    기구 1 2 2 1 2 1 2
    시간 0 0 2 3 4 6 6

   */

//var n: Long = 0
//var m: Long = 0
//
//lateinit var times: Array<Long>
//
////현재 까지 시간으로 아이들을 다 태울 수 있는가.
//fun check(time: Long): Boolean {
//    // 탑승횟수(탑승한 아이의 수)
//    // 일단 기구개수 만큼 m명은 타고 시작함
//    var cnt: Long = m
//    for (i in 0 until m.toInt()) {
//        cnt += (time / times[i])
//    }
//    return cnt >= n
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toLong() }
//    n = info[0]
//    m = info[1]
//
//    times = readLine().split(" ").map { it.toLong() }.toTypedArray()
//
//    if (n <= m) {
//        println(n)
//        return@with
//    }
//
//    //시간(분)
//    var left: Long = 1
//    var right: Long = 6_000_000_000_4
//    var minTime: Long = 0
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//        if (check(mid)) {
//            minTime = mid
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//
//    // 2분탐색의 결과값에서 1을 작게 하여 다시 몇명 탑승하였는지 계산한다.
//    var cnt = m
//    for (i in 0 until m.toInt()) {
//        cnt += (minTime - 1) / times[i]
//    }
//
//    for (i in 0 until m.toInt()) {
//        if ((minTime % times[i]) == 0L) {
//            cnt += 1
//        }
//        if (cnt == n) {
//            println(i + 1)
//            return@with
//        }
//    }
//}
