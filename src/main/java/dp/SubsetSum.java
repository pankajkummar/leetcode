package dp;

import java.util.Arrays;
// return number of set sum equals sum
public class SubsetSum {
    public int subsets(int[] set, int sum){
        int[][] dp = new int[set.length][sum+1];
        dp[0][0]=1;
        for(int j=1; j<sum+1; j++){
            if(set[0]-j>=0) {
                dp[0][j] = dp[0][set[0]-j];
            }
        }
        for(int i=1; i<set.length;i++){
            for(int j=0; j<sum+1; j++){
                dp[i][j]=dp[i-1][j]+ ((j-set[i]>=0)? dp[i-1][j-set[i]]:0);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[set.length-1][sum];
    }

    public static void main(String[] args) {
     int[] set = {1,2,3,1,4};
     int sum=6;
     //   System.out.println(subsets(set,sum));


    }
}
