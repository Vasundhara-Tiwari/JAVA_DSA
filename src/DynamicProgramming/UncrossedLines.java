package DynamicProgramming;

public class UncrossedLines {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,2,5};
        int[] nums2 = {10,5,2,1,5,2};
        System.out.println(uncrossedLines(nums1, nums2));
    }
    public static int uncrossedLines(int[] nums1, int[] nums2){
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int ans = 0;
                if(nums1[i-1] == nums2[j-1]){
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    int f = dp[i-1][j];
                    int s = dp[i][j-1];
                    ans = Math.max(f, s);
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
