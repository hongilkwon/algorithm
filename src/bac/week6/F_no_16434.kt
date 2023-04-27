package bac.week6


/*
   드래곤 앤 던전

   방의 개수 N (1 ≤ N  ≤ 123,456)

   HATK (1 ≤ HATK  ≤ 1,000,000)

   ti, ai, hi (ti ∈ {1, 2}, 1 ≤ ai, hi  ≤ 1,000,000)

   최소의 HMaxHP 구하기

   2분탐색/그리디 두개다 풀이가 가능하다.
   시간초과 기준이 매우 빡빡한문제.

   몬스터와 용사와 데미지 부분을 while로 구현하면 시간초과가 생김.
   right 값을 너무 크게 해도 시간초과가 생김.
   */



// n번 방까지 체력이 0이하가 되지 않을 수 있는지 확인 한다.
//fun check(hp: Long): Boolean {
//
//    var currentHp = hp
//    var currentAtk = atk
//
//    for (i in 0 until roomInfoList.size) {
//        val info = roomInfoList[i]
//
//        if (info.first == 1L) {
//            val monAtk = info.second
//            var monHp = info.third
//
//            while (true) {
//                monHp -= currentAtk
//                if (monHp <= 0) break
//                currentHp -= monAtk
//                if (currentHp <= 0) return false
//            }
//        } else {
//            currentAtk += info.second
//            if (currentHp + info.third > hp){
//                currentHp = hp
//            }
//            else{
//                currentHp += info.third
//            }
//        }
//    }
//    return currentHp >= 1
//}


//var n: Long = 0
//var atk: Long = 0L
//
//val roomInfoList = mutableListOf<Triple<Long, Long, Long>>()
//fun check(hp: Long): Boolean {
//
//    var currentHp = hp
//    var currentAtk = atk
//
//    for (i in 0 until roomInfoList.size) {
//        val info = roomInfoList[i]
//
//        if (info.first == 1L) {
//            val monAtk = info.second
//            var monHp = info.third
//
//            val cnt = (monHp / currentAtk) + if (monHp % currentAtk > 0) 1 else 0
//            currentHp -= monAtk * (cnt - 1)
//        } else {
//            currentAtk += info.second
//            if (currentHp + info.third > hp) {
//                currentHp = hp
//            } else {
//                currentHp += info.third
//            }
//        }
//        if (currentHp <= 0) return false
//    }
//    return true
//}
//
//var bw = System.out.bufferedWriter()
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//    n = info[0]
//    atk = info[1]
//
//    for (i in 0 until n) {
//        val roomInfo = readLine().split(" ").map { it.toLong() }
//        roomInfoList.add(Triple(roomInfo[0], roomInfo[1], roomInfo[2]))
//    }
//
////    println(roomInfoList.joinToString(" "))
//    var left: Long = 1
//    var right: Long = 1_000_000_000_000_000_000L
//
//    var hpMax = Long.MAX_VALUE
//    while (left <= right) {
//        val mid = (left + right) / 2
//
//        if (check(mid)) {
//            hpMax = mid
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//
//    bw.write(hpMax.toString())
//    bw.close()
//    Unit
//}
