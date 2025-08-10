package BFSpack;

import Graph.Edge;
import java.util.*;

/*
BFS : 넓이 우선 탐색
 */

public class BFS {
    int N; //정점의 수
    List<Edge>[] graph;
    private boolean[] visited;

    public BFS(List<Edge>[] adjList) { //생성자
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = false; //배열 초기화
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) { //방문하지 않은 칸이면 bfs 탐색
                bfs(i);
            }
        }
    }

    private void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i); //큐에다 시작 정점 삽입
        while (!q.isEmpty()) {
            int j = q.remove(); //탐색하고 정점 j 꺼내기
            System.out.print(j + " ");
            for (Edge e : graph[j]) { //정점 j
                if(!visited[e.adjvertex]){
                    visited[e.adjvertex] = true;
                    q.add(e.adjvertex);
                }
            }
        }
    }
}
