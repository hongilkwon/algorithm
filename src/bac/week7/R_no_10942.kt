package bac.week7

/*
    펠린드롭?



 */


var n = 0
var m = 0

lateinit var arr: Array<Int>
lateinit var case: Array<Array<Int>>

val bw = System.out.bufferedWriter()
fun main() = with(System.`in`.bufferedReader()) {

    n = readLine().toInt()
    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
    case = Array(n) { Array(n) { 0 } }

    // 대각선
    for (i in 0 until arr.size) {
        case[i][i] = 1
    }
    // 최소 크기 중간 사이즈 2인 경우 채우기.
    for (i in 0 until arr.size - 1) {
        if (arr[i] == arr[i + 1]) case[i][i + 1] = 1
    }
    // 양쪽끝을 제외한 중간의 사이즈 를 반복한다.
    for (size in 2 until arr.size) {
        for (i in 0 until arr.size - size) {
            if (arr[i] == arr[i + size] && case[i + 1][i + size - 1] == 1) {
                case[i][i + size] = 1
            }
        }
    }

//    case.forEach { println(it.joinToString(" ")) }

    m = readLine().toInt()
    for (i in 1..m) {
        val info = readLine().split(" ").map { it.toInt() }
        val answer = case[info[0] - 1][info[1] - 1]
        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()
    Unit
}