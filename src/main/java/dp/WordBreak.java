package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static boolean isWordBreakPossible(String s, String[] words){
        Set<String> set = new HashSet<>();
        set.addAll(List.of(words));
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0; i<s.length()+1; i++){
            for(int j=0; j<i; j++){
                if(set.contains(s.substring(j,i)) && dp[j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[words.length];

    }

    public static void main(String[] args) {
        String s = "catsandogsareanimals";
       String[] words = {"cats", "dog", "sand", "and", "cat", "mals", "san", "dogs", "are", "animal", "ani", "og", "sar"};
        System.out.println(isWordBreakPossible(s,words));
    }
}
