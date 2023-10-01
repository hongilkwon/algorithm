package programmers.lv3

/*
    징검다리 건너기

    - 구현(시뮬레이션)
    - 이분탐색 <--  stones 배열 각 원소들의 값은 1 이상 200_000_000 이하인 자연수

    *O(n) 풀이 방법

    징검다리는 일렬로 놓여 있고 각 징검다리의 디딤돌에는 모두 숫자가 적혀 있으며 디딤돌의 숫자는 한 번 밟을 때마다 1씩 줄어듭니다.
    디딤돌의 숫자가 0이 되면 더 이상 밟을 수 없으며 이때는 그 다음 디딤돌로 한번에 여러 칸을 건너 뛸 수 있습니다.
    단, 다음으로 밟을 수 있는 디딤돌이 여러 개인 경우 무조건 가장 가까운 디딤돌로만 건너뛸 수 있습니다

    최대 몇 명까지 징검다리를 건널 수 있는지 return 하도록

    1 <= stones.size <= 200,000
    stones 배열 각 원소들의 값은 1 이상 200_000_000 이하인 자연수
 */


//class Solution {
//
//    lateinit var stones: IntArray
//    var k = 0
//
//    /*    fun check(): Boolean {
//            var maxCnt = 0
//            var tempCnt = 0
//
//            for (i in 0 until stones.size){
//                if (stones[i] <= 0)
//                    tempCnt += 1
//                else{
//                    maxCnt = maxOf(maxCnt, tempCnt)
//                    tempCnt = 0
//                }
//            }
//            return maxCnt < k
//        }*/
//
//    fun check(n: Int): Boolean {
//
//        var continuedZerocnt = 0
//
//        for (i in 0 until stones.size) {
//            if (n > stones[i]){
//                continuedZerocnt += 1
//                if (continuedZerocnt >= k) return false
//            }else{
//                continuedZerocnt = 0
//            }
//        }
//        return true
//    }
//
//    fun solution(stones: IntArray, k: Int): Int {
//        var answer = 0
//
//        this.stones = stones
//        this.k = k
//
//        // 다리를 건널수 있는 인원 - 1명부터 최대 2억명
//        var (left, right) = 1 to 200_000_001
//
//        while (left <= right) {
//            val mid = (left + right) / 2
//            // 최댓값을 구하기 때문에 -> 으로 진행.
//            if (check(mid)) {
//                answer = mid
//                left = mid + 1
//            } else {
//                right = mid - 1
//            }
//        }
//        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(intArrayOf(2, 4, 5, 3, 2, 1, 4, 2, 5, 1), k = 3)
//}