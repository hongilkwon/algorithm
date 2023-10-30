///*
//   오아시스 재결합.
//
//
//    1< n <50만
//
//    50만 * 50만
//    1초?
//    O(n^2) 풀수가 없다.
//
//    stack --> 쌍을 맞춤.
//    * 단순 일반 구현으로는 풀수가 없음
//
//    귀납적 사고 + 경우의수
//
//    현재까지 값 + 새로운 사람이 뒤에 섰을떄 새로 생길수있는 추가적 수
//
// */
//
//import java.util.Stack
//
//var n = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    val stack = Stack<Pair<Long, Long>>()
//    var total: Long = 0
//
//    for (i in 0 n) {
//        val num = readLine().toLong()
//
//        // 앞사람 보다 크거나 같은 사람.
//        var cnt: Long = 1
//
//        while (stack.isNotEmpty() && stack.peek().first <= num) {
//            if(stack.peek().first == num){
//                // 동일한 크기의 사람이 왔을때.
//                cnt = stack.peek().second + 1
//            }else{
//                // 나보다 큰 사람이 왔을떄.
//                cnt = 1
//            }
//            total += stack.peek().second
//            stack.pop()
//        }
//
//        // 앞사람 보다 작은 사람
//        if(stack.isNotEmpty()){
//            total += 1
//        }
//
//        stack.push(num to cnt)
//    }
//    println(total)
//    Unit
//}

