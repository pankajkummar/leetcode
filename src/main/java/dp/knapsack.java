package dp;

import java.util.Arrays;

public class knapsack {
    public static int getKnapsack(int[] values, int[] weights, int k){
        int[][] dp = new int[weights.length][k+1];
        for (int j = 0; j <= k; j++) {
            dp[0][j] = (weights[0] <= j) ? values[0] : 0;
        }

        for(int i=1; i<weights.length;i++){
            for(int j=0; j<k+1; j++){
                if(weights[i]<=j ){
                    dp[i][j]=Math.max(values[i]+ dp[i-1][j-weights[i]], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[weights.length-1][k];
    }

    public static void main(String[] args) {
        int[] values = {20,30,15,25,10};
        int[] weights = {6,13,5,10,3};
        int k=20;
        System.out.println(getKnapsack(values,weights,k));
    }

}
