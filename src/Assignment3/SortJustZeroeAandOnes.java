package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortJustZeroeAandOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] nums){
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else if(nums[i] == 0){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
