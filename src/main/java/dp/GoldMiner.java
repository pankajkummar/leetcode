package dp;

import java.util.Arrays;

public class GoldMiner {
    public static int findMaxGold(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i>0) {
                    dp[i][j] = matrix[i][j] + Math.max(( j>0 ? dp[i - 1][j-1] : 0), Math.max(dp[i - 1][j],(j<col-1)? dp[i-1][j+1]:0));
                }else{
                    dp[i][j] = matrix[i][j];
                }
            }
        }
        int maxGold = Integer.MIN_VALUE;
        for(int j=0;j<col;j++){
            if(dp[row-1][j]>maxGold){
                maxGold=dp[row-1][j];
            }
        }
        return maxGold;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3,2,12,15,10},
                {6,19,7,11,17},
                {8,5,12,32,21},
                {3,20,2,9,7}
        };
        System.out.println(findMaxGold(matrix));
    }
}
