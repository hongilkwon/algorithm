package programmers.lv1

/*
    가장 가까운 글자

    1 ≤ s의 길이 ≤ 10,000
    s은 영어 소문자로만 이루어져 있습니다.

    * 이전 preIdx를 이용하는 문제이다.
 */


//fun solution(s: String): IntArray {
//
//    val idxMap = mutableMapOf<Char, Int>()
//
//    val arr = IntArray(s.length){ 0 }
//    for (i in 0 until s.length){
//        if (idxMap.containsKey(s[i])){
//            val preIdx = idxMap[s[i]]!!
//            idxMap[s[i]] = i
//            arr[i] = i - preIdx
//        }else{
//            idxMap[s[i]] = i
//            arr[i] = -1
//        }
//    }
//
//    return arr
//}