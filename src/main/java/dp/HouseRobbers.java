package dp;

public class HouseRobbers {
    public static int maximumRobbery(int[] houses){
        int[] dp = new int[houses.length];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[1],dp[0]);
        for(int i=2; i<houses.length; i++){
            dp[i]=Math.max(dp[i-2]+houses[i],dp[i-1]);
        }
        return dp[houses.length-1];
    }

    public static void main(String[] args) {
        int[] arr={2,10,3,6,8,1,7};
        System.out.println(maximumRobbery(arr));

    }
}
