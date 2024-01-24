package bac.etc


/*
    컨베이어 벨트 위의 로봇(복잡구현, 시뮬레이션)

    로봇은 올리는 위치에만 올릴 수 있다.
    언제든지 로봇이 내리는 위치에 도달하면 그 "즉시" 내린다


    로봇을 올리는 위치에 올리거나 / 로봇이 어떤 칸으로 이동하면 그 칸의 내구도는 즉시 1만큼 감소한다.


    종료되었을 때 몇 번째 단계가 진행 중

    2 ≤ N ≤ 100
    1 ≤ K ≤ 2N
    1 ≤ Ai ≤ 1,000

    3 2

    1 2 1
    2 1 2

    2 1 2
    1 2 1

    0 1 0
    2 1 2


    1. 회전 (내리기)
    2. 로봇 이동
    3. 로봇올리기
    4. 검사

 */


//var n = 0
//var k = 0
//
//data class Belt(val idx: Int, var hp: Int, var isWithRobot: Boolean)
//
//val upper = mutableListOf<Belt>()
//val lower = mutableListOf<Belt>()
//
//
//fun check(): Boolean {
//    var cnt = upper.count { it.hp == 0 } + lower.count { it.hp == 0 }
//    return cnt >= k
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    val tempArr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    for (i in n downTo 1) {
//        val belt = Belt(idx = i, hp = tempArr[i - 1], isWithRobot = false)
//        upper.add(belt)
//    }
//    for (i in n * 2 downTo n + 1) {
//        val belt = Belt(idx = i, hp = tempArr[i - 1], isWithRobot = false)
//        lower.add(belt)
//    }
//
//    var cnt = 0
//    while (true) {
//
//        cnt += 1
//
//        // 벨트회전
//        val upperFirst = upper.removeFirst()
//        lower.add(upperFirst)
//        val lowerFirst = lower.removeFirst()
//        upper.add(lowerFirst)
//
//        upper.first().isWithRobot = false
//
//        // 로봇이동. * 벨트에 먼저 올라온 로봇순으로 벨트 방향으로 이동.
//        for (i in 1 until upper.size) {
//            val prev = upper[i - 1]
//            val curr = upper[i]
//
//            if (!prev.isWithRobot && prev.hp >= 1 && curr.isWithRobot) {
//                prev.isWithRobot = true
//                prev.hp -= 1
//                curr.isWithRobot = false
//            }
//        }
//        upper.first().isWithRobot = false
//
//        // 로봇 올리기
//        val upperLast = upper.last()
//        if (upperLast.hp >= 1 && !upperLast.isWithRobot) {
//            upperLast.isWithRobot = true
//            upperLast.hp -= 1
//        }
//
//        if (check()) {
//            break
//        }
//    }
//
//    println(cnt)
//    return@with Unit
//}
