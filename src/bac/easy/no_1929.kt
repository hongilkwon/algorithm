package bac.easy

/*
    소수 구하기

    1 ≤ M ≤ N ≤ 1_000_000

    최악은 M = 1, N = 1_000_000

    증가하는 순서대로 소수를 출력한다.
 */

//var m = 0
//var n = 0
//
//val primes = mutableListOf<Int>()
//
//fun eratos(n: Int) {
//
//    val arr = BooleanArray(n + 1) { true }
//    arr[1] = false
//
//    for (i in 2..n) {
//        if (!arr[i]) continue
//        for (j in i * 2..n step i) {
//            arr[j] = false
//        }
//    }
//
//    arr.forEachIndexed { idx, v ->
//        if (v) primes.add(idx)
//    }
//}
//
//val bw = System.out.bufferedWriter()
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//    m = info[0]
//    n = info[1]
//
//    eratos(n)
//
//    val sb = StringBuilder()
//    primes.forEach {
//        if (it >= m)
//            sb.append("${it}\n")
//    }
//
//    bw.write(sb.toString())
//    bw.flush()
//    bw.close()
//}