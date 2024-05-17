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

    val p1 = Person("1",1)
    val p2 = Person("2",1)
    val p3 = Person("3",1)

    val arr = arrayOf(
        Person("1",1),
        Person("10",10),
        Person("4",4),
        Person("17",17),
        Person("8",8)
    )

    arr.sortWith(cmp)
    println(arr.joinToString(" "))
}


