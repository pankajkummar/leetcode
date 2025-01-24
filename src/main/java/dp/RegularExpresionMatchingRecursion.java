package dp;

public class RegularExpresionMatchingRecursion {
    public static boolean isMatch(String s, String p, int i, int j){
        if(j==p.length()){
            return i==s.length();
        }
        if(i==s.length()){
            if(j<p.length()){
                while(j<p.length()){
                    if(p.charAt(j)=='.' || p.charAt(j)=='*'){
                        j++;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }
        if((i<s.length()) && (s.charAt(i)==p.charAt(j)) || p.charAt(j) =='.'){
            isMatch(s, p, i+1, j+1);
        }
        if(p.charAt(j+1)=='*'){
            isMatch(s, p, i+1, j+1);
            isMatch(s, p, i, j+1);
        }
    }
}
