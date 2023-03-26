package bac.week5.concept

/*
 회의실 배정

 10만*10만 -> 100억

 2중 반복문 사용하면 안됨.

 도식화 -> 회의 종료 시간으로 정렬.

 이후 최적해(그리디)로 조짐.
 주어진 시간들을 종료시간으로 정렬한 뒤, 훑으면서 현재까지 진행한 회의 시각 <= 다음 회의의 시작 시간 이면 update 및 count 를 올려주는 것

 종료시간으로 정렬할때, 같다면 시작시간이 빠른순으로 정렬?

 이 문제에서는 시작시간과 종료시간이 같은 회의가 존재합니다. 예를 들어, 2 3/3 3 이 입력으로 들어왔다고 하면 두 회의 모두 진행할 수 있습니다.
 이 때, 시작 시간이 늦은 순으로 정렬하면 3 3 -> 2 3 으로 확인하기 때문에 2 3은 불가능하다고 판단합니다.
 반면, 시작 시간이 빠른 순으로 정렬하면 2 3 -> 3 3 으로 확인하기 때문에 시작시간과 종료시간이 같을 때를 체크해 줄 수 있습니다.

 */


//var bac.week5.concept.getN = 0
//var answer = 1
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    bac.week5.concept.getN = readLine().toInt()
//
//    val arr = Array(bac.week5.concept.getN) {
//        val info = readLine().split(" ").map { it.toInt() }
//        info[0] to info[1]
//    }
//
//    val times = arr.sortedWith(comparator = compareBy({it.second}, {it.first}))
////    println(times.joinToString(" "))
//    var start = times[0].first
//    var end = times[0].second
//
//    for (i in 1 until bac.week5.concept.getN){
//        if (times[i].first < end) continue
//        start = times[i].first
//        end = times[i].second
//        answer += 1
//    }
//    println(answer)
//}