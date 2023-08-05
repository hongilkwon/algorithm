package math


/*
    중복순열
    n개 중에 r개를 "순서"를 고려하여 뽑는데, 중복이 가능하다.
    (매우 안좋은 효율성을 보이기 떄문에 사용시 충분한 고민을 해야된다.)
    n∏r = n^r
 */

val doublePermutationArr = arrayOf(
    'a', 'b', 'c', 'd', 'e',
    'f', 'g', 'h', 'i', 'j',
    'k', 'l', 'm', 'n', 'o',
)

// result는 항상 index를 담아둔다.
val doublePermutationResult = mutableListOf<Int>()
var doublePermutationTotalCnt = 0
fun doublePermutation(n: Int, r: Int, cnt: Int = 0) {

    if (cnt == r) {
        /*
            logic
         */
        doublePermutationTotalCnt += 1
        println(doublePermutationResult.joinToString(" "))
        return
    }

    for (i in 0 until n) {
        doublePermutationResult.add(i)
        doublePermutation(n = n, r = r, cnt + 1)
        doublePermutationResult.remove(i)
    }
}

fun main() {
    doublePermutation(n= doublePermutationArr.size, r= 2)
    println("doublePermutationTotalCnt: ${doublePermutationTotalCnt}")
}