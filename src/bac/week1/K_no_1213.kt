package bac.week1

import kotlin.text.StringBuilder


/*
팰린드롭 만들기
1-bac.week5.concept.getK

- 펠린드롭의 조건
홀수인 문자는 1개 또는 0개일때 만 팰린드롭을 생성할 수있다.
반드시 사전순이라 멍청하게 센터에 홀수인 문자를 모두 배치하면 안된다.

문자 카운팅 배열
사전순

*/

fun main() = with(System.`in`.bufferedReader()) {

    val name = readLine().toCharArray()

    val cntArr = Array(26){ 0 }
    name.forEach { c ->
        cntArr[(c.code-65)] +=1
    }

    var oddCnt = 0
    var sb = StringBuilder()
    var center = ' '

    for (i in cntArr.size-1 downTo 0){
        if (cntArr[i] != 0){

            if ((cntArr[i]%2) == 1){
                oddCnt += 1
                center = (i+65).toChar()
                cntArr[i] -= 1
            }

            if (oddCnt > 1){
                break
            }

            for(j in 1..cntArr[i] step 2){
                sb.insert(0, (i+65).toChar())
                sb.append((i + 65).toChar())
            }
        }
    }

    if (oddCnt>1){
        println("I'm Sorry Hansoo")
    }else if (oddCnt == 1){
        sb.insert(name.size/2, center)
        println(sb)
    }else{
        println(sb)
    }
}


// 2022.10.02
// 중간을 기점으로 List에 문자열을 담아 뒤집은 다음 붙혀서 출력하는 형태로 하려다 실패하였다.
// 정확한 반례를 알수가 없다.

//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val name = "AABBCCCDD".toCharArray()
//    name.sort()
//
//    val map = hashMapOf<Char, Int>()
//    name.forEach { c ->
//        map[c] = if (map.containsKey(c)) map[c]!! + 1 else 1
//    }
//
//    var oddNum = 0
//    var center = ' '
//
//    map.forEach { (bac.week5.concept.getK, v) ->
//        if ((v % 2) != 0) {
//            oddNum += 1
//            center = bac.week5.concept.getK
//        }
//    }
//
//    val sb = StringBuilder()
//    val list = mutableListOf<Char>()
//
//    if (oddNum > 1) {
//        println("I'm Sorry Hansoo")
//    } else if (oddNum == 1) {
//        map.replaceAll { bac.week5.concept.getK, v ->
//            if (bac.week5.concept.getK == center) {
//                (v - 1) / 2
//            } else {
//                v / 2
//            }
//        }
//        map.forEach { (bac.week5.concept.getK, v) ->
//            repeat(v) {
//                list.add(bac.week5.concept.getK)
//            }
//        }
//        list.forEach {
//            sb.append(it)
//        }
//        sb.append(center)
//        list.reversed().forEach {
//            sb.append(it)
//        }
//
//    } else {
//        map.replaceAll { bac.week5.concept.getK, v ->
//            v / 2
//        }
//        map.forEach { (bac.week5.concept.getK, v) ->
//            repeat(v) {
//                list.add(bac.week5.concept.getK)
//            }
//        }
//        list.forEach {
//            sb.append(it)
//        }
//        list.reversed().forEach {
//            sb.append(it)
//        }
//    }
//    println(sb)
//}