


/*
   피카츄

   1. pi ka chu
   7개 안에 알파벳에 존재 해야된다.
   2.

   3.
 */



fun main() = with(System.`in`.bufferedReader()) {

    var str = readLine().toCharArray()

    val cList = listOf('p', 'i', 'k', 'a', 'c', 'h', 'u')
    var pCnt = 0
    var kCnt = 0
    var cCnt = 0

    for (i in 0 until str.size) {

        if (str[i] !in cList) {
            println("NO")
            return@with
        }

        if (str[i] == 'p') {
            if (i + 1 >= str.size) {
                println("NO")
                return@with
            }
            if (str[i + 1] != 'i') {
                println("NO")
                return@with
            }
            pCnt += 1
        }

        if (str[i] == 'k') {
            if (i + 1 >= str.size) {
                println("NO")
                return@with
            }
            if (str[i + 1] != 'a') {
                println("NO")
                return@with
            }
            kCnt += 1
        }

        if (str[i] == 'c') {
            if (i + 1 >= str.size || i + 2 >= str.size) {
                println("NO")
                return@with
            }
            if (str[i + 1] != 'h') {
                println("NO")
                return@with
            }
            if (str[i + 2] != 'u') {
                println("NO")
                return@with
            }
            cCnt += 1
        }
    }
    val totalCnt = pCnt * 2 + kCnt * 2 + cCnt * 3

    if (totalCnt == str.size)
        println("YES")
    else
        println("NO")
    Unit
}