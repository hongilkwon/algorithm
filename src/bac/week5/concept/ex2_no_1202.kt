package bac.week5.concept
/*

  보석 도둑

  30만 * 30만
  1초

  * 무엇을 기준으로 반복문을 돌려야 하나....

  가장 작은 가방에 가장 가치가 있는 보석을 담아야 한다.
  구현력도 상당히 필요한 문제.

 */

//import java.util.*
//
//var n = 0
//var gems = emptyArray<Pair<Long, Long>>()
//
//var k = 0
//var bags = emptyArray<Long>()
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    k = info[1]
//
//    // 보석정보
//    gems = Array(n) {
//        val gemInfo = readLine().split(" ").map { it.toInt() }
//        gemInfo[0].toLong() to gemInfo[1].toLong()
//    }
//
//    // 가방 무게 정보.
//    bags = Array(k) {
//        readLine().toLong()
//    }
//
//    gems.sortWith(comparator = compareBy { it.first })
//    bags.sort()
//
////    println(bac.week5.concept.getGems.joinToString(" "))
////    println(bac.week5.concept.getBags.joinToString(" "))
//
//    val pq = PriorityQueue<Long>(Collections.reverseOrder())
//    var answer: Long = 0
//
//    var j = 0
//
//    // 가방을 기준으로 반복.
//    for (i in 0 until k) {
//        // 가방보다 작은 보석을 발견하면 값우선순위 큐에 계속 넣음.
//        while (j < n && gems[j].first <= bags[i]) {
//            pq.add(gems[j].second)
//            j += 1
//        }
//        // 가방의 크기에서 가질수 있는 최고 가치를 적산.
//        if (pq.isNotEmpty()) {
//            answer +=pq.poll()
//        }
//    }
//    println(answer)
//}