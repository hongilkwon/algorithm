package bac.easy


/*
   근손실(단순구현, 순욜)
    - 하루에 1개씩의 키트를 사용
    - 중량 증가량이 같을 수 있으나, 서로 다른 운동 키트로 간주
    - N일 동안 한 번씩만 사용
*/

//var n = 0
//var k = 0
//
//lateinit var arr: IntArray
//
//var cnt = 0
//val result = mutableListOf<Int>()
//
//lateinit var isSelected: BooleanArray
//
//fun permutation(n: Int, r: Int) {
//
//    if (result.size == r) {
//        if (check()) {
//            cnt += 1
//        }
//        return
//    }
//
//
//    for (i in 0 until n) {
//        if (isSelected[i]) continue
//
//        isSelected[i] = true
//        result.add(i)
//        permutation(n, r)
//
//        isSelected[i] = false
//        result.removeLast()
//    }
//
//}
//
//fun check(): Boolean {
//
//    var w = 500
//
//    for (i in 0 until result.size){
//        val idx = result[i]
//        w += (arr[idx] - k)
//        if (w < 500) return false
//    }
//
//    return true
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    isSelected = BooleanArray(arr.size) { false }
//
//    permutation(n, n)
//    println(cnt)
//
//    return@with Unit
//}