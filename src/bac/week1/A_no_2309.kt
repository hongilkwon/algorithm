package bac.week1

/*
일곱 난쟁이
1-A

조합
1. nCr = nCn-r

*조합 r이 3이하면 반복문으로 해결을 하고
그 이상이면 조합 재귀코드를 사용해야 된다.

 */

fun main() {

    val arr = Array(9) {
        readLine()?.toInt() ?: 0
    }
    arr.sort()

    val excess = arr.sum() - 100

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if ((arr[i] + arr[j]) == excess) {
                arr.forEach {
                    if (it != arr[i] && it != arr[j])  {
                        println(it)
                    }
                }
                return
            }
        }
    }
}