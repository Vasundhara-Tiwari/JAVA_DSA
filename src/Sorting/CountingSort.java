package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
        System.out.println(Arrays.toString(arr));
        ;
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int[] frequency = new int[max+1];
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            frequency[arr[i]]++;
        }
        for(int i = 1; i < frequency.length; i++){
            frequency[i] += frequency[i-1];
        }
        for(int i = arr.length-1; i >= 0; i--){
            int v = arr[i];
            int count = frequency[v];
            result[count-1] = v;
            frequency[v]--;
        }
        return result;
    }
}
