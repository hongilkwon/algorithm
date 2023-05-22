package programmers.lv2

/*
    양궁대회
    kakao blind recruitment

    완전탐색

    완전탐색
    1 ≤ n ≤ 10
    info의 길이 = 11

    핵심적 "시간복잡도"
    11개의 점수판중에 최대 10개의 화살이 어떻게 꼽 힐것인가!

    화살을 동일한곳에 쏠수있기 때문에 일반적인 순열과 조합이 아니다.

    1. 중복순열(시간초과, 라이언이 쏘는 순서가 중요한것이 아니기 때문에 이렇게 할필요가 없다.)
    11^10 > 10_000_000_000 (100억)

    2. 중복조합(대략 180만, 완전탐색이 가능하다.)
    nHr = n+r−1Cr
    11H10 = 11+10-1C10 = (11+10-1)! / 10!(11-1)! = 184,756


    *문제를 꼼꼼히 읽어야된다.
    ...실수를 할 수있는 부분이 정말 많은 문제이다.
    조심해야된다.

 */

//var result = mutableListOf<Int>()
//
//var aInfo = Array(11) { 0 }
//var rInfo = Array(11) { 0 }
//
//fun calPoint(): Triple<Boolean, Int, Array<Int>> {
//    val temp = Array(11) { 0 }
//
//    result.forEach {
//        temp[it] += 1
//    }
//
//    var aPoint = 0
//    var rPoint = 0
//    for (i in 0 until aInfo.size) {
//        if (aInfo[i] == 0 && temp[i] == 0) continue
//        if (temp[i] > aInfo[i]) {
//            rPoint += 10 - i
//        } else {
//            aPoint += 10 - i
//        }
//    }
//
//    if (rPoint > aPoint) {
//        return Triple(true, rPoint - aPoint, temp)
//    } else {
//        return Triple(false, 0, arrayOf(-1))
//    }
//}
//
//var possible = false
//var diffPoint = Int.MIN_VALUE
//fun go(n: Int, r: Int, start: Int = 0) {
//
//    if (result.size == r) {
//        val ret = calPoint()
//        if (ret.first) {
//            possible = ret.first
//            if (diffPoint < ret.second) {
//                diffPoint = ret.second
//                rInfo = ret.third
//            }
//            if (diffPoint == ret.second) {
////                rInfo = checkArr(rInfo, ret.third)
//                for (i in 10 downTo 0){
//                    if (ret.third[i] > rInfo[i]){
//                        rInfo = ret.third
//                        break
//                    }else if (ret.third[i] < rInfo[i]){
//                        break
//                    }
//                }
//            }
//        }
//        return
//    }
//
//    for (i in start until n) {
//        result.add(i)
//        go(n, r, i)
//        result.remove(i)
//    }
//}
//
// fun checkArr(a: Array<Int>, b: Array<Int>): Array<Int> {
//    for (i in a.indices.reversed()) {
//        if (a[i] == b[i]) continue
//        if (a[i] < b[i]) return b
//        break
//    }
//    return a
//}
//
//fun solution(n: Int, info: IntArray): IntArray {
//    aInfo = info.toTypedArray()
//
//    go(n = info.size, r = n)
//    if (possible) {
//        return rInfo.toIntArray()
//    } else {
//        return intArrayOf(-1)
//    }
//}
//
//fun main() {
//    println(solution(5, intArrayOf(2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0)).joinToString(","))
//}