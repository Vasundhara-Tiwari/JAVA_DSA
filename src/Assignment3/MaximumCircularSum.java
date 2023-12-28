package Assignment3;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases>0){
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = scanner.nextInt();
            }
            System.out.println(maxCircularSum(arr));
            testCases--;
        }
    }

    public static int kadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static int maxCircularSum(int[] nums) {
        int n = nums.length;

        // Find the maximum subarray sum for the original array
        int maxStraightSum = kadane(nums);

        // Find the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Find the maximum subarray sum for the inverted array (with signs reversed)
        int[] invertedNums = new int[n];
        for (int i = 0; i < n; i++) {
            invertedNums[i] = -nums[i];
        }
        int maxInvertedSum = totalSum + kadane(invertedNums);

        // Return the maximum of the two sums
        return Math.max(maxStraightSum, maxInvertedSum);
    }
}
