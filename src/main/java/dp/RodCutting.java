package dp;

import java.util.Arrays;

public class RodCutting {
    public static int findMaxProfit(int[] prices, int n){
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            for(int length=1; length<=i;length++){
                dp[i]=Math.max(dp[i],prices[length]+dp[i-length]);

            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n=8;
        int[] prices = {0,1,3,5,6,7,9,10,11};
        System.out.println(findMaxProfit(prices, n));
    }
}
