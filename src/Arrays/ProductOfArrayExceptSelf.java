package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelfUsingDivisionOperator(nums)));
        System.out.println(Arrays.toString(productExceptSelfUsingWithoutDivisionOperator(nums)));
    }

    // using division operator
     public static int[] productExceptSelfUsingDivisionOperator(int[] nums) {
        int[] product = new int[nums.length];
        int pr = 1;
        for(int i = 0; i < nums.length; i++){
            pr *= nums[i];
        }
        for(int i = 0;  i < nums.length; i++){
            product[i] = pr/nums[i];
        }
        return product;
    }

    // without using division operator
    public static int[] productExceptSelfUsingWithoutDivisionOperator(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
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
