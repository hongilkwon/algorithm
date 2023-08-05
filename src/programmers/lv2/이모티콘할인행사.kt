package programmers.lv2

/*
    이모티콘 할인행사.

    단순구현문제
    완전탐색문제

    조합 중조합, 순열 중순열 재정리.
    10, 20, 30, 40
 */



//class Solution {
//
//    var maxCnt = 0
//    var maxIncome = 0
//
//    val salesPercentage = intArrayOf(10, 20, 30, 40)
//    val resultList = mutableListOf<Int>()
//    lateinit var resultArr: IntArray
//
////    fun doublePermu(cnt: Int) {
////
////        if (emoticons.size == cnt) {
////
////            // 할인률 / 할인가
////            val priceArr = Array(emoticons.size) {
////                resultArr[it] to (emoticons[it]) * (100 - resultArr[it]) / 100
////            }
////
////            // 사용자 마다 가격에 따른 결과 계산.
////            val usersResult = Array(users.size) {
////                false to 0
////            }
////
////            for (i in 0 until users.size) {
////
////                val user = users[i]
////                var sumPrice = 0
////
////                for (j in 0 until priceArr.size) {
////                    if (priceArr[j].first >= user[0]) {
////                        sumPrice += priceArr[j].second
////                    }
////                }
////
////                if (sumPrice >= user[1]) {
////                    usersResult[i] = true to sumPrice
////                } else {
////                    usersResult[i] = false to sumPrice
////                }
////            }
////
////            // 전체 사용자 통계.
////            val cnt = usersResult.count { it.first }
////            var income = 0
////
////            for (i in 0 until usersResult.size) {
////                if (!usersResult[i].first) {
////                    income += usersResult[i].second
////                }
////            }
////
////            if (maxCnt < cnt) {
////                maxCnt = cnt
////                maxIncome = income
////            } else if (maxCnt == cnt && maxIncome < income) {
////                maxCnt = cnt
////                maxIncome = income
////            }
////            return
////        }
////
////        for (i in 0 until 4) {
////            resultArr[cnt] = salesPercentage[i]
////            doublePermu(cnt + 1)
////        }
////    }
//
//    fun doublePermu(r: Int) {
//
//        if (r == resultList.size) {
//
//            // 할인률 / 할인가
//            val priceArr = Array(emoticons.size) {
//                salesPercentage[resultList[it]] to (emoticons[it]) * (100 - salesPercentage[resultList[it]]) / 100
//            }
//            println(priceArr.joinToString(" "))
//            // 사용자 마다 가격에 따른 결과 계산.
//            val usersResult = Array(users.size) {
//                false to 0
//            }
//
//            for (i in 0 until users.size) {
//
//                val user = users[i]
//                var sumPrice = 0
//
//                for (j in 0 until priceArr.size) {
//                    if (priceArr[j].first >= user[0]) {
//                        sumPrice += priceArr[j].second
//                    }
//                }
//
//                if (sumPrice >= user[1]) {
//                    usersResult[i] = true to sumPrice
//                } else {
//                    usersResult[i] = false to sumPrice
//                }
//            }
//
//            // 전체 사용자 통계.
//            val cnt = usersResult.count { it.first }
//            var income = 0
//
//            for (i in 0 until usersResult.size) {
//                if (!usersResult[i].first) {
//                    income += usersResult[i].second
//                }
//            }
//
//            if (maxCnt < cnt) {
//                maxCnt = cnt
//                maxIncome = income
//            } else if (maxCnt == cnt && maxIncome < income) {
//                maxCnt = cnt
//                maxIncome = income
//            }
//
//            return
//        }
//
//        for (i in 0 until salesPercentage.size) {
//            resultList.add(i)
//            doublePermu(r)
//            resultList.removeLast()
//        }
//    }
//
//    lateinit var users: Array<IntArray>
//    lateinit var emoticons: IntArray
//    fun solution(a: Array<IntArray>, b: IntArray): IntArray {
//
//        users = a
//        emoticons = b
//        resultArr = IntArray(emoticons.size) { 0 }
//        doublePermu(emoticons.size)
//
//        var answer: IntArray = intArrayOf(maxCnt, maxIncome)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(a = arrayOf(intArrayOf(40, 10000), intArrayOf(25, 10000)), b = intArrayOf(7000, 9000))
//}
