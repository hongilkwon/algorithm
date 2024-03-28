/*
    play_ground
 */



fun main() {

    val a = "abcdefg"
    val b = a.slice(0 until 3)
    println(b)

    val arr = intArrayOf(1,2,30,4,5)
    val temp = arr.copyOfRange(0, 3)
    println(temp.joinToString(" "))
}


