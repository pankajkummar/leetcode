package util;

public class AdjancyMatrix {
    public int[][] createGraph(int n, int[][] edges){
        int[][] graph = new int[n][n];
        for(int[] edge:edges){
            int row = edge[0];
            int col = edge[1];
            graph[row][col]=1;
            graph[col][row]=1;
        }
        return graph;
    }

}
