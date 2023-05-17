package programmers.lv1

/*
    2022 KAKAO TECH INTERNSHIP
    성격유형검사하기

    단순 구현문제.

    * String을 대소비교한다면,
    두 string을 charArr로 변환하여, 각 자리마다 아스키코드 값을 비교한다.
    만약 두개의 길이가 다르다면 짧은 것을 기준으로 비교한다.
    'a'=97 < 'b'=98
    즉, 사전순으로 앞선다면 그 문자열이 더 작다.
 */

//lateinit var pointMap: MutableMap<Char, Int>
//
//fun calPoint(disAgree: Char, agree: Char, choice: Int): Pair<Char, Int> {
//    var temp = ' ' to 0
//    when (choice) {
//        in 0..2 -> {
//            temp = disAgree to 3 - choice
//        }
//
//        in 4..6 -> {
//            temp = agree to choice - 3
//        }
//    }
//    return temp
//}
//
//fun select(first: Char, second: Char): Char{
//    val firstP = pointMap[first]!!
//    val secondP = pointMap[second]!!
//
//    return  if (firstP > secondP)
//        first
//    else if (firstP < secondP)
//        second
//    else{
//        if (first.toString() > second.toString())
//            second
//        else
//            first
//    }
//
//}
//fun solution(survey: Array<String>, choices: IntArray): String {
//    var answer: String = ""
//
//    pointMap = mutableMapOf(
//        'R' to 0,
//        'T' to 0,
//        'C' to 0,
//        'F' to 0,
//        'J' to 0,
//        'M' to 0,
//        'A' to 0,
//        'N' to 0
//    )
//
//    for (i in 0 until survey.size) {
//        val info = survey[i].toCharArray()
//        val choice = choices[i] - 1
//
//        val ret = calPoint(info[0], info[1], choice)
//        if (ret.first == ' ') continue
//        pointMap[ret.first] = pointMap[ret.first]!! + ret.second
//    }
//
//    val sb = StringBuilder()
//    sb.append(select('R', 'T'))
//    sb.append(select('C', 'F'))
//    sb.append(select('J', 'M'))
//    sb.append(select('A', 'N'))
//
//    return sb.toString()
//}
