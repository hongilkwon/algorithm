package bac.week2.concept

/**
 * graph
 * 정점(Vertex) 과 간선(Edge)으로 이루어진 자료구조.
 * degree - 1개의 Vertex 에 연결된 Edge 의 개수
 *
 *
 * tree
 * 순환(cycle)이 없는 무방향 graph/ 순환(cycle)이 없는 방향 graph
 * graph 한 종류로 순환이 없다는 것이 가장 큰 특징이다.
 *
 * 레벨(level) - root node를 0level 기준으로 떨어진 정도
 * 높이(high) -  tree 전체에서 가장 높은 level
 * 깊이(depth) - 레벨과 동의어
 * 서브트리 - 트리의 부분집합.
 *
 * 이진트리
 * 자식의 노드 수가 2개 이하인 트리
 *
 * 이진탐색트리
 * 노드의 오른쪽 하위 트리에는 "노드의 값보다 큰 값"이 있는 노드만 포함되고 왼쪽 하위트리에는 "노드의 값보다 작은값"이 들어있는 트리
 *
 * 연결된 컴포넌트
 * 연결되어있는 정점과 간선의 집합
 * floodFill 알고리즘을 통해 연결됨 컴포넌트 집합의 개수를 세는 문제가 출제된다.
 *
 * 그래프를 code 로 표한하는 방법(인접행렬, 인접리스트)
 *
 * 인접행렬
 * 인접행렬이란 그래프에서 정점과 간선의 관계를 나타내는 정사각형 행렬
 * 보통 boolean/int 2차원행렬을 사용한다.
 * 예를 들어 2차원배열 a[1004][1004]가 정의되어있을 때 a[1][3] = 1이라는 뜻은 1로부터 3까지 가는 경로가 있다는 의미를 말하며
 * a[1][2] = 0이라면 1로부터 2까지 가는 경로가 없다는 것을 의미합니다.
 *
 * 시간복잡도는 O(V^2), 공간복잡도 또한 O(V^2)입니다.
 * val rows = 14
 * val cols = 14
 * val arr = Array(rows) { IntArray(cols) }
 */

/**
 * 인접리스트
 * 인접 리스트(adjacency list)는 특정 정점에서 다른 정점들과 연결된 정점을 리스트를 통해 표현하는 것
 * 예를 들어 정점1이 정점 3,4,5와 간선을 통해 연결되어 있다면,
 *
 *  val adjList = MutableList(vNum){mutableListOf<Int>()}
 *  adjList[1] = mutableListOf(1,3,4,5)
 *
 *  for (i in 0 until adjList.size){
 *      for ( element in adjList[i]){
 *      }
 *  }
 *
 * 인접리스트는 시간복잡도는 O(V + E), 공간복잡도 또한 O(V + E)입니다.
 * 둘 중 어떤 것을 써야 할까요?
 * 보통 인접리스트로 할 생각을 하고 문제에서 만약에 인접행렬로 주어졌다면 인접행렬로 푸는 것이 좋다.
 */
