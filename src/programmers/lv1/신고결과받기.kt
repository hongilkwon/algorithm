package programmers.lv1

/*
    2022 KAKAO BLIND RECRUITMENT

    2 ≤ id_list의 길이 ≤ 1,000
    1 ≤ report의 길이 ≤ 200,000

   유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

   자료구조의 특성을 잘 이해하고 천천히 구현만하는 문제이지만 살짝 헷갈릴수 있다.
   조심히 천천히 구현해야 흐름을 안 뺏기고 제대로 구현할 수 있다.
 */

//fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    var fromToMap = mutableMapOf<String, MutableSet<String>>()
//
//    for (i in 0 until id_list.size) {
//        fromToMap[id_list[i]] = mutableSetOf()
//    }
//    for (i in 0 until report.size) {
//        val info = report[i].split(' ')
//        val from = info[0]
//        val to = info[1]
//        fromToMap[from]?.add(to)
//    }
//
//    val cntMap = mutableMapOf<String, Int>()
//    for (key in fromToMap.keys) {
//        val tempList = fromToMap[key]!!.toList()
//        for (j in 0 until tempList.size) {
//            if (cntMap.containsKey(tempList[j])) {
//                cntMap[tempList[j]] = cntMap[tempList[j]]!! + 1
//            } else {
//                cntMap[tempList[j]] = 1
//            }
//        }
//    }
//
//    val stopList = mutableListOf<String>()
//    for (entity in cntMap) {
//        if (entity.value >= k){
//            stopList.add(entity.key)
//        }
//    }
//
//    val tempList = mutableListOf<Int>()
//    for (i in 0 until id_list.size){
//        val toSet = fromToMap[id_list[i]]!!
//        var cnt = 0
//        for (j in 0 until stopList.size){
//            if(toSet.contains(stopList[j])){
//                cnt += 1
//            }
//        }
//        tempList.add(cnt)
//    }
//
//    return tempList.toIntArray()
//}

