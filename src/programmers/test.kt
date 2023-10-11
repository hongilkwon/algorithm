package programmers




data class Process(val idx: Int, val priority: Int)

fun main() {

    val str ="hik님이 들어왔습니다."

    println(str.indexOf("님"))
    println(str.substring(0, str.indexOf("님")))


    println( str.replace("hik", "바보"))
}
