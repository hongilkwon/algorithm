package bac.easy


/*
   다리놓기

   다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수
   N, M (0 < N ≤ M < 30)


   사고과정.
   m개의 지점중에 n개를 뽑으면된다.

   factorial이다 보니... Python은 상관이 없는데.
   kotlin에서는 long형으로도 계산이 불가능하다...
   그래서 2차원 dp(table)를 사용해야되서 난이도가 적지 않다.

*/


//var n = 0
//var m = 0
//
////fun factorial(n: Int): Long {
////
////   var num = 1L
////   for (i in 1 ..n){
////      num *= i
////   }
////   return num
////}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        m = info[1]
//
//    }
//
//    return@with Unit
//}