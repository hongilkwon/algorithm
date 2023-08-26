package programmers.lv3

/*
    단어 변환

    1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
    2. words에 있는 단어로만 변환할 수 있습니다.

    가장 짧은 변환 과정

    가중치가 동일한 최단거리 --> bfs
    단, 인접리스트를 스스로 만들어야되고, 그래프문제인지 인지하는데 시간이 걸릴수있음.

 */


//import java.util.LinkedList
//import java.util.Queue
//
//class Solution {
//
//
//    lateinit var begin: String
//    lateinit var target: String
//    lateinit var nWords: Array<String>
//
//    lateinit var adjMap: MutableMap<String, MutableList<String>>
//    lateinit var visited: MutableMap<String, Int>
//
//    val queue: Queue<String> = LinkedList()
//    fun go(begin: String) {
//
//        queue.add(begin)
//        visited[begin] = visited[begin]!! + 1
//
//        while (queue.isNotEmpty()) {
//
//            val node = queue.poll()
//            for (next in adjMap[node]!!) {
//                if (visited[next]!! == 0) {
//                    visited[next] = visited[node]!! + 1
//                    queue.add(next)
//                }
//            }
//        }
//    }
//
//    fun solution(begin: String, target: String, words: Array<String>): Int {
//        var answer = 0
//
//        this.begin = begin
//        this.target = target
//        this.nWords = Array(words.size + 1) {
//            if (it == words.size) {
//                begin
//            } else {
//                words[it]
//            }
//        }
//
//        if (target !in words) return 0
//
//        adjMap = mutableMapOf()
//
//        for (i in 0 until nWords.size) {
//
//            val key = nWords[i]
//            adjMap[key] = mutableListOf()
//
//            for (j in 0 until nWords.size) {
//
//                if (j == i) continue
//
//                var cnt = 0
//                for (k in 0 until nWords[j].length) {
//                    if (key[k] != nWords[j][k]) cnt += 1
//                }
//
//                if (cnt == 1) {
//                    adjMap[key]!!.add(nWords[j])
//                }
//            }
//        }
//
////        adjMap.forEach { key, value ->
////            println("$key : ${value.joinToString()}")
////        }
//
//        visited = mutableMapOf()
//        visited[begin] = 0
//        for (i in 0 until nWords.size) {
//            visited[nWords[i]] = 0
//        }
//
//        go(begin)
////        println(visited)
//        answer = visited[target]!! - 1
////        println(answer)
//        return answer
//    }
//}
//

//fun main() {
//    Solution().solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log", "cog"))
//}