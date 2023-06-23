package bac.week8

/*
    인기가 넘쳐 흘러

     N (1 ≤ N ≤ 300),
     M (1 ≤ M ≤ 300),
     K (1 ≤ K ≤ 300),

     욱제가 기대하는 최소의 파티 인원 T (1 ≤ T ≤ M)

     인원을 필요로하는 구간을 나누기.
 */

//import kotlin.math.*
//
//var n = 0
//var m = 0
//var k = 0
//
//var t = 0
//
//lateinit var timeArr: Array<Int>
//val timeSelection = mutableListOf<Pair<Int, Int>>()
//
//// 진행시간, 빌려올 수 있는 친구 수, --> 최대 머무르는 시간.
//lateinit var case: Array<Array<Int>>
//
//fun go(idx: Int, remain: Int, prev: Int): Int {
//
//    if (idx == timeSelection.size)
//        return 0
//    if (case[idx][remain] != -1)
//        return case[idx][remain]
//
//    // 현재 구간에 필요한 친구 수
//    val required = max(0, t - timeSelection[idx].second)
//
//    // 이미 이전 구간에 충분히 투입되었다면 0
//    // 영선이의 친구들은 부끄럼이 많아서 욱제 및 영선이의 친구들을 제외한 파티 인원이 T명 이상이 되는 순간 다 같이 파티장에서 나가 버리고 돌아오지 않는다
//    val real_cost = if (prev >= required) 0 else required
//
//    var ret = 0
//    ret =
//        if (remain - real_cost >= 0) {
//            max(
//                go(idx + 1, remain - real_cost, required) + timeSelection[idx].first,
//                go(idx + 1, remain, 0)
//            )
//        } else
//            go(idx + 1, remain, 0)
//
//    case[idx][remain] = ret
//    return case[idx][remain]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//    k = info[2]
//    t = info[3]
//
//    timeArr = Array(n + 2) { 0 }
//    for (i in 1..m) {
//        val p = readLine().split(" ").map { it.toInt() }
//        for (j in p[0] until p[1]) {
//            timeArr[j] = min(t, timeArr[j] + 1)
//        }
//    }
//
//    case = Array(n + 2) { Array(k + 1) { -1 } }
////    println(timeArr.joinToString(" "))
//
//    //시간별 구간 생성.
//    var size = 1
//    var p = timeArr[1]
//
//    for (i in 2 until timeArr.size) {
//        if (p != timeArr[i]) {
//            timeSelection.add(size to p)
//            size = 1
//            p = timeArr[i]
//        } else
//            size += 1
//    }
////    println(timeSelection.joinToString(" "))
//    println(go(0, k, 0))
//}