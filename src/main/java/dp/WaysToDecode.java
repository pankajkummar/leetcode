package dp;

public class WaysToDecode {
    public static int findWaysToDecode(String s){
        return s.charAt(0)-'A'+1;

    }

    public static void main(String[] args) {
        String str="C";
        System.out.println(findWaysToDecode(str));
    }
}
