package dp;

import java.util.Arrays;

// find total number of paths to go from top of matrix to bottom of matrix
public class PathsInMatrix {
    public static int findPaths(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = 1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]!=1) {
                    dp[i][j] = (i > 0 ? dp[i-1][j] : 0 ) + (j > 0 ? dp[i][j-1] : 0);
                    dp[0][0]=1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,1,0,1},
                {0,0,0,0,1},
                {0,0,1,0,0},
                {1,0,0,0,0}
        };
        System.out.println(findPaths(matrix));
    }
}
