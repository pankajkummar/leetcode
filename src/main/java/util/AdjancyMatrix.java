package util;

public class AdjancyMatrix {


    public static int[][] createUndirectedGraph(int n, int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] edge:edges){
            int row = edge[0];
            int col = edge[1];
            graph[row][col]=1;
            graph[col][row]=1;
        }
        return graph;
    }
    public static int[][] createDirectedGraph(int n, int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] edge:edges){
            int row = edge[0];
            int col = edge[1];
            graph[row][col]=1;
        }
        return graph;
    }
    public static int[][] createUndirectedWeightedGraph(int n, int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] edge:edges){
            int row = edge[0];
            int col = edge[1];
            graph[row][col]=edge[2];
            graph[col][row]=edge[2];
        }
        return graph;
    }
    public static int[][] createDirectedWeightedGraph(int n, int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] edge:edges){
            int row = edge[0];
            int col = edge[1];
            graph[row][col]=edge[2];
        }
        return graph;
    }

}
