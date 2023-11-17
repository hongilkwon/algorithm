package bac.etc


/*
    이진 "검색" 트리

    이진 검색 트리를 전위 순회한 결과가 주어졌을 때, 이 트리를 후위 순회한 결과

    key 값 10^6보다 작은 양의 정수이다.
    노드의 수는 10,000개 이하

    전위 순회
    일단 노드 확인후
    왼쪽 -> 오른쪽 재귀탐색

    일단 이진트리 순회에 있어서

    전위 순회 및 후위 순회 만으로 트리를 단 1개로 확정지어 복원이 불가능하다.
    즉 full 이진트로 형태로만 복원이 가능하다.

    이 문제는 일단 트리를 복원하는 순간 시간초과가 나기도 하지만 트리를 복원하여 후위순회 한다고 그 순서를 알 수는 없다.

    전위순회 + 이진"탐색"트리

    전위 순회 결과는 [root, {root보다 작은 값들}, {root보다 큰 값들}] 꼴이기 때문에
    후위 순회 {root보다 작은 값들} -> {root보다 큰 값들} -> root 순서로 탐색을 진행

 */


//val preOrderResult = mutableListOf<Int>()
//
//fun postOrder(start: Int, end: Int) {
//
//    if (start > end)
//        return
//
//    val root = preOrderResult[start]
//    var left = start + 1
//    var right = end
//
//    while (left <= right) {
//        if (preOrderResult[left] > root)
//            break
//        left += 1
//    }
//
//    // {root보다 작은 값들}
//    postOrder(start + 1, left - 1)
//
//    // {root보다 큰 값들}
//    postOrder(left, end)
//
//    // root
//    println(root)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//        val num = (readLine() ?: break).toInt()
//        preOrderResult.add(num)
//    }
//    postOrder(0, preOrderResult.size-1)
////    println(preOrderResult.joinToString(" "))
//}