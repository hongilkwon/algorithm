package bac.etc


/*
   ATM

   돈을 인출하는데 필요한 시간의 합의 최솟값

   사고과정.

   돈을 인출하는 시간 자체는 무조건 소모되고,
   기다리는 시간을 최소화 해야됨.
   돈을 인출하는 시간이

   P1 = 3, P2 = 1, P3 = 4, P4 = 3, P5 = 2 인 경우


   [P1, P2, P3, P4, P5] 순서로 줄을 선다면
   [ 3,  1,  4,  3, 2]
   p1 => 3
   p2 => 3+1
   p3 => 3+1+4
   p4 => 3+1+4+3
   p5 => 3+1+4+3+2

   [P2, P5, P1, P4, P3]
   [ 1,  2,  3,  3,  4]

*/


//var n = 0
//lateinit var arr: IntArray
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    arr.sort()
//
//    var sum = 0
//    var waitingTime = 0
//    for (i in 0 until arr.size) {
//        waitingTime += arr[i]
//        sum += waitingTime
//    }
//
//    println(sum)
//    return@with Unit
//}