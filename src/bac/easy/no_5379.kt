package bac.easy

/*
   키로거(ArrayList vs LinkedList)

   키로거는 사용자가 키보드를 누른 명령을 모두 기록
   강산이는 키보드로 입력한 키는 알파벳 대문자, 소문자, 숫자, 백스페이스, 화살표이다.

   길이가 L인 문자열이 주어진다. (1 ≤ L ≤ 1,000,000)

   강산이가 백스페이스를 입력했다면, '-'가 주어진다.
   이때 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다. 화살표의 입력은 '<'와 '>'로 주어진다
   만약 커서의 위치가 줄의 마지막이 아니라면, 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동

ArrayList
    시간복잡도
    add             : O(1)
    remove          : O(n)
    get             : O(1)
    Contains        : O(n)
    *iterator.remove : O(n)
    java 1.2에 추가, thread-safe 보장 안함
     특징 :  데이터 추가,삭제를 위해 임시 배열을 생성해 데이터를 복사
       - 대량의 자료를 추가/삭제시 복사가 일어 나게 되어 성능 저하를 일이킴
       - 데이터의 인덱스를 가지고 있어 데이터 검색시 빠름

LinkedList
    시간복잡도
    add             : O(1)
    remove          : O(1)
    get             : O(n)
    Contains        : O(n)
    *iterator.remove : O(1)
    java 1.2에 추가, thread-safe 보장 안함
    특징 : 데이터를 저장하는 각 노드가 이전 노드와 다음 노드의 상태만 알고 있다.
       - 데이터 추가/삭제시 빠름
       - 데이터 검색시 처음부터 노드를 순화해야 되기 때문에 느림
*/


//import java.util.LinkedList
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//
//        val str = readLine()
//
//        val list = LinkedList<Char>()
//        val cursor = list.listIterator()
//
//        for (i in 0 until str.length) {
//            val c = str[i]
//
//            if (c == '<') {
//                if (cursor.hasPrevious()){
//                    cursor.previous()
//                }
//            } else if (c == '>') {
//                if (cursor.hasNext()){
//                    cursor.next()
//                }
//            } else if (c == '-') {
//                if (cursor.hasPrevious()){
//                    cursor.previous()
//                    cursor.remove()
//                }
//            } else {
//                cursor.add(str[i])
//            }
//        }
//
//        val sb = StringBuilder()
//        for (i in list) {
//            sb.append(i)
//        }
//        println(sb.toString())
//    }
//    return@with Unit
//}


//import java.util.LinkedList
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//
//        val str = readLine()
//
//        var cursor = 0
//        val list = LinkedList<Char>()
//
//        for (i in 0 until str.length) {
//            val c = str[i]
//
//            if (c == '<') {
//                if (cursor > 0) {
//                    cursor -= 1
//                }
//            } else if (c == '>') {
//                if (cursor < list.size) {
//                    cursor += 1
//                }
//            } else if (c == '-') {
//                if (cursor > 0) {
//                    cursor -= 1
//                    list.removeAt(cursor)
//                }
//            } else {
//                list.add(cursor, str[i])
//                cursor += 1
//            }
////            println("c: $c cursor: $cursor")
////            println(list.joinToString(" "))
////            println("------------------------------")
//        }
//
//        val sb = StringBuilder()
//        for (i in list) {
//            sb.append(i)
//        }
//        println(sb.toString())
//    }
//    return@with Unit
//}