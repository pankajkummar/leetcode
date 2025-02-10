package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TrainTicketProblem {
    public static int findMinimumCost(int[] trainDays, int[]trainCost,int n){
        int[]dp = new int[n];
        Set<Integer> trainDaySet = new HashSet<>();
        Arrays.stream(trainDays).forEach(value -> trainDaySet.add(value));
        for(int i=0; i<n; i++){
            if(!trainDaySet.contains(i)){
                dp[i]= i-1>=0 ? dp[i-1] : 0;
            }
            else{
                int dayCost = trainCost[0] + ((i-1)>=0? dp[i-1]:0);
                int weekCost = trainCost[1] + ((i-7)>=0? dp[i-7]:0);
                int monthCost = trainCost[2] + ((i-30)>=0? dp[i-30]:0);
                dp[i]= Math.min(dayCost,Math.min(weekCost,monthCost));
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] trainDays = {1,3,8,9,22,23,28,31};
        int[] costs = {4,10,25};
        int n =32;
        System.out.println(findMinimumCost(trainDays, costs, n));
    }
}
