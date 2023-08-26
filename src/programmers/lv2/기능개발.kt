package programmers.lv2



/*
    기능개발

    개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
    이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포

    단순구현

    list를 이용해도 되지만,
    queue를 사용하면 구현에 유연하다.

 */

//import java.util.LinkedList
//import java.util.Queue
//data class Jop(var progress: Int, val speeds: Int)
//class Solution {
//
//    lateinit var progresses: IntArray
//    lateinit var speeds: IntArray
//
//    val queue: Queue<Jop> = LinkedList()
//    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
//        var answer = intArrayOf()
//
//        this.progresses = progresses
//        this.speeds = speeds
//
//        for (i in 0 until progresses.size){
//            queue.add(Jop(progresses[i], speeds[i]))
//        }
//
//        val temp = mutableListOf<Int>()
//        while (queue.isNotEmpty()){
//
//            for (job in queue){
//                 job.progress += job.speeds
//            }
//
//            var cnt = 0
//            while (queue.isNotEmpty() && queue.peek().progress >= 100){
//                queue.poll()
//                cnt += 1
//            }
//
//            if (cnt > 0) temp.add(cnt)
//        }
//
//        answer = temp.toIntArray()
//        return answer
//    }
//}