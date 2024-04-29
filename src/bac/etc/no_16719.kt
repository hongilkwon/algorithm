package bac.etc


/*
   ZOAC(완전탐색, 재귀, 문자열)

   문자열의 길이는 최대 100자

    사고과정.

    1. 재귀함수
    - 사전순으로 빠르다 --> 아스키값( A-65, a-97 )이 가장 작다.
    - 규칙이 분명 재귀적인 성격을 띄고 있다는 것은 파악했지만, 구현력이 부족했음.


    예시) ST A RTLINK

       * -->
     __A______

     정해진 구간에서 "가장 작은 문자를 찾는다".
       *
     __A___I__

     가장 작은 문자를 기준으로, 사전순서로 가장 앞서기 위해서 왼쪽부터 추가해준다.
           *
     __A___I__
             *
     __A___I_K
             *
     __A___INK

           *
     __A__TINK

     더 이상 왼쪽을 추가할 수 없다면, 오른쪽 구간에 추가해 준다.
*/


//lateinit var str: CharArray
//lateinit var isSelected: BooleanArray
//
//val sb = StringBuilder()
//fun go(left: Int, right: Int) {
//
//    // 가장 작은 문자를 찾는 다.
//    var c = 'Z' + 1
//    var idx = -1
//    for (i in left..right) {
//        if (isSelected[i]) continue
//        if (c > str[i]){
//            c = str[i]
//            idx = i
//        }
//    }
//
//    // 더 이상 기준 문자열 보다 작은 문자가 없다면,
//    if (idx == -1) return
//
//    // 문자열 중복 사용을 방지.
//    isSelected[idx] = true
//    var temp = ""
//    for (i in 0 until str.size){
//        if (isSelected[i]) temp += str[i]
//    }
//    sb.append("$temp\n")
//
//    // 오른쪽 구간
//    go(idx + 1, right)
//    // 왼쪽 구간
//    go(left, idx - 1)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    str = readLine().toString().toCharArray()
//
//    isSelected = BooleanArray(str.size) { false }
//
//    go(0, str.size - 1)
//    println(sb.toString())
//    return@with Unit
//}