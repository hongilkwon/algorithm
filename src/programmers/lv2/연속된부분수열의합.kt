package programmers.lv2



/*

 1. 기존 수열에서 임의의 두 인덱스의 원소와 그 사이의 원소를 모두 포함하는 부분 수열 (연속된)
 2. 부분 수열의 합은 k
 3. 합이 k인 부분 수열이 여러 개인 경우 길이가 짧은 수열
 4. 길이가 짧은 수열이 여러 개인 경우 앞쪽(시작 인덱스가 작은)에 나오는 수열

 5 ≤ sequence 길이 ≤ 1,000,000
 1 ≤ sequence 원소 ≤ 1,000

 sequence 비내림차순으로 정렬되어 있습니다.
 5 ≤ k ≤ 1,000,000,000

 k는 항상 sequence 부분 수열로 만들 수 있는 값입니다.

 원소의 개수가 100만개 -> 2중 반복문을 사용하면 안된다.

 1번 순회로 2개의 인덱스를 사용하여 해결한다.(투포인터)


 */

//fun solution(sequence: IntArray, k: Int): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    val sequenceList = mutableListOf<Pair<Int, Int>>()
//
//    var left = 0
//    var sum = 0
//
//    for (right in 0 until sequence.size){
//        sum += sequence[right]
//        while(sum > k) {
//            sum -= sequence[left]
//            left++
//        }
//        if(sum == k) {
//            sequenceList.add(left to right)
//        }
//    }
//
//    val comp = compareBy<Pair<Int, Int>> {it.second - it.first}.thenBy { it.first }
//    sequenceList.sortWith(comp)
//
//    answer = intArrayOf(sequenceList.first().first, sequenceList.first().second)
//    return answer
//}
