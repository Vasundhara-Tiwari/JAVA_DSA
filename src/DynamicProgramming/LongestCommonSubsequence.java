package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "abcde";
        int[][] dp = new int[str1.length()][str2.length()];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(longestCommonSubsequence(str1, str2, 0, 0, dp));
    }
    // i for str1
    // j for str2
    public static int longestCommonSubsequence(String str1, String str2, int i, int j, int[][] dp){
        if(str1.length() == i || str2.length() == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(str1.charAt(i) == str2.charAt(j)){
            ans = 1 + longestCommonSubsequence(str1, str2, i+1, j+1, dp);
        }
        else{
            int f = longestCommonSubsequence(str1, str2, i+1, j, dp);
            int s = longestCommonSubsequence(str1, str2, i, j+1, dp);
            ans = Math.max(f, s);
        }
        return dp[i][j] = ans;
    }

    public static int longestCommonSubsequenceBU(String text1, String text2){
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i = 1; i < text1.length(); i++){
            for(int j = 1; j < text2.length(); j++){
                int ans = 0;
                if(text1.charAt(i-1) == text2.charAt(j-1)){
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
