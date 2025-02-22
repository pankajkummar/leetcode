package graphTheory;

import util.AdjancyMatrix;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumEdges {
    public static List<Integer> findMinimumEdges(int n, int[][] edges, int start, int end){
        boolean[] visited = new boolean[n];
        int[][] graph = AdjancyMatrix.createUndirectedGraph(n,edges);
        HashMap<Integer,Integer> prev = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> nodes = new LinkedList<>();
        queue.add(start);
        prev.put(start, start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(!visited[node]){
                visited[node]=true;
                for(int i=0; i<n; i++){
                    if(graph[node][i]==1){
                        if(!visited[i]){
                            queue.add(i);
                            if(!prev.containsKey(i)) {
                                prev.put(i, node);
                            }
                        }
                    }
                }
            }
        }
        int node = end;
        nodes.add(end);
        for(int i=0; i<n; i++){
            System.out.println(node);
            if(node==start)
            {
                break;
            }
            node = prev.get(node);
            nodes.add(node);

        }
    return nodes;
    }

    public static void main(String[] args) {
        int n=6;
        int[][] edges = {{0,1},{0,2},{0,3},{1,2},{1,4},{2,4},{3,4},{3,5},{4,5}};
        int start =0;
        int end = 5;
        findMinimumEdges(n,edges,start,end);

    }
}
