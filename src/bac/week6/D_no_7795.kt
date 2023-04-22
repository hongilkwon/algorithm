package bac.week6

/*
   먹을 것인가 먹힐것인가.

   1 ≤ N, M ≤ 20,000

   20,000 * 20,000
   400,000,000
   4억




   */

var n = 0
var m = 0

lateinit var arrA: Array<Int>
lateinit var arrB: Array<Int>
fun main() = with(System.`in`.bufferedReader()) {

    val tc = readLine().toInt()
    repeat(tc) { _ ->
        val info = readLine().split(" ").map { it.toInt() }
        n = info[0]
        m = info[1]

        arrA = readLine().split(" ").map { it.toInt() }.toTypedArray()
        arrA.sort()

        arrB = readLine().split(" ").map { it.toInt() }.toTypedArray()
        arrB.sort()
//        println(arrB.joinToString(" "))

        var cnt = 0
        for (i in 0 until arrA.size) {
            for (j in 0 until arrB.size){
                if (arrA[i] > arrB[j]) {
                    cnt += 1
                } else {
                    break
                }
            }
        }
        println(cnt)
    }
    Unit
}

