package bac.week5


/*
  두수의 합.

   1< ai <1,000,000

   bac.week5.concept.getN = 수열의 크기
   x = ai + aj
   (1 ≤ bac.week5.concept.getN ≤ 100000, 1 ≤ x ≤ 2000000)

   10만 * 10만 = 100억
   10,000,000,000

*/


//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    val x = readLine().toInt()
//
//    arr.sort()
//
//    var l = 0
//    var r = arr.size -1
//
//    var cnt = 0
//
//    while (l < r) {
//        val sum = arr[r] + arr[l]
//        if (x == sum) {
//            cnt += 1
//            l += 1
//            r -= 1
//        } else if (x > sum) {
//            l += 1
//        } else if (x < sum)  {
//            r -= 1
//        }
//    }
//    println(cnt)
//    Unit
//}
