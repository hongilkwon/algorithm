package bac.easy

/*
    z

    단순재귀 문제인데 수학적인 생각을 조금 필요로 한다.

    2^15 = 32768
    일단 직접 모든 경우의수를 구하면 "메모리 초과" 발생함.
    40000 *40000
    1600_000_000
    배열의 크기는 1천만 넘어가면 답 없음.

    0.5초라 완탐을 해서도 안됨.

    결국 수학적 수열의 규칙을 이용하여 백트레킹을 해야됨.
    즉, r, c 좌표를 정확히 알고 있기 때문에 수학적 응용한다.
 */


//import kotlin.math.pow
//import kotlin.system.exitProcess
//
//var n = 0
//var r = 0
//var c = 0
//
//var answer = 0
//var cnt = 0

/*
// 완탐으로 조지면 시간초과남.
fun go(n: Int, row: Int, col: Int) {

    if (n == 0) {
        if (row == r && col == c){
            println(cnt)
            exitProcess(0)
        }
        cnt += 1
        return
    }

    val offSet = 2.0.pow(n - 1).toInt()
    go(n - 1, row, col)
    go(n - 1, row, col + offSet)
    go(n - 1, row + offSet, col)
    go(n - 1, row + offSet, col + offSet)

}
 */

/*
    Back Tracking
    불필요한 사분면을 재귀를 돌지 말아야됨.

 */

//fun go(n: Int, row: Int, col: Int) {
//
//    if (n == 0) {
//        return
//    }
//
//    val offSet = 2.0.pow(n - 1).toInt()
//
//    val temp = 4.0.pow(n - 1).toInt()
//
//    var nRow = row
//    var nCol = col
//    // 1사분면
//    if (r < row + offSet && c < col + offSet) {
//        cnt += 0
//    } else if (r < row + offSet && c in col + offSet until col + offSet * 2) {
//        cnt += temp
//        nCol += offSet
//    } else if (r in row + offSet until row + offSet * 2 && c < col + offSet) {
//        cnt += temp * 2
//        nRow += offSet
//    } else if (r in row + offSet until row + offSet * 2 && c in col + offSet until col + offSet * 2) {
//        cnt += temp * 3
//        nRow += offSet
//        nCol += offSet
//    }
//
//    go(n - 1, nRow, nCol)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    r = info[1]
//    c = info[2]
//
//    go(n, 0, 0)
//    println(cnt)
//}