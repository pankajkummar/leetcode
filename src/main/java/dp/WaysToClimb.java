package dp;

public class WaysToClimb {
    public static int findWays(int[] jumps, int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=0; i<n+1; i++){
            for(int j: jumps){
                if(i-j>=0){
                    dp[i] = dp[i] + dp[i-j];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=10;
        int[] jumps={2,4,5,8};
        System.out.println(findWays(jumps,n));
    }
}
