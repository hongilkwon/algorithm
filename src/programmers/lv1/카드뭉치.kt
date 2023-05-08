package programmers.lv1

/*
    카드뭉치
    단순구현 문제.
    단, idx를 수동조절 및 Stack/Queue 비어있는지 확인하는것.

 */

//fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
//    var answer: String = ""
//
//    var idxCard1 = 0
//    var idxCard2 = 0
//
//    for (i in 0 until goal.size) {
//        if ( idxCard1 in 0 until cards1.size && cards1[idxCard1] == goal[i]) {
//            idxCard1 += 1
//        } else if (idxCard2 in 0 until cards2.size && cards2[idxCard2] == goal[i] ) {
//            idxCard2 += 1
//        } else {
//            return "No"
//        }
//    }
//    return "Yes"
//}