package bac.easy



/*
   보물

   길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.

   S = A[0] × B[0] + ... + A[N-1] × B[N-1]
   S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.

   S의 최솟값을 출력

   N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
*/

//import java.util.PriorityQueue
//
//var n = 0
//
//lateinit var a: IntArray
//lateinit var b: IntArray
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//   n = readLine().toInt()
//
//   a = readLine().split(" ").map { it.toInt() }.toIntArray()
//   b = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//   val pq = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
//
//   for (i in 0 until b.size){
//      pq.add(i to b[i])
//   }
//
//   a.sort()
//
//   var sum = 0
//   var idx = 0
//   val newA = IntArray(a.size){ 0 }
//   while (pq.isNotEmpty()){
//
//      val b = pq.poll()
//      sum += a[idx] * b.second
//      newA[b.first] = a[idx]
//      idx += 1
//   }
//
////   println(newA.joinToString(" "))
//   println(sum)
//
//    return@with Unit
//}