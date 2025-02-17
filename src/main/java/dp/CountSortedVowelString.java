package dp;

import util.PrintArray;

import java.util.Arrays;

public class CountSortedVowelString {
    public static int count(int n){
        int row = n;
        int col = 5;
        int[][] dp = new int[row][col];
      for(int i=0; i<col; i++){
          dp[0][i]=1;
      }
      for(int i=1; i<row; i++){
          dp[i][0]= dp[i-1][0]+dp[i-1][1]+dp[i-1][2]+dp[i-1][3]+dp[i-1][4];
          dp[i][1]= dp[i-1][1]+dp[i-1][2]+dp[i-1][3]+dp[i-1][4];
          dp[i][2]= dp[i-1][2]+dp[i-1][3]+dp[i-1][4];
          dp[i][3]= dp[i-1][3]+dp[i-1][4];
          dp[i][4]= dp[i-1][4];
      }
        System.out.println(Arrays.deepToString(dp));

      return Arrays.stream(dp[dp.length-1]).sum();
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(count(4));
    }
}
