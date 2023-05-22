package math


/*
    중복조합 nCr
    n개 중에 r개를 순서를 고려하지 않고 뽑는데, 중복하여 뽑을수 있다.

    nHr = n+r−1Cr = (n+r−1)!
*/

val doubleCombinationList = mutableListOf(
    'a', 'b', 'c', 'd', 'e',
    'f', 'g', 'h', 'i', 'j', 'k',
//    'k', 'l', 'm', 'n', 'o',
//    'p', 'q', 'r', 's', 't',
//    'u', 'v', 'w', 'x', 'y',
//    'z'
)

var doubleCombinationTotalCnt = 0
fun doubleCombination(n: Int, r: Int, resultList: MutableList<Int> = mutableListOf(), start: Int = 0) {

    if (resultList.size == r) {
        /*
            logic
        * */
        doubleCombinationTotalCnt += 1
//        println(resultList.joinToString(" "))
        return
    }

    for (i in start until n) {
        resultList.add(i)
        doubleCombination(n, r, resultList, start = i)
        resultList.remove(i)
    }
}

fun main() {
    doubleCombination(doubleCombinationList.size, 10)
    println(doubleCombinationTotalCnt)
}

