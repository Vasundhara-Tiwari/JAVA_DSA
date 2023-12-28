package Assignment3;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long[] arr = new long[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        arr = productExceptSelfUsingWithoutDivisionOperator(arr);
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static long[] productExceptSelfUsingWithoutDivisionOperator(long[] nums) {
        long[] left = new long[nums.length];
        long[] right = new long[nums.length];
        left[0] = 1;
        for(int i = 1; i < left.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        right[right.length-1] = 1;
        for(int i = right.length-2; i >= 0; i--){
            right[i] = nums[i+1] * right[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
