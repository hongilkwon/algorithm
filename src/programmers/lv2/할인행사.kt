package programmers.lv2

/*
    할인행사

    10일간, 하루에 1개씩만 할인하고 1개만 구매가능하다.
    원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return

    1 ≤ want의 길이 = number의 길이 ≤ 10
    1 ≤ number의 원소 ≤ 10

    number[i]는 want[i]의 수량을 의미하며, number의 원소의 합은 10입니다.
    10 ≤ discount의 길이 ≤ 100,000

    쉬운 형태의 투포인터
 */

//val wantMap = mutableMapOf<String, Int>()
//fun check(discount: Map<String, Int>): Boolean {
//    for (element in wantMap){
//        if (discount.containsKey(element.key) && discount[element.key]!! >= element.value){
//           continue
//        }else{
//            return false
//        }
//    }
//    return true
//}
//
//fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
//    var answer: Int = 0
//
//    want.forEachIndexed{ idx, str ->
//        wantMap[want[idx]] = number[idx]
//    }
//
//    var cnt = 0
//    for (i in 0 .. discount.size - 10) {
//        val tempMap = mutableMapOf<String, Int>()
//        repeat(10) {
//            val element = discount[i + it]
//            if (tempMap.containsKey(element)){
//                tempMap[element] = tempMap[element]!! + 1
//            }else{
//                tempMap[element] = 1
//            }
//        }
//        if (check(tempMap)){
//            cnt += 1
//        }
//    }
//    return cnt
//}
//
//fun main() {
//    solution(
//        want = arrayOf("banana", "apple", "rice", "pork", "pot"),
//        number = intArrayOf(3, 2, 2, 2, 1),
//        discount = arrayOf(
//            "chicken", "apple", "apple", "banana", "rice",
//            "apple", "pork", "banana", "pork", "rice",
//            "pot", "banana", "apple", "banana")
//    )
//}