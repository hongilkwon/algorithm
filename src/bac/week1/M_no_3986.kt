package bac.week1

/*

좋은단어
1-M

직접 예제를 보면서 그림을 그려서 문제를 이해한다.
직접 그리다 보면, 좋은단어란 짝을 이뤄야 하는데,
새로운 문자가 기존의 좋은 단어 규칙을 꺠지않고 "짝"을 이뤄야한다.

새로운 문자가 전체를 좋은단어로 만들기 위해서는 반드시 가장 "마지막에서 가까운 단어랑 짝을 이뤄야됨"
-> stack


kotlin - java.util.Stack 을 그대로 사용함.
Collection.isNotEmpty()를 반드시 검사하고 로직을 수행하는 습관을 지녀야 한다.

*/

//import java.util.Stack
//fun main() = with(System.`in`.bufferedReader()){
//
//    val testCase = readLine().toInt()
//    var cnt = 0
//
//    for(n in 1..testCase){
//
//        val word =readLine().toString().toCharArray()
//        val stack = Stack<Char>()
//
//        for (i in 0 until word.size){
//            if (stack.empty()){
//                stack.add(word[i])
//            }else{
//                if (stack.peek() == word[i]){
//                    stack.pop()
//                }else{
//                    stack.add(word[i])
//                }
//            }
//        }
//
//        if (stack.empty()){
//            cnt += 1
//        }
//    }
//    println(cnt)
//}