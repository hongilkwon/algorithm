package bac.etc


/*
   용감한 진수

   (1 ≤ K ≤ N ≤ 100)
   (0 ≤ 힘, 민첩, 지능 ≤ 1_000_000)

   사고과정

   어떻게 풀어야되는지 감이 잘 안옴.
   총 스탯 포인트가 최소이다, 즉, 각각 힘, 민첩, 지능의 제한은 없다는 것.
   힘, 민첩, 지능이 모두 높아야 이길 수 있음.

   1. 완전탐색

   n의 최대 크기가 100으로 작다.
   주어진 적들의 힘, 민첩, 지능의 모든 조합을 생성할 수 있다.

   힘, 민첩, 지능이 모두 높아야 이길 수 있다 -> 최소 1명을 이길려고 해도 그 적의 힘 + 민첩 + 지능을 모두 더한 스탯이 필요하다.
   100*100*100*100

   -> 100_000_000(1억)

    배울점
    CS 알고리즘은 기본적으로 컴퓨터를 통한 문제해결을 위한 순서이다.
    즉 1초에 대략 1억의 연산횟수를 크게 상회하지 않는다는 확신이 있다면, 반드시 완전탐색을 고려해야한다.

*/

//import kotlin.math.min
//
//var n = 0
//var k = 0
//
//lateinit var arr: Array<IntArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    arr = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var minStat = 1_000_000 * 3
//
//
//    for (x in 0 until n) {
//        for (y in 0 until n) {
//            for (z in 0 until n) {
//                // 모든 힘, 민, 지, 경우에서 적 k명을 해치울 수 있는 지 확인한다.
//                val him = arr[x][0]
//                val min = arr[y][1]
//                val ji = arr[z][2]
//
//                var cnt = 0
//
//                for (i in 0 until n) {
//
//                    val enemy = arr[i]
//
//                    if (
//                        him >= enemy[0]
//                        && min >= enemy[1]
//                        && ji >= enemy[2]
//                    ) {
//                        cnt += 1
//                    }
//
//                    if (cnt >= k) {
//                        minStat = min(minStat, him + min + ji)
//                    }
//                }
//            }
//        }
//    }
//    println(minStat)
//    return@with Unit
//}