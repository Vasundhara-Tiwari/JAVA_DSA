package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int[] dp =  new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.println(robForward(nums, 0));
    }
    public static int robForward(int[] nums, int index) {
        if(index >= nums.length){
            return 0;
        }
        int rob = nums[index] + robForward(nums, index+2);
        int dontRob = robForward(nums, index+1);
        return Math.max(rob, dontRob);
    }

    public static int robTD2(int[] nums, int index, int[] dp) {
        if(index < 0){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int rob = nums[index] + robTD2(nums, index-2, dp);
        int dontRob = robTD2(nums, index-1, dp);
        return dp[index] = Math.max(rob, dontRob);
    }

    public static int robBU(int[] nums, int index) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            int rob = nums[i] + dp[i-2];
            int dontRob = nums[i-1];
            dp[i] = Math.max(rob, dontRob);
        }
        return dp[dp.length - 1];
    }
}
