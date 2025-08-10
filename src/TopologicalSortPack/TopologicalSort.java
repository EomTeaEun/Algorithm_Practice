package TopologicalSortPack;

import java.util.*;

import Graph.Edge;
import DFSpack.DFS;

/*
위상정렬 : 사이클이 없는 방향 그래프에서 정점을 선형순서로 나열하는 것
<u,v> 라면 u -> v 순서가 꼭 되어야 함

1. 순방향 방법 : 진입 차수가 0인 정점부터 출력, 삭제 반복
2. 역방향 방법 : 진출 차수가 0인 정점부터 출력. 삭제 반복 후 얻은 리스트를 역순으로 만듦

 */

public class TopologicalSort {
    int N; //그래프 정점의 수
    boolean[] visited; //DFS 수행 중 방문 여부 체크
    List<Integer>[] adjList; //인접 리스트 형태의 입력 그래프
    List<Integer> sequence; //위상 정렬 순서를 담을 리스트

    public TopologicalSort(List<Integer>[] graph) {
        N = graph.length;
        visited = new boolean[N];
        adjList = graph;
        sequence = new ArrayList<>();
    }

    public List<Integer> tsort() {
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }

    public void dfs(int i) {
        visited[i] = true;
        for (int v : adjList[i]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
        sequence.add(i);
    }
}
