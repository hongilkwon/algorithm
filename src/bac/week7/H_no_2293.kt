package bac.week7


/*
    동전 1

    n가지 종류의 동전이 있다.
    이 동전들을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다.
    동전의 개수가 최소

    사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
     (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000)

    상향식방법
    메모이제이션

 */


var n = 0
var k = 0

lateinit var coins: Array<Int>

val case = Array(10_001) { 0 }
fun main() = with(System.`in`.bufferedReader()) {
    val info = readLine().split(" ").map { it.toInt() }
    n = info[0]
    k = info[1]
    coins = Array(n) {
        readLine().toInt()
    }

    case[0] = 1
    for (i in 0 until n ){
        val coin = coins[i]
        for(j in coin .. k){
            case[j] += case[j - coin]
        }
    }
    println(case[k])
    Unit
}