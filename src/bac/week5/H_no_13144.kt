package bac.week5

import java.lang.reflect.UndeclaredThrowableException

/*
    List of Unique Numbers

    (1 ≤ N ≤ 100,000)

    10만 * 10만 -> 완전반복으로 풀면 절대안됨..
    2개의 포인터를 사용해서 반복을 최소화 해야된다.

    1.예시를 통한 문제이해에 있어 부족함이 있었다.
    2.경우의수가 이상하게 크면 Long을 사용해라.


    예시

 idx 0 1 2 3 4
     1 2 3 1 2

    1
    12
    123
    1231(x)
--------------------
    2
    23
    231
    2312(x)
---------------------
    312
    (3) (1) (2)
    (3,1) (1, 2)
    (3,1,2)
 */

// 10만 2중반복 메모리 초과남.....
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    var cnt = 0
//    for (i in 0 until n){
//        val set = mutableSetOf<Int>()
//        set.add(arr[i])
//        cnt += 1
//        for(j in i+1 until n){
//            if (set.contains(arr[j])){
//               break
//            }
//            set.add(arr[j])
//            cnt += 1
//        }
//    }
//    println(cnt)
//}


fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toLong()
    val arr = readLine().split(" ").map { it.toLong() }

    val cnt = Array(100001) { false }

    var s: Long = 0
    var e: Long = 0

    var answer: Long = 0

    while (e < n){
        if (!cnt[arr[e.toInt()].toInt()]){
            // 중복 원소가 아니라면,
            cnt[arr[e.toInt()].toInt()] = true
            e++
        }else{
            // 중복 원소를 만난거라면,
            cnt[arr[s.toInt()].toInt()] = false
            answer += (e - s)
            s++
        }
    }
    answer += (e - s) * (e - s + 1) / 2
    println(answer)
    Unit
}


//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toLong()
//    val arr = readLine().split(" ").map { it.toLong() }
//
//    val cnt = Array(100001) { false }
//
//    var answer: Long = 0
//    var end: Long = 0
//
//    for (start in 0 until  n){
//        while (end < n){
//            if (cnt[arr[end.toInt()].toInt()]){
//                break
//            }
//            cnt[arr[end.toInt()].toInt()] = true
//            end += 1
//        }
//        cnt[arr[start.toInt()].toInt()] = false
//        answer += end - start
//    }
//    println(answer)
//    Unit
//}