package bac.week1

/*
1-J
패션왕 신해빈

모든 경우를 찾아서 더 하려고 하면,
모든 nC1 nC2 nC3 .... nCn 모든 조합을 다 구하여야한다. -> 엄청난 수의 반복문이 필요하다 불가능
여집합을 이용해야된다.

-> 아무것도 안입는 경우를 1개의 원소로 만들어 집어 넣는다.

 */


//fun main() = with(System.`in`.bufferedReader()) {
//
//    val testCase = readLine().toInt()
//
//    for (i in 1..testCase) {
//
//        val cNum = readLine().toInt()
//        if (cNum == 0) {
//            println(0)
//            continue
//        }
//
//        val map = mutableMapOf<String, Int>()
//
//        var result: Long = 1
//
//        for (j in 1..cNum) {
//            val clothes = readLine().split(" ")[1]
//            map[clothes] = if (map.containsKey(clothes)) map[clothes]!! + 1 else 1
//        }
//
//        map.forEach { (k, v) ->
//            result *= v + 1
//        }
//
//        println(result - 1)
//    }
//}