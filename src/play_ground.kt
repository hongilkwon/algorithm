import java.util.*

/*
    play_ground
 */


data class Person(val name: String, var age: Int)

fun main() {

    val arr = arrayOf(
        Person("1", 1),
        Person("2", 2),
        Person("3", 3),
    )

    val arr2 = arr.copyOf()
    arr2[0].age =10

    println(arr.joinToString(" "))

}


