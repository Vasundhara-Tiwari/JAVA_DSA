package Arrays;
import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));;
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], nums[i]+sum);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
