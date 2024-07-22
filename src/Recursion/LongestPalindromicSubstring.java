package Recursion;

import static String.CheckPalindrome.isPalindrome;

public class LongestPalindromicSubstring {
    static int len = 0;
    public static void main(String[] args) {
        String str = "babad";
        int[] dp = new int[str.length()];
        longestPalindromicSubstring(str, "", dp);
        System.out.println(len);
    }

    private static int longestPalindromicSubstring(String str, String ans, int[] dp) {
        if (str.length() == 0){
            return ans.length();
        }
        if(isPalindrome(ans)){
            len = Math.max(len, ans.length());
        }
        char ch = str.charAt(0);
        if(dp[ch-'a'] != 0){
            return dp[ch-'a'];
        }
        str = str.substring(1);
        int pick = longestPalindromicSubstring(str, ans+ch, dp);
        int notPick = longestPalindromicSubstring(str, ans, dp);
        return Math.max(pick, notPick);
    }
}