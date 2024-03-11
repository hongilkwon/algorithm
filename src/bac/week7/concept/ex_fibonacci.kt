package bac.week7.concept


/*
    피보나치


    n = 0 --> fibo(0) = 0
    n = 1 --> fibo(1) = 1
    n >=2 --> fibo(n) = fibo(n-1) + fibo(n-2)

    0 1 2 3 4 5...............................n
    0 1 1 2 3 5 8 9 17 26 43....            ?

    fibo(n) = fibo(n-1) + fibo(n-2)
            = fibo(n-2) + fibo(n-3) + fibo(n-3) +fibo(n-4)
            .
            .
            .
            .
               fibo(1) / fibo(0)
  */

fun fibo_recursive(n: Int): Int {

    // 종료 조건
    if (n == 0 || n == 1) {
        return n
    }

    // 다음 노드로
    val ret = fibo_recursive(n - 1) + fibo_recursive(n - 2)

    // 결과 반환.
    return ret
}


lateinit var table: IntArray
fun fibo_dp(n: Int): Int {

    table = IntArray(n + 1) { 0 }
    table[0] = 0
    table[1] = 1

    for (i in 2 until table.size) {
        table[i] = table[i - 1] + table[i - 2]
    }

    println(table.joinToString(" "))
    return table[n]
}

fun main() {
    println(fibo_dp(45))
}