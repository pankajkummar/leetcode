package dp;

import java.util.Arrays;

public class Partition {
    public static boolean isPartition(int[] arr) {
        SubsetSum s = new SubsetSum();
        int sum = Arrays.stream(arr).sum();
        if(sum%2 !=0){
            return false;
        }
        return s.subsets(arr,sum/2)>0;

    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,3,2,5,1};
        int[] arr2 = {5,6,2,3,8,1};


        System.out.println(isPartition(arr1));
        System.out.println(isPartition(arr2));
    }


}
