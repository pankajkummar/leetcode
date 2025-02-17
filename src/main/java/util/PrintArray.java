package util;

import java.util.Arrays;

public class PrintArray {
    public <T> void print2D(T[][] array) {
        int row = array.length;
        int col = array[0].length;
        System.out.println("*******************");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*******************");

    }

    public static void main(String[] args) {
        Integer[][] twoDPrimitive = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
       PrintArray pr = new PrintArray();
        System.out.println("2D Primitive:");
        pr.print2D(twoDPrimitive);
    }
}