package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int[] findMaxIncreasingSeq(int[] arr){
        int[] dp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int maxPrev = 0;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>maxPrev){
                        maxPrev=dp[j];
                    }
                }
            }
            dp[i]=maxPrev+1;
        }
        System.out.println(Arrays.toString(dp));
        return dp;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,2,4,7,2,3,6,4,5,12,1,7};
        System.out.println(findMaxIncreasingSeq(arr));
    }
}
