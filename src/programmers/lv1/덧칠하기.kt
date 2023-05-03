package programmers.lv1
/*

  n = 총벽의 크기
  m = 롤러의 크기
  1 ≤ m ≤ n ≤ 100,000

  section - 1미터 단위로 벽을 나누고 다시 칠해야되는 구역

   "롤러가 벽에서 벗어나면 안 됩니다."
   구역의 일부분만 포함되도록 칠하면 안 됩니다.

   현재 페인트를 칠하는 구역들을 완전히 칠한 후 벽에서 롤러를 떼며, 이를 벽을 한 번 칠했다고 정의합니다.

   한 구역에 페인트를 여러 번 칠해도 되고,
   다시 칠해야 할 구역이 아닌 곳에 페인트를 칠해도 되지만 다시 칠하기로 정한 구역은 적어도 한 번 페인트칠을 해야 합니다.
   롤러로 페인트칠을 하는 횟수를 최소화하려고 합니다.

   greedy 문제

 */

//lateinit var wall: Array<Int>
//fun solution(n: Int, m: Int, section: IntArray): Int {
//    var answer: Int = 0
//
//
//    wall = Array(n+1) { 0 }
//    for (i in 0 until section.size) {
//        wall[section[i]] = 1
//    }
////    println(wall.joinToString(" "))
//
//    var lastIdx = 0
//    for (i in 0 until wall.size) {
//        if (i > lastIdx && i <= wall.size - m) {
//            if (wall[i] == 1) {
//                lastIdx = i + (m - 1)
//                for (k in i..lastIdx) {
//                    wall[k] = 0
//                }
//                answer += 1
//            }
//        }
//        // println(wall.joinToString(" "))
//    }
//
//    for (i in wall.size - m until wall.size) {
//        if (wall[i] == 1) answer += 1
//    }
//
//    return answer
//}
//fun solution(n: Int, m: Int, section: IntArray): Int {
//    var answer: Int = 0
//
//    // 덧칠한 마지막 구역 idx
//    var lastIdx = 0
//    for (i in 0 until section.size) {
//        if (section[i] > lastIdx) {
//            answer += 1
//            lastIdx = section[i] + (m - 1)
//        }
//    }
//    return answer
//}

