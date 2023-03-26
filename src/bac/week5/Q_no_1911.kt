package week5


/*
    흙길 보수하기

    라인스위핑(상황에 따라 최선의 상황을 경우의수에 따라 판단한다.)
    0<= .. <=1,000,000,000
    10억.

    길이가 10억인데
    자료구조를 사용하기 힘들다. 1000만이 넘어가면 배열을 생성하면,(메모리초과)
 */


//var n = 0
//var l = 0
//
//val waterInfoList = mutableListOf<Pair<Int, Int>>()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    n = info[0]
//    l = info[1]
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        waterInfoList.add(info[0] to info[1])
//    }
//
//    waterInfoList.sortBy { it.first }
////    println(waterList)
//
//    var answer = 0
//    var panzaLastIdx = 0
//    for (i in 0 until n) {
//        // 웅덩이의 마지막 인덱스가 이미 판자가 설치된 곳 보다 작거나 같다면,
//        if (waterInfoList[i].second <= panzaLastIdx) continue
//
//        var cnt = 0
//        // 웅덩이가 끝나고 몇 칸뒤에 다시 웅덩이가 시작될때,
//        if (panzaLastIdx < waterInfoList[i].first) {
//            cnt = (waterInfoList[i].second - waterInfoList[i].first) / l
//            cnt += if ((waterInfoList[i].second - waterInfoList[i].first) % l == 0) 0 else 1
//            panzaLastIdx = waterInfoList[i].first + (cnt * l)
//        } else {
//         // 웅덩이가 겹쳐서있을 경우
//            cnt = (waterInfoList[i].second - panzaLastIdx) / l
//            cnt += if ((waterInfoList[i].second - panzaLastIdx) % l == 0) 0 else 1
//            panzaLastIdx += (cnt * l)
//        }
//        answer += cnt
//    }
//    println(answer)
//}


