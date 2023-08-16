package math


/*
    순열 nPr
    n개 중에 r개를 순서를 고려하여 뽑는 경우의 수
    n!/(n-r)!

    중복순열 n∏r = n^r
 */


//val permutationArr = arrayOf(
//    'a', 'b', 'c', 'd', 'e',
//    'f', 'g', 'h', 'i', 'j',
//    'k', 'l', 'm', 'n', 'o',
//)

//val permutationArr = arrayOf(
//    'a', 'b', 'c', 'd', 'e'
//)
//var isSelect = BooleanArray(permutationArr.size) { false }
//
//// result 항상 index 담아둔다.
//val permutationResult = mutableListOf<Int>()
//var permutationTotalCnt = 0
//
//fun permutation(n: Int, r: Int) {
//
//    // 카운트 숫자를 매개변수로 주어 뽑으려는 수까지 cnt를 세게되면 메서드 종료
//    if (permutationResult.size == r) {
//        /*
//            logic
//         */
//        permutationTotalCnt += 1
//        println(permutationResult.joinToString(" "))
//        return
//    }
//
//    //매번 재귀 마다 반복문 시작이 0부터 시작함.
//
//    for (i in 0 until n) {
//        // 중복 선택을 방지한다.
//        if (isSelect[i]) continue
//
//        permutationResult.add(i)
//        isSelect[i] = true
//
//        permutation(n = n, r = r)
//
//        permutationResult.removeLast()
//        isSelect[i] = false
//    }
//}
//fun main() {
//    permutation(n= permutationArr.size, r= 4)
//    println("PermutationTotalCnt: $permutationTotalCnt")
//}