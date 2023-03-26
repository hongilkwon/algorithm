package bac.week1

/*
팰린드롬인지 확인하기
1-D

1. 문자열을 반대로 뒤집어서 확인하는 방법
2. 중앙을 기점으로 대칭되는 문자를 확인하는 방법
 */

fun main() = with(System.`in`.bufferedReader()) {

    val str = readLine().toCharArray()
    val half = str.size / 2

    for(i in 0 until half){
        if (str[i] != str[str.size-1-i]){
            println(0)
            return@with
        }
    }
    println(1)
    return@with
}