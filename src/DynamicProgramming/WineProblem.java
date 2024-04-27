package DynamicProgramming;

public class WineProblem {
    public static void main(String[] args) {
        int[] winePrices = {2, 3, 5, 1, 4};
        int[][] dp = new int[winePrices.length][winePrices.length];
        System.out.println(maxProfit(winePrices, 0, winePrices.length-1, 1, dp));
    }
    public static  int maxProfit(int[] wine, int si, int ei, int year, int[][] dp){
        if(si > ei){
            return 0;
        }
        if(dp[si][ei] != 0){
            return dp[si][ei];
        }
        int fs = wine[si] * year + maxProfit(wine, si+1, ei, year+1, dp);
        int ls = wine[ei] * year + maxProfit(wine, si, ei-1, year+1, dp);
        return dp[si][ei] = Math.max(fs, ls);
    }
}
