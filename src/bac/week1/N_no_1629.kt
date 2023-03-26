package bac.week1

/*
곱셈
1-N

재귀를 통한 분할 정복.
모듈러 연산.
재귀호출 이후 어떤 추가적 로직이 필요한 경우 반드시 반환값이 존재해야한다.

*/

fun main() = with(System.`in`.bufferedReader()){

//    val info = readLine().split(" ").map { it.toLong() }
//    var a = info[0]
//    val b = info[1]
//    val c = info[2]
    println(go(10,11,12))
}

fun go(a: Long, b: Long, c:Long): Long{

    // 종료 조건.
    println("current B: $b")
    if (b==1L) return a % c

    //결과 저장.
    var result = go(a, b/2, c)

    // 모듈러 연산 (a*b) mod c = ((a mod c) * (b mod c)) * mod c
    result = (result * result) % c

    // 홀수인경우 한번 더 곱셉이 필요함.
    if ((b % 2L) != 0L){
        result = (result*a) % c
    }

    return result
}