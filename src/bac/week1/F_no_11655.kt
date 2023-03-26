package bac.week1


/*
ROT13
1-F

배열의 순환된 idx 구현할수 있냐 없냐의 문제이다.

0                                           25
a b c d e f g h i j n o p q r s t u w z x y z

 idx > (Array.size -1)

 idx - (Array.size-1) -1

 ex) idx 30  = idx 4

 */

import java.lang.StringBuilder

fun main() = with(System.`in`.bufferedReader()) {

    val str = readLine().toCharArray()
    val sb = StringBuilder()

    for (idx in 0 until str.size) {

        val c = str[idx]

        val sc = if (c.isUpperCase()) {
            if ((c.code + 13) > 90) {
                val e = c.code + 13 - 'Z'.code
                ('A'.code + (e - 1)).toChar()
            } else {
                (c.code + 13).toChar()
            }
        } else if (c.isLowerCase()) {
            if ((c.code + 13) > 122) {
                val e = c.code + 13 - 'z'.code
                ('a'.code + (e - 1)).toChar()
            } else {
                (c.code + 13).toChar()
            }
        } else {
            str[idx]
        }
        sb.append(sc)
    }
    println(sb.toString())
}