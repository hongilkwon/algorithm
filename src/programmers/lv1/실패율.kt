package programmers.lv1

/*
    2019 KAKAO BLIND RECRUITMENT
    실패율

    실패율
    스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

    N - 총 스테이지 개수
    stages- 각 사람별로 현재 도전 중인 스테이지의 번호

    실패율 내림차순 같다면, 작은 번호의 스테이지가 먼저

    스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.

    단순구현 문제
    double

    * kotlin
    sort sortBy{} sortWith() 유연하게 사용하고, comparator 잘 사용하기.
    항상 나누기 연산의 분모를 동적으로 생성할때는 반드시 0인 경우를 확인해야된다.
    kotlin  @ / 0 -> infinite
 */



//fun solution(N: Int, stages: IntArray): IntArray {
//    var answer = intArrayOf()
//
//    val failRateList = mutableListOf<Pair<Int, Double>>()
//
//    for (stage in 1..N) {
//        val ja = stages.count { it == stage }
//        val mo = stages.count { it >= stage }
//
//        if (mo==0){
//            failRateList.add(stage to 0.0)
//        }else{
//            val failRate = ja.toDouble() / mo.toDouble()
//            failRateList.add(stage to failRate)
//        }
//    }
//
//    failRateList.sortWith(comparator = compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first })
//    answer = failRateList.map { it.first }.toIntArray()
//    return answer
//}
