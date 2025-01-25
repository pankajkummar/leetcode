package dp;

public class MaxSubsequence {
    public static int maxSubsequence(String s1, String s2){
        int row = s1.length()+1;
        int col = s2.length()+1;
        int[][] dp = new int[row][col];
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        String s1="abdacbab";
        String s2="acebfca";
        System.out.println(maxSubsequence(s1,s2));
    }
}
