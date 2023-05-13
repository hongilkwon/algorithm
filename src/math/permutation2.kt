package math

import java.util.*


/*

    순열 nPr
    n개 중에 r개를 순서를 고려하여 뽑는 경우의 수
    n!/(n-r)!

    중복순열 n∏r = n^r

 */

val permuArr = arrayOf(
    'a', 'b', 'c', 'd', 'e',
    'f', 'g', 'h', 'i', 'j',
    'k', 'l', 'm', 'n', 'o',
)
var isSelect = BooleanArray(permuArr.size) { false }

// result는 항상 index를 담아둔다.
val result = mutableListOf<Int>()

fun permutation(n: Int, r: Int, cnt: Int = 0) {

    // 카운트 숫자를 매개변수로 주어 뽑으려는 수까지 cnt를 세게되면 메서드 종료
    if (cnt == r) {
        /*
            logic
         */
        totalCnt += 1
        println(result.joinToString(" "))
        return
    }

    for (i in 0 until n) {
        // 시도하는 수가 선택되었는지 판단한다.
        if (isSelect[i]) continue

        result.add(i)
        isSelect[i] = true
        permutation(n = n, r = r, cnt + 1)

        result.remove(i)
        isSelect[i] = false
    }
}

var totalCnt = 0
fun doublePermutation(n: Int, r: Int, cnt: Int = 0) {

    if (cnt == r) {
        /*
            logic
         */
        totalCnt += 1
        println(result.joinToString(" "))
        return
    }

    for (i in 0 until n) {
        result.add(i)
        doublePermutation(n = n, r = r, cnt + 1)
        result.remove(i)
    }
}

fun main() {
//    permutation(n = permuArr.size, r = 15)
//    doublePermutation(n = permuArr.size, r = 3)
//    println(totalCnt)
    val test: Long = 1*2*3*4*5*6*7*8*9*10*11*12*13*14*15
    println(test)
    println(Long.MAX_VALUE)
}