package graphTheory;

import util.AdjancyMatrix;

import java.util.Stack;

public class PathExist {
    public boolean isPathExist(int n, int[][] edges, int start, int end){
        AdjancyMatrix adj = new AdjancyMatrix();
        int[][] graph = adj.createGraph(n, edges);
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while(!stack.empty()){
            int node = stack.pop();
            if(!visited[node]){
                visited[node]=true;
                System.out.println(node+" ");
                for(int neighbor : graph[node]){
                    if(!visited[neighbor]){
                        stack.push(neighbor);
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
        PathExist pt = new PathExist();
        System.out.println(pt.isPathExist(n, edges,start,end));

    }
}
