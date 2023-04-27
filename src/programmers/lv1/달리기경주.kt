package programmers.lv1

/*
  바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다

  5 ≤ players의 길이 ≤ 50,000
  players[i]는 i번째 선수의 이름을 의미합니다.
  players 원소들은 알파벳 소문자로만 이루어져 있습니다.
  players에는 중복된 값이 들어가 있지 않습니다.

  3 ≤ players[i]의 길이 ≤ 10

  2 ≤ callings의 길이 ≤ 1,000,000
  callings players의 원소들로만 이루어져 있습니다.
  경주 진행중 1등인 선수의 이름은 불리지 않습니다.

   50,000 * 1,000,000
   50,000,000,000,

   2준 반복문안됨.

   2개의 맵을 이용하여 해결.
   * 맵 정렬.


 */


//fun solution(players: Array<String>, callings: Array<String>): Array<String> {
//
//    val playersMapName = mutableMapOf<String, Int>()
//    val playersMapRank = mutableMapOf<Int, String>()
//
//    players.forEachIndexed { index, s ->
//        playersMapName[s] = index
//    }
//    players.forEachIndexed { index, s ->
//        playersMapRank[index] = s
//    }
//
//    for (i in 0 until callings.size) {
//
//        val rank = playersMapName[callings[i]]!!
//        val prevPlayer = playersMapRank[rank - 1]!!
//
//        playersMapName[prevPlayer] = rank
//        playersMapRank[rank] = prevPlayer
//
//        playersMapName[callings[i]] = rank - 1
//        playersMapRank[rank - 1] = callings[i]
//    }
//
//    val answer = Array<String>(players.size) { " " }
//    playersMapRank.entries.sortedBy { it.key }.forEach {
//        answer[it.key] = it.value
//    }
//
//    return answer
//}
//
//fun main() {
//    println(
//        solution(
//            arrayOf("mumu", "soe", "poe", "kai", "mine"),
//            arrayOf("kai", "kai", "mine", "mine")
//        ).joinToString(" ")
//    )
//}

