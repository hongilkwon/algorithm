import java.util.*

/*
    play_ground
 */


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
    println(Int.MIN_VALUE)
    println(Double.MIN_VALUE < 0)
}


