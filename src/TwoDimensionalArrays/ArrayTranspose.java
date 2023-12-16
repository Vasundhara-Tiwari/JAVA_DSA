package TwoDimensionalArrays;

import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i< arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        transpose(arr);
        for(int i=0; i< arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
