fun main() {


    val set = mutableSetOf(
        mutableListOf(1, 2, 3),
        mutableListOf(1, 2, 4)
    )

    println(set)
    set.add(mutableListOf(1, 4, 2))

    println(set)
}


