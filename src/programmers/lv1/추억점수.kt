package programmers.lv1

/*
    추억점수
    - 이름이 없으면 0점이다.
    - 2차원배열이지만, 각 행의 길이가 다르다.
 */

//fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
//    var answer: IntArray
//
//    val map = mutableMapOf<String, Int>()
//    name.forEachIndexed { index, s ->
//        map[s] = yearning[index]
//    }
//
//    val tempList = mutableListOf<Int>()
//    for (i in 0 until photo.size){
//        var sum = 0
//        for (j in 0 until photo[i].size){
//            sum += map[photo[i][j]] ?: 0
//        }
//        tempList.add(sum)
//    }
//    answer = tempList.toIntArray()
//    return answer
//}

//fun main() {
//
//    val name = arrayOf("may", "kein", "kain", "radi")
//
//    val yearning = intArrayOf(5, 10, 1, 3)
//
//    val photo = arrayOf(
//        arrayOf("may"),
//        arrayOf("kein", "deny", "may"),
//        arrayOf("kon", "coni")
//    )
//    println(solution(name, yearning, photo).joinToString(" "))
//
//}