package bac.week8

/*
    자물쇠

    한 번 자물쇠를 돌릴 때, 최대 세 칸을 시계 방향 또는 반시계 방향으로 돌릴 수 있다.
    또, 최대 세 개의 "인접한" 디스크를 한 번에 돌릴 수 있다

    N <= 100


    3개를 단위로 생각을 했을 때
    3*3*2 -> 18개의 회전방법이 존재한다.

    100/3 = 33.3
    18*18*18... 너무 많다 --> DP

    해설코드를 그대로 변환해도 풀리지 않는 문제이다.
 */

//import kotlin.math.min
//
//const val INF = 1_000_000_000
//
//var n = 0
//lateinit var current: CharArray
//lateinit var target: CharArray
//
//
//// idx / one 회전 횟수 / two 회전 횟수 / three 회전 횟수 / 방향
//val case = Array(104) { Array(10) { Array(10) { Array(10) { Array(2) { -1 } } } } }
//fun mod(x: Int): Int {
//    return if (x < 0) x + 10 else x % 10
//}
//
//fun go(pos: Int, x: Int, y: Int, z: Int, flag: Int): Int{
//    if(pos == n) return 0
//    if (case[pos][x][y][z][flag] != -1) return case[pos][x][y][z][flag]
//
//    if(mod(x + current[pos].digitToInt()) == mod(target[pos].digitToInt())) {
//        val ret = min(go(pos + 1, y, z, 0, 0), go(pos + 1, y, z, 0, 1))
//        case[pos][x][y][z][flag] = ret
//        return case[pos][x][y][z][flag]
//    }
//
//    var ret = INF
//    val _flag = if (flag == 1) 1 else -1
//
//    for (i in 1..3) {
//        ret = min(ret, 1 + go(pos, mod(x + i * _flag), y, z, flag))
//        ret = min(ret, 1 + go(pos, mod(x + i * _flag), mod(y + i * _flag), z, flag))
//        ret = min(ret, 1 + go(pos, mod(x + i * _flag), mod(y + i * _flag), mod(z + i * _flag), flag))
//    }
//    case[pos][x][y][z][flag] = ret
//    return case[pos][x][y][z][flag]
//
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    current = readLine().toCharArray()
//    target = readLine().toCharArray()
//
//    println(min(go(0, 0, 0, 0, 0), go(0, 0, 0, 0, 1)))
//}


//fun go(idx: Int, one: Int, two: Int, three: Int, flag: Int): Int {
//
//    if (idx == n) return 0
//    if (case[idx][one][two][three][flag] != -1) case[idx][one][two][three][flag]
//
//    var ret = INF
//    // 처음부터 비밀번호가 맞춰져 있는 경우 --> 2개의 방향을 설정하여 다음 노드
//    if (mod(current[idx].digitToInt() + one) == mod(target[idx].digitToInt()) ) {
//        ret = min(go(idx + 1, two, three, 0, 0), go(idx + 1, two, three, 0, 1))
//    } else {
//        // 비밀번호 회전.
//        val dir = if (flag == 1) 1 else -1
//        for (i in 1..3) {
//            ret = min(ret, 1 + go(idx, mod(one+ i * dir), two, three, flag))
//            ret = min(ret, 1 + go(idx, mod(one+ i * dir), mod(two+ i * dir), three, flag))
//            ret = min(ret, 1 + go(idx, mod(one+ i * dir), mod(two+ i * dir), mod(three+ i * dir), flag))
//        }
//    }
//    case[idx][one][two][three][flag] = ret
//    return case[idx][one][two][three][flag]
//}
//
//fun rotate(num: Int, cnt: Int): Int {
//    val temp = num + cnt
//    return if (temp in 0 ..9) temp
//    else if (temp >= 10) temp % 10
//    else temp + 10
//}