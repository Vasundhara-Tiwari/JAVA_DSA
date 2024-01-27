package Recursion;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 7, 8, 9};
        int[] arr2 = {1, 2, 5, 7, 11, 13, 14, 16, 18};
        int[] result = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int[] result = new int[arr1.length + arr2.length];
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] >= arr2[j]){
                result[k] = arr2[j];
                j++;
                k++;
            }
            else {
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        while(i < arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        return result;
    }
}
