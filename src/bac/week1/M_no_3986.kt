package bac.week1

import java.util.Stack

/*

좋은단어
1-M

새로운 원소가 "짝"을 이뤄야한다.
마지막 참조를 필요로한다
-> stack

*/

fun main() = with(System.`in`.bufferedReader()){

    val testCase = readLine().toInt()
    var cnt = 0

    for(n in 1..testCase){

        val word =readLine().toString().toCharArray()
        val stack = Stack<Char>()

        for (i in 0 until word.size){
            if (stack.empty()){
                stack.add(word[i])
            }else{
                if (stack.peek() == word[i]){
                    stack.pop()
                }else{
                    stack.add(word[i])
                }
            }
        }

        if (stack.empty()){
            cnt += 1
        }
    }
    println(cnt)
}