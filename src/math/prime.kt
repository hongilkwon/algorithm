package math

/*
    소수

    1과 자기 자신만으로 나누어 나머지가 0 이되는 1보다 큰 양의 정수.

 */

//import kotlin.math.sqrt
//
///*
// *  가장 단순하고 비효율적인 방법
// *  시간 복잡도 O(N)
// */
//fun isPrimeV1(n: Int): Boolean {
//    if (n == 1) return false
//    if (n == 2) return true
//
//    for (i in 2 until n) {
//        if (n % i == 0) return false
//    }
//    return true
//}
//
///*
// *  곱의 절반인 sqrt(n.toDouble()).toInt()까지만 반복.
// *  시간 복잡도 O(n/2)
// */
//fun isPrimeV2(n: Int): Boolean {
//    if (n == 1) return false
//    if (n == 2) return true
//
//    val end = sqrt(n.toDouble()).toInt()
//
//    for (i in 2..end) {
//        if (n % i == 0) return false
//    }
//    return true
//}
//
///*
// * 특정 정수 n까지 모든 정수에 대한 소수를 미리 판별해 놓고,
// * 여러번 오는 쿼리에 대해서 빠르게 처리한다.
// * O(1)
// *
// */
//val primes = mutableListOf<Int>()
//fun eratos(n: Int) {
//
//    /* idx = 해당 수를 의미하고
//    * arr[idx] = 1 이면 소수
//    * arr[idx] = 0 이면 소수가 아님을 뜻한다.
//    * 초기화 - 모든 값을 1로 초기화 한다.
//    * 0, 1은 소수가 아니다.
//    */
//    val arr = IntArray(n + 1) { 1 }
//    arr[0] = 1
//    arr[1] = 0
//
//     2 .. n 까지 반복
//    for (i in 2..n) {
//        // 이미 0이면 건너뜀.
//        if (arr[i] == 0) continue
//        // 자신을 제외한 배수를 arr[idx] = 0 로 만들어 준다.
//        for (j in i*2 ..n step i){
//           arr[j] = 0
//        }
//    }
//
//    // 소수로 판명된 것들은 리스트에 담음.
//    for (i in 2..n) {
//        if (arr[i] != 0) {
//            primes.add(i)
//        }
//    }
//}
//
//fun main() {
//    eratos(10000)
//    println(primes.joinToString(" "))
//}