//package bac.week6
//
//
///*
//   기타레슨
//
//   i번 강의와 j번 강의를 같은 블루레이에 녹화하려면, i와 j 사이의 모든 강의도 같은 블루레이에 녹화해야 한다.
//
//   M개의 블루레이는 모두 같은 크기
//   개수도 최소, 가능한 블루레이의 크기 중 최소
//
//   강의는 총 9개이고, 블루레이는 총 3개 가지고 있다.
//   1번 블루레이에 1, 2, 3, 4, 5, 2번 블루레이에 6, 7, 3번 블루레이에 8, 9 를 넣으면 각 블루레이의 크기는 15, 13, 17이 된다.
//   블루레이의 크기는 모두 같아야 하기 때문에, 블루레이의 크기는 17이 된다. 17보다 더 작은 크기를 가지는 블루레이를 만들 수 없다.
//
//    100,000 * 10,000
//    1,000,000,000 => 10억
//
//   */
//
//var n = 0
//var m = 0
//
//lateinit var sizeArr: Array<Int>
//
//fun check(size: Int): Boolean {
//
//    var cnt = 0
//    var sum = 0
//
//    for (i in 0 until sizeArr.size) {
//        if (sizeArr[i] > size) return false
//        if (sum + sizeArr[i] > size) {
//            sum = 0
//            cnt += 1
//        }
//        sum += sizeArr[i]
//    }
//    // 합이 0가 아니란 뜻은 sizeArr 요소를 더하고도 사이드보다 작지만 영보다 크기 때문에
//    // 디스크가 1장더 필요하다는것
//    if (sum !== 0) cnt++
//    return m >= cnt\
//}
//
//
////fun check(size: Int): Boolean{
////
////    var temp = size
////    var cnt = 0
////    for (i in 0 until n) {
////        if (sizeArr[i] > size) {
////            return false
////        }
////        if (temp - sizeArr[i] < 0) {
////            temp = size
////            cnt++
////        }
////        temp -= sizeArr[i]
////    }
////    if (size !== temp) cnt++
////
////    return cnt <= m
////}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    sizeArr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    // 블루레이 디스크가 반드시 m개가 아닐수도 있기 때문에 m으로 나눠서 +1을 한것이 최소값이 아닐수 있다.
////    var left = (sizeArr.sum() / m) + 1
//
//    var left = 0
//    var right = sizeArr.sum()
//    var mid = 0
//
//    var answer = Int.MAX_VALUE
//
//    while (left <= right) {
//        mid = (left + right) / 2
//        if (check(mid)) {
//            answer = mid
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//    println(answer)
//    Unit
//}

