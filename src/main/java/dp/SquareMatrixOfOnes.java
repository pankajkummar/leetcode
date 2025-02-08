package dp;

import java.util.Arrays;

public class SquareMatrixOfOnes {
    public static int findMaxArea(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max=Integer.MIN_VALUE;
        int[][] dp= new int[rows][cols];
        for(int i=0; i<rows; i++){
            dp[i][0]=matrix[i][0];
        }
        for(int j=0; j<cols; j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                dp[i][j]= matrix[i][j]==0? 0: 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return max*max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,1,1,1,0},
                {1,0,1,1,1,1},
                {0,1,1,1,1,0},
                {1,1,1,1,0,1},
                {0,1,0,1,1,1}
        };
        System.out.println(findMaxArea(matrix));
    }

}
