package util;

import java.util.Arrays;

public class PrintArray {
    public static <T> void print(T array) {
        if (array instanceof Object[]) {
            Object[] objArray = (Object[]) array;
            if (objArray.length > 0 && objArray[0] instanceof Object[]) {
                // 2D Array (Wrapper types like Integer[][], Double[][])
                for (Object row : objArray) {
                    System.out.println(Arrays.deepToString((Object[]) row));
                }
            } else {
                // 1D Array (Wrapper types like Integer[], Double[])
                System.out.println(Arrays.toString(objArray));
            }
        } else if (array instanceof int[][]) {
            for (int[] row : (int[][]) array) {
                System.out.println(Arrays.toString(row));  // ✅ Corrected
            }
        } else if (array instanceof double[][]) {
            for (double[] row : (double[][]) array) {
                System.out.println(Arrays.toString(row));  // ✅ Corrected
            }
        } else if (array instanceof int[]) {
            System.out.println(Arrays.toString((int[]) array));
        } else if (array instanceof double[]) {
            System.out.println(Arrays.toString((double[]) array));
        } else {
            System.out.println("Unsupported array type!");
        }
    }

    public static void main(String[] args) {
        int[][] twoDPrimitive = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("2D Primitive:");
        print(twoDPrimitive);
    }
}