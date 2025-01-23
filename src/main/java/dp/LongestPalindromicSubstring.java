package dp;

public class LongestPalindromicSubstring {
    public static String findLongestPalindromicSubstring(String str){
        boolean[][] dp = new boolean[str.length()][str.length()];
        int maxLength =1;
        int start =0;
        for(int i=0; i<str.length(); i++){
          dp[i][i]=true;
        }
        for(int i=0; i<str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i + 1)) { // Check if the two characters match
                dp[i][i + 1] = true;
                start = i; // Update start index for the palindrome
                maxLength = 2; // Update max length for two-character palindromes
            }
        }

        for(int length=3; length<=str.length(); length++){
            for(int i=0; i< str.length() - length + 1; i++){
                int j = i+length-1;
                if(str.charAt(i)== str.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

         return str.substring(start,start+maxLength);

    }

    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(findLongestPalindromicSubstring(str));
    }
}
