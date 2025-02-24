package graphTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Applicable for Directed Acyclic Graph
// Algo 1 use Dfs
// used for tasks which has dependencies
// Can be used to find cycle in graph
public class TopologicalSortDFS {
    public static void topologicalSortDFS(int node, List<List<Integer>> graph, boolean[] visited, Stack<Integer> stack){
        visited[node] = true;
        for(int neighbor: graph.get(node)){
            if(!visited[neighbor]){
                topologicalSortDFS(neighbor,graph,visited,stack);
            }
        }
        stack.push(node);
    }
    public static List<Integer> topologicalSort(int n, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
        }
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(!visited[i]){
                topologicalSortDFS(i,graph,visited,stack);
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = { {5, 0}, {5, 2}, {4, 0}, {4, 1}, {2, 3}, {3, 1} };
        int n = 6;
        System.out.println("Topological Sort (DFS): " + topologicalSort(n, edges));
    }
}
