package recursive

fun fibo(n: Int): Int{
    if (n==0 || n==1) return 1
    return fibo(n-1) + fibo(n-2)
}

fun main() {
    println(fibo(9))
}