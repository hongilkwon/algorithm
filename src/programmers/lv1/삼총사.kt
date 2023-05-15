package programmers.lv1


/*
    삼총사.

    구현문제.

    3 ≤ number의 길이 ≤ 13
    -1,000 ≤ number의 각 원소 ≤ 1,000

    2000개 정수
    2000*2000*2000 3중 반복문하면 안됨
    조합 재귀구현.

 */


//lateinit var number: IntArray
//val result = mutableListOf<Int>()
//var cnt = 0
//fun combi(n: Int, r: Int, start: Int = -1) {
//
//    if (r == result.size) {
//        var sum = 0
//        for (i in result) {
//            sum += number[i]
//        }
//        if (sum == 0) {
//            cnt += 1
//        }
//        return
//    }
//
//    for (i in start + 1 until n) {
//        result.add(i)
//        combi(n, r, i)
//        result.remove(i)
//    }
//}
//
//fun solution(n: IntArray): Int {
//    var answer: Int = 0
//
//    number = n
//    combi(number.size, 3)
//    answer = cnt
//    return answer
//}
//
//fun main() {
//    println(solution(intArrayOf(-2, 3, 0, 2, -5)))
//}
