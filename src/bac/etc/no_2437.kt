package bac.etc


/*
   저울(누적합, 도식화를 통한 원리도출)

   추들을 사용하여 측정할 수 없는 양의 정수 무게 중 최솟값

    1 <= N <= 1_000
    1 <= 추의 무게 <= 1_000_000

    사고과정.

    3, 1, 6, 2, 7, 30, 1

    어떤 추를 썻는지 모든 경우의 수를 센다?
    2*2*2....2  2의 1000승..?

    dp???

    정렬
    1, 1, 2, 3, 6, 7, 30

    1은 1짜리 추 1개
    2은 2짜리 추 1개 또는 1짜리 추 2개
    3은 3짜리 추 1개 또는 1짜리 추 1개 + 2짜리 추 1개
    4는 ..

    모르겠다 시벌

    해설

    총 N개의 저울추 중에서 몇 가지를 뽑아서 1부터 - K 만큼의 무게를 측정할 수 있다고 가정할 때,
    무게가 X인 새로운 저울추가 추가된다고 하면, 새로 측정할 수 있는 무게는 (1 ~ K) + X가 된다.

    예)  [1]가 있다고 가정해보자!
    그럼, 1 1개의 무게를 측정할 수가 있다
    여기에 1 무게 추가 추가되면, 기존의 측정 가능한 무게에 2(1+1) 을 추가로 더 측정 가능하다.
    여기에 2 무게 추가 추가되면, 기존의 측정 가능한 무게에 3(1+2) 4(2+2)을 추가로 더 측정 가능하다.
    여기에 3 무게 추가 추가되면, 기존의 측정 가능한 무게에 5(2+3) 6(3+3) 7(4+3)을 추가로 더 측정 가능하다.
    여기에 6 무게 추가 추가되면, 기존의 측정 가능한 무게에 8(2+6) 9(3+6) 10(4+6) 11(5+6) 12(6+6) 13(7+6) 을 추가로 더 측정 가능하다.
    여기에 7 무게 추가 추가되면, 기존의 측정 가능한 무게에 14(7+7) 15(8+7) 16(9+7) 17(10+7) 18(11+7) 19(12+6) 20(13+7) 을 추가로 더 측정 가능하다.
   *여기에 30무게 추가 추가되면, 기존의 측정 가능한 무게에 31(1+30) .....(20+30) 을 추가로 더 측정 가능하다.

   기존의 연속으로 측정 가능한 무게들의 수 보다 더 큰 추가 들어온다면, 연속측정이 불가능하다!

   즉 연속으로 측정 가능 무게추들의 집합에 추가된 추 x의 무게가 k+1보다 큰 수가 들어온다면 불가능하고,
   반대로 k+1보다 같거나 작다면, (1 ~ k) + x까지 연속으로 추가적 측정이 가능하다.

   도식화를 해보면 생각보다 원리를 금방 알수가 있는데 도식화를 안하고 대가리 속으로 생각을 하다보면,
   쓸데없는 방향으로 문제의 흐름을 잡기 때문에 어렵게 느껴질수 있다.

*/

//var n = 0
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    arr.sort()
//
//    var answer = 1
//    for (i in 0 until arr.size) {
//        val w = arr[i]
//        if (answer >= w) {
//            answer += w
//        } else {
//            break
//        }
//    }
//
//    println(answer)
//    return@with Unit
//}