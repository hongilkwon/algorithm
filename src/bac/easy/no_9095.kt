package bac.easy

/*
    1,2,3 더하기

    1, 2, 3의 합으로 나타내는 방법의 수를 출력
    합을 나타낼 때는 수를 1개 이상 사용

    n은 양수이며 11보다 작다.

    * dp 문제고 이전에 비슷한

    ex 1)
    1

    ex 2)
    1 1
    2

    ex 3)
    1 1 1
    1 2
    2 1
    3

    ex 4)
    1 1 1 1

    1 1 2
    1 2 1
    2 1 1

    2 2
    1 3
    3 1

    ex 5)
    1 1 1 1 1

    1 1 1 2
    1 1 2 1
    1 2 1 1
    2 1 1 1

    2 2 1
    2 1 2
    1 2 2

    1 1 3
    1 3 1
    3 1 1

    3 2
    2 3

    1 2 4 7 13 24 44

 */

//var n = 0
//val table = IntArray(12) { 0 }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    table[1] = 1
//    table[2] = 2
//    table[3] = 4
//
//    for (i in 4..11) {
//        table[i] = table[i - 1] + table[i - 2] + table[i - 3]
//    }
//
//    repeat(tc) {
//        n = readLine().toInt()
//        println(table[n])
//    }
//}