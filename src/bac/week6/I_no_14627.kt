package bac.week6


/*
   파닭파닭

   길이가 일정하지 않은 파를 구매

   각 파닭마다 일정한 파량을 넣음
   최대한 파를 많이 넣음
   (하나의 파닭에는 하나 이상의 파가 들어가면 안 된다)

   남은 파를 라면에 넣어 먹음

   파의 개수S(1 ≤ S ≤ 1,000,000),
   파닭의 수 C(1 ≤ C ≤ 1,000,000),
   (S ≤ C)

   파의 길이 L(1 ≤ L ≤ 1,000,000,000)

   */

var s = 0
var c = 0

lateinit var parSizeArr: Array<Int>

var rest = 0
// 현재 길이로 모든 파닭에 다 파를 제공 가능한지 확인하고
// 파가 얼마나 남는지 동시에 확인한다.
fun check(size: Int): Boolean {
    rest = 0
    var cnt = 0
    for (i in 0 until parSizeArr.size) {
        cnt += parSizeArr[i] / size
        rest += parSizeArr[i] % size
    }
    return c <= cnt
}

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }
    s = info[0]
    c = info[1]

    parSizeArr = Array(s) {
        readLine().toInt()
    }

    var left = 1
    var right = parSizeArr.maxOrNull()!!

    var maxSize = Int.MIN_VALUE
    while (left <= right) {
        val mid = (left + right) / 2
        if (check(mid)) {
            maxSize = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(rest)
    Unit
}
