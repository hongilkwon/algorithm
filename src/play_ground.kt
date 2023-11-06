/*
 Function definition
 a, b parameters

*/
fun add(a: Int, b: Int): Int {
    val c = a + b
    return c
}

// main 함수 - 프로그램 시작의 진입점
fun main() {
    val set = mutableSetOf<MutableList<Int>>()
    set.add(mutableListOf(1, 2, 3))
    set.add(mutableListOf(1, 2, 3))

    println(set)
}


