package dp;

import java.util.Arrays;

public class InterleavingString {
    public static boolean isInterleavingPossible(String s1, String s2, String s3){
        int rows = s1.length()+1;
        int cols = s2.length()+1;
        boolean[][] dp = new boolean[rows][cols];
        dp[0][0]=true;
        for(int i=1; i<rows; i++){
            dp[i][0] = (s1.charAt(i-1)==s3.charAt(i-1)) & dp[i-1][0];
        }
        for(int j=1; j<cols; j++){
            dp[0][j] = (s2.charAt(j-1)==s3.charAt(j-1)) & dp[0][j-1];
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                boolean s1_check = (s1.charAt(i-1)==s3.charAt(i+j-1)) & dp[i-1][j];
                boolean s2_check = (s2.charAt(j-1)==s3.charAt(i+j-1)) & dp[i][j-1];
                dp[i][j] = s1_check | s2_check;
            }
        }
        System.out.println(Arrays.deepToString(dp));


        return false;
    }

    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        System.out.println(isInterleavingPossible(s1,s2,s3));
    }
}
