package dp;

import java.util.Arrays;
import java.util.Stack;

public class ShortestCommonSupersequence {
    public static int findSuperSequence(String s1, String s2){
         int row = s1.length()+1;
         int col = s2.length()+1;
         int[][] dp = new int[row][col];
         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 if(i>0 && j>0) {
                     if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                         dp[i][j] = dp[i - 1][j - 1] + 1;
                     } else {
                         dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                     }
                 }else{
                     dp[i][j]=i+j;
                 }
             }
         }
        System.out.println(Arrays.deepToString(dp));
         return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        String s1="abdacbab";
        String s2="acebfca";
        System.out.println(findSuperSequence(s1,s2));
    }
}
