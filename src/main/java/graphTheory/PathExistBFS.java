package graphTheory;

import util.AdjancyMatrix;

import java.util.LinkedList;
import java.util.Queue;

public class PathExistBFS {
    public boolean isPathExist(int n, int[][] edges, int start, int end){
        AdjancyMatrix adj = new AdjancyMatrix();
        int[][] graph = adj.createUndirectedGraph(n,edges);
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(!visited[node]) {
                visited[node]=true;
                System.out.println(node+" ");
                for (int i = 0; i < n; i++) {
                    if (graph[node][i] == 1) {
                        if (!visited[i]) {
                            queue.add(i);
                        }
                    }
                }
            }
        }
    return visited[end];
    }

    public static void main(String[] args) {
        int n=9;

        int[][] edges = {{0,1},{0,2},{2,4},{3,5},{5,6},{5,7},{6,8}};
        int start=0;
        int end =6;
        PathExistBFS pt = new PathExistBFS();
        System.out.println(pt.isPathExist(n, edges,start,end));
    }
}
