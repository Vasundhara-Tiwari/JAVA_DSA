package Sorting;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int i = 0;  // position of 0
        int j = arr.length-1;  // position of 2
        int k = 0;  // for iterating over array
        while(k <= j){
            if(arr[k] == 2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            } else if(arr[k] == 1){
                k++;
            } else{
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
        }
    }
}
