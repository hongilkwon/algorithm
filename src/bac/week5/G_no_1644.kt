package bac.week5


/*
    소수의 연속합

    (1 ≤ N ≤ 4,000,000)

    소수 - 1과 자기 자신으로 만 나눠지는 수.


    1. n보다 작은 소수를 모두 구한다.
    2. 더해 보면서 카운팅을 한다.

 */

//import kotlin.math.*
//
//
//fun isPrime(n: Int): Boolean {
//    for (i in 2 until n) {
//        if (n % i == 0) return false
//    }
//    return true
//}
//
//
//fun isPrimeE(n: Int): Boolean {
//    val end = sqrt(n.toDouble())
//
//    for (i in 2..end.toInt()) {
//        if (n % i == 0) return false
//    }
//    return true
//}
//
//
//val primes = mutableListOf<Int>()
//
//fun eratos(n: Int, arr: Array<Int>) {
//
//    for (i in 2..n) {
//        if (arr[i] == 0) continue
//        var j = i * 2
//        while (j <= n) {
//            arr[j] = 0
//            j += i
//        }
//    }
//
//    for (i in 2..n) {
//        if (arr[i] != 0) {
//            primes.add(arr[i])
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val arr = Array(n + 1) { it }
//    eratos(n, arr)
//
////    println(primes.joinToString(" "))
//
//    var cnt = 0
//
//    for (i in 0 until primes.size) {
//        var sum = primes[i]
//        for (j in i + 1 until primes.size) {
//            if (sum == n) {
//                cnt += 1
//                break
//            }
//            if (sum > n) {
//                break
//            }
//            sum += primes[j]
//        }
//    }
//    if(n in primes) cnt += 1
//    println(cnt)
//}