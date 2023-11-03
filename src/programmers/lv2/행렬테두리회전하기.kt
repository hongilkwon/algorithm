package programmers.lv2


/*
    행렬 테두리 회전하기

    배열 회전(단순구현)
    "그 회전에 의해 위치가 바뀐 숫자"들 중 가장 작은 숫자들을 순서대로 배열에 담아 리턴.
 */

//import kotlin.math.min
//
//class Solution {
//
//    lateinit var mapOrigin: Array<IntArray>
//
//    lateinit var map: Array<IntArray>
//    lateinit var mapTemp: Array<IntArray>
//
//    val tempList = mutableListOf<Int>()
//    fun rotate(y1: Int, x1: Int, y2: Int, x2: Int) {
//
//        var min = 100 * 100 + 1
//        // 상단
//        for (x in x2 downTo x1 + 1) {
//            mapTemp[y1][x] = map[y1][x - 1]
//            min = min(min, map[y1][x - 1])
//        }
//
//        // 오른쪽
//        for (y in y2 downTo y1 + 1) {
//            mapTemp[y][x2] = map[y - 1][x2]
//            min = min(min, map[y - 1][x2])
//        }
//
//        // 하단
//        for (x in x1..x2 - 1) {
//            mapTemp[y2][x] = map[y2][x + 1]
//            min = min(min, map[y2][x + 1])
//        }
//
//        // 왼쪽
//        for (y in y1..y2 - 1) {
//            mapTemp[y][x1] = map[y + 1][x1]
//            min = min(min, map[y+1][x1])
//        }
//
//        mapTemp.forEachIndexed { i, arr ->
//            map[i] = arr.copyOf()
//        }
//        tempList.add(min)
//    }
//
//    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
//        var answer = intArrayOf()
//
//        mapOrigin = Array(rows) { r -> IntArray(columns) { c -> (c + 1) + r * columns } }
//
//        map = Array(rows) { r -> IntArray(columns) { c -> (c + 1) + r * columns } }
//        mapTemp = Array(rows) { r -> IntArray(columns) { c -> (c + 1) + r * columns } }
//
////        map.forEach { println(it.joinToString(" ")) }
//
//        for (i in 0 until queries.size) {
//            val q = queries[i].map { it - 1 }
//            rotate(q[0], q[1], q[2], q[3])
//        }
//
//        answer = tempList.toIntArray()
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(
//        6, 6, arrayOf(
//            intArrayOf(2, 2, 5, 4),
//            intArrayOf(3, 3, 6, 6),
//            intArrayOf(5, 1, 6, 3)
//        )
//    )
//}