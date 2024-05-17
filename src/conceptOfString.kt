/*
    자주 사용하는 kotlin 문자열 함수및 코드를 정리한다.

    1. String 반복할때, length를 이용한다.

    2.
     isBlank() -> 실제 글자가 없이 "   "
     isEmpty() -> ""

    3. indexOf() 일치 하는 문자의 idx 반환
    indexOf() 일치 하는 문자의 앞선 idx 반환
    indexOfFirst{ } 람다 조건에 일치 하는 앞선 idx 반환
    indexOfLast{ } 람다 조건에 일치 하는 앞선 idx 반환

    4. split() 해당 문자/문자열 기준으로 쪼갠 List<String> 반환

    5. subString(startIdx, endIdx) (startIdx <=  <endIdx) 잘라낸 새로운 스트링 반환.

    6. replace(old, new) 교체한 새로운 문자열 반환.

    7. lowercase(), uppercase(), reversed() 뒤집은 새로운 문자열 반환

    8. trim() 문자열의 앞뒤 공백(whitespace)을 삭제하고 새로운 문자열 반환.

    * 문자열로 정수형을 비교할때 자릿수 먼저 비교하고 실제 정수값을 비교해야된다.

 */


//val cmp = Comparator<String> { o1, o2 ->
//    return@Comparator if (o1.length > o2.length) {
//        1
//    } else if (o1.length < o2.length) {
//        -1
//    } else {
//        o1.compareTo(o2)
//    }
//}

//val cmp = object : Comparator<String>{
//    override fun compare(o1: String?, o2: String?): Int {
//
//    }
//}

//fun main() {
//    val arr = arrayOf("4", "23", "1", "9", "234", "728", "97")
//
//    println(arr.sortedArray().joinToString(" "))
//    println(arr.sortedWith(comparator = cmp).joinToString(" "))
//}
