package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int turn = 1; turn < arr.length; turn++){
            for(int i = 0; i < arr.length-turn; i++){
                if(arr[i] > arr[i +1]) {
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] = temp;
                }
            }
        }
    }
}
