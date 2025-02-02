package dp;

public class WaysToDecode {
    public static int findWaysToDecode(String s){
        int n=s.length();
        int[] dp = new int[n];
        if(s.charAt(0)=='0'){
            return 0;
        } else if (n==1) {
            return 1;
        }
        dp[0]=1;


    }
    public static int StringToValue

    public static void main(String[] args) {
        String str="C";
        System.out.println(findWaysToDecode(str));
    }
}
