package dp;

import java.util.Arrays;
import java.util.HashMap;

public class coinChangeProblem {
    public static int minimumCoins(int amount, int[] coins){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1; i<amount+1; i++){
            for(int coin: coins){
                if((i-coin)>=0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }
    }

    public static void main(String[] args) {
        int[] coins = {2,3,7};
        int amount = 200;
        System.out.println(minimumCoins(amount,coins));
    }
}
