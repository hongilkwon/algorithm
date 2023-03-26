package bac.week5.concept


/*
 선긋기.
 x, y(-1,000,000,000 ≤ x < y ≤ 1,000,000,000)

 Arrays.sort는 기본타입일 경우 듀얼피벗
 객체일 경우 팀소트나 머지소트를 사용하여 정렬하고
 Collections.sort 는 리스트롤 배열로 변환 후
 Arrays.sort를 호출 해서 팀소트나 머지소트를 사용하여 정렬하고
 다시 배열을 리스트로 변환합니다
*/

//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//
//    val lines = MutableList(n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        info[0] to info[1]
//    }
//
//    lines.sortBy { it.first }
//
//    var answer = 0
//    var s = lines[0].first
//    var e = lines[0].second
//
//    for (i in 1 until n) {
//        if (e < lines[i].first) {
//            // 기존의 길이 적산후
//            answer += (e - s)
//            // 새로운 시작 점 지점
//            s = lines[i].first
//            e = lines[i].second
//        }
//        if (e in lines[i].first..lines[i].second) {
//            // 라인의 범위를 넓힘
//            e = lines[i].second
//        }
//    }
//    answer += (e - s)
//    println(answer)
//    Unit
//}
