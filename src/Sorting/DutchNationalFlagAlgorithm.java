package Sorting;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums){
        int i = 0;  // position of 0
        int j = nums.length-1;  // position of 2
        int k = 0;  // for iterating over array
        while(k <= j){
            if(nums[k] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
            } else if(nums[k] == 1){
                k++;
            } else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
        }
    }
}
