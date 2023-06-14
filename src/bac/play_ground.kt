
fun main() {

    val arr = Array(10){ it }

    for (size in 2 until arr.size) {
        println("size: $size")
        for (i in 0 until arr.size - size) {
            print("$i ~ ${i+size}, ")
        }
        println()
    }

}