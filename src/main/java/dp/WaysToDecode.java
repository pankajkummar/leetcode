package dp;

public class WaysToDecode {
    public static int findWaysToDecode(String str) {
        int n = str.length();
        if (n == 0 || str.charAt(0) == '0') return 0; // If the string starts with '0', no valid decoding

        int[] dp = new int[n + 1]; // DP array for storing results
        dp[0] = 1; // Base case: empty string has 1 way to be decoded
        dp[1] = 1; // Single character can only be decoded in one way (unless it's '0', but we already handled that)

        for (int i = 2; i <= n; i++) {
            int oneDigit = str.charAt(i - 1) - '0'; // Extract last single digit
            int twoDigit = (str.charAt(i - 2) - '0') * 10 + oneDigit; // Extract last two digits

            // If the single digit is non-zero, it can be decoded individually
            if (oneDigit != 0) {
                dp[i] += dp[i - 1];
            }

            // If the two-digit number is between 10 and 26, it forms a valid character
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n]; // Return the total number of ways to decode
    }

    public static void main(String[] args) {
        String s = "51281012029";
        System.out.println(findWaysToDecode(s));
    }
}
