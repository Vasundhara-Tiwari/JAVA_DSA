package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
//        System.out.println(lis(arr));
        System.out.println(lisOptimized(arr));
    }
    public static int lis(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for(int i = 1; i < dp.length; i++){
            for (int j = i-1; j>=0; j--){
                if(nums[j] < nums[i]){
                    int x = dp[j];
                    dp[i] = Math.max(dp[i], x+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    public static int lisOptimized(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > dp[len-1]){
                dp[len] = nums[i];
                len++;
            } else {
                int index = binarySearch(dp, 0, len-1, nums[i]);
                dp[index] = nums[i];
            }
        }
        return len;
    }

    public static int binarySearch(int[] dp, int start, int end, int ele){
        int ans = -1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(dp[mid] >= ele){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}
