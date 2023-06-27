package bac.week8


/*
    영화 수집.

    영화의 수 n과 보려고 하는 영화의 수 m이 주어진다. (1 ≤ n, m ≤ 100,000)

 */


//var tc = 0
//
//var n = 0
//var m = 0
//
//lateinit var arr: Array<Int>
//lateinit var bit: Array<Int>
//
//val map = mutableMapOf<Int, Int>()
//
//var offSet = 100_000
//
//fun bitUpdate(idx: Int, value: Int) {
//    var i = idx
//    while (i < bit.size) {
//        bit[i] += value
//        i += i and -i
//    }
//}
//
//fun sum(idx: Int): Int {
//
//    var ret = 0
//
//    var i = idx
//    while (i > 0) {
//        ret += bit[i]
//        i -= i and -i
//    }
//    return ret
//}
//
//val bw = System.out.bufferedWriter()
//fun main() = with(System.`in`.bufferedReader()) {
//    tc = readLine().toInt()
//
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        m = info[1]
//
//        arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//        offSet = 100_000
//        bit = Array(200_001) { 0 }
//
//        map.clear()
//
//        for (i in 1..n) {
//            bitUpdate(i + offSet, 1)
//            map[i] = i + offSet
//        }
//
//        val sb = StringBuilder()
//        for (i in 0 until arr.size) {
//
//            val idx = map[arr[i]]!!
//            sb.append("${sum(idx) - 1} ")
//
//            bitUpdate(idx, -1)
//            bitUpdate(offSet, 1)
//            map[arr[i]] = offSet
//            offSet -= 1
//        }
//        bw.write(sb.toString() + "\n")
//    }
//    bw.flush()
//    bw.close()
//}