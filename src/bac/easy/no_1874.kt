package bac.easy

/*
    스택 수열

     n (1 ≤ n ≤ 100,000)
     1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
     push하는 순서는 "반드시 오름차순"을 지키도록 한다고 하자

     원본 + "어떤 스택의 명령어" -> 왜곡된 스택과 비교

    4
    3
    6
    8
    7
    5
    2
    1

    8
    7
    6     4, 3, 6, 8 7 5 2 1
    5
    2
    1

    문제를 조금더 이해하고, 규칙을 찾는 편이 좋지 않았나 싶다.
    스택문제는 짝맞추는 경우가 아니면 조금 까다롭다.
 */


import java.util.*


var n = 0
lateinit var arr: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    arr = IntArray(n) {
        readLine().toInt()
    }

    var orignNum = 1
    val operators = mutableListOf<Char>()
    val s = Stack<Int>()

    for (i in 0 until arr.size) {

        while (orignNum <= arr[i]) {
            s.add(orignNum)
            operators.add('+')
            orignNum += 1
        }

        if (s.peek() == arr[i]){
            s.pop()
            operators.add('-')
        }else{
            println("NO")
            return@with
        }
    }
    operators.forEach { println(it) }
}