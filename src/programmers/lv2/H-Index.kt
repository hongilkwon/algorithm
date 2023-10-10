package programmers.lv2

/*
    H-Index
    논문 n편 중,
    h번 이상 인용된 논문이 h편 이상이고, 나머지 논문이 h번 이하 인용되 었다면,

    h의 최댓값이 이 과학자의 H-Index

    [3, 0, 6, 1, 5]

    5편중에
    0번 2번 4번은 3번이상 3편
    1번 3번 3번 이하.

    [0, 1, 4, 5, 6] -> 3
    [0, 2, 2, 2, 2] -> 2

 */

// h Index의 기준 값을 잘못 잡았음.
// 논문의 개수로 잡았어야 됬는데 인용된 횟수로 잡다 보니 틀림.
//   [0, 1, 4, 5, 6] -> 3이 나와야 되는데 1이 나옴.
//class Solution {
//    fun solution(citations: IntArray): Int {
//        var answer = 0
//
//        val arr = citations.sorted()
//
//        var maxH = 0
//
//        for (i in 0 until arr.size) {
//            val cnt = arr[i]
//            if (arr.size - i >= cnt && cnt >= i) {
//                maxH = maxOf(maxH, cnt)
//            }
//        }
//        answer = maxH
//        return answer
//    }
//}

//class Solution {
//    fun solution(citations: IntArray): Int {
//        var answer  = 0
//
//        val arr = citations.sorted()
//
//        for (i in 0 until arr.size){
//            val h = arr.size - i
//            if (arr[i] >= h){
//                answer = h
//                break
//            }
//        }
//        return answer
//    }
//}
