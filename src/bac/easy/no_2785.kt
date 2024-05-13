package bac.easy


/*
   체인(아이디어, )

   희원이는 가능한 한 적은 고리를 열고 닫아서, 모든 체인을 하나의 긴 체인으로 연결

   체인의 개수 N (2 ≤ N ≤ 500_000)

    Li(1 ≤ Li ≤ 1_000_000)

    사고과정.

    예제 자체가 이해가 쉽지 않음.
    체인의 길이가 1개라면 열어서 동시에 2개를 연결할 수있음.

    이상한 강박관념에 사로잡혀 체인을 꼭 순서대로 연결해야된다고 생각함....

    4 "3" 5 7 9
    3개짜리 체인을 모두 풀어서 연결한다.
    그럼 3번만에 가능하다.

    그러면 어떤 체인을 풀어서 1개짜리 고리들을 만들어 여닫는 횟수를 줄여야 하나...
    만약 4개짜리 체인을 풀었다면.... 1개가 남아서 여닫는 횟수가 4개가 된다.
    ---> "가장 작게 연결된 체인을 풀어야됨".

    가장 작은 체인을 모두 1개의 체인으로 써도 모두 연결이 안된다면?? 그때 4개짜리 체인에서 1개씩 풀어나간다.

    즉.  4 "3" 5 7 9

    3 4 5 7 9
    2 4 5 16
    1 4 21
    0 25

    3 4 5 7 9 10
    2 4 5 7 19
    1 4 5 26
    0 4 31
      35
  */

//var n = 0
//lateinit var chains: MutableList<Int>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    chains= readLine().split(" ").map { it.toInt() }.toMutableList()
//    chains.sort()
//
//    var cnt = 0
//    while (true){
//
//        if(chains.size == 1)
//            break
//
//        chains[chains.lastIndex-1] += chains[chains.lastIndex]
//        chains.removeLast()
//
//        cnt += 1
//        chains[0] -= 1
//
//        if (chains[0] == 0)
//            chains.removeFirst()
//    }
//
//    println(cnt)
//
//    return@with Unit
//}