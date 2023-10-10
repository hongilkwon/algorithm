package programmers.lv3


/*
    디스크 컨트롤

    작업의 요청부터 종료까지 걸린 시간의 평균을 가장 줄이는 방법으로 처리하면 평균을 리턴

    요청시간 - 종료시간

    요청이 들어와 있는 작업중에 작업이 가장 짧은 녀석부터 해결해 됨.
    "우선순위 큐 2개를 이용해야 된다"

 */

//import java.util.PriorityQueue
//
//class Solution {
//
//    lateinit var jobs: Array<IntArray>
//    val pq = PriorityQueue(compareBy<Pair<Int, Int>> { it.first })
//    fun solution(jobs: Array<IntArray>): Int {
//        var answer = 0
//
//        for (i in 0 until jobs.size){
//            pq.add(jobs[i][0] to jobs[i][1])
//        }
//
//        var time = 0
//        var sum = 0
//        val tempPq = PriorityQueue(compareBy<Pair<Int, Int>> { it.second })
//
//        while (pq.isNotEmpty()){
//
//            while (pq.isNotEmpty() && time >= pq.peek().first){
//                tempPq.add(pq.poll())
//            }
//
//            if (tempPq.isNotEmpty()){
//                val job = tempPq.poll()
//                time += job.second
//                sum += time - job.first
//
//                pq.addAll(tempPq)
//                tempPq.clear()
//            }else{
//                time += 1
//            }
//        }
//
//        answer = sum / jobs.size
////        println(answer)
//        return answer
//    }
//}

//fun main() {
//    Solution().solution(arrayOf(intArrayOf(0, 3), intArrayOf(2, 6), intArrayOf(1, 9)))
//}