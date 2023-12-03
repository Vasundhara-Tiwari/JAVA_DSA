package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 7, 9, 11, -8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertLastElement(int[] arr, int index){
        int item = arr[index];
        int j = index-1;
        while(j >= 0 && item < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            insertLastElement(arr, i);
        }
    }
}
