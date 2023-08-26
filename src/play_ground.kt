
import java.util.*
import kotlin.Comparator

//val comp = Comparator<String> { o1, o2 ->
//
//    if (o1.length > o2.length) {
//        for (i in 0 until o2.length) {
//            if (o1[i] > o2[i]) return@Comparator 1 else if (o1[i] < o2[i]) return@Comparator -1
//        }
//        for (i in o2.length until o1.length) {
//            if (o1[i] > o2[0]) return@Comparator 1 else if (o1[i] < o2[0]) return@Comparator -1
//        }
//        return@Comparator 0
//
//    } else if (o1.length < o2.length) {
//        for (i in 0 until o1.length) {
//            if (o1[i] > o2[i]) return@Comparator 1 else if (o1[i] < o2[i]) return@Comparator -1
//        }
//        for (i in o1.length until o2.length) {
//            if (o1[0] > o2[i]) return@Comparator 1 else if (o1[0] < o2[i]) return@Comparator -1
//        }
//        return@Comparator 0
//    } else {
//        return@Comparator if (o1 > o2) 1 else if (o2 > o1) -1 else 0
//    }
//}

val comp = Comparator<String> { o1, o2 ->
    return@Comparator if (o1 > o2) 1 else if (o2 > o1) -1 else 0
}

fun main() {

    val temp = mutableListOf(
        "1293",
        "3",
        "9",
        "456",
        "94785",
        "1123",
        "56785",
    )

    temp.sortWith(programmers.lv2.comp)
    println(temp.joinToString(" "))

}
