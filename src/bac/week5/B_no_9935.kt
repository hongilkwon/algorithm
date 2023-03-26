package bac.week5


/*
    문자열 폭발.
    1시간.

    반복문 전체

 */


import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {

    val str = readLine()
    val bomb = readLine()

    val s = Stack<Char>()

    str.forEach { c ->
        if (c == bomb.last() && s.size >= bomb.length - 1) {
            val sb = StringBuilder(bomb.length)
            sb.append(c)

            repeat(bomb.length - 1) {
                sb.append(s.pop())
            }
            val temp = sb.reverse().toString()
            if (temp != bomb) {
                temp.forEach { s.push(it) }
            }
        } else {
            s.push(c)
        }
    }

    val answer = StringBuilder()
    while (s.isNotEmpty()) {
        answer.append(s.pop())
    }
    println(answer.reverse().toString().ifEmpty { "FRULA" })

}