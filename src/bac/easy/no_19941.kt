package bac.easy


/*
   햄버거 분배(그리디, greedy)

    사람들은 자신의 위치에서 거리가 K이하인 햄버거를 먹을 수 있다.

    식탁의 길이 N,
    햄버거를 선택할 수 있는 거리 K,
    사람과 햄버거의 위치가 주어졌을 때, 햄버거를 먹을 수 있는 사람의 최대 수

    1 <= n <= 20_000
    1 <= k <= 10

    사고과정.

    자기 앞에 있는 가장 멀리 떨어진 햄버거를 먹어야 그나마 뒷사람에게 덜 피해줌
    자기 뒤에 있는 가장 가까운 햄버거는 먹어야 그나마 뒷사람에게 덜 피해줌

    예시)
    20 2
    H H H H H P P X P P H P H P H P H H H P
*/


//var n = 0
//var k = 0
//
//lateinit var arr: CharArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    arr = readLine().toCharArray()
//
//    var cnt = 0
//    for (i in 0 until arr.size) {
//
//        if (arr[i] == 'H' || arr[i] == 'X') continue
//
//        for (j in i - k until i + k + 1) {
//            if (j < 0) continue
//            if (j >= arr.size) continue
//            if (arr[j] == 'H') {
//                cnt += 1
//                arr[j] = 'X'
//                break
//            }
//        }
//    }
//
//    println(cnt)
//    return@with Unit
//}