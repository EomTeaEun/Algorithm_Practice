package Graph;

import java.util.ArrayList;
import java.util.*;

public class Edge {
    public int adjvertex; // 간선의 다른 쪽 정점
    public Edge(int v) {
        adjvertex = v; //생성자
    }
}

/*

List <Edge> [] adjList = new List[N];
for (int i = 0; i<N; i++){
    adjList[i] = new Linked<>();
    for (int j = 0; j<N; j++){
        if(정점 i 와 j 사이에 간선이 존재하면) {
            Edge e = new Edge(j);
            adjList[i].add(e);
        }
    }
}

 */