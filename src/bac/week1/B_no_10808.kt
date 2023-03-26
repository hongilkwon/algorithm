package bac.week1

/*
알바벳
1-B

kotlin
Char code 함수를 이용하면 Int 형으로 변경 가능하다.
알파벳 26개

소문자 a-97 z-122
대문자 A-65 Z-90

횟수(count)를 저장하는 자료구조를 이용할때는

map -> (k, v) key 대응하는 value(cnt)를 업데이트 한다.
array -> (idx, v) idx 대응하는 value(cnt)를 업데이트 한다.

 */

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val charArr = str.toCharArray()

    val cntArr = Array(26){
        0
    }

    charArr.forEach {
        val idx = (it.code - 97)
        cntArr[idx] = cntArr[idx] + 1
    }

    println(cntArr.joinToString(separator = " "))
//    val a: Char = 'a'
//    val z: Char = 'z'
//    val A: Char = 'A'
//    val Z: Char = 'Z'
//    println("${a.code} ${z.code} ${A.code} ${Z.code}")
}