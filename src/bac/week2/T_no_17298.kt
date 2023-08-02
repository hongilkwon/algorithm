package bac.week2


/*
    오큰수

     N (1 ≤ N ≤ 1,000,000)

     완전탐색으로 풀 수 없는 문제이다.
     100만*100만

     오큰수가 결정되는 순간을 이해해야된다.
     결정되는 순간에만 반복문을 실행하여 O(N^2) 보다 시간복잡도를 줄인다.

     * 결과만을 담을 자료구조를 선언한다.
     스택을 통한 해결을 떠올리기 쉽지 않다.

     * 수열/배열의 들어오는 순서대로 무언가 처리 하면서, 반복을 줄여야한다면,
     스택또는 우선순위큐 등을 생각해보자.

     Stack 시간복잡도

     삽입(Push/Add): 최상위에 데이터를 넣으면 되기 때문에 O(1)
     삭제(Pop): 최상위에 데이터를 삭제하면 되기 때문에 O(1)
     읽기(Peek): 최상위에 데이터를 읽으면 되기 때문에 O(1)
     탐색(Search):  데이터부터 하나씩 찾아야 하기 때문에 O(N)

 */

//import java.util.Stack
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    val result = IntArray(n) { -1 }
//    val stack = Stack<Int>()
//
//    for (i in 0 until arr.size) {
//        while (stack.isNotEmpty() && arr[stack.peek()] < arr[i]) {
//            result[stack.peek()] = arr[i]
//            stack.pop()
//        }
//        stack.add(i)
//    }
//
//    val sb = StringBuilder()
//    result.forEach {
//        sb.append("$it ")
//    }
//    println(sb.toString())
//}