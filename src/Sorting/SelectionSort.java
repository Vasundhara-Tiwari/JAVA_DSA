package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 4, 2, 1};
        System.out.println(minimumFromIthIndex(arr, 3));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int minimumFromIthIndex(int[] arr, int index){
        int min = index;
        for(int i = index+1; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
    public static void sort(int[] arr){
        for(int turn = 0; turn < arr.length; turn++){
            int j = minimumFromIthIndex(arr, turn);
            int temp = arr[turn];
            arr[turn] = arr[j];
            arr[j] = temp;
        }
    }
}
