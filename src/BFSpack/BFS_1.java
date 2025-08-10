package BFSpack;

import java.util.*;

import DFSpack.DFS;
import Graph.Edge;

public class BFS_1 {

    public static void main(String[] args) {
        int N = 10; // 정점 개수
        List<Edge>[] adjList = new List[N];

        // 인접 리스트 초기화
        for (int i = 0; i < N; i++) {
            adjList[i] = new LinkedList<>();
        }

        // 간선 정보 추가 (방향 그래프)
        adjList[0].add(new Edge(2));
        adjList[0].add(new Edge(1));
        adjList[1].add(new Edge(3));
        adjList[1].add(new Edge(0));
        adjList[2].add(new Edge(3));
        adjList[2].add(new Edge(0));
        adjList[3].add(new Edge(9));
        adjList[3].add(new Edge(8));
        adjList[3].add(new Edge(2));
        adjList[3].add(new Edge(1));
        adjList[4].add(new Edge(5));
        adjList[5].add(new Edge(7));
        adjList[5].add(new Edge(6));
        adjList[5].add(new Edge(4));
        adjList[6].add(new Edge(7));
        adjList[6].add(new Edge(5));
        adjList[7].add(new Edge(6));
        adjList[7].add(new Edge(5));
        adjList[8].add(new Edge(3));
        adjList[9].add(new Edge(3));

        // BFS 수행
        BFS bfs = new BFS(adjList);  // 생성자에서 자동으로 수행
    }
}
