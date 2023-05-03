package programmers.lv1

/*
    2023 KAKAO BLIND RECRUITMENT

    당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다.
    수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다.

    파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성

    2000 ≤ YYYY ≤ 2022
    1 ≤ MM ≤ 12
    MM이 한 자릿수인 경우 앞에 0이 붙습니다.
    1 ≤ DD ≤ 28
    DD가 한 자릿수인 경우 앞에 0이 붙습니다.

    단순구현 문제
    구현시 조금 까다로운것 들이있다.


 */


//fun listToStr(todayList: MutableList<Int>): String {
//
//    val sb = StringBuilder("${todayList[0]}")
//
//    if (todayList[1] >= 10) {
//        sb.append(".${todayList[1]}")
//    } else {
//        sb.append(".0${todayList[1]}")
//    }
//    if (todayList[2] >= 10) {
//        sb.append(".${todayList[2]}")
//    } else {
//        sb.append(".0${todayList[2]}")
//    }
//    return sb.toString()
//}
//
//fun calLimitDate(today: String, month: Int): String {
//
//    val todayList = today.split('.').map { it.toInt() }.toMutableList()
//
//    val year = month / 12
//    val rMonth = month % 12
//
//    todayList[0] -= year
//
//    if (todayList[1] <= rMonth) {
//        todayList[0] -= 1
//        todayList[1] = 12 - (rMonth - todayList[1])
//    } else {
//        todayList[1] -= rMonth
//    }
//
//    if (todayList[2] + 1 > 28) {
//        todayList[1] += 1
//        todayList[2] = 1
//    } else {
//        todayList[2] += 1
//    }
//
//    return listToStr(todayList)
//}
//
//
//// target이 제한날짜보다 과거인지 판단하는 함수
//fun check(target: String, limit: String): Boolean {
//
//    val targetList = target.split('.')
//    val limitList = limit.split('.')
//
//    if (targetList[0] < limitList[0]) {
//        return true
//    } else if (targetList[0] > limitList[0]) {
//        return false
//    } else {
//        if (targetList[1] < limitList[1]) {
//            return true
//        } else if (targetList[1] > limitList[1]) {
//            return false
//        } else {
//            if (targetList[2] < limitList[2]) {
//                return true
//            } else if (targetList[2] > limitList[2]) {
//                return false
//            } else {
//                return false
//            }
//        }
//    }
//}
//
//fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    val termsMap = mutableMapOf<String, String>()
//
//    terms.forEach {
//        val str = it.split(" ")
//        termsMap[str[0]] = calLimitDate(today, str[1].toInt())
//    }
//
//    val tempList = mutableListOf<Int>()
//    for (i in 0 until privacies.size) {
//        val info = privacies[i].split(' ')
//        val date = info[0]
//        val type = info[1]
//        val limitDate = termsMap[type]!!
//
//        if (check(date, limitDate)) {
//            tempList.add(i + 1)
//        }
//    }
//    tempList.sort()
//    return tempList.toIntArray()
//}
//
//fun main() {
//    println(calLimitDate("2022.05.19", 3))
//}