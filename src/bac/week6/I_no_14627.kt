package bac.week6


/*
   파닭파닭

   길이가 일정하지 않은 파를 구매

   각 파닭마다 "일정한" 파량을 넣음
   최대한 파를 많이 넣음
   (하나의 파닭에는 하나 이상의 파가 들어가면 안 된다)

   남은 파를 라면에 넣어 먹음

   파의 개수S(1 ≤ S ≤ 1_000_000),
   파닭의 수 C(1 ≤ C ≤ 1_000_000),
   (S ≤ C)

   파의 길이 L(1 ≤ L ≤ 1_000_000_000)

  *Long 타입 연산을 할때 반드시 연산타입을 맞춰야 한다.

   */

//var s: Long = 0
//var c: Long = 0
//
//lateinit var parSizeArr: Array<Long>
//
//// 입력된 파의 사이즈면, 각각의 파들로 만들어야 될 파닭을 모두 만들수 있는지 확인.
//fun check(size: Long): Boolean {
//    var cnt: Long = 0
//    for (i in 0 until parSizeArr.size) {
//        cnt += parSizeArr[i] / size
//    }
//    return cnt >= c
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//    s = info[0]
//    c = info[1]
//
//    parSizeArr = Array(s.toInt()) {
//        readLine().toLong()
//    }
//
//    var left: Long = 1
//    var right: Long = 1000_000_000L
//
//    var maxParSize: Long = 0
//    while (left <= right) {
//        val mid = (left + right) / 2L
//        if (check(mid)) {
//            maxParSize = mid
//            left = mid + 1
//        } else {
//            right = mid - 1
//        }
//    }
////    println(maxParSize)
//    var rest = parSizeArr.sum() - (maxParSize * c)
//    println(rest)
//    Unit
//}
