package DFSpack;

import Graph.Edge;
import java.util.*;

/*
DFS : 깊이 우선 탐색
 */

public class DFS {
    int N; //그래프 정점의 수
    List<Edge>[] graph;
    private boolean[] visited; //DFS 수행 중 방문한 정점 ture로

    public DFS(List<Edge>[] adjList) { //생성자
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited [i] = false;
        } for (int i = 0; i < N; i++) {
            if(!visited[i]){
                dfs(i); //여기서 첫 dfs 를 호출하고 재귀함수로 인접, 인접, 인접, 탐색
            }
        }
    }

    public void dfs(int i){
        visited[i] = true;
        System.out.print(i+" ");
        for(Edge e: graph[i]){
            if(!visited[e.adjvertex]){
                dfs(e.adjvertex);
            }
        }
    }
}
