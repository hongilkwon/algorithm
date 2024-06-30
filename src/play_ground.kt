
/*
    play_ground
 */

import java.util.*
import kotlin.math.*

data class Person(val name: String, var age: Int)

val cmp = Comparator<Person> { o1, o2 ->
    if (o1.age > o2.age) {
        -1
    } else if (o1.age < o2.age) {
        1
    } else {
        0
    }
}

fun main() {
    val temp = mutableListOf(10, 11, 12, 13, 14)

    println( temp.mapIndexed { index, v ->
        println("index : $index, v: $v")
        v+index
    })
}


