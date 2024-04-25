package bac.etc


/*
   ZOAC(완전탐색, 재귀, 문자열)

   문자열의 길이는 최대 100자

    1. 완전탐색
    일단 문자열의 길이가 길지 않다.

    2. 재귀함수
    - 규칙이 분명 재귀적인 성격을 띄고 있다는 것은 파악했지만, 구현력이 부족했음.


    예시) ST A RTLINK

     정해진 구간에서 "가장 작은 문자를 찾는다",
       *
     __A___I__

     가장 작은 문자를 기준으로, 사전순서로 가장 앞서기 위해서 왼쪽부터 추가해준다.
           *
     __A___I__
             *
     __A___I_K
     더 이상 왼쪽을 추가할 수 없다면, 오른쪽 구간에 추가해 준다.
*/


// 재귀적 풀이.
lateinit var str: CharArray
lateinit var isSelected: BooleanArray

val sb = StringBuilder()
fun go(left: Int, right: Int) {

    var c = 'Z' + 1
    var idx = -1
    for (i in left..right) {
        if (isSelected[i]) continue
        if (c > str[i]){
            c = str[i]
            idx = i
        }
    }
    // 더 이상 기준 문자열 보다 작은 문자가 없다면,
    if (idx == -1) return

    // 문자열 중복 사용을 방지.
    isSelected[idx] = true
    var temp = ""
    for (i in 0 until str.size){
        if (isSelected[i]) temp += str[i]
    }
    sb.append("$temp\n")

    // 왼쪽 구간
    go(idx + 1, right)
    // 오른쪽 구간
    go(left, idx - 1)
}

fun main() = with(System.`in`.bufferedReader()) {

    str = readLine().toString().toCharArray()

    isSelected = BooleanArray(str.size) { false }

    go(0, str.size - 1)
    println(sb.toString())

    return@with Unit
}